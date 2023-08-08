class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");

        int result =0 ;
        int length = words.length;
        
        HashSet<Character> hashset = new HashSet<Character>();

        for(int i=0;i<brokenLetters.length();i++)
        {
            hashset.add(brokenLetters.charAt(i));
        }


        for(int i=0;i<words.length;i++)
        {
            String word =words[i];
            for(char c:hashset)
            {
                if(word.contains(String.valueOf(c)))
                {
                    result++;
                    break;
                }
            }
        }

     
        return length-result;
        
    }
}