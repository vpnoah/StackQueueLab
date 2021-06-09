import java.util.*;

public class CustomerClient{
    
   public static void main(String args[]){
   
      CheckoutLineQueue clq = new CheckoutLineQueue(true);
   
      boolean finish = false;
      
      Scanner scan = new Scanner(System.in);
      
      while(!finish){
      
         System.out.println("What would you like to do with the supermarket line?" + "\n" +
            "1 - have a customer line up" + "\n" +
            "2 - have a customer check out" + "\n" +
            "3 - check who is in line" + "\n" +
            "4 - quit");
         
         int z = scan.nextInt();
         
         if(z==1){
            System.out.println("Enter the customers name, and the number of items");
            String s = scan.next();
            int a = scan.nextInt();
            Customer cus = new Customer(s,a);
            clq.addToLine(cus);
            
            if(a<16){
               System.out.println(s + " is in the fasttrack line with " + a + " item(s).");
            }
            else{
               System.out.println(s + " is in the normal line with " + a + " item(s).");
            }
         }
         
         if(z==2){
            if(clq.bothLinesEmpty()){
               System.out.println("There is no one in line to checkout");
            }
            else{
               Customer c = clq.lookAtFront();
               System.out.println(c.getName() + " is checking out with " + c.getItems() + " item(s)!");
               clq.removeFromLine();
            }

         }
         
         if(z==3){
            if(clq.bothLinesEmpty()){
               System.out.println("There is no one in line");
            }
            else{
               System.out.println(clq);
            }
         }
         
         if(z==4){
            System.out.println("Thank you for shopping with us!");
            break;
         }  
                
      }
   
   
   }







}