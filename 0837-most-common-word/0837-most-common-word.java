class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String paragraph2 = paragraph.replaceAll("[^a-zA-Z]"," ");
        String paragraph3 = paragraph2.toLowerCase();
        String[] words = paragraph3.split("\\s+");

        Set<String> bannedset = new HashSet<String>();

        for(int i=0;i<banned.length;i++)
        {
                bannedset.add(banned[i]);
        }

        Map<String, Integer> tmap = new TreeMap<String, Integer>();

        for(int i=0;i<words.length;i++)
        {
            if(!bannedset.contains(words[i]))
            {
                tmap.put(words[i],tmap.getOrDefault(words[i],0)+1);
            }
        }

         List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(tmap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }});

               Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        String commonword = null;

        for(Map.Entry<String,Integer> entry:sortedMap.entrySet())
        {
            commonword = entry.getKey();
        }


        return commonword;
        
    }
}