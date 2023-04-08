import java.util.Scanner;
public class Task5 {
    /*
     * is number prime or not via recursion
     * @param n - number
     * @param sc - scanner for taking input from console
     * @param i - counter
     * @param ans - for answer
     * @param f - limit for recursion
     * @param a - predposledniy number
     * @param b - last number
     */
    public static int ffibo(int a, int b, int i, int f){//function for task5
        if(i == f){//end of recursion
            return b;
        }
        else{
            return ffibo(b, a + b, i + 1, f);//recursion
        }

    }
    public static void task5() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter digit");
        int n = sc.nextInt();//number
        System.out.println(ffibo(0, 1, 1, n));//output answer
    }
}