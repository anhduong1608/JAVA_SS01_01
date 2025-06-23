//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String name = "Mai Cong Trung Tien";
       int age = 32 ;
       String address = "Hà Nôi";
//        Sử dụng System.out.printf() để in tên và tuổi ra màn hình theo định dạng sau:
//        "Tên tôi là [tên], tôi [tuổi] tuổi, hiện tại đang học tại PTIT-HCM. Quê ở [địa chỉ]"
//        Trong đó [tên], [tuổi], [địa chỉ] là các thông tin cá nhân của sinh viên
        System.out.printf("Tên tôi là: %s, tôi %d tuổi, hiện tại đang học tại PTIT-HCM. " +
                "Quê ở %s",name, age, address  );
        }};