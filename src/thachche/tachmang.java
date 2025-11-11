package thachche;

import java.util.Scanner;

public class tachmang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tun n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + (i + 1) + "la: ");
			arr[i] = sc.nextInt();
		}

		// Tạo 2 mảng tạm bằng kích thước tối đa n
		int[] le = new int[n];
		int[] chan = new int[n];
		int countChan = 0;
		int countLe = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				chan[countChan] = arr[i];
				countChan++;
			} else {
				le[countLe] = arr[i];
				countLe++;
			}
		}

		System.out.println("Mang chan ");
		for (int i = 0; i < countChan; i++) {
			System.out.println(chan[i] + " ");
		}

		System.out.print("Mang le: ");
		for (int i = 0; i < countLe; i++) {
			System.out.print(le[i] + " ");
		}

		sc.close();

	}

}
