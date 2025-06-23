import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        int currentDay = LocalDate.now().getYear();
        if (age < 0) {
            System.err.println("tuổi nhập không hợp lệ!!");
            return;
        }
        int yearOfBirth = currentDay - age;
        System.out.printf("Năm sinh : %d", yearOfBirth);

    }
}
