package self_practice.javaPractice.anonymousClass;

public class Demo {
    public static void main(String[] args) {

        A obj = new A(){
            public void show(){
                System.out.println("in Anonymous show");
            }
        };

        obj.show();
    }
}
