
/**
 * Write a description of class Link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Link
{
    private Link next;
    private double dData;
    
    public Link(double dData){
        this.dData = dData;;
    }
    public void setNext(Link l){
        next = l;
    }
    public Link getLink(){
        return next;
    }
    public double getData(){
        return dData;
    }
    public void displayLink(){
        System.out.println(" { " + dData + " , }");
    }
    
}
