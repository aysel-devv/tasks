public class Solution {
    public String longestCommonPrefix(String[] str) {

        String commonPrefix="";
        String item="";
        String nextItem="";
        int len1=str[0].length();

        if (str.length == 1) {
            commonPrefix+=str[0];
            return commonPrefix;
        }

        for(int i=0; i<=str[0].length()-1; i++){

            item=String.valueOf(str[0].charAt(i));
            for (int j = 1; j <= str.length-1 ; j++) {
                if(i<str[j].length()){
                    nextItem=String.valueOf(str[j].charAt(i));
                    if(!item.equals(nextItem))
                    {
                        return commonPrefix;
                    }
                    if(j==str.length-1 && item.equals(nextItem)){
                        commonPrefix+=item;
                    }




                }
            }
        }


        return commonPrefix;
    }
}
