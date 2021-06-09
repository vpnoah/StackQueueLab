public class CustomerNode{

   private Customer data;
   private CustomerNode next;

   public CustomerNode(){
      next=null;
   }
   
   public CustomerNode(Customer input){
      next=null;
      data=input;
   }
   
   public void setData(Customer input){
      data=input;
   }
      
   public void setNext(CustomerNode input){
      next=input;
   }
   
   public CustomerNode getNext(){
        return next;
   }

   public Customer getData(){
      return data;
   }   





}