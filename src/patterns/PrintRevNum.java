package patterns;

public class PrintRevNum {
public static void main(String[] args) {
	int no = 5;
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(no + " ");
		}
		no--;
		System.out.println();
	}
}
}
