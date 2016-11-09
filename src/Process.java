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
public class Process implements Runnable{


	private static int PID;
	private int task;
	private static int Priority;
	private static Date Create_time;
	private static Date Start_time;
	private static Date End_time;
	private int Attempts;
	private int Sleep_time;
	
	public Process()
	{
		this.Attempts = 0;
		this.Sleep_time = 0;
		this.PID = 0;
		this.Priority = 0;
		this.task = 0;
		
	}


	//public Process//(int pID, int task, int priority, Date create_time, Date start_time, Date end_time, int attempts,
	/*		int sleep_time) {
		super();
		PID = pID;
		this.task = task;
		Priority = priority;
		Create_time = create_time;
		Start_time = start_time;
		End_time = end_time;
		Attempts = attempts;
		Sleep_time = sleep_time;
	}*/

	public Process (int x)
	{
		Random rn = new Random();
		int task = rn.nextInt(5);
		
	
		
		Random generator = new Random();
		
		PID = generator.nextInt(40)+1;
		
		
		Priority = generator.nextInt(5)+1;
		switch(x)
		{
		case 1: Map mp = new Map();
		mp.Insert("well well", 10);
		
			break;
		case 2:
			mp.Delete(Priority);
			break;
			
		case 3:
			mp.Search("WEL WELL");
			break;
			
		case 4:
			System.out.println("Sorting file?");
			mp.Sort();
			break;
		case 5:
			//Count_integers();
			break;
		default: System.out.println("Invalid task number");
			
		}
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
	/*public static void NewRecord(ArrayList<String> list)
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
	/**/
/*	public static void Count_intgers()
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
	
	/*public void Display()
	{
		System.out.println("Process information");
		System.out.println("PID: " + this.PID);
		System.out.println("Attempts: " + this.Attempts);
		System.out.println("Sleep time: " + this.Sleep_time);
		System.out.println("task: " + this.task);
		System.out.println("Priority: " + this.Priority);
		System.out.println("Create time: " + this.Create_time);
		System.out.println("Start time: " + this.Start_time);
		System.out.println("End time: " + this.End_time);

	}
/*
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
		
		
		

