class Solution {
    public boolean areNumbersAscending(String s) {
        
            String[] words = s.split(" ");

            List<Integer> numbers = new ArrayList<Integer>();

            for(int i=0;i<words.length;i++)
            {
                try
                {
                    int value = Integer.parseInt(words[i]);
                    numbers.add(value);
                }
                catch(Exception e)
                {

                }
            }




        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                return false;
            }
        }

       

        return true;

    }
}