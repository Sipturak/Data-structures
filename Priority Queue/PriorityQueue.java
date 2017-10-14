
/**
 * Write a description of class PriorityQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PriorityQueue
{
    private int [] array;
    private int maxSize;
    private int nItems;
    
    public PriorityQueue(int s){
        maxSize = s;
        array = new int[maxSize];
        nItems = 0;
    }
    
    public void insert(int value){
        int j;
        if(nItems == 0){
            array[nItems++] = value; // if no items insert at 0
        }
        else{
            //else start from end (front)
            for(j = nItems - 1; j >=0; j--){ 
                if(value > array[j]){ // if new item is larger
                    array[j+1] = array[j]; // shift upward
                }
                else{
                    break; //done shifting
                }
            }
            //end for
            array[j+1] = value; //insert at
            nItems++;
        }
    }
    public int delete(){
        return array[--nItems];
    }
    public int peek(){
        return array[nItems - 1];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return(nItems == maxSize);
    }
}
