import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write task number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
                Task1 task = new Task1();
                Task1.task1();
        }
    }
}