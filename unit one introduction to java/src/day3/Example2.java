package day3;

public class Example2 {
    public static void main(String[] args) {
       int numberOne = 17, numberTwo = 17, numberThree = 19;
       int numStudents = 3;
       //because all the variables are ints we need to temporarily treat something as a double before the division so we get double division.
       //(type) variables --> will cost the variable as the type
       double averageAge = (numberOne + (double)numberTwo + numberThree) / numStudents;
       System.out.println("Average age is: " + averageAge);
       int x = 6;
       int y = 7;
        System.out.println("the sum of" + x + "and" +y + "is" +x + y);
        //"the sum of 6 and 7 is 67"
        System.out.println("the sum of " + x + " and " +y + " is " +(x + y));
    }
}
