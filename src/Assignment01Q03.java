public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int f_num1 = 1, f_num2 = 1;
        int curr;
        
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                curr = f_num1;
            }else if (i == 1) {
                curr = f_num2;
            }else {
                curr = f_num1 + f_num2;
                f_num1 = f_num2;
                f_num2 = curr;
            }
            if (curr % 2 == 1) {
                numOdd++;
            }
            System.out.print(curr);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
