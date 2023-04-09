import java.util.Scanner;

public class Task6 {
    /*
     * power of a via recursion
     * @param a - first number
     * @param sc - scanner for taking input from console
     * @param i - counter
     * @param b - second number
     */
    private static int fpower(int a, int b, int i){//function for task5
        if(i == b){//end of recursion
            return a;
        }
        else{
            return a * fpower(a, b, i + 1);//recursion
        }

    }
    public static void task6() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter 2 digits");
        int a = sc.nextInt();//first number
        int b = sc.nextInt();//seconds number
        if(b <= 0){
            System.out.println(2);
        }
        else{
        System.out.println(fpower(a, b, 1));//output answer
        }
    }
}
