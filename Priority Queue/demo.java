
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
    public static void main (String [] args){
        PriorityQueue q = new PriorityQueue(10);
        q.insert(30);
        q.insert(50);
        q.insert(10);
        q.insert(20);
        
        while( !q.isEmpty()){
            int item = q.delete();
            System.out.print(item + " ");
            
        }
        System.out.println("");
    }
    
 
    }
    

