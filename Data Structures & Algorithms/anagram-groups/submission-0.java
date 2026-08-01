class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> s= new ArrayList<>();
        List<String> n= new ArrayList<>();
        for(String c:strs){
            n.add(c);
        }
        for(int i=0;i<n.size();i++){
            List<String> m=new ArrayList<>();
            m.add(n.get(i));
            for(int j=i+1;j<n.size();j++){
                if(sorting(n.get(i)).equals(sorting(n.get(j)))){
                    m.add(n.get(j));
                    n.remove(j);
                    j--;
                }
            }
            s.add(m);
        }
        return s;
        
    }
    public String sorting(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        String t="";
        for(char ch:c){
            t=t+ch;
        }
        return t;
    }
}
