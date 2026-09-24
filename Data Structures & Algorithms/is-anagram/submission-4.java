class Solution {
    public boolean isAnagram(String s, String t) {
        int a = 0  ; 
        int b = 0 ; 
        int[] abjad = new int[26];
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0;i < s.length();i++){
            int index = s.charAt(i) - 'a';
            abjad[index] += 1 ; 
        }
        for (int i = 0;i < s.length();i++){
            int index = t.charAt(i) - 'a';
            if (abjad[index] - 1 < 0){
                return false;
            }
            else{
                abjad[index] -= 1;
            }
        }
        return true;
    }
}
