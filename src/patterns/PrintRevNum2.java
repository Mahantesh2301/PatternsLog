package patterns;

public class PrintRevNum2 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		int no = 5;
		for (int j = 1; j <= i; j++) {
			System.out.print(no + " ");
			no--;
		}

		System.out.println();
	}
}
}
