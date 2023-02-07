package day1;

public class UsingifStatements {
    public static void main(String[] args) {
        int num = 72;
        if(num % 2 == 0)
        {
            System.out.println(num + "is even.");


        }
        if(num%2 ==0)
        
            System.out.println("A");//Only does this
            System.out.println("B");


            int score = 81;
           /* 
            if(score>= 90){
                System.out.println("A+");

            }else {
                System.out.println("Bad Mark");
            }
*/
if(score >=90) {
    System.out.println("A+");
    else if (score >= 80)
    {
        System.out.println("A");
    }
    else if (score >=70)
    {
        System.out.println("B");
    }
    else if(score>=60)
    System.out.println("c");
    {
        else if(score>=50)
        {
            System.out.println("f");
        }
    }
    else(){
        System.out.println("your done for");
    }
}
        
    }
    
}
