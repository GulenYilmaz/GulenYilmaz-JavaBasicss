package syntax.class21__SuperKeyword_Overloading;

public class AdditionTest {
	public static void main(String[] args) {

		Addition obj=new Addition();
		obj.add(10.99, 10.99);
		obj.add(10, 10.99);
		obj.add(10, 10, 10);
	}
}