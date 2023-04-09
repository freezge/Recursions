import java.util.Scanner;
public class Task7 {
    /*
     * finding reverse of an array via recursion
     * @param arr - array
     * @param n - length of an array
     * @param sc - scanner for taking input from console
     * @param i - index
     * @param arr - for array
     * I did not understand the task, so I did what I thought
     */


    private static void freverse(int[] arr, int i){//function for task7
        if(i == 0){//checking if we are on the first element of array
            System.out.print(arr[i]);//print first elem of arr
        }
        else{
            System.out.print(arr[i] + " ");//printing elems
            freverse(arr, i - 1);//recursion
        }
    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter length of an array");
        int n = sc.nextInt();//length of an array
        System.out.println("please enter an array");
        int[] arr = new int[n];//array from condition
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//reading array
        }
        freverse(arr, n - 1);
    }
}
