package day3;
import java.util.Scanner;
public class goFish {
   static Scanner in = new Scanner(System.in);
   //private static final int WIN = 1;
   //private static final int LOST = -1;
   //private static final int TIE = 0;
   private static int yourScore = 0;
   // private static int numSpaces = 0;
   private static int playerOneScore = 0;
   private static int playerTwoScore = 0;
   private static int playerThreeScore = 0;
   private static final int NUM_SUITS = 4;
   private static final int NUM_VALUES = 13;
   private static final String HEARTS = "H";
   private static final String CLUBS = "C";
   private static final String SPADES = "S";
   private static final String DIAMONDS = "D";
   private static final String JACK = "J";
   private static final String ACE = "A";
   private static final String QUEEN = "Q";
   private static final String KING = "K";
   // private static Boolean theresTwo = true;
   static String yourHand =   getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
    static String playerOneHand =   getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
    static String playerTwoHand =  getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
   static String playerThreeHand =   getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
   public static void main(String[] args) {
    removeDuplicates(yourHand, 0);
    removeDuplicates(playerOneHand, 1);
    removeDuplicates(playerTwoHand, 2);
    removeDuplicates(playerThreeHand, 3);
    
    while(yourScore <10 && playerOneScore < 10 && playerTwoScore < 10 && playerThreeScore < 10)
    {
      playerTurn();
      cpuTurn(1);
      cpuTurn(2);
      cpuTurn(3);
   
      

      
      
    }
    if(playAgain())
    {
       yourHand =  getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
       playerOneHand =  getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
       playerTwoHand =  getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
       playerThreeHand =  getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
       yourScore = 0;
       playerOneScore = 0;
       playerTwoScore = 0;
       playerThreeScore = 0;

       main(null);
    }


   }


   
    private static boolean playAgain() {
      while (true) {
         System.out.print("Play Again ([Y]es/[N]o): ");
         String result = in.nextLine().toLowerCase();

         if (result.equals("y") || result.equals("yes"))
            return true;
         else if (result.equals("n") || result.equals("no"))
            return false;
      }

   }


   private static void cpuTurn(int player) {
      if(yourScore <10 && playerOneScore < 10 && playerTwoScore < 10 && playerThreeScore < 10)
      {
         int opponent;
         while(true)
         {
            opponent = (int)Math.random()*4;
            if(opponent != player)
            {
               break;//if the opponent is not the player then we have chosen a player to target
            }

         }
         String hand = "";
        if(player == 1)
            hand = playerOneHand;
        if(player == 2)
            hand = playerTwoHand;
        if(player ==3)
            hand = playerThreeHand;

        int r = (int) (Math.random() * hand.length());
        if(r % 2 != 0)
            r--; // if r is not even it sets it to an even value

            String card = hand.charAt(r) + "";// gets a random card to look for and then changes the character to a string
         checkHand(opponent, player, card);
         outOfCards();
      }
   }



   private static void outOfCards() {
      if(yourHand.length() == 0)
      {
         System.out.println("your ran out of cards, you are going to get 5 more! ");
         yourHand = getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
         removeDuplicates(yourHand, 0);

         

      }
      if(playerOneHand.length() == 0)
      {
         System.out.println("player 1 has ran out of cards, they are getting 5 more! ");
         playerOneHand = getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
         removeDuplicates(playerOneHand, 1);
      }
      if(playerTwoHand.length() == 0)
      {
         System.out.println("player 2 has ran out of cards, they are getting 5 more! ");
         playerTwoHand = getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
         removeDuplicates(playerTwoHand, 2);
      }
      if(playerThreeHand.length() == 0)
      {
         System.out.println("player 3 has ran out of cards, they are getting 5 more! ");
         playerThreeHand = getCard() + "" + getCard() + "" + getCard() + "" + getCard() + "" + getCard();
         removeDuplicates(playerThreeHand, 3);
      }
   }



   private static void playerTurn() {
      displayHand(yourHand, false, "your cards: ");
      displayHand(playerOneHand, true, "player 1 cards: ");
      displayHand(playerTwoHand, true, "player 2 cards: ");
      displayHand(playerThreeHand, true, "player 3 cards: ");

      System.out.println("what card do you want? ");
      String card = in.nextLine();
      if(yourHand.contains(card))
      {
         System.out.println("which player would you like to ask? ");
         System.out.println("Player 1 (1), player 2(2) or player 3(3)");
         
         try{
            int player = Integer.parseInt(in.nextLine());//it takes the next line and changes it into an integer
            if(player < 1|| player >3){
               System.out.println("please enter valid option");
               playerTurn();
            }
            else
            {
               checkHand(player, 0, card);
               outOfCards();//if you run out of cards as a player
            }


         }
         catch(NumberFormatException ex){//it its not a number then it runs catch
       System.out.println("please enter valid options");
       playerTurn();
         }
      }
      else{
         System.out.println("please enter a card that you have");
         playerTurn();
      }
      
   
   }



