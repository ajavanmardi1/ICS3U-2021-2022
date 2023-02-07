package day1;

//import java.util.Scanner;

public class Example1 {
   public static void main(String[] args) {
     // exampleOne();
      //exampleTwo();
      //exampleThree();
      //exampleFour();
   //   exampleFive();
   }

   /*
    * find the percentage of even numbers when you get 1000 random numbers 1 - 100
    
   private static void exampleFive() {
    int counter = 1;
    int numEven = 0;
    final int Num_ITTERATIONS = 12;
    while(counter<=Num_ITTERATIONS){
        int rnd = (int) (Math.random()*100) + 1;
        if(rnd % 2 == 0)
        numEven++;
        counter++;
    }
    System.out.println(((double)numEven / Num_ITTERATIONS)*100);
    

   }

   /*
    * Introduction to While Loops - Keep asking for a number until the number is
    * even.
    
   private static void exampleOne() {
    /*If statements  
    if(boolean exp){
        //do the code if boolean expression is true
         
        //while statement
        //while(condition){

        //}

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number(even to quit):");
        int number = in.nextInt();
        while(number%2 == 1)
        {
            System.out.println("pleaste enter a number (even to quit):");
            number = in.nextInt();
        }

    }
    /*while conditio */
   //}

   /* Sum the numbers from 1 to 1000 using a while loop 
   private static void exampleTwo() {
    int sum = 0;
    int currNum = 1;
    while(currNum <= 1000)
    {
        sum +=currNum;
        currNum++;
       
    }
    System.out.println(sum);

   }
/* 
   
    * Prompt the user for a number and add it to a sum. Continue as long as the
    * number is positive
    
   private static void exampleThree() {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    System.out.println("please enter a positive number:");
    int number = in.nextInt();
    while(number>= 0)
    {
        sum += number;
        System.out.println("please enter a positive number");
        number = in.nextInt();
    }
System.out.println(sum);
in.close();
   }

   /* Prompt the user for a String and count the number of vowels in the String. 
   private static void exampleFour() {
    Scanner in = new Scanner(System.in);
    System.out.println("please enter a sentence");
    String sentence = in.nextLine();
    int index = 0;
    int numVowels = 0;
    while(index < sentence.length())
    {
        String letter = sentence.substring(index,index +1).toLowerCase();
        if("aeiou".indexOf(letter)>=0)
        numVowels++;
        index++;

    }
    System.out.println(numVowels);
    in.close();
    

    

   }
*/
int a = 1;

String result = "";

while (a < 20)

{

result += a;

a += 5;

}

System.out.println(result);
}
