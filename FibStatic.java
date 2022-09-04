import java.util.*;
class FibStatic extends Thread {  // Recursive Fibonacci

    public static int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    @Override
    public void run() {

        int fibNum;
        Scanner scnr = new Scanner(System.in);
        System.out.println("");
        System.out.print("What number would you like to know from the Fibonnaci sequence? ");
        fibNum = scnr.nextInt();
        System.out.println("The " + fibNum + "th number in the Fibonnaci sequence is " + Fibonacci(fibNum));




    }
}
