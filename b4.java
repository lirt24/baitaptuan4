package b4;

import java.util.Scanner;

public class b4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên dương: ");
        int n = sc.nextInt();
        boolean check = true;
        if (n <= 1)
            check = false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) 
                check = false;
        if (check) 
            System.out.println(n + " là số nguyên tố.");
        else
            System.out.println(n + " không phải là số nguyên tố.");
	}
}
