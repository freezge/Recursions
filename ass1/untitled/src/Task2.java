import java.util.Scanner;
public class Task2 {
    public static int favg(int[] arr, int i){//function for task1
        if(i == arr.length - 1){//checking if we are on the last element of array
            return arr[i];// returning last value
        }
        else{
            int sum = favg(arr, i + 1);//recursion
            return sum + arr[i];//
        }
    }
    public static void task2() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter length of an array");
        int n = sc.nextInt();//length of an array
        int[] arr = new int[n];//array from condition
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//reading array
        }
        float ans = favg(arr, 0);//calling for function to find minimum
        System.out.println("Average value is " + ans/n);//output answer
    }
}
