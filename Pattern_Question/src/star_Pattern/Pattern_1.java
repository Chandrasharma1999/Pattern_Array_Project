package star_Pattern;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of row:- ");
		int row = sc.nextInt();
		int i,j;
		for(i = 1;i <= row; i++) {
			for(j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
