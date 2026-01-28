const http = require('http');
const fs = require('fs');
const path = require('path');

const ROOT = __dirname;
const PORT = 3000;

function isSolutionFolder(folderPath) {
  // Exclude files and hidden folders
  const stat = fs.statSync(folderPath);
  return stat.isDirectory() && !path.basename(folderPath).startsWith('.');
}

function getSolutionFolders() {
  return fs.readdirSync(ROOT)
    .filter(name => isSolutionFolder(path.join(ROOT, name)))
    .filter(name => /\d/.test(name)); // likely a problem folder
}

function getFilesInFolder(folder) {
  const folderPath = path.join(ROOT, folder);
  return fs.readdirSync(folderPath).filter(f => !f.startsWith('.'));
}

function getFileContent(folder, file) {
  const filePath = path.join(ROOT, folder, file);
  try {
    return fs.readFileSync(filePath, 'utf8');
  } catch {
    return null;
  }
}

function getAllProblems() {
  const folders = getSolutionFolders();
  return folders.map(folder => {
    const files = getFilesInFolder(folder);
    const solutions = files.filter(f => /\.(java|js|sql|py|cpp)$/i.test(f));
    const readme = files.find(f => /readme\.md/i.test(f));
    return {
      folder,
      solutions: solutions.map(file => ({
        file,
        content: getFileContent(folder, file)
      })),
      readme: readme ? getFileContent(folder, readme) : null
    };
  });
}

const server = http.createServer((req, res) => {
  if (req.url === '/api/problems') {
    res.writeHead(200, { 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*' });
    res.end(JSON.stringify(getAllProblems()));
  } else {
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Not found');
  }
});

server.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
