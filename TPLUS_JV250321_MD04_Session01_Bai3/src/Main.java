import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính:");
        float radius = Float.parseFloat(scanner.nextLine());

        double area = Math.PI * radius * radius;
        System.out.printf("Diện tích là : %f", area);
        }}


