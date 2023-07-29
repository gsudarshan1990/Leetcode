class Solution {
    public String makeFancyString(String s) {

           
            StringBuilder sb = new StringBuilder();

            try
            {
            for(int i=0;i<s.length();i++)
            {

                    if(i<s.length()-2 && (s.charAt(i) == s.charAt(i+1)) && (s.charAt(i) == s.charAt(i+2)))   
                    {
                        continue;
                    }
                    else
                    {
                        sb.append(s.charAt(i));
                    }
            }
            }
            catch(Exception e)
            {

            }

            return sb.toString();
    }
}