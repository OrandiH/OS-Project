package osproject;

public class Map {
	private MapEntry Head;
	
	public Map()
	{
		this.Head = null;
	}
	
	public void Insert(String K,int V)
	{
		MapEntry entry = new MapEntry(K,V);
		entry.setNextMapEntry(Head);
		Head = entry;
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
