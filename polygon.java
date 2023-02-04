public class polygon {
    private int numSides;
    private double sideLength;
    private String shapeType;
    public polygon(int ns, double sl, String st){
        this.numSides = ns;
        this.shapeType = st;
        this.sideLength = sl;
       if(numSides<3){
           System.out.println("Number sides need to be greater than 2 to be a polygon");
           return;

       }
       if(sideLength<0){
           System.out.println("Side length needs to be greater than 0");
           return;

       }
    }
    public polygon(){
        numSides = 3;
        shapeType = "Triangle";
        sideLength = 2.0;

    }
    public int getNumSides(){
        return numSides;
    }
    public double getSideLength(){
        return sideLength;

    }
    public String getShapeType(){
        return shapeType;
    }
}