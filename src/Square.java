public class Square extends Rectangle{

    public Square(int side){
        super(side,side);
    }

    public Square(){
        super();
    }

    public void printDetails(){
        System.out.println("side: "+ this.getWidth());
    }
}
