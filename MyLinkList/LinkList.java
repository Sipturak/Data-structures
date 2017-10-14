
/**
 * Write a description of class LinkList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkList
{
    //instance variables
    private Link first;
    private Link last;
    //Constructor
    public LinkList (){
        first = null;
        last = null;
    }
    /**
     * Check if linklist is empty
     * @return true if no elements
     */
    public boolean isEmpty(){
        return (first == null);
    }
    /**
     * Insert element on first position in linklist
     */
    public void insertFirst(int iData){
        Link newLink = new Link(iData);
        if(isEmpty()){
            last = newLink; // if no element last point to newElement
        }
        newLink.setNext(first);
        first = newLink;
    }
    /**
     * Insert element on last position in linklist
     */
    public void insertLast(int iData){
        Link newLink = new Link(iData);
        if(isEmpty()){
            first = newLink;
        }
        else{
            last.setNext(newLink); // last next point to newLink
        }
        last = newLink; //last is know point to newLink
    }
    /**
     * Delete first element in linklist
     * @return deleted item
     */
    public int deleteFirst(){
        int temp = first.getData();
        first = first.getNext();
        return temp;
    }
    /**
     * Delete iitem in linklist with specific key 
     * @return 0 if element don't exsits otherwise return item
     */
    public int delete(int key){
        Link previous = first;
        Link current = first;
        while(current != null && key != current.getData()){
            if(current.getNext() == null){
                return 0;
            }
            else{
                previous = current;
                current = current.getNext();
            }
        }
        if(current == first){
            first = first.getNext();
        }
        else{
            previous.setNext(current.getNext());
        }
        return current.getData();
    }
    /**
     * Find element int list .If dont exists return 0
     * @return element 
     * @param key, element which you want to find
     */
    public int find(int key){
        Link current = first;
        while(current != null && key != current.getData()){
            if(current.getNext() == null){
                return 0;
            }
            else{
                current = current.getNext();
            }
        }
        return current.getData();
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
