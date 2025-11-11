package thachche;

import java.util.Scanner;

public class vonglap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n= ");
		int n = sc.nextInt();
		System.out.println("Bang cuu chuong" + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + (n * i));
		}

		sc.close();

	}

}
