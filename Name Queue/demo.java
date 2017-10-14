
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
    public static void main (String [] args){
        BankQueue b = new BankQueue(10);
        b.enque("Milos Maksimovic");
        b.enque("Uros Mitic");
        b.enque("Nemanja Vukovic");
        b.enque("Momir Kosanin");
        System.out.println("Peek at elemnt: " + b.peek());
        b.dequeu();
        b.dequeu();
        System.out.println("Dequeu two elements");
        System.out.println("Peek at element: " + b.peek());
        System.out.println("Current size of queue " + b.size());
        b.enque("Lazar Djokic");
        b.enque("Dordje Malisic");
        System.out.println("Add two element");
        System.out.println("Current size " +  b.size());
        b.display();
        b.dequeu();
        b.dequeu();
        System.out.println("Dequeu two elemetns  and display again all elements" );
        b.display();
        
    }
}
