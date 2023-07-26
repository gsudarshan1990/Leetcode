class Solution {
    public int finalValueAfterOperations(String[] operations) {

     String a  = "X++";
     String b =  "++X";
     String c = "X--";
     String d  = "--X";

     int value = 0;

     for(int i =0; i < operations.length; i++)
     {
         if(operations[i].equalsIgnoreCase(a) || operations[i].equalsIgnoreCase(b))
         {
             value= value+1;
         }
            if(operations[i].equalsIgnoreCase(c) || operations[i].equalsIgnoreCase(d))
         {
             value=value-1;
         }


     }

     return value;

    }
}