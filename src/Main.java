class Test {
    private int _x;

    public Test() {
        _x = 0;
    }

    public Test(int x) {
        _x = x;
    }

    public void set_x(int x) {
        _x = x;
    }

    public int get_x() {
        return _x;
    }
}

class Test2 {
    private int _y;

    public Test2() {
        _y = 0;
    }

    public Test2(int y) {
        _y = y;
    }

    public void set_y(int y) {
        _y = y;
    }

    public int get_y() {
        return _y;
    }
}

class Stuff<T> {
    private T _thing;

    public Stuff() {
        _thing = null;
    }

    public Stuff(T t) {
        _thing = t;
    }

    public T getThing() {
        return _thing;
    }

    public void setThing(T t) {
        _thing = t;
    }

    public void print() {
        if (_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() +
                    ", value: " + _thing);
        } else {
            System.out.println("null");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stuff<Test> t = new Stuff<>();
        t.print();
        t.setThing(new Test(5));
        t.print();
        System.out.println(t.getThing().get_x());
    }
}