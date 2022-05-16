import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean con = true;
		while(con == true) {
	
		System.out.println("hello, what is your name?:");
		String name = input.next();
		
		CYOAObject story = new CYOAObject(name);
		System.out.println(story.beginning());
		int hero = input.nextInt();
		
		if(hero == 1) {
			System.out.println(story.ending());
			int choice = input.nextInt();
			
			if(choice == 1) {
				System.out.println(story.finalChoice1());
			}
		
			else if(choice == 3){
				System.out.println(story.scene2choice1());
			}
			else if(choice == 4){
				System.out.println(story.scene2choice2());
			}
			else if(choice == 5){
				System.out.println(story.scene2choice3());
			}
			else if(choice == 6) {
				System.out.println(story.scene2choice4());
			}
		}
		
		else if(hero == 2) {
			System.out.println(story.decisionChoice2());
			int choice2 = input.nextInt();
		
			if(choice2 == 1) {
				System.out.println(story.finalchoice2());
			}
			else{
				System.out.println(story.otherChoice2());
			}
		}
		else if(hero == 3) {
			System.out.println(story.decisionChoice3());
			int choice3 = input.nextInt();
			
			if(choice3 == 1) {
				System.out.println(story.finalChoice2());
			}
			else{
				System.out.println(story.otherChoice3());
			}

		}
		else if(hero == 4) {
			System.out.println(story.decisionChoice4());
			int choice4 = input.nextInt();
		
			if(choice4 == 1){
				System.out.println(story.finalchoice4());
			}
			else{
				System.out.println(story.otherchoices4());
				}
			}
		}
	}
}
