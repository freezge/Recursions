import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write task number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
                Task1.task1();
                break;
            case 2:
                Task2.task2();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}