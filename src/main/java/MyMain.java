import java.util.Scanner;

public class MyMain {
    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a)) {
            return b;
        } 
        else if ((b < a && a < c) || (c < a && a < b)) {
            return a; 
        }
        else {
            return c;
        } 
    }
    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if( Math.abs(a) > Math.abs(b) ) {
            return a; 
        }  
        else {
            return b;
        }     
    }
    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = (Math.pow(a,2)) + (Math.pow(b,2));
        return Math.sqrt(c);
    }
    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        Scanner scan = new Scanner(System.in);
        System.out.print("Int: ");
		String median_1 = scan.next();
        int M_1 = Integer.parseInt(median_1);
        System.out.print("Int: ");
		String median_2 = scan.next();
        int M_2 = Integer.parseInt(median_2);
        System.out.print("Int: ");
		String median_3 = scan.next();
        int M_3 = Integer.parseInt(median_3);
        System.out.print("Int: ");
		String magnitude_1 = scan.next();
        int Mag_1 = Integer.parseInt(magnitude_1);
        System.out.print("Int: ");
		String magnitude_2 = scan.next();
        int Mag_2 = Integer.parseInt(magnitude_2);
        System.out.print("Int: ");
		String pythagoras_1 = scan.next();
        int P_1 = Integer.parseInt(pythagoras_1);
        System.out.print("Int: ");
		String pythagoras_2 = scan.next();
		int P_2 = Integer.parseInt(pythagoras_2);
        System.out.println(median(M_1, M_2, M_3)); // should be 2
        System.out.println(magnitude(Mag_1, Mag_2)); // should be -7
        System.out.println(pythagoras(P_1, P_2)); // should be 5.0   
    }
}
