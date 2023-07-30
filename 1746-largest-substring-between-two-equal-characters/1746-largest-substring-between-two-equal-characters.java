class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

            int maxlength = -1;
            int strlength = 0;
            char[] letters = s.toCharArray();

            for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(letters[i] == letters[j])
                    {
                        strlength = s.substring(i,j).length()-1;
                        maxlength = Math.max(maxlength,strlength);
                    }
                }
            }

        return maxlength;
       
        
    }
}