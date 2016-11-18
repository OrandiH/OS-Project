

public class QueueNode {
	private ProcessList process;
	private QueueNode PrevNode;
	private Node NextProcess;
	private QueueNode NextNode;
	
	public QueueNode()
	{
		this.process = new ProcessList();
		this.PrevNode = null;
		this.NextNode = null;
	}
	
	public QueueNode(Node A)
	{
		this.process = A.GetData();
		this.NextProcess = A.GetNextNode();
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
	
	public String ToString()
	{
		return new String("Process: " + this.process.GetTask());
	}
	
	public ProcessList GetProcessList()
	{
		return this.process;
	}
	

}
