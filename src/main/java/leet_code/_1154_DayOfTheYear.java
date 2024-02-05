package leet_code;

class _1154_DayOfTheYear {

    public static void main(String[] args) {
        String date = "2019-02-10";
        System.out.println(dayOfYear(date));

        String a =  "10";
        int day= Integer.parseInt(a.substring(0));
        System.out.println(day);


    }
    public static int dayOfYear(String date) {
        int year= Integer.parseInt(date.substring(0,4));
        int month= Integer.parseInt(date.substring(5,7));
        int day= Integer.parseInt(date.substring(8));

        int result=0;
        int daysOfTheMonth=0;
        for(int i=1; i<month; i++){
            switch (i) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                daysOfTheMonth=31;
                break;
            case 4:
            case 6: 
            case 9: 
            case 11:
                daysOfTheMonth=30;
                break;
            case 2:
                daysOfTheMonth= isLeap(year);
                break;
            default:
        }
            result+=daysOfTheMonth;
        }
    
        result+=day;
        return result;
    }

    public static int isLeap(int year){
          if(year%4==0 && year%100!=0){
              return 29;
          }else if(year%400==0){
              return 29;
          }

          return 28;
    }

   
}