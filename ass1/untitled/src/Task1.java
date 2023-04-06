import java.util.Scanner;

public class Task1 {
    /*
     * finding min value through recursion
     * @param arr - array
     * @param n - lenght
     * @param sc - scanner for taking input from console
     * @param i - to navigate in recursion
     * @param min - for minimum
     * */
    public static int fmin(int[] arr, int i){//function for task1
        if(i == arr.length - 1){//checking if we are on the last element of array
            return arr[i];// returning last value
        }
        else{
            int min = fmin(arr, i + 1);//recursion
            return Math.min(min, arr[i+1]);//checking min between 2 elems
        }
    }
    public static void task1() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter length of an array");
        int n = sc.nextInt();//length of an array
        int[] arr = new int[n];//array from condition
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//reading array
        }
        int min = fmin(arr, 0);//calling for function to find minimum
        System.out.println("Min value is " + min);//output minimum
    }
}
