package syntax.class22__Overriding_Polymorphism;

public class Addition {

	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	
	public static void main(String[] args) {
		
		Addition obj=new Addition();
		obj.add(12, 14);// compiler time polymorphism
		                // we already know which method executing based on the parameters

	}
}
