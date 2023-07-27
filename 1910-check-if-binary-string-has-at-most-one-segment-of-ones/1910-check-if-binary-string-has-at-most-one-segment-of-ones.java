class Solution {
    public boolean checkOnesSegment(String s) {

        int count = 0;
        boolean check = false;

        for(char c : s.toCharArray())
        {
            if( c =='1' && !check)
            {
                check = true;
                count++;
            }
            else if ( c =='0' && check)
            {
                check = false;
            }
        }        

        return count<=1;
    }
}