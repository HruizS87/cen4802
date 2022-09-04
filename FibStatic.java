import java.util.*;
class FibStatic extends Thread {  // Recursive Fibonacci
    /**
     * @author Hector E Ruiz Silva
     * The following is a static method that will execute the value of any given fibonnaci
     * sequence number (n) when entered.
     * @param n integer that will be used to determine the value of the number entered
     * @return the result takes the number (n) and adds them resulting in the fibonnaci
     *         sequence value.
     */
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
