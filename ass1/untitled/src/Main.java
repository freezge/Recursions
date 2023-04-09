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
            case 3:
                Task3.task3();
                break;
            case 4:
                Task4.task4();
                break;
            case 5:
                Task5.task5();
                break;
            case 6:
                Task6.task6();
                break;
            case 7:
                Task7.task7();
                break;
            case 8:
                Task8.task8();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
