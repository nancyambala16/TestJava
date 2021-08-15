package testingdemonstration;

public class QueueImp {

	int rear;
	int front;
	int size;
	int arr[];
	int length;

	public QueueImp(int cap) {

		rear=-1;
		front=0;
		size=cap;
		arr=new int[size];
		length=0;
	}

	public boolean isFull()
	{
		return length==size;
	}

	public boolean isEmpty() {
		return length==0;
	}

	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			rear++;
			arr[rear]=data;
			if(rear==size-1)
			{
				rear=0;
			}

			System.out.println(data+" is inserted");
			length++;
		}

	}

	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			front++;
			if(front==size-1)
			{		
				System.out.println(arr[front-1]+ " is popped ");
				front=0;
			}
			else {
			System.out.println(arr[front-1]+ " is popped ");
			}
			length--;
		}

	}

	public static void main(String[] args) {

		QueueImp que=new QueueImp(3);
		que.dequeue();
		que.enqueue(10);
		que.enqueue(20);
		que.dequeue();
		que.enqueue(30);
		que.enqueue(40);
		que.dequeue();
		que.dequeue();
		que.dequeue();
	}

}
