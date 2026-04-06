class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int n = num1.length() - 1, m = num2.length() - 1;
        String ans = "";
        while (n >= 0 && m >= 0) {
            int n1 = num1.charAt(n--)-'0';
            int n2 =num2.charAt(m--)-'0';
            
            int sum = n1 + n2;
            sum += carry;
            if (sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            ans = String.valueOf(sum) + ans;
        }
        if (n >= 0) {
            while (n >= 0) {
                int n1 = num1.charAt(n--)-'0';
                int sum = n1 + carry;
                if (sum > 9) {
                    carry = 1;
                    sum = sum % 10;
                } else {
                    carry = 0;
                }
                ans = String.valueOf(sum) + ans;
            }
        }
        else if (m >= 0) {
            while (m >= 0) {
                int n2 = num2.charAt(m--)-'0';
                int sum = n2 + carry;
                if (sum > 9) {
                    carry = 1;
                    sum = sum % 10;
                } else {
                    carry = 0;
                }
                ans = String.valueOf(sum) + ans;
            }
        }

        if(carry==1){
            ans="1"+ans;
        }

        return ans;

    }
}