package javarush;

/*
Порядок загрузки переменных
*/


public class OrderOfLoadingVariables {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public OrderOfLoadingVariables() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        OrderOfLoadingVariables s = new OrderOfLoadingVariables();
    }

    public static void printAllFields(OrderOfLoadingVariables obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.name);
        System.out.println(obj.i);
    }
}
