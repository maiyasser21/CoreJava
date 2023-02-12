import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void drawShapes(List<? extends Shape> lists)
    {
        for (Shape s : lists)
        {
            s.draw();
        }
    }
    public static void main(String[] args) {
        List<Rect> list1=new ArrayList<Rect>();
        list1.add(new Rect());
        List<Circle> list2= new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShapes(list1);
        drawShapes(list2);

    }
    
}
