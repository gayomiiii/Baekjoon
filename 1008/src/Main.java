
// https://www.acmicpc.net/problem/1008
// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		System.out.println(A/B);
	}
}
