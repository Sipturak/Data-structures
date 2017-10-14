
/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack
{
    private LinkList theList;
    
    public Stack(){
        theList = new LinkList();
    }
    public void push(double dData){
        theList.insertFirst(dData);
    }
    public double pop(){
        return theList.deleteFirst();
    }
    public boolean isEmpty(){
        return (theList.isEmpty());
    }
}
