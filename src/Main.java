import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test1();
    }

    public static void test1 ()
    {
        Frog testFrog = new Frog(new Point(0, 0), 1);
        Frog testFrog2 = new Frog(0, 0, 100);
        int n = 3;
        Point[] route = new Point[n];   //создался массив, НО не точек
        //а указателей на точки
        route[0] = new Point(2, 0);
        route[1] = new Point(1, 1);
        route[2] = new Point(0, 1);

        for (int i = 0; i < route.length; i++) {
            double d = Point.calcDistance(testFrog.place, route[i]);
            if( d<= testFrog.tongueLength)
            {
                System.out.println("кузнечек съеден в "+(i+1) +" точке");
                break;
            }
        }
    }
    public static Frog askCoordinatesTonguelength() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите координату x, координату y и длину языка z");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        Frog Frog = new Frog(x, y, z);
        return Frog;

    }

}





class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("вызван конструктор точки с параметрами "+x+"; "+y);
    }

    public static double calcDistance(Point p1, Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
    }
}

class Frog{
    Point place;
    int tongueLength;

    public Frog(Point place, int tongueLength) {
        this.place = place;
        this.tongueLength = tongueLength;
        System.out.println("вызван конструктор Frog с 2 параметрами");
    }

    public Frog(int x, int y, int len){
        place = new Point(x, y);
        tongueLength = len;
        System.out.println("вызван конструктор Frog с 3 параметрами");
    }
}
