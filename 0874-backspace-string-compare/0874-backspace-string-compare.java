class Solution {
    public boolean backspaceCompare(String s, String t) {

      

       return wordBuilder(s).equals(wordBuilder(t));
    }


    public String wordBuilder(String data)
    {
        Stack<Character> stack1 = new Stack<Character>();
     

        for(char c:data.toCharArray())
        {
            if(c != '#')
            {
                stack1.push(c);
            }
             else if(!stack1.empty())
            {
                stack1.pop();
            }

           

        }
        return String.valueOf(stack1);
    }
    
}