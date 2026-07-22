class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            int[] st=new int[27];
            for(int i=0;i<s.length();i++){
                st[s.charAt(i)-'a'+1]++;
            
                st[t.charAt(i)-'a'+1]--;
            }
            for(int i=0;i<st.length;i++){
                if(st[i]>0){
                    return false;
                }
            }
            return true;
        }

    }
}
