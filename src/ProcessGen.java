
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
public class ProcessGen implements Runnable{

	private MapEntry Head;
	private static int PID;
	private int task;
	private static int Priority;
	private static Date Create_time;
	private static Date Start_time;
	private static Date End_time;
	private int Attempts;
	private int Sleep_time;
	


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

	public ProcessGen()
	{
		Random rn = new Random();
		int task = rn.nextInt(5);
		
		int b = rn.nextInt(100)+1;
		
		Random generator = new Random();
		
		PID = generator.nextInt(40)+1;
		MapEntry mp = new MapEntry();
		
		Priority = generator.nextInt(5)+1;
		switch(task)
		{
		case 1: 
			Insert(mp,b);
break;
		case 2:
			Delete(Priority);
			break;
			
		case 3:
			Search("WEL WELL");
			break;
			
		case 4:
			System.out.println("Sorting file?");
			Sort();
			break;
		case 5:
			//Count_integers();
			break;
		default: System.out.println("Invalid task number");
			
		}
	}

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


public void Search(String x)
{
	MapEntry m = Head;
	while(m != null)
	{
		if(m.getKey() == x)
		{
			System.out.println("Found!");
			break;
		}
		else{
			m.getNextMapEntry();
			}
	}
}

public void Sort()
{
	MapEntry temp = new MapEntry();
	MapEntry node = Head,i,j;
        Head = node;
        i = node;
        j = node.getNextMapEntry();
        
        while(i.getNextMapEntry()!= null)
        {
        	while(j.getNextMapEntry()!= null)
        	{
        		if((Integer)i.getValue() < (Integer)j.getValue()) {
                    temp = i.getNextMapEntry();
                    i.setNextMapEntry(j.getNextMapEntry()); 
                    j.setNextMapEntry(temp);
        	}
        		j= j.getNextMapEntry();
        	}
        	i= i.getNextMapEntry();
        }
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
}


}