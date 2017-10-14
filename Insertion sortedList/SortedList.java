
/**
 * Write a description of class SorteDlist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortedList
{
    private Link first;
    
    public SortedList(int [] array){
        first = null;
        for(int i = 0; i < array.length;i++){
            insert(array[i]);
        }
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insert(int data){
        Link newLink = new Link(data);
        Link previous = null;
        Link current = first;
        while(current != null && data > current.getData()){
            previous = current;
            current = current.getNext();
        }
        if(previous == null){
            first = newLink;
        }
        else{
            previous.setNext(newLink);
        }
        newLink.setNext(current);
    }
    public Link removeFirst(){
        Link temp = first;
        first = first.getNext();
        return temp;
    }
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("");
    }
}
