package models;
import java.util.ArrayList;
import java.util.List;
public class Shape {
    List<Point> points = new ArrayList<>();
    public void addPoint(Point newPoint) {
        points.add(newPoint);
    }
    public double calculatePerimeter() {
        int count = points.size();
        double perimeter = 0;
        for (int i = 0; i < count; i++)
            perimeter += points.get(i).getDistanceTo(points.get((i + 1) % count));
        return perimeter; }
    public double getAverageSide() {
        int count = points.size();
        if (count <= 1) return 0;
        if (count == 2) return calculatePerimeter();
        return calculatePerimeter()/ count;
    }
    public double getLongest() {
        double max = 0;
        int size = points.size();
        for (int i = 0; i < size; i++)
            max = Math.max(points.get(i).getDistanceTo(points.get((i + 1) % size)), max);
        return max;
    }

}