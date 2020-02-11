//Queue implemantation using array

class QueueCreation //class that contain class signature for queue implementation
{
	public int arr[]; //declareing array with no size
	int top; //instance variale for inserting element in queue
	int beg; //instance variable for deleting element from queue
	public QueueCreation(int size) ///constructor for instialising the queue
	{
		top = -1; 
		beg = -1;
		arr = new int[size];
	}

 	//helper method to check is queue empty or not
	public boolean isQueueFull()
	{
		if(top == arr.length-1)
		{
			return true;
		}
		return false;
	}

	//helper method to check whether queue is full or not
	public boolean isQueueEmpty()
	{
		if(top == -1 || beg == arr.length)
		{
			return true;
		}
		return false;
	}

	//instance method for inserting the element in queue
	public void enQueue(int data)
	{
		if(isQueueFull())
		{
			System.out.println("Queue Overflow");
		}

		else if(isQueueEmpty())
		{
			beg++;
			top++;
			arr[top] = data;
		}
		else
		{
			top++;
			arr[top] = data;
		}
	}

	public void deQueue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Can't delete element..");
		}

		else
		{
			System.out.println(arr[beg]);
			beg++;
			if(beg > top)
			{
				top = -1;
				beg = -1;
			}
		}
	}

	public void deleteQueue()
	{
		arr = null;
		System.out.println("Queue deleted..");
	}

	public void peakQueue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Underflow"); //no element in queue
		}
		else
		{
			System.out.println(arr[beg]);
		}
	}

	public void printQueue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue Empty");
		}
		else
		{
			for(int i = beg; i < top; i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}


class MyQueueDriverClass
{
	public static void main(String[] args)
	{
		QueueCreation q1 = new QueueCreation(10);
		//System.out.println(q1.isQueueFull());
		//System.out.println(q1.isQueueEmpty());
		for(int i = 100; i < 110; i++){q1.enQueue(i);}
		//q1.deleteQueue();
	System.out.println("initial queue...........");
		q1.printQueue();
	System.out.println("Element to bedeQueue...........");
		q1.deQueue();
	System.out.println("final queue............");
		q1.printQueue();
	System.out.println("Peak Element.....");
	q1.peakQueue();

	}
}