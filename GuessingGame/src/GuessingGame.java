import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
	public static void main(String args[]){
		Random ran = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("Guess a number 0-25");
		//get user input for a
		int a= reader.nextInt();
		int b= ran.nextInt(25);
		if(a==b){
			System.out.println("Correct!");
		}
		else if(a<b){
			System.out.println("Too Low!");
		}
		else if(a>b){
			System.out.println("Too High!");
		}
	}
}
