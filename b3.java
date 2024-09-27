package b3;

import java.util.Scanner;

public class b3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên dương: ");
        int n = sc.nextInt();
        long giaiThua;
        if (n == 0 || n == 1) {
            giaiThua = 1;
        } else {
            giaiThua = 1;
            for (int i = 2; i <= n; i++) {
                giaiThua *= i;
            }
            System.out.println(n + "!= " + giaiThua);
	}
}
}
