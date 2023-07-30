class Solution {
    public char findTheDifference(String s, String t) {

         if(s.length() == 0)
         {
             return t.charAt(0);
         }

         char[] array1 = s.toCharArray();
         char[] array2 = t.toCharArray();

         Arrays.sort(array1);
         Arrays.sort(array2);

         for(int i=0;i<array1.length;i++)
         {
             if(array1[i] != array2[i])
             {
                 return array2[i];
             }
         }

         return array2[array2.length-1];
    }
}