package thachche;

import java.util.Scanner;

public class giasp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong san pham la:  ");
		int n = sc.nextInt();
		float[] arr = new float[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap gia san pham thu " + (i + 1) + "la :");
			arr[i] = sc.nextFloat();
		}

//		Giá sản phẩm tăng dần 

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					float temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Gia san phan tang dan: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

//		Giá sản phẩm giảm dần

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					float temp_2 = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp_2;

				}
			}

		}

		System.out.println("Gia san pham giam dan la: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

//		Tim gia tri cu the
		System.out.println("Nhap gia san pham ma ban muon: ");
		float so = sc.nextFloat();
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (so == arr[i]) {
				System.out.println("Gia" + arr[i] + "co nam trong danh sach");
				found = true;
				break;

			}

		}

		if (!found) {
			System.out.println("Gia " + so + "khong nam trong danh sach");
		}

		sc.close();

	}

}
