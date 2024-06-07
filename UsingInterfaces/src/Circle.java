
public class Circle extends Shape implements MyInterface {

    public Circle(String color) {
        super(color);
    }

    public int sizeOfRectangle(int l, int w){
        int size = l * w;
        return size;
    }

    public String printDisplay(){
        return "The color of the Rectangle is " + getColor();
    }
}
