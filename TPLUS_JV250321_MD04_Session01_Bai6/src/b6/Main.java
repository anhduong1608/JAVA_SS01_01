package b6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("width:");
    float width = Float.parseFloat(scanner.nextLine());
        System.out.println("height:");
    float height = Float.parseFloat(scanner.nextLine());
    float area = width * height;
    float circumference = (width + height) * 2;
        System.out.printf("diện tích là:%.2f \n chu vi là:%.2f",area, circumference );
}}
