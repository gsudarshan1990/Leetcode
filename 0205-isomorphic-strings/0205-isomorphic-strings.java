class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hmap = new HashMap<Character, Character>();

        if(s.length()!=t.length())
        {
            return false;
        } 

        for(int i=0;i<s.length();i++)
        {
            if(!hmap.containsKey(s.charAt(i)))
            {
                if(hmap.containsValue(t.charAt(i)))
                {
                        return false;
                }
                hmap.put(s.charAt(i),t.charAt(i));
            }
            else if(t.charAt(i)!=hmap.get(s.charAt(i)))
            {
                return false;
            }
        }

        return true;
        
    }
}