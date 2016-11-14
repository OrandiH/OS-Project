package osproject;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class CPU {
	Semaphore CPUstatus = new Semaphore(1);
	Semaphore num_of_waiting_processes = new Semaphore(1);
	Semaphore mutex = new Semaphore(1);
	
	public static Map maplist = new Map()
		{{
			maplist.Insert("R1", 23);
			maplist.Insert("R2", 10);
			maplist.Insert("R3", 17);
			maplist.Insert("R4", 27);
			maplist.Insert("R5", 7);
			maplist.Insert("R6", 87);
			maplist.Insert("R7", 977);
			maplist.Insert("R8", 120);
			maplist.Insert("R9", 234);
			maplist.Insert("R10", 50);
			
		}};
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num_of_processes;
		Queue JobQueue = new Queue();
		Queue ReadyQueue = new Queue();
		
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
		 }while(input.hasNextInt() != false);
		}
		input.close();
		
		ProcessGen [] Processes = new ProcessGen[num_of_processes];
		for (int i = 0;i<=num_of_processes;i++)
		{
			JobQueue.Enqueue(Processes[i]);
		}
		
		for(int x = 0;x<=5;x++)
		{
			//Sort first 5 jobs based on priority
			//Add them to ready queue
		}
		
		
		//Make processes in ready queue run
		
		//Check task given
		
		
		
	}

}
