public class Customer{

   private String name;
   private int items;
   
   public Customer(String s, int x){
      name=s;
      items=x;
      }
   
   public String getName(){
      return name;
      }
   
   public int getItems(){
      return items;
      }
      
   public String toString(){
      return "Name: " + name + " / Items : " + items;
      }


}