class Solution {
    public int countVowelSubstrings(String word) {

        int vowelcount = 0;
        Set<Character> hashset = new HashSet<Character>();

        for(int i=0;i<word.length()-4;i++)
        {
            hashset.clear();
            for(int j=i;j<word.length();j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u')
                {
                    hashset.add(ch);
                    if(hashset.size()==5)
                    {
                        vowelcount++;
                    }
                }
                else
                {
                    break;
                }
            }
        }

        return vowelcount;

    }
}