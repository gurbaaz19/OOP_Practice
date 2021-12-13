public class Rectangle {

    private int height, width;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0, 0);
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void printDetails() {
        System.out.println("width: " + width);
        System.out.println("height: " + height);
    }
}
