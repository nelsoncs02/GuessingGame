import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
	public static void main(String args[]){
		Random ran = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("Guess a number 0-25");
		//get user input for a
		int b= ran.nextInt(25);
		boolean done = false;
		while(!done){
			int a = reader.nextInt();
			if(a==b){
				done=true;
				System.out.println("Correct, but different!!");
			}
			else if(a<b){
				System.out.println("Too Low!");
			}
			else if(a>b){
				System.out.println("Too High!");
			}
		}
	}
}
