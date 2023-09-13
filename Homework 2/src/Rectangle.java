import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

    }

    //Variables
    int width;
    int height;
    int upperLeftX;
    int upperLeftY;

    //setter
    public void setCoordinates(int x, int y) {
        upperLeftX = x;
        upperLeftY = y;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    //getter
    public int getXCoordinate() {
        return upperLeftX;
    }

    public int getYCoordinate() {
        return upperLeftY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area() {
        return width * height;
    }

    public int circumference() {
        return 2 * (height + width);
    }
}
