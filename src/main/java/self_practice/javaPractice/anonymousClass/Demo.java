package self_practice.javaPractice.anonymousClass;

public class Demo {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in Anonymous show");
            }
        };

        obj.show();

    /*

    instead of creating this class we are using anonymous class as below.

        public class B extends AbstractClassA {

            @Override
            public void show() {
                System.out.println("in new show");
            }

        }
     */


        //here we are not creating obj from AbstractClassA since it is an abstract class.
        //we are crating obj from Anonymous class which extends AbstractClassA,
        // so we can override the show method
        //The purpose is let's say we will only use this implementation once, and we do not want
        //to create another class which extends AbstractClassA and give the implementation
        //instead we are giving the implementation (actually we are writing the class after the
        //constructor as below).
//        AbstractClassA obj2 = new AbstractClassA() {
//            @Override
//            public void show() {
//                System.out.println("in new show");
//            }
//        };


        //you can give implementation for more than one method

        AbstractClassA obj3 = new AbstractClassA() {
            @Override
            public void show() {
                System.out.println("in new show");
            }

            @Override
            public void config() {
                System.out.println("in new config");
            }
        };

    }
}
