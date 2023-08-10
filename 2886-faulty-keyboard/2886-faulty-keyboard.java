class Solution {
    public String finalString(String s) {


        StringBuilder sb = new StringBuilder();
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j) =='i')
            {
                sb.reverse();
            }
            else
            {
                sb.append(s.charAt(j));
            }
        }
       
        return sb.toString();
    }

   
}