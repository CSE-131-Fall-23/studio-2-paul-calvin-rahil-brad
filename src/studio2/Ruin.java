package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the amount of money that you are starting with?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		
	  double currentAmount = startAmount;
		
		while (currentAmount <= winLimit && currentAmount != 0) {
			if (Math.random() < winChance) 
			{
				currentAmount ++ ;
				 System.out.println(currentAmount);
			}
			else {
		    currentAmount--;
		    
		    System.out.println(currentAmount); 
		}
		}
	}
}
1`
