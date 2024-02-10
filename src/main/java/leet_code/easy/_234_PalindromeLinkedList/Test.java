package leet_code.easy._234_PalindromeLinkedList;

public class Test {
    public static void main(String[] args) {
        MySLL mySLL = new MySLL();
        mySLL.add(1);
        mySLL.add(2);
        mySLL.add(2);
        mySLL.add(1);
        mySLL.add(1);

//        System.out.println(Solution.isPalindrome(mySLL.head));
        System.out.println(SolutionCleanCode.isPalindrome2(mySLL.head));


    }
}
