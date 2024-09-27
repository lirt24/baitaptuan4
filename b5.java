package b5;

import java.util.Scanner;

public class b5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();
        int tmp1 = a, tmp2 = b,tmp = 0;
        int ucln,bcnn;
        while (tmp2 != 0) {
            tmp = tmp2;
            tmp2 = tmp1 % tmp2;
            tmp1 = tmp;
        }
        ucln = tmp;
        bcnn = (a * b) / ucln;
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + bcnn);
	}
}
