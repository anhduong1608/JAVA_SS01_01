import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        iết chương trình Java thực hiện tính toán quãng đường đi được khi yêu cầu người dùng nhập vào:
//
//        Vận tốc (Không được nhỏ hơn 0)
//        Thời gian (Không được nhỏ hơn 0)
//        Biết công thức: Quãng đường = Vận tốc x Thời gian
//
//        Yêu cầu:
//
//        Nhập vận tốc (km/h)
//        Nhập thời gian đi (giờ)
//                Tính quãng đường đi được
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vận tốc(km/h):");
        float speed = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập thời gian đi(giờ):");
        float time = Float.parseFloat(scanner.nextLine());
        float result = speed * time;
        if (speed < 0 || time < 0) {
            System.err.println("vận tốc hoặc thời gian nhập vào không đúng!!!");
            return;
        }
        System.out.printf("Quãng Đường:%.2f KM", result);

    }
}