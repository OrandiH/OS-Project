
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class CPU {
	Semaphore CPUstatus = new Semaphore(1);
	Semaphore num_of_waiting_processes = new Semaphore(1);
	Semaphore mutex = new Semaphore(1);
	static Map maplist = new Map();
	
		
	

	public static void main(String[] args) {
		 
		
				maplist.InsertAtFront("R1", 23);
				maplist.InsertAtFront("R2", 10);
				maplist.InsertAtFront("R3", 17);
				maplist.InsertAtFront("R4", 27);
				maplist.InsertAtFront("R5", 7);
				maplist.InsertAtFront("R6", 87);
				maplist.InsertAtFront("R7", 977);
				maplist.InsertAtFront("R8", 120);
				maplist.InsertAtFront("R9", 234);
				maplist.InsertAtFront("R10", 50);
				
		
		
		
		Scanner input = new Scanner(System.in);
		int num_of_processes;
		
		Queue ReadyQueue = new Queue();
		QueueNode current = new QueueNode();
		int count = 0;
		current = ReadyQueue.getFront();
		
		Calendar cal = Calendar.getInstance();
		  cal.getTime();
		 SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		
		  
	//USE TO POPULATE LINKED LIST WITH VALUES	
		LinkList Processes = new LinkList();
		System.out.println("Enter the number of processes you want for the simulation: ");
		num_of_processes = input.nextInt();
		
		for (int x = 0; x < num_of_processes; x++){
			ProcessList d = new ProcessList(); //KEEPS THE RANDOM VALUES FROM STORING 20 OF THE SAME VALUES
			d.setCreate_time(cal.getTime());
			
			d.SetPID();
			d.SetPriority();
			d.GetTask();
			
			Processes.InsertAtFront(d);
		}
		Processes.Sort();
	//	Processes.DisplayList();
		Processes.WriteToFile();
		input.close();
		
		//Add process to ready Queue
		Node temp = Processes.getHead();
		while(temp != null && count != 5)
		{
			ReadyQueue.Enqueue(temp);
			temp = temp.GetNextNode();
			count++;
		}
		
		System.out.println("Ready Queue empty? " +ReadyQueue.IsQueueEmpty());
		System.out.println(" " + count);
		QueueNode Temp = new QueueNode();
		Temp =  ReadyQueue.getFront();
		while(!ReadyQueue.IsQueueEmpty() )
		{	
			 ReadyQueue.Dequeue().GetProcessList().run();
		}
		
		
		/*
		
		
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
		
		
		
		
		for(int x = 0;x<num_of_processes;x++)
		{
			for(int y = 0;y<num_of_processes-x-1;y++)
			{
				if(Processes[y].getPriority()>Processes[y+1].getPriority())
				{
					Temp = Processes[y];
					Processes[y] = Processes[y+1];
					Processes[y+1] = Temp;
				}
			}
			
			//Sort first 5 jobs based on priority
			//Add them to ready queue
		}
	
			ReadyQueue.Enqueue(Processes[0]);
			ReadyQueue.Enqueue(Processes[1]);
			ReadyQueue.Enqueue(Processes[2]);
			ReadyQueue.Enqueue(Processes[3]);
			ReadyQueue.Enqueue(Processes[4]);
		
		
	
		
		//Make processes in ready queue run
		
		//Check task given
		
		
		*/
	}

}
