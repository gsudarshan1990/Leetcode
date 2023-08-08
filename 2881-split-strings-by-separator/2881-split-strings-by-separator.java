class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        StringBuilder sb = new StringBuilder().append("\\").append(separator);

        List<String> separated = new ArrayList<>();

        for(int i=0;i<words.size();i++)
        {
            String[] wordlist = words.get(i).split(sb.toString());

            for(String word:wordlist)
            {
                if(!word.equals(""))
                {
                    separated.add(word);
                }
            }
        }

        return separated;
        
    }
}