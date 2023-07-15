package random;

public class RecursiveSummation {
    public static int recursiveSummation(int number){
        if (number<=1){
            return number;
        }

        return number+ recursiveSummation(number-1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveSummation(5));
    }

    /*


    2+ rec(2-1) =3
    3+ rec(3-1) =6
    4+ rec(4-1)=10
    5+ rec(5-1)=15
    rec(5)
     */
}
