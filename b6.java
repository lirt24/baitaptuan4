package b6;

import java.util.Scanner;

public class b6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
        int n = sc.nextInt();
        int reversedNum = 0;
        int tmp=n;
        while (tmp != 0) {
            int digit = tmp % 10;
            reversedNum = reversedNum * 10 + digit;
            tmp /= 10;
        }
        if (n == reversedNum)
            System.out.println(n + " là số đối xứng.");
        else 
            System.out.println(n + " không phải là số đối xứng.");
    }
}
