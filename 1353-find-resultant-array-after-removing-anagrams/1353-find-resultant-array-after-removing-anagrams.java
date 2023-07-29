class Solution {
    public List<String> removeAnagrams(String[] words) {

        List<String> result = new ArrayList<String>();

        for(int i=0;i<words.length;)
        {
            int j;
            for(j = i+1;j<words.length;j++)
            {
                if(!isAnagram(words[i],words[j]))
                {
                    break;
                }
            }
            result.add(words[i]);
            i=j;
        }

        return result;

    }

    public boolean isAnagram(String s1, String s2)
    {   
            if(s1.length() != s2.length())
            {
                return false;
            }

            char[] char1 = s1.toCharArray();
            char[] char2 = s2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            return Arrays.equals(char1,char2);
    }
}