import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write task number ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch (a) {
            case "1" -> Task1.task1();
            case "2" -> Task2.task2();
            case "3" -> Task3.task3();
            case "4" -> Task4.task4();
            case "5" -> Task5.task5();
            case "6" -> Task6.task6();
            case "7" -> Task7.task7();
            case "8" -> Task8.task8();
            case "9" -> Task9.task9();
            case "10" -> Task10.task10();
            default -> System.out.println("Wrong number");
        }
    }
}
