package variable;

class TestClass05 {
	public static String msg="연습";
	public int num;
}

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println(TestClass05.msg);
		TestClass05 t = new TestClass05();
		System.out.println(t.msg);
	}
}