package osproject;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class CPU {
	Semaphore CPUstatus = new Semaphore(1);
	Semaphore num_of_waiting_processes = new Semaphore(1);
	Semaphore mutex = new Semaphore(1);
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num_of_processes;
		
		try
		{
		System.out.println("Enter the number of processes you want for the simulation: ");
		num_of_processes = input.nextInt();
		}
		catch(InputMismatchException e)
		{
		 do
		 {
			 System.out.println("Re enter the number of processes");
			 num_of_processes = input.nextInt();
		 }while(input.hasNextInt() == false);
		}
		input.close();
		for (int i = 0;i<=num_of_processes;i++)
		{
			//Process[] Processes = new Process();
		}
		
		
		
		
	}

}
