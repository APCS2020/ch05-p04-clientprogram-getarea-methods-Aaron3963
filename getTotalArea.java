import java.util.ArrayList;

public class getTotalArea{
    public static double getAllCircleArea(Circle [] list){
        double area = 0;
        for(int i = 0; i < list.length;i++){
            area += list[i].getArea();
        }
        return area;
    }

    public static double getAllRectangleArea(ArrayList<Rectangle> list){
        double area = 0;
        for(int i = 0; i < list.size(); i++){
            area += list.get(i).getArea();
        }
        return area;
    }

    public static double getAllTriangle(ArrayList<Triangle> list){
        double area = 0;
        for(int i = 0; i < list.size(); i++){
            area += list.get(i).getArea();
        }
        return area;
    }
    public static void main(String[] args) {
        Circle[] list = new Circle[3];
        list[0] = new Circle(5.1);
        list[1] = new Circle(114514);   

        ArrayList<Rectangle> alistR = new ArrayList<Rectangle>();        
        alistR.add(new Rectangle(14,5));
        alistR.add(new Rectangle(2,10));

        ArrayList<Triangle> alistT = new ArrayList<Triangle>();        
        alistT.add(new Triangle(14,5));
        alistT.add(new Triangle(2,10));
    }
}