   private static void checkHand(int opponent, int asker, String card) {
      String hand = card + "D";
      if(opponent == 0)
      {
         hand += yourHand;
      }
      if(opponent == 1)
      {
         hand += playerOneHand;
      }
      if(opponent == 2)
      {
         hand += playerTwoHand;
      }
      if(opponent == 3)
      {
         hand += playerThreeHand;
      }
      boolean hasCard = false;
      for (int i = 0; i < hand.length() - 1; i+=2) {
         String c = hand.charAt(i) + "";
         String temp = hand.substring(hand.indexOf(c) + 2); 
         if(temp.contains(c)) {
             hasCard = true;
             hand = hand.substring(0, i) + temp.substring(0, temp.indexOf(c)) + temp.substring(temp.indexOf(c) + 2);//changing the hand and removing the card that your requesting for
           break;//ends the loop
     }
   }
   if(!hasCard)
   {
      hand = hand.substring(2);//removes the card that the hand that we were looking for if it was not removed in the for loop
   }
   if(opponent == 0)
   {
      yourHand = hand;
   }
   if(opponent == 1)
   {
      playerOneHand = hand;
   }
   if(opponent == 2)
   {
      playerTwoHand = hand;
   }
   if(opponent == 3)
   {
      playerThreeHand = hand;
   }
   if(hasCard)
   {
      if(asker == 0)
      {
         removeDuplicates(yourHand + card + "D", 0);
      }
      if(asker == 1)
      {
         removeDuplicates(playerOneHand + card + "D", 1);
      }
      if(asker == 2)
      {
         removeDuplicates(playerTwoHand + card + "D", 2);
      }
      if(asker == 3)
      {
         removeDuplicates(playerThreeHand + card + "D", 3);
      }
      
   }
   else{
      System.out.println("go fish");
      if(asker == 0)
      {
         yourHand = yourHand + getCard();
         removeDuplicates(yourHand, 0);
      }
      if(asker == 1)
      {
         playerOneHand = playerOneHand + getCard();
         removeDuplicates(playerOneHand, 1);
      }
      if(asker == 2)
      {
         playerTwoHand = playerTwoHand + getCard();
         removeDuplicates(playerTwoHand, 2);
      }
      if(asker == 3)
      {
         playerThreeHand = playerThreeHand + getCard();
         removeDuplicates(playerThreeHand, 3);
      }
   }



   }



   private static void removeDuplicates(String cards, int player) {
      cards = cards.replace("10", "t");
      int count = 0;
        String found = "No pairs found.";
        for (int i = 0; i < cards.length() - 1; i+=2) {
            String c = cards.charAt(i) + "";
            String temp = cards.substring(cards.indexOf(c) + 2); 
            if(temp.contains(c)) {
                count++;
                cards = cards.substring(0, i) + temp.substring(0, temp.indexOf(c)) + temp.substring(temp.indexOf(c) + 2);
                i = -2;

         
        }
      }
      if(player == 0)
      {
         yourScore += count;
         yourHand = cards;
         System.out.println("your score is " + yourScore);
         System.out.println();
      }
      if(player == 1)
      {
         playerOneScore += count;
         playerOneHand = cards;
         System.out.println("player 1's score is " + playerOneScore);
         System.out.println();
      }

      if(player == 2)
      {
         playerTwoScore += count;
         playerTwoHand = cards;
         System.out.println("player 2's score is " + playerTwoScore);
         System.out.println();
      }
      if(player == 3)
      {
         playerThreeScore+=count;
         playerThreeHand = cards; 
         System.out.println("player 3's score is " + playerThreeScore);
         System.out.println();
      }
      
      
      
   }


  
  
   
         

         



 
  
 
private static int countOccurences(String cards, String space) {
   int numSpaces = 0;
      for(int i = 0; i<cards.length(); i++)
      {
         if(cards.substring(i,i+1).equals(" "))
         {
            numSpaces++;
         }
      }
      
      return numSpaces;
   }

private static String getCard() {
    return getValue() + getSuit();
 }
 private static void displayHand(String cards, boolean isHidden, String label) {
    String result = "";
    if (isHidden)
      result = label + ("xxxxxxx");
    else
       result += label + cards;

    System.out.println(result);
 }
  private static String getSuit() {
    int iSuit = (int) (Math.random() * NUM_SUITS) + 1;

    if (iSuit == 1)
       return HEARTS;
    else if (iSuit == 2)
       return SPADES;
    else if (iSuit == 3)
       return CLUBS;
    else
       return DIAMONDS;

 }
 



  private static String getValue() {
    int iValue = (int) (Math.random() * NUM_VALUES) + 1;

    if (iValue == 1)
       return ACE;
    else if (iValue == 11)
       return JACK;
    else if (iValue == 12)
       return QUEEN;
    else if (iValue == 13)
       return KING;
    else
       return "" + iValue;
 }
 

}
