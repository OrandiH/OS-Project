

import java.util.Random;

public class Map {
	private MapEntry Head;
	
	public Map()
	{
		Head = null;
	}
	
	public void InsertAtFront(String K,int V)
	{
		MapEntry Temp = new MapEntry();
		if(Temp != null)
		{
			Temp.setKey(K);
			Temp.setValue(V);
			Temp.setNextMapEntry(null);
		}
		
		if(Head == null)
		{
			Head = Temp;
		}
		else
		{
			Temp.setNextMapEntry(Head);
			Head = Temp;
		}
		
	}
	
	public void InsertAtBack(String K,int V)
	{
		MapEntry Temp = new MapEntry();
		MapEntry Temp2 = new MapEntry();
		
		Temp.setKey(K);
		Temp.setValue(V);
		Temp.setNextMapEntry(null);
		
		if(Head == null)
		{
			Head = Temp;
		}
		else
		{
			Temp2 = Head;
			while(Temp2.getNextMapEntry() != null)
			{
				Temp2 = Temp2.getNextMapEntry();
			}
			Temp2.setNextMapEntry(Temp);
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
	
	public void Search()
	{
		Random n = new Random();
		int SearchVal = n.nextInt(977 - 10 + 1) + 10;
		
		MapEntry temp = this.Head;
		while(temp !=null && temp.getValue() == SearchVal)
		{
			temp = temp.getNextMapEntry();
			
			if(temp != null)
			{
				System.out.println("Value " + temp.getValue() + "found with key: " + temp.getKey());
				break;
			}
			
		}
	}
	
	public void sort()
	{
		MapEntry temp = this.Head,prev,current;
		this.Head = null;
		
		while(temp != null)
		{
			prev = null;
			current = this.Head;
			while(current != null && current.getValue() < temp.getValue())
			{
				prev = current;
				current = current.getNextMapEntry();
			}
			if(prev == null)
			{
				this.Head = temp;
				temp = temp.getNextMapEntry();
				this.Head.setNextMapEntry(current);
			}
			else
			{
				prev.setNextMapEntry(temp);
				temp = temp.getNextMapEntry();
				prev.getNextMapEntry().setNextMapEntry(current);
			}
		}
	}
	public int Calculate()
	{
		int sum = 0;
		MapEntry temp = new MapEntry();
		temp = this.Head;
		while (temp != null)
		{
			sum = temp.getValue() + sum;
			temp = temp.getNextMapEntry();
		}
		
		return sum;
	}
	
	
	public MapEntry getHead() {
		return Head;
	}

	public void setHead(MapEntry head) {
		Head = head;
	}

	public void printList()
	{
		MapEntry top = Head;
		System.out.println("Map");
		while(top != null)
		{
			
			System.out.print("Key: " + top.getKey() + " " + "Value: " + top.getValue());
			System.out.println();
			top = top.getNextMapEntry();
		}
	}
	

	
	

}
