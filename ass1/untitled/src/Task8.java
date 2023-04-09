import java.util.Scanner;
public class Task8 {
    /*
     * is digits or not via recursion
     * @param sc - scanner for taking input from console
     * @param i - index
     * @param s - string(line)
     */
    private static boolean fisdigit(String s, int i) {//function for task8
        if (Character.isDigit(s.charAt(i))) {
            if (i == s.length() - 1) {
                return true;
            } else {
                return fisdigit(s, i + 1);
            }
        }
        return false;
    }
    public static void task8() {
        Scanner sc = new Scanner(System.in);//to read from console
        System.out.println("Please enter a line");
        String s = sc.nextLine();//length of an array
        System.out.println(fisdigit(s,0));
    }
}
