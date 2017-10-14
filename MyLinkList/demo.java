
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
    public static void main(String [] args){
        LinkList l = new LinkList();
        l.insertFirst(2);
        l.insertFirst(7);
        System.out.println("Display list " );
        l.displayList();
        System.out.println(l.find(2));
        l.insertFirst(1);
        l.insertFirst(6);
        l.insertFirst(3);
        l.insertFirst(4);
        System.out.println("Display list " );
        l.displayList();
        System.out.println(l.find(6));
        System.out.println("Know insert last: " );
        l.insertLast(10);
        l.insertLast(20);
        l.insertLast(50);
        System.out.println("Display list " );
        l.displayList();
    }
}
