package ra;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình vuông: ");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Chu vi hình vuông là: ");
        double area = side * side;
        System.out.println("Diện tích hình vuồn là: ");
    }
}
