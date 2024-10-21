public class Test2 {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 1, 5);
        MyCircle c2 = new MyCircle(4, 5, 10);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circumference of c1: " + c1.getCircumference());

        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}
