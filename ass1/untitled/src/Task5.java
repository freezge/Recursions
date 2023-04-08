import java.util.Scanner;
public class Task5 {
    /*
     * is number prime or not via recursion
     * @param n - number
     * @param sc - scanner for taking input from console
     * @param i - counter
     * @param ans - for answer
     */
    public static int ffact(int a, int i, int f){//function for task3
        if(a < i){
            return f;
        }
        else{
            return ffact(a, i + 1, f * i);
        }

    }
    public static void task5() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter digit");
        int n = sc.nextInt();//number
        if (n == 0) { // checking if 0 is written
            System.out.println("1");//output number
        }
        else {
            int ans = ffact(n, 2, 1);//calling for function to find minimum
            System.out.println(ans);
        }
    }
}