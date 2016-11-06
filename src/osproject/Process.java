package osproject;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.io.*;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Process {


	private static int PID;
	private int task;
	private static int Priority;
	private static Date Create_time;
	private static Date Start_time;
	private static Date End_time;
	private int Attempts;
	private int Sleep_time;


	public Process(int pID, int task, int priority, Date create_time, Date start_time, Date end_time, int attempts,
			int sleep_time) {
		super();
		PID = pID;
		this.task = task;
		Priority = priority;
		Create_time = create_time;
		Start_time = start_time;
		End_time = end_time;
		Attempts = attempts;
		Sleep_time = sleep_time;
	}



	public int getPID() {
		return PID;
	}



	public static void setPID(int pID) {
		PID = pID;
	}



	public int getTask() {
		return task;
	}



	public void setTask(int task) {
		this.task = task;
	}



	public int getPriority() {
		return Priority;
	}



	public static void setPriority(int priority) {
		Priority = priority;
	}



	public Date getCreate_time() {
		return Create_time;
	}



	public static void setCreate_time(Date create_time) {
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



	public int getAttempts() {
		return Attempts;
	}



	public void setAttempts(int attempts) {
		Attempts = attempts;
	}



	public int getSleep_time() {
		return Sleep_time;
	}



	public void setSleep_time(int sleep_time) {
		Sleep_time = sleep_time;
	}



	public static void NewRecord(ArrayList<String> list)
	{
		try{
			BufferedWriter x = new BufferedWriter(new FileWriter("List.txt"));
			for(String a: list)
			{
				x.write(a);
				x.newLine();
			}
			x.close();
			}
		catch (IOException e){
			e.getStackTrace();
			
		}
	}
	public static void DeletefromFile(ArrayList<String> list,String search)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(search));
			{
				list.remove(i);
				NewRecord(list);
			}
		}
	}

	public static void SearchFile(ArrayList<String> list,String search)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(search));
			{
				System.out.println(list.get(i));
			}
		}
	}

	public static void SortFile()
	{
		try
		{
			FileInputStream fstream = new FileInputStream("List.txt");
			
			DataInputStream in = new DataInputStream(fstream);
			String [] arr = new String[8];
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String str;
			while((str = br.readLine()) != null)
			{
				int k=0;
				arr[k]= str;
				k++;
			}
			Arrays.sort(arr);
			in.close();
		}
		
			catch(Exception e)
			{
				System.err.println("Found Error"+e.getMessage());
			}
		

	}
	/*
	public static void Count_intgers()
	{
		try{
		FileInputStream fstream = new FileInputStream("List.txt");
		
		DataInputStream in = new DataInputStream(fstream);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String str;
		while((str = br.readLine()) != null)
		{
			if(str.)
		}
		}
		catch(IOException e)
		{
			System.err.println("Cant open file"+e.getMessage());
		}
	}
	*/
	public static void tasks(int x)
	{
		ArrayList<String> f = new ArrayList<String>();
		f.add("Writing1");
		f.add("Writing1");
		f.add("Writing1");
		f.add("Writing1");
		f.add("Writing1");
		f.add("29");
		f.add("23");
		f.add("Wah");
		
		
		switch(x)
		{
		case 1: NewRecord(f);
		
			break;
		case 2:
			System.out.println("What would you want to delete?");
			Scanner sr = new Scanner(System.in);
			String option=sr.nextLine();
			DeletefromFile(f ,option);
			break;
			
		case 3:
			System.out.println("What would you want to search for?");
			Scanner sr1 = new Scanner(System.in);
			String opt=sr1.nextLine();
			
			SearchFile(f , opt);
			break;
			
		case 4:
			System.out.println("Sorting file?");
			//Scanner sr2 = new Scanner(System.in);
			//String op=sr2.nextLine();
			SortFile();
			break;
		case 5:
			//Count_integers();
			break;
		default: System.out.println("Invalid task number");
			
		}
		
		
	}

	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		  cal.getTime();
		  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		  //System.out.println(sdf.format(cal.getTime())); 
		
		  setCreate_time(cal.getTime());  
		
		
		/*ArrayList<String> f = new ArrayList<String>();
		f.add("Writing1");
		f.add("Writing1");
		f.add("Writing1");
		f.add("Writing1");
		f.add("Writing1");
		f.add("29");
		f.add("23");
		f.add("Wah");
		*/
		
		Random rn = new Random();
		int task = rn.nextInt(5);
		
		tasks(task);
		
		Random generator = new Random();
		
		int c = generator.nextInt(39)+1;
		setPID(c);
		
		int pri = generator.nextInt(4)+1;
		setPriority(pri);
		
		
	}

}


