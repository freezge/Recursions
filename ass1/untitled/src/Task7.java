import java.util.Scanner;
public class Task7 {
    /*
     * finding min value through recursion
     * @param arr - array
     * @param n - lenght
     * @param sc - scanner for taking input from console
     * @param i - to navigate in recursion
     * @param min - for minimum
     */


//    public static void freverse(int[] arr, int i){//function for task7
//        if(i == 0){//checking if we are on the last element of array
//            System.out.print(arr[i]);
//        }
//        else{
//            System.out.print(arr[i] + " ");
//            freverse(arr, i - 1);
//        }
//    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter length of an array");
        int n = sc.nextInt();//length of an array
        System.out.println("please enter array");
        int[] arr = new int[n];//array from condition
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//reading array
        }
        freverse(arr, n - 1);
    }
}
