class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        while(left<=right){
            int temp=left;
            boolean flag=true;
            while(temp!=0){
                int rem=temp%10;
                temp/=10;
                if(rem!=0){
                if(left%rem!=0){
                    flag=false;
                    break;
                }
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(left);
            }
            left++;
        }
        return list;
    }
}