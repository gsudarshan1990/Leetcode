class Solution {
    public String sortSentence(String s) {
        

        String[] words = s.split(" ");
        
        String string1 = null;
        String string2 = null;



        TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();

        for(int i=0;i< words.length;i++)
        {
            string1 = words[i].substring(0,words[i].length()-1);
            string2  = words[i].substring(words[i].length()-1);

            try
            {
                tmap.put(Integer.parseInt(string2),string1);
            }
            catch(NumberFormatException e)
            {

            }

        }

  

        List<String> stringvalues = new ArrayList<String>();

        for(String newstring:tmap.values())
        {
            stringvalues.add(newstring);
        }
        
         return String.join(" ",stringvalues);
    }
}