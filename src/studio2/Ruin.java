package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the amount of money that you start with?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the probability that you win a single day?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the win limit amount?");
		double winLimit = in.nextDouble();
		
		System.out.println("What is the total number of simulations?");
		int totSim = in.nextInt();
		
		int simNumber = 1;
		while (startAmount <= winLimit && simNumber <= totSim) {
			simNumber++ ;
			
			double number = (Math.random());
			if (number >= winChance) {
				startAmount++;
				System.out.println("Simulation " + simNumber + ":" + startAmount + " Win");
				
				
			}
			else {
				startAmount--;
				System.out.println("Simulation " + simNumber + ":" + startAmount + " Lose");
				
			}
			
		}
		System.out.println("Simulation " + simNumber + ":" + startAmount +  " Lose");
	}
}
