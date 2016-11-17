package osproject;


public class Node {
	
	private ProcessList Data;
	private Node NextNode;
	
	public Node()
	{
		Data = null;
		NextNode = null;
		
	}
	
	public void SetData(ProcessList x){
		Data = x;
		
	}

	
	public ProcessList GetData(){
		return Data;
	}
	
	public void SetNextNode(Node n){
		NextNode = n;
	}
	
	public Node GetNextNode(){
		return NextNode;
	}
}