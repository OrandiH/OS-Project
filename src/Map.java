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
	
	
	
	
	public MapEntry getHead() {
		return Head;
	}

	public void setHead(MapEntry head) {
		Head = head;
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
