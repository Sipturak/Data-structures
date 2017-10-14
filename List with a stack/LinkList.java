
/**
 * Write a description of class LinkList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkList
{
    private Link first;
    
    public LinkList(){
        first  = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(double dData){
        Link newLink = new Link (dData);
        newLink.setNext(first);
        first = newLink;
    }
    public double deleteFirst(){
        double temp = first.getData();
        first = first.getLink();
        return temp;
    }
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.getLink();
        }
        System.out.print(" ");
    }
    
}
