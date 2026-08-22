class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        Map<Character, Character> c=new HashMap<>();
        c.put(')','(');
        c.put('}','{');
        c.put(']','[');

        for(char i: s.toCharArray()){
            if(c.containsKey(i)){
                if(!a.isEmpty() && a.peek()==c.get(i)){
                    a.pop();
                }
                else{
                    return false;
                }
            }
            else{
                a.push(i);
            }
        }
        return a.isEmpty();
    }
}
