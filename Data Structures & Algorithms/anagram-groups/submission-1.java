class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> r=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String x=new String(c);
            r.putIfAbsent(x, new ArrayList<>());
            r.get(x).add(s);
        }  
        return new ArrayList<>(r.values());
    }
}
