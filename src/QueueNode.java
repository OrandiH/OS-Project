package osproject;

public class QueueNode {
	private Process process;
	private QueueNode PrevNode;
	private QueueNode NextNode;
	
	public QueueNode()
	{
		this.process = new Process();
		this.PrevNode = null;
		this.NextNode = null;
	}
	public QueueNode(Process A)
	{
		Process temp = new Process(A);
		process = temp;
		this.PrevNode = null;
		this.NextNode = null;
	}

	public QueueNode getPrevNode() {
		return PrevNode;
	}

	public void setPrevNode(QueueNode prevNode) {
		PrevNode = prevNode;
	}

	public QueueNode getNextNode() {
		return NextNode;
	}

	public void setNextNode(QueueNode nextNode) {
		NextNode = nextNode;
	}
	
	public void Display()
	{
		this.process.Display();
		
	}
	

}
