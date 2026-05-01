class Solution {
    public int maxProduct(int n) {
        Set<Integer> set= new LinkedHashSet<>();
        String s=String.valueOf(n);
        int l=s.length();
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                int num1=s.charAt(i)-'0';
                int num2=s.charAt(j)-'0';

                set.add(num1*num2);

            }
        }
        int max=Collections.max(set);
        return max;
    }
}