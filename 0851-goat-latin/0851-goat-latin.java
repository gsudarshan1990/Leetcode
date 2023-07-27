class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");

        List<String> formedword = new ArrayList<String>();

        boolean containvowel = false;
        List<Character> word = new ArrayList<Character>();

        word.add('a');
        word.add('e');
        word.add('i');
        word.add('o');
        word.add('u');
        word.add('A');
        word.add('E');
        word.add('I');
        word.add('O');
        word.add('U');

        int toappenda;

        

        for(int i =0;i<words.length;i++)
        {
            String wordToCheck = words[i];
            StringBuilder sb = new StringBuilder(wordToCheck);

            String aform="";

            char firstchar = wordToCheck.charAt(0);
            if(!word.contains(firstchar))
            {
                    sb.deleteCharAt(0);
                    sb.append(String.valueOf(firstchar));
                    sb.append("ma");
                    
            }
            else
            {
                sb.append("ma");
            }


            toappenda = i+1;

            for(int j =0;j<toappenda;j++)
            {
                aform= aform + "a";
            }
            
            sb.append(aform);

           formedword.add(sb.toString());

            
        }

        return String.join(" ",formedword);
        
    }
}