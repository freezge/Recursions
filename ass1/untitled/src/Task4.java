import java.util.Scanner;
public class Task4 {
    /*
     * is number prime or not via recursion
     * @param n - number
     * @param sc - scanner for taking input from console
     * @param i - counter
     * @param f - to save  factorial
     * @param ans - for answer
     */
    public static int ffact(int a, int i, int f){//function for task4
        if(a < i){// checker
            return f;//end pf recursion
        }
        else{
            return ffact(a, i + 1, f * i);//recursion
        }

    }
    public static void task4() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter digit");
        int n = sc.nextInt();//number
        if (n == 0) { // checking if 0 is written
            System.out.println("1");//output number
        }
        else {
            int ans = ffact(n, 2, 1);//calling for function to find minimum
            System.out.println(ans);//output answer
        }
    }
}