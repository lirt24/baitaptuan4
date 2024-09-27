package b1;

import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị của n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
	}
}
