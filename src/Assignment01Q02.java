public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int num = Integer.parseInt(args[0]);
        double sum = 0.0;
        int sign = 1;
        double denom;

        for(int i = 0; i < num; i++){
            denom = 1.0 / (2 * i + 1);
            sum += sign * denom;
            sign = -sign;
        }

        approxPi = 4 * sum;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
