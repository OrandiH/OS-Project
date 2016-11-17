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
		Calendar cal = Calendar.getInstance();
	
		Random rn = new Random();
		int task = rn.nextInt(5);
		
		int b = rn.nextInt(100)+1;
		
		Random generator = new Random();
		
		PID = generator.nextInt(40)+1;
		
		Priority = generator.nextInt(5)+1;
		
		Create_time =cal.getTime() ;
		
	}
/*
	public void Insert(MapEntry b, int V)
	{
		Map temp = new Map();
		if(temp.getHead()== null)
		{
			temp.setHead(b);
		}
		else
		b.setNextMapEntry(temp.getHead());
		temp.setHead(b);
	}
	*/


<<<<<<< HEAD

/*
public void Delete(int V)
{
	if(Head.getValue()== V)
	{
		Head=Head.getNextMapEntry();
	}
	
	MapEntry temp = Head;
	while(temp.getNextMapEntry()!= null)
{
	if(temp.getNextMapEntry().getValue() == V)
	{
		temp.setNextMapEntry(temp.getNextMapEntry());
		break;
	}
	else {
		temp = temp.getNextMapEntry();
	}
}
	
}
*/

	
	
	
public static int getPID() {
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



	public static int getPriority() {
		return Priority;
	}



	public static void setPriority(int priority) {
		Priority = priority;
	}



	public static Date getCreate_time() {
		return Create_time;
	}



	public static void setCreate_time(Date create_time) {
		Create_time = create_time;
	}



	public static Date getStart_time() {
		return Start_time;
	}



	public static void setStart_time(Date start_time) {
		Start_time = start_time;
	}



	public static Date getEnd_time() {
		return End_time;
	}



	public static void setEnd_time(Date end_time) {
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
=======
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
>>>>>>> f6a0d560407135ffcdb041a6df752200b8252571
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
<<<<<<< HEAD
	
	public synchronized static void Insert()
=======
}
	/*public static void NewRecord(ArrayList<String> list)
>>>>>>> f6a0d560407135ffcdb041a6df752200b8252571
	{
		Random ran = new Random();
		MapEntry newMapEntry = new MapEntry("R11",ran.nextInt());
		//CPU.maplist.Insert(newMapEntry);
	}
	
	public synchronized static void Delete()
	{
		Random ran = new Random();
		int Del = ran.nextInt(977 - 10 + 1) + 10;
		if(CPU.maplist.getHead().getValue() ==  Del)
		{
			CPU.maplist.getHead().getNextMapEntry();
		}
		MapEntry temp = CPU.maplist.getHead();
		
		while(temp.getNextMapEntry()!= null)
		{
			if(temp.getNextMapEntry().getValue() == Del )
			{
				temp.setNextMapEntry(temp.getNextMapEntry());
				break;
			}
			else {
				temp = temp.getNextMapEntry();
			}
		}
		
	}
<<<<<<< HEAD
	
	



@Override
public void run() {
	// TODO Auto-generated method stub
	if(this.task == 1)
=======
	/**/
/*	public static void Count_intgers()
>>>>>>> f6a0d560407135ffcdb041a6df752200b8252571
	{
		Insert();
	}
<<<<<<< HEAD
	else if(this.task == 2)
	{
		Delete();
	}
	else if(this.task == 3)
=======
	*/
	
	/*public void Display()
>>>>>>> f6a0d560407135ffcdb041a6df752200b8252571
	{
		CPU.maplist.printList();
	}
<<<<<<< HEAD
	else if(this.task == 4)
	{
		CPU.maplist.Sort();
	}
	else if (this.task == 5)
	{
		//Search
	}
	
}

=======
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
		
		
		
>>>>>>> f6a0d560407135ffcdb041a6df752200b8252571

}