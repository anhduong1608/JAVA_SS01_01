import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("product name:");
        String productName = scanner.nextLine();
        System.out.println("Quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("price:");
        float price = Float.parseFloat(scanner.nextLine());
        float priceTotal = price * quantity;
        System.out.println("-----------Hoa don ----------");
        System.out.printf("tên sản phẩm:%s \n Số lượng:%d \n Đơn giá:%,.0f \n" +
                        "tên sản phẩm:%s \n Số lượng:%d \n Đơn giá:%,.0f \n Thành tiền:%,.0f", productName,
                quantity, price, productName, quantity, price, priceTotal);


    }
}