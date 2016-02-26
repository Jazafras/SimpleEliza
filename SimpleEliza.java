import java.util.Random;

public class SimpleEliza {
	
	int randomQ = -1;

	public boolean hasMoreQuestions(){
		return true;
	}
	
	public String askQuestion(){
		String [] Questions = {"How are you?", "What is your name?", "How old are you?", 
				"What is your favorite color?", 
				"What is the airspeed velocity of an unladen swallow?",
				"What is your quest?"}; 
        int random = (int) (Math.random() * Questions.length);
        while (random == randomQ){
        	random = (int) (Math.random() * Questions.length);
        }
        randomQ = random;
        return Questions[random];
    
		
	}
		
	public String listen(String statement){
		if ((statement.toLowerCase().contains("good") || 
				statement.toLowerCase().contains("love") ||
				statement.toLowerCase().contains("adore") || 
				statement.toLowerCase().contains("positive") ||
				statement.toLowerCase().contains("enjoy"))
				&&
		    (statement.toLowerCase().contains("bad") || 
		    	statement.toLowerCase().contains("hate") ||
				statement.toLowerCase().contains("negative") ||
				statement.toLowerCase().contains("dislike") ||
				statement.toLowerCase().contains("despise")))
			return "Huh?";
		if (statement.toLowerCase().contains("good") || 
				statement.toLowerCase().contains("love") ||
				statement.toLowerCase().contains("adore") || 
				statement.toLowerCase().contains("positive") ||
				statement.toLowerCase().contains("enjoy"))
			return "That's nice.";
		if (statement.toLowerCase().contains("bad") || 
				statement.toLowerCase().contains("hate") ||
				statement.toLowerCase().contains("negative") ||
				statement.toLowerCase().contains("dislike") ||
				statement.toLowerCase().contains("despise"))
			return "Yikes.";
		else return null;
		
	}


}
