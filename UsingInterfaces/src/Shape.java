/**

 */
public class Shape {

    //private String color;
    private int length;
    private int width;
    private int height;
    private String color;


    public Shape(String color) {
        this.color=color;
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
