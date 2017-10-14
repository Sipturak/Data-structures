
/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankQueue
{
    public String [] names;
    public int maxSize;
    public int rear;
    public int front;
    public int nItems;
    
    public BankQueue(int s){
        maxSize = s;
        names = new String[maxSize];
        rear = -1;
        front = 0;
        nItems = 0;
    }
    
    public void enque(String name){
        if(rear == maxSize - 1){ //deal with warparound
            rear = - 1;
        }
        names[++rear] = name; //add to queue
        nItems++;
    }
    public String dequeu(){
        String temp = names[front++]; // get the element
        if(front == maxSize){ 
            front = 0; // deal wtih wrap aroundn delete element and go too the next
        }
        nItems--;
        return temp;
    }
    public String peek(){
        return names[front];
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == maxSize - 1);
    }
    
    public int size(){
        return nItems;
    }
    
    public String peekN(int n){
        return names[n];
    }
    
    public void display(){
        int see = front;
        System.out.print("Current name in queue: " );
        for(int i = 0; i < size(); i++){
            System.out.print(peekN(see++) + ", ");
        }
        System.out.println("");
    }
}
