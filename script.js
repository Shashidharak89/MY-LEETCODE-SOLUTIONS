
// --- DOM Elements ---
const folderList = document.getElementById('folderList');
const fileList = document.getElementById('fileList');
const selectedFolderTitle = document.getElementById('selectedFolderTitle');
const codeContent = document.getElementById('codeContent');
const markdownContent = document.getElementById('markdownContent');

let problems = [];
let currentFolder = null;
let currentFile = null;
let currentFolderObj = null;

// --- Fetch all problems from API ---
async function fetchProblems() {
	try {
		const res = await fetch('http://localhost:3000/api/problems');
		problems = await res.json();
		renderFolders();
	} catch (e) {
		folderList.innerHTML = '<li style="color:red">Failed to load problems from server</li>';
	}
}

// --- Render Folders ---
function renderFolders() {
	folderList.innerHTML = '';
	problems.forEach((item, idx) => {
		const li = document.createElement('li');
		li.textContent = item.folder;
		li.className = (currentFolder === item.folder) ? 'active' : '';
		li.onclick = () => {
			currentFolder = item.folder;
			currentFile = null;
			currentFolderObj = item;
			renderFolders();
			renderFiles();
			clearViewer();
		};
		folderList.appendChild(li);
	});
}

// --- Render Files in Selected Folder ---
function renderFiles() {
	fileList.innerHTML = '';
	selectedFolderTitle.textContent = currentFolder ? currentFolder : 'Select a problem';
	if (!currentFolderObj) return;
	// List all solution files and Readme
	currentFolderObj.solutions.forEach(sol => {
		const li = document.createElement('li');
		li.textContent = sol.file;
		li.className = (currentFile === sol.file) ? 'active' : '';
		li.onclick = () => {
			currentFile = sol.file;
			renderFiles();
			showFile(sol.file, sol.content);
		};
		fileList.appendChild(li);
	});
	if (currentFolderObj.readme) {
		const li = document.createElement('li');
		li.textContent = 'Readme.md';
		li.className = (currentFile === 'Readme.md') ? 'active' : '';
		li.onclick = () => {
			currentFile = 'Readme.md';
			renderFiles();
			showFile('Readme.md', currentFolderObj.readme);
		};
		fileList.appendChild(li);
	}
}

// --- Show File Content ---
function showFile(file, content) {
	codeContent.textContent = '';
	markdownContent.innerHTML = '';
	const ext = file.split('.').pop().toLowerCase();
	if (ext === 'md') {
		markdownContent.innerHTML = window.marked.parse(content);
		codeContent.style.display = 'none';
		markdownContent.style.display = 'block';
	} else {
		codeContent.textContent = content;
		codeContent.className = getHighlightClass(ext);
		markdownContent.style.display = 'none';
		codeContent.style.display = 'block';
		window.hljs.highlightElement(codeContent);
	}
}

function getHighlightClass(ext) {
	switch (ext) {
		case 'java': return 'language-java';
		case 'js': return 'language-javascript';
		case 'sql': return 'language-sql';
		case 'py': return 'language-python';
		case 'cpp': return 'language-cpp';
		default: return '';
	}
}

function clearViewer() {
	codeContent.textContent = '';
	markdownContent.innerHTML = '';
}

// --- Initial Render ---
fetchProblems();
