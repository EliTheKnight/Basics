public class Building{

    private int numWindows;
    private boolean stairs;

    public Building(int numWindows, boolean stairs){
        this.numWindows = numWindows;
        this.stairs = stairs;
    }

    public void printWindows(){
        System.out.println(numWindows);
    }

    public void printStairs(){
        System.out.println(stairs);
    }

}