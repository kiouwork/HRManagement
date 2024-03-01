/**
 * ClassName: Circle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/8 - 21:02
 * @Version: V0.1
 */
public class Circle extends GeometricObject{
    protected double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
