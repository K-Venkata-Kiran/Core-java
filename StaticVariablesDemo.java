
public class StaticVariablesDemo {
    static int a=10;
    static String b="hello";
    public static void main(String[] args) {
        System.out.println(a); // 10
        System.out.println(b); // hello
        System.out.println(StaticVariablesDemo.a);// 10 // recommended
        System.out.println(StaticVariablesDemo.b);// hello // recommended
        StaticVariablesDemo obj=new StaticVariablesDemo();
        System.out.println(obj.a); // 10
        System.out.println(obj.b); // hello
        obj.a=200;
        System.out.println(obj.a); // 200
        StaticVariablesDemo.a=2000;
        StaticVariablesDemo.b="kiran";
        System.out.println(a); // 2000
        System.out.println(b); // kiran
    }
}
