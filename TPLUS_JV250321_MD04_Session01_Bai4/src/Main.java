


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Khai báo 2 biến kiểu số nguyên int và gán giá trị :
//        Khai báo hai số nguyên a và b có kiểu int.
//                Khởi tạo các giá trị bất kỳ cho 2 biến
//        Thực hiện các phép toán:
//        Tính tổng của a và b và gán cho .
//                Tính hiệu của a và b.
//                Tính tích của a và b.
//                Tính thương của a chia cho b.
//        Tính phần dư khi chia a cho b.
//        In giá trị 2 biến a, b và kết quả các phép tính ra màn hình .        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
        int a = 10;
        int b = 20;
        int cong = a + b;
        int tru = a - b;
        int nhan = a * b;
        float chia = (float) a / b;
        int du = a % b;
        System.out.printf("a = %d, b = %d \n a + b = %d \n", a, b, cong);
        System.out.printf("a = %d, b = %d \n a - b = %d \n", a, b, tru);
        System.out.printf("a = %d, b = %d \n a * b = %d \n", a, b, nhan);
        System.out.printf("a = %d, b = %d \n a / b = %f \n", a, b, chia);
        System.out.printf("a = %d, b = %d \n a chia lay du b = %d \n", a, b, du);


    }
}

