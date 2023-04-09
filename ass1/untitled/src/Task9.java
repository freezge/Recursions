import java.util.Scanner;
public class Task9 {
    /*
     * is digits or not via recursion
     * @param sc - scanner for taking input from console
     * @param i - index
     * @param s - string(line)
     */
    private static int ffact(int a, int i, int f){//function for task9(from task4)
        if(a < i){// checker
            return f;//end pf recursion
        }
        else{
            return ffact(a, i + 1, f * i);//recursion
        }
    }
    private static int fbincoef(int n, int k) {//function for task9
        //C(n,k) = n! / ( k! * (n-k)!)
        return ffact(n, 1, 1) / (ffact(k, 1, 1) * ffact(n - k, 1, 1));
    }
    public static void task9() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter 2 numbers - n and k");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(fbincoef(n, k));
    }
}
