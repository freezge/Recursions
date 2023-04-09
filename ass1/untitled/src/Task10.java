import java.util.Scanner;
public class Task10 {
    /*
     * gcd via recursion
     * @param sc - scanner for taking input from console
     * @param i - counter
     * @param a - digit a
     * @param b - digit b
     */
    private static int fgcd(int n, int k, int i) {//function for task10
        if (n % i == 0 && k % i == 0){//gcd
            return i;
        }
        else return fgcd(n, k, i - 1);//recursion
    }
    public static void task10() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter 2 numbers - n and k");
        int n = sc.nextInt();//input n
        int k = sc.nextInt();// input k
        if (n > k){
            System.out.println(fgcd(n, k, k));//caling for func
        }
        else {
            System.out.println(fgcd(k, n, n));//ccalling ofr func
        }
    }
}
