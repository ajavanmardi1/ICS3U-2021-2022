public class Die{
    private int numSides;
    private int topSide;
    public Die(int sumberOfSides)
    {
      this.numSides = numSides;
        this.roll();

    }
    public int getTopSides()
    {
        return topSide;
    }
    public Die()
    {
        this.numSides = 6;
        roll();
    }
 void roll() {
        this.topSide = (int)(Math.random()*this.numSides) + 1;
    }
    public String toString(){
        return " " + this.topSide;
    }


}