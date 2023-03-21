class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;


        while(right > left) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(l < 47 || l > 122 || (l > 57 && l < 65) || (l > 90 && l < 97)) {
                //l char is not alphanumeric
                left++;
                continue;
            }

            if(r < 47 || r > 122 || (r > 57 && r < 65) || (r > 90 && r < 97)) {
                //r char is not alphanumeric
                right--;
                continue;
            }

            if(l != r) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}