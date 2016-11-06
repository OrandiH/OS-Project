package osproject;

public class Main {
	public static void main(String[]args)
	{
		Map maplist = new Map();
		
		maplist.Insert("R1", 3);
		maplist.Insert("R2", 4);
		maplist.Insert("R3", 13);
		maplist.InsertAtBack("R4", 7);
	
		
		maplist.printList();
	}
	

}
