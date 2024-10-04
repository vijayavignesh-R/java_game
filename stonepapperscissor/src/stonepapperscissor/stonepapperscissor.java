package stonepapperscissor;

import java.util.Random;
import java.util.Scanner;

public class stonepapperscissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		String[]option = {"stone","paper","scissor"};
		boolean playagain = true;
		
		while(playagain) {
			System.out.println("Enter your choice");
		    String userchoice = sc.nextLine().toLowerCase();
		    
		    int index = random.nextInt(3);
		    String computerchoice = option[index];
		    
		    if(userchoice.equals(computerchoice)){
		    	System.out.println("Its tie");
		    	
		    }else if((userchoice.equals("stone") && computerchoice.equals("scissor")) || 
		    		(userchoice.equals("scissor") && computerchoice.equals("paper")) ||
		    		(userchoice.equals("paper") && computerchoice.equals("stone")))    {
		    			System.out.println("You Win");
		    		}
		    else {
		    	System.out.println("you loose");
		    }
		    
		    System.out.println("Do you want play again(yes/no)");
		    String answer  = sc.nextLine().toLowerCase();
		    if(!answer.equals("yes")) {
		    	playagain=false;
		    	System.out.println("thanks for playing");
		    	
		    }
		    
		    
		}
		
		

	}

}
