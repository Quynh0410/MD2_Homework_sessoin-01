package ra;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double exchangeRate = 25.646;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: " );
        double usd = scanner.nextDouble();
        double vnd = usd * exchangeRate;
        System.out.println("Số tiền tương ứng VND: " + vnd);
    }
}
