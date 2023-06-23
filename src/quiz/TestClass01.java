package quiz;

public class TestClass01 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public int sums(int kor, int eng, int math) {
		sum = kor + eng + math;
		
		return sum;
	}
	
	public double average() {
		avg = (double)sum/3;
		
		return avg;
	}
	
	public void gradeFunc(String name, int kor, int eng, int math, int sum, double avg) {
		
	}
}