import java.util.Scanner;
public class Task7 {
    /*
     * finding reverse via recursion
     * @param n - length of an array
     * @param sc - scanner for taking input from console
     * @param i - index
     * @param arr - for array
     * I did not understand the task, so I did what I thought
     */


//    private static void freverse(int[] arr, int i){//function for task7
//        if(i == 0){//checking if we are on the first element of array
//            System.out.print(arr[i]);//print first elem of arr
//        }
//        else{
//            System.out.print(arr[i] + " ");//printing elems
//            freverse(arr, i - 1);//recursion
//        }
//    }
    private static void freverse(Scanner sc, int n, int i){//function for task7
        if (i == n){// end of recursion
            System.out.print(sc.nextInt() + " ");// print the last elem from those which where inputted
        }
        else {
            int a = sc.nextInt();// next digit
            freverse(sc, n, i + 1);// recursion
            System.out.print(a + " ");// output
        }
    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter length of an array");
        int n = sc.nextInt();//length of an array
        System.out.println("Enter arr");
        freverse(sc, n, 1);
    }
}
