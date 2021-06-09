public class CardNode{

   private Card data;
   private CardNode next;

   public CardNode(){
      next=null;
   }
   
   public CardNode(int input){
      Card c = new Card(input);
      next=null;
      data=c;
   }
   
   public void setData(Card input){
      data=input;
   }
      
   public void setNext(CardNode input){
      next=input;
   }
   
   public CardNode getNext(){
        return next;
   }

   public Card getData(){
      return data;
   }


}