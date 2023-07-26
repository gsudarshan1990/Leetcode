class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        List<Character> jewels_list = new ArrayList<Character>();

        char[] jewels_char = jewels.toCharArray();

        int count =0;

        for(int i =0;i<jewels_char.length;i++)
        {
            jewels_list.add(jewels_char[i]);
        }

        
    
        char[] stones_char = stones.toCharArray();

        for(int i =0;i<stones_char.length;i++)
        {

            if(jewels_list.contains(stones_char[i]))
            {
                    count++;
            }
        }

        return count;

    }
}