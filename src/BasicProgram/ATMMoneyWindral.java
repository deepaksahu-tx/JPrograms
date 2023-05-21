package BasicProgram;

import java.util.Scanner;

public class ATMMoneyWindral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int balance=5000,withdraw,deposite;
		
		while(true) {
			System.out.println("Choose 1 for Enter the withdraw amount");
			System.out.println("choose 2 for deposite the amount and check the balnce");
			System.out.println("choose 3 for Exit from the the system");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the money to withdraw");
				
			    withdraw=sc.nextInt();
			    if(balance>withdraw){
			    	balance=balance-withdraw;
			      }else {
					System.out.println("Insufficient balance");
				}
			    System.out.println("");
			    break;
			    
			case 2:
				System.out.println("Enter the deposite amount");
				
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("Updated Available balance is " + balance);
				System.out.println("");
				break;
				
			case 3:
				System.out.println("Exit from the system");
				System.exit(0);
			}
			
		}
		

	}

}
