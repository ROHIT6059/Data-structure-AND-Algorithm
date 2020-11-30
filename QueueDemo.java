package DSArraypack;

public class QueueDemo {
    int front ,rear ;
    int capacity;
    int queue[];

    QueueDemo(int capacity) {

        front=rear=0;
        this.capacity = capacity;
         queue = new int[capacity];
    }

    boolean isFull() {
        if (rear == capacity) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == rear) {
            return true;

        }
        return false;
    }

    public void enqueueQueue(int ele) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        else

            queue[rear]=ele;
           rear++;

        return;
        }


    public void dqueueQueue()

    {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];

            }
        }
    }

    public void Display ()
            {
                if (front == rear)
                {
                 System.out.println("Queue is empty");


                }
                for(int i=front;i<rear;i++)
                {
                    System.out.println(queue[i]);
                }


            }
        }

class QueueDemo1
{
    public static void main(String[] args) {
        QueueDemo q=new QueueDemo(5);
        q.enqueueQueue(20);
        q.enqueueQueue(30);
        q.Display();
       // q.dqueueQueue();
        q.enqueueQueue(40);
        q.enqueueQueue(50);
        q.enqueueQueue(60);
       // q.dqueueQueue();
        //q.dqueueQueue();
        q.dqueueQueue();
       q.enqueueQueue(70);

        q.Display();



    }
}