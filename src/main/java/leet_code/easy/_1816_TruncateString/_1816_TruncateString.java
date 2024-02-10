package leet_code.easy._1816_TruncateString;

class _1816_TruncateString {
    public String truncateSentence(String s, int k) {
       int count=0;
       int i=0;
       while(count<k && i<s.length()){
           if(s.charAt(i)==' '){
               count++;
               if(k==count){
                   break;
               }
           }

           i++;
       }

       return s.substring(0, i);

        
    }
}
