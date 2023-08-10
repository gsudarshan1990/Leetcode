class Solution {
    public int numUniqueEmails(String[] emails) {

            HashSet<String> hashset = new HashSet<String>();
            String localname;
            String domainname;
            for(String email:emails)
            {

                StringBuilder sb = new StringBuilder();
                int index = email.indexOf("@");
                 localname= email.substring(0,index);
                 domainname= email.substring(index);

                if(localname.contains("+"))
                {
                        index = email.indexOf("+");
                        localname=localname.substring(0,index);

                }
                String newlocalname =localname.replaceAll("\\.","");            

                hashset.add(newlocalname+domainname);

            }

        return hashset.size();
    }
}