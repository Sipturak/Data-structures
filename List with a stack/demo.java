
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
    public static void main (String [] args){
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        System.out.println("While stack is not empty");
        while(!s.isEmpty()){
            System.out.println("Pop element from stack: " + s.pop());
        }
    }
}
