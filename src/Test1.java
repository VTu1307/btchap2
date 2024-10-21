public class Test1 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());  // 5.0
        System.out.println("Gradient: " + line1.getGradient());  // 0.9272952180016122 (radians)
        MyLine line2 = new MyLine(1, 2, 6, 5);
        System.out.println(line2);  // MyLine[begin=(1,2), end=(6,5)]
        System.out.println("Length: " + line2.getLength());  // 5.830951894845301
        System.out.println("Gradient: " + line2.getGradient());  // 0.5404195002705842
    }
}
