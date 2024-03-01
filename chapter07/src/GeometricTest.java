/**
 * ClassName: GeometricTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/8 - 21:08
 * @Version: V0.1
 */
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("黄色" , 10.0, 5);
        Circle c2 = new Circle("红色" , 5.0, 3);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        System.out.println(test.equalsArea(c1, c2));
    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return  g1.findArea() == g2.findArea();
    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积是：" + g.findArea());
    }
}
