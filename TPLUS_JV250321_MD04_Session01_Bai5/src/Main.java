

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tử số thứ nhất a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mẫu số thứ nhất b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tử số thứ hai c:");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mẫu số thứ hai d:");
        int d = Integer.parseInt(scanner.nextLine());

        int numerator =((a * d) + (b * c));
        int denominator =  (b * d);
        System.out.printf("kết quả a/b + c/d : %d / %d", numerator, denominator);


        }
    }
