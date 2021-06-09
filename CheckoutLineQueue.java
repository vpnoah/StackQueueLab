public class CheckoutLineQueue{

   CustomerNode head = null;
   CustomerNode tail = null;
   
   CheckoutLineQueue normal;
   CheckoutLineQueue express;
     
   public int remove = 0; //1 means normal is removed next, 2 means fast lane
  
   public CheckoutLineQueue(boolean x){
      
      if(x){
         normal = new CheckoutLineQueue(false);
         express = new CheckoutLineQueue(false);
      }
   
   }
   
   public void addToLine(Customer c){
   
      if(c.getItems()>15){
         normal.Enqueue(c);
         if(remove==0){
            remove=1;
            }
      }
      else{
         express.Enqueue(c);
         if(remove==0){
            remove=2;
            }
      }
      
   }
   
   public void removeFromLine(){
   
      if(remove==1){
         if(!normal.isEmpty()){
            normal.Dequeue();
            remove=2;
         }
         else if(!express.isEmpty()){
            express.Dequeue();
         }
      }
      else if(remove==2){
         if(!express.isEmpty()){
            express.Dequeue();
            remove=1;
         }
         else if(!normal.isEmpty()){
            normal.Dequeue();
         }
      }  
   
   }
   
   public Customer lookAtFront(){
      
      Customer c = null;
   
      if(remove==1){
         c=normal.peek();
         }
      else if(remove==2){
         c=express.peek();
         }
   
      return c;
      
   }
   
   public boolean bothLinesEmpty(){
      return normal.isEmpty() && express.isEmpty();
   }
   
   public void Enqueue(Customer c){      
         
      if(head == null){   
         CustomerNode cn = new CustomerNode(c);         
         head = cn;         
         tail = cn;      
         }      
      else{    
         CustomerNode cn = new CustomerNode(c);         
         tail.setNext(cn);         
         tail = cn;      
         }   
         
  }

  public void Dequeue(){
   
      head = head.getNext();      
      if(head == null){ 
         tail = null;      
         }   
    
   }
    
   public Customer peek(){
      return head.getData();
   }

   public boolean isEmpty(){
   
      if(head==null)
         return true;
         
      return false;
      
   }

   public String toString(){
   
      String s = "Start of line: " + "\n";
      
      CustomerNode n = normal.head;
      CustomerNode e = express.head;
      int start=0; //1 = normal line, 2 = express line
      if(remove == 1){
         start=1;}
      if(remove == 2){
         start=2;}
      
      while(n!=null || e!=null){
      
         if(start==1){
         
            if(n!=null){
               s+= n.getData().toString() + "\n";
               n=n.getNext();
               }
               
            start=2;
            }
            
         if(start==2){
         
            if(e!=null){
               s+= e.getData().toString() + "\n";
               e=e.getNext();
               }
               
            start=1;
            }
      
      
      }
            
      s+= "End of line";
      
      return s; 
 
   }

}