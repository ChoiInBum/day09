package quiz;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestClass01 t = new TestClass01();
		
		String name;
		int kor, eng, math;
		
		System.out.print("이름 >> ");
		name = sc.next();		
		System.out.print("국어 점수 >> ");
		kor = sc.nextInt();
		System.out.print("영어 점수 >> ");
		eng = sc.nextInt();
		System.out.print("수학 점수 >> ");
		math = sc.nextInt();
		System.out.println(t.sums(kor, eng, math));
		System.out.println(t.average());
	}
}