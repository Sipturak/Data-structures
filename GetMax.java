
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
public class GetMax
{
   //instance variable
    private int [] array;
    private int nEl;
    private int [] arraySorted;
    
    //Constructor
    public GetMax(int maxSize){
        array = new int[maxSize];
        nEl = 0;
        arraySorted = new int[maxSize];
       
    }
    /**
     * return size of array
     */
    public int getSize(){
        return nEl;
    }
    
    /**
     * Insert value in array if size of array is not full
     */
    public void insert(int value){
        if(nEl < array.length){
            array[nEl] = value;
            nEl++;
        }
    }
    /**
     * Get the max value in array
     * @return maximum value of array
     */
    public int getMax(){
        int max = array[0];
        if(nEl == 0 )
            return max;
        else{
            for(int i = 0; i < array.length;i++){
                if(array[i] > max){
                    max = array[i];
                }
            }
             
            return max;
        }
    }
    /**
     * Find the index of current value
     * @return index of value
     */
    public int findIndex(int value){
        int index = 0;
        for(int i =0; i < array.length;i++){
            if(array[i] == value){
                index = i;
            }
            
        }
        return index;
    }
    
    /**
     * Display all elements of array
     */
    public String display(){
        
        return Arrays.toString(array);
        
    }
    
    /**
     * Remove the value from array
     * @retrun delete value
     */
    public int delete(int value){
        
        int i;
        for(i = 0; i < array.length;i++){
            if(array[i] == value){
                break;
            }
        }
        if(value == nEl){
            return 0;
        }
        else{
            for(int k = i; k < array.length - 1; k++){
                array[k] = array[k+1];
            }
            nEl--;
            
            return value;
        }
    }
    /**
     * Remove maximum value from array
     * 
     */
    public int removeMax(int biggest){
    
            
        if(nEl == 0){
            return biggest;
        }
        else{
            for(int i =0; i < array.length;i++){
                if(array[i] > biggest){
                    biggest = array[i];
                }
            }
            delete(biggest);
            return biggest;
        
    

        }
    }
    
    /**
     * Remove all duplicates form array and shrink the size of array
     */
    public void noDups(){
            int value =0;
            int size = array.length;
            for(int i = 0 ; i < size; i++){
                value = array[i];
                for(int j = i + 1; j < size;j++){
                    if(array[j] == value){
                        
                        for(int k = j; k < size - 1;k++){
                            array[k] = array[k+1];
                        }
                        nEl--;
                        j--;
                        size--;
                        System.out.println("Delete : " + value);
                    }
                }
            }
        }
    
    
    /**
     * Insert the biggest element on the last position and add on the last position in the second array
     */
   public void sort(){
       
       for(int i = arraySorted.length - 1; i > 0; i--){
           for(int j = 0; j <= array.length; j++){
               arraySorted[i] = removeMax(array[j]);
            }
        }
       
   }
   /**
    * Display sorted array
    * @return array in string representation
    */
   public String displaySecond(){
       return Arrays.toString(arraySorted);
    }
}
    
    
    
   
    
   
    

