public class Card{

   private int num;
   
   public Card(int x){
   
      num=x;
      
      }
      
   public int getNum(){
   
      return num;
      
      }   
      
   public String toString(){
   
      String s = "Card: " + num;
      
      return s;
      
      }


}