package leet_code.easy._509_FibonacciNumber;

class Solution {
    public static int fib(int n) {
        if(n<=1) return n;
        int prev=0;
        int next=1;
        int curr=0;
        for (int i=2; i<=n; i++){
            curr= prev+next;
            prev=next;
            next=curr;
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}