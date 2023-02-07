package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        System.out.println(6<9);//true
        System.out.println(7 !=8);//true
        boolean test = 7 >=9;//false
        System.out.println(!test); // !false = true

        boolean isHarder = (7>3) == ("red".equals("blue")); //true == false = false
        boolean isNotAsHard = (9<=3) != (5==7);
        boolean isRed = true;
        boolean isBig = true;
        boolean isDog = true;
        boolean isCllifford = isRed && isBig && isDog;
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false



        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        String str = null;

        // short circuit check for null before calling
        boolean exp = str != null && str.length()>3;
        
    }
    
}
