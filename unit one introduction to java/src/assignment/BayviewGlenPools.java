package assignment;
import java.util.Scanner;

public class BayviewGlenPools {
    
    
    
    public static void main(String[] args) {
        
    
        //prints the questions and gets the user input
    Scanner in = new Scanner(System.in);
   
    System.out.println("Please enter the length of the pool in meters ");
   
    double length = in.nextDouble();
   
    System.out.println("Please enter the width of the pool in meters ");
   
    double width = in.nextDouble();
   
    System.out.println("Enter the depth of the shallow end in meters ");
   
    double shallowDepth = in.nextDouble();
   
    System.out.println("Enter the depth of the deep end in meters ");
    
    double deepDepth = in.nextDouble();

    System.out.println("Enter the length of the shallow end in meters ");
   
    double shallowLength = in.nextDouble();
   
    System.out.println("Enter the length of the transition between the shallow end and the deep end in meters ");
   
    double transition = in.nextDouble();
  
    System.out.println("Please enter the price of the liner per m^2 here ");
  
    double linerPrice = in.nextDouble();
   
    //calculates transition height
    double transitionHeight = (double)deepDepth-shallowDepth;
   
    
    double aSquaredMinusBsquared = (double) Math.pow(transition,2) - (double) Math.pow(transitionHeight, 2);
   
    
    double transitionLength = Math.sqrt(aSquaredMinusBsquared);
   
   
   //Calculates length of deep end
    double deepLength = (double)length-(double)transitionLength-(double)shallowLength;
  
  
  //calculates volume
  
    double volume = (deepLength*deepDepth*width) + (shallowLength*shallowDepth*width +(shallowDepth*width*transitionLength) + (0.5* transitionHeight * transitionLength *width));
    double waterNeeded = (volume*0.9);
    double rounded = Math.round(waterNeeded);
    System.out.println("The amount of water needed for filling the pool to 90% is approximately " + rounded + "L");
    
    
    //calculates surface area
    
    double surfaceArea = ((deepDepth*width) + (2*(deepLength*deepDepth)) + (deepLength*width)) 
    + ((shallowDepth*width) + (2*(shallowLength*shallowDepth)) + (shallowLength*width)) + 
    ((transition*width) + (2*(transitionHeight*transitionLength)/2) + (2*(transitionLength*shallowDepth))); 
   
   //rounds surface area
    double surfaceAreaRounded = Math.round(surfaceArea*100)/100.0;
     


    //output
     System.out.println("The amount of lining needed is " + surfaceAreaRounded + "m^2.");
     double liner = (linerPrice*surfaceAreaRounded);
     System.out.println("The price of liner is " + liner + "$");
     in.close();
}
}