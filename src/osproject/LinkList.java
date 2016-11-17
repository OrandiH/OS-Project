package osproject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LinkList {
private Node Head;	
	
	
	public LinkList(){
		Head = null;
	}
	
	
	
	public void InsertAtFront(ProcessList d){
		Node Temp = new Node();
		
		
			
		if (Temp != null){
			
			Temp.SetData(d);
			Temp.SetNextNode(null);
			}
			if (Head == null){
				Head = Temp;
			}
			else
			{
				Temp.SetNextNode(Head);
				Head = Temp;
			}
			
			
			}
	
	public void WriteToFile()
	{
		Node Temp = new Node();
		Temp = Head;
		try{
			BufferedWriter x = new BufferedWriter(new FileWriter("Process List.txt"));
			while(Temp != null)
			{
				x.write(Temp.GetData().GetPID() +"\t"+ Temp.GetData().GetPriority() +"\t"+ Temp.GetData().GetTask());
				x.newLine();
				Temp = Temp.GetNextNode();
			}
			x.close();
			}
		catch (IOException e){
			e.getStackTrace();
			
		}
	}
	
	public void DisplayList(){
		Node Temp = new Node();
		Temp = Head;
		System.out.println("PID \t Priority \t Task \t Create Time");
		while (Temp != null){
			//PRINTING THREE COLUMS WITH INFO
			System.out.println(Temp.GetData().GetPID() +"\t"+ Temp.GetData().GetPriority() +"\t\t"+ Temp.GetData().GetTask() +"\t\t"+ Temp.GetData().getCreate_time());
			Temp = Temp.GetNextNode();
		}
	}
	
	public void SaveToFile(){
		
	}
	
	public void Sort()
	{
		Node Temp = Head,prev,current;
		this.Head = null;
		while(Temp != null)
		{
			prev = null;
			current = this.Head;
			while(current != null && current.GetData().GetPriority() < Temp.GetData().GetPriority())
			{
				prev = current;
				current = current.GetNextNode();
			}
			if(prev == null)
			{
				this.Head = Temp;
				Temp = Temp.GetNextNode();
				this.Head.SetNextNode(current);
			}
			else
			{
				prev.SetNextNode(Temp);
				Temp = Temp.GetNextNode();
				prev.GetNextNode().SetNextNode(current);
			}
		
		}
	}



	public Node getHead() {
		return Head;
	}



	public void setHead(Node head) {
		Head = head;
	}
}
