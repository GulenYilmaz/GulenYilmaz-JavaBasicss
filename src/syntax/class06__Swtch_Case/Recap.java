package syntax.class06__Swtch_Case;

public class Recap {
	
	public static void main(String[] args) {
		/* if hour between 1-11--->morning
		 * if hour between 12-15--->afternoon
		 * if hour between 16-20---> evening
		 * if hour between 21-24---> night
		 * 
		 */
		
		int hour=19;
		String timeOfDay;
		if (hour>=1 && hour<=11) {
			timeOfDay="Morning";
		}else if(hour>=12 && hour<=15){
			timeOfDay="Afternoon";
		}else if(hour>=16 && hour<=20){
			timeOfDay="Evening";
		}else if(hour>=21 && hour<=24){
			timeOfDay="Night";
		}else {
			timeOfDay="Unknown";
			
			
		}
		//if time of the day is not unkwon---> only then I wan t to see the message
		if (!timeOfDay.equals("Unknown")) {
			System.out.println("Right now is "+timeOfDay);
		}
				
	}

}
