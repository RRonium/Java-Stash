class Perimeter {
    double a;
    double b;

    Perimeter(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double Calculate() {
        return 2 * (a + b);
    }

    void show() {
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Perimeter: " + Calculate());
    }
}

class Area extends Perimeter {
    double h;
    double area;

    Area(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    void doArea() {
        area = a * h;
    }

    void show() {
        super.show();
        doArea();
        System.out.println("Height: " + h);
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Area parallelogram = new Area(5.0, 7.0, 8.0);
        parallelogram.show();
    }
}
