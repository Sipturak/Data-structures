
/**
 * Write a description of class Link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Link
{
    private Link next;
    private int iData;
    
    public Link (int iData){
        this.iData = iData;
    }
    public void setNext(Link next){
        this.next = next;
    }
    public Link getNext(){
        return next;
    }
    public int getData(){
        return iData;
    }
    public void displayLink(){
        System.out.print(" { " + iData + " ,  }");
    }
}
