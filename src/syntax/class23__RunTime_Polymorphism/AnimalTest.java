package syntax.class23__RunTime_Polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal=new Bird();
		animal.sleep();//--->Bird sleeps
		
		animal.whoAmI();//--->I am an animal
		Animal.whoAmI();//--->I am an animal
		
		Bird.whoAmI();//--->I am a bird
		
	}
}