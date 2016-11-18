

import java.util.*;

public class ProcessList implements Runnable {
	private int PID;
	private String Task[] = { "Adding", "Removing", "Retrieve", "Sort", "Calculate" };
	private int Priority;
	private long CreateTime;
	private long StartTime;
	private long EndTime;
	

	private static Date Create_time;
	private static Date Start_time;
	private static Date End_time;

	private int Attempts;
	private int SleepTime;

	Random ran = new Random();

	public ProcessList() {

		CreateTime = System.currentTimeMillis();
		StartTime = System.currentTimeMillis();
		EndTime = System.currentTimeMillis();
		Attempts = 0;

	}
	

	public void SetPID() {
		Random ran = new Random();
		PID = ran.nextInt(40) + 1;
	}

	public int GetPID() {
		return PID;
	}

	/*
	 * public void SetTask(){
	 * 
	 * }
	 */

	public String GetTask() {
		int x;
		x = ran.nextInt(5);
		return Task[x];
	}

	public void SetPriority() {
		Priority = ran.nextInt(5) + 1;
	}

	public int GetPriority() {
		return Priority;
	}

	public void SetCreateTime() {

	}

	public long GetCreateTime() {
		return CreateTime % 1000;
	}

	public void SetStartTime() {

	}

	public long GetStartTime() {
		return StartTime;
	}

	public void SetEndtiume() {

	}

	public long GetEndTime() {
		return EndTime;
	}

	public Date getCreate_time() {
		return Create_time;
	}

	public void setCreate_time(Date create_time) {
		Create_time = create_time;
	}

	public Date getStart_time() {
		return Start_time;
	}

	public void setStart_time(Date start_time) {
		Start_time = start_time;
	}

	public Date getEnd_time() {
		return End_time;
	}

	public void setEnd_time(Date end_time) {
		End_time = end_time;
	}

	public void SetAttempts(int x) {
		Attempts = x;
	}

	public int GetAttempts() {
		return Attempts;
	}

	public void SetSleepTime() {
		SleepTime = ran.nextInt(5);
	}

	public int GetSleepTime() {
		return SleepTime;
	}

	public synchronized static void Insert() {
		Random ran = new Random();
		Map i = new Map();
		MapEntry top = i.getHead();
		MapEntry newMapEntry = new MapEntry("R11", ran.nextInt());
		if(i.getHead()== null)
		{
		i.setHead(newMapEntry);
		}
		else top.setNextMapEntry(newMapEntry);
		CPU.maplist.InsertAtFront(newMapEntry.getKey(),newMapEntry.getValue());
	}

	public synchronized static void Delete() {
		Random ran = new Random();
		int Del = ran.nextInt(977 - 10 + 1) + 10;
		if (CPU.maplist.getHead().getValue() == Del) {
			CPU.maplist.getHead().getNextMapEntry();
		}
		MapEntry temp = CPU.maplist.getHead();

		while (temp.getNextMapEntry() != null) {
			if (temp.getNextMapEntry().getValue() == Del) {
				temp.setNextMapEntry(temp.getNextMapEntry());
				break;
			} else {
				temp = temp.getNextMapEntry();
			}
		}

	}
	

	@Override
	public void run() {
		String task = this.GetTask();
			switch(task)
			{
			case "Adding":
				System.out.println("Insertion happening");
				
				CPU.maplist.printList();
				Insert();
				System.out.println("New List:");
				CPU.maplist.printList();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
			break;
			case "Calculate":
				System.out.println("Calculate happening");
				CPU.maplist.Calculate();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			break;
			case "Removing":
				System.out.println("Delete happening");
				CPU.maplist.printList();
				Delete();
				System.out.println("New List:");
				CPU.maplist.printList();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			break;
			case "Retrieve":
				System.out.println("Retrieve happening");
				CPU.maplist.Search();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			break;
			case "Sort":
				System.out.println("Sorting happening");
				CPU.maplist.sort();
				System.out.println("New List");
				CPU.maplist.printList();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			}
			
			
			
		
	}
}