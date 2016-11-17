package osproject;

public class Queue {
	private QueueNode Front;
	private QueueNode Rear;
	
	public Queue()
	{
		Front = null;
		Rear = null;
	}
	
	public void Enqueue(Node A)
	{
		QueueNode Temp = new QueueNode(A);
		
		if(Temp != null)
		{
			if(IsQueueEmpty())
			{
				Front = Temp;
				Rear = Temp;

			}
			else
			{
				Rear.setNextNode(Temp);
				Temp.setPrevNode(Rear);
				Rear = Temp;
			}
			
		}
	}
	
	public QueueNode getFront() {
		return Front;
	}

	public void setFront(QueueNode front) {
		Front = front;
	}

	public QueueNode getRear() {
		return Rear;
	}

	public void setRear(QueueNode rear) {
		Rear = rear;
	}

	public boolean IsQueueEmpty()
	{
		if (Front == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public QueueNode Dequeue()
	{
		QueueNode Temp = new QueueNode();
		
		
		if(!IsQueueEmpty())
		{
			if(Rear == Front)
			{
				Rear = null;
			}
			Temp = Front;
			Front = Front.getNextNode();
			
			if(Front != null)
			{
				Front.setPrevNode(null);
			}
			
			return Temp;
		}
		else
		{
			System.out.println("Error");
			return Temp;
		
		}
	
	}
	public void RunProcessAtNode()
	{
		QueueNode temp = new QueueNode();
		temp = this.Front;
		while(temp != null)
		{
			temp.GetProcessList().run();
			temp.getNextNode();
		}
	}

}
