import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        BMI = Cân nặng (kg) / (Chiều cao (m))²
//
//        Yêu cầu:
//
//        Nhập cân nặng (kg)
//        Nhập chiều cao (m)
//        Tính và in ra chỉ số BMI
        Scanner scanner = new Scanner(System.in);
        System.out.println("weight(kg):");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("height(m):");
        float height = Float.parseFloat(scanner.nextLine());
        float BMI = (float) Math.pow((weight / height), 2);
        System.out.printf("chỉ số BMI:%.2f", BMI);

    }
}