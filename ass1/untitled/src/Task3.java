import java.util.Scanner;
public class Task3 {
    /*
     * is number prime or not via recursion
     * @param n - number
     * @param sc - scanner for taking input from console
     * @param i - counter
     * @param ans - for answer
     */
    public static boolean fprime(int a, int i){//function for task3
        if(i <= a/2) {//to minimize amount of numbers
            if (a % i == 0) {//checking if it is divisible by the counter
                return false;
            } else {
                return fprime(a, i + 1);//recursion
            }
        }
        return true;//returning true otherwise
    }
    public static void task3() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter digit");
        int n = sc.nextInt();//number
        if (Math.abs(n) == 1){ //checking if 1 is written
            System.out.println("Prime");//output answer
        } else if (Math.abs(n) == 0) { // checking if 0 is written
            System.out.println("Composite");//output number
        }
        else {
            boolean ans = fprime(n, 2);//calling for function to find minimum
            if(ans){ //checking the result
                System.out.println("Prime");//output answer
            }
            else{
                System.out.println("Composite");//output number
            }
        }
    }
}