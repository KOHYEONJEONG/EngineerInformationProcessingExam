package exam.e2021;

class A{
    int a;
    int b;
}

public class java_12 {
    static void fun1(A m){
        m.a *= 10;
    }

    static void fun2(A m){
        m.a *= m.b;
    }

    public static void main(String[] args) {
        A m = new A();
        m.a = 100;
        fun1(m);
        m.b = m.a;
        fun2(m);

        System.out.printf("%d", m.a); // 1000000
    }

}
