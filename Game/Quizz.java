
/**
 * Write a description of class Quizz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Quizz
{
   private ArrayList<String> movies;
   private ArrayList<Character> characters;
   private String randomMovie;
   private char c;
   private int number_of_attempt;
   public Quizz(){
       movies = new ArrayList<String>();
       characters = new ArrayList<>();
       number_of_attempt = 14;
    }
    
   public void add (String movie){
       try{
           movies.add(movie);
        }
       catch(NullPointerException ex){
           System.out.println(ex.getMessage());
        }
   }
   public void pick(){
       int r = new Random().nextInt(movies.size());
       randomMovie = movies.get(r);
   }

   public void game(){
       int index;
       int size = randomMovie.length();
       String hide = randomMovie.replaceAll("[a-zA-Z]", "*");
       while(number_of_attempt > 0){
           StringBuilder b = new StringBuilder(hide);
           System.out.println("You are guessing: " + b.toString());
           System.out.println("You have guessed (" + characters.size() + ") wrong letters: " );
           System.out.print("Guess a letter ");
           c = new Scanner(System.in).next().charAt(0);
           if(hasCharacter()){
               Stack s = new Stack(size);
               int i;
               for(i = 0; i < randomMovie.length(); i++){
                   s.push(randomMovie.charAt(i));
                   if(s.pop() == c ){
                       b.setCharAt(i,c);
                    }
                   hide = b.toString();
                   
               }
           }
           else{
               characters.add(c);
            }
           System.out.println("");
           number_of_attempt--;
           if(randomMovie.equals(b.toString())){
               System.out.println("You are win");
               break;
           }
           else if(number_of_attempt == 1){
               System.out.println("Sorry you don't have many attempt. Game is over");
               break;
            }
       }
    }
    public boolean hasCharacter(){
        return (randomMovie.indexOf(c) > -1);
    }
   
 
    
   
}
