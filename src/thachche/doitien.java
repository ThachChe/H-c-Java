package thachche;

import java.util.Scanner;

public class doitien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap USD: ");
		float usd = sc.nextFloat();
		float vnd = usd * 25000;
		System.out.println("So tien vnd la:" + vnd);

	}
}
