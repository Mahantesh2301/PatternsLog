package patterns;

public class Print1To15 {
public static void main(String[] args) {
	int num=1;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
}
}
