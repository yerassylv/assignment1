package models;
import java.util.ArrayList;
import java.util.List;
public class Shape {
    List<Point> points = new ArrayList<>();
    public void addPoint(Point newPoint) {
        points.add(newPoint);
    }
    public double getPerimeter() {
        int count = points.size();
        double perimeter = 0;
        for (int i = 0; i < count; i++)
            perimeter += points.get(i).getDistanceTo(points.get((i + 1) % count));
        return perimeter; }
    public double getAverage() {
        int count = points.size();
        if (count <= 1) return 0;
        if (count == 2) return getPerimeter();
        return getPerimeter() / count;
    }
    public double getLongest() {
        double mx = 0;
        int size = points.size();
        for (int i = 0; i < size; i++)
            mx = Math.max(points.get(i).getDistanceTo(points.get((i + 1) % size)), mx);
        return mx;
    }

}