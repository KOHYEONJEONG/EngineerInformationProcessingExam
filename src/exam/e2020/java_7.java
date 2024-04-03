package exam.e2020;

class Parent{
    int compute(int num){
        if(num <= 1) return num;
        return compute(num - 1)*compute(num-2);
    }
}

class Child extends Parent{
    int compute(int num){
        if(num<=1) return num;
        System.out.print(compute(num -1)+", "+compute(num-3)); //0 -> 0 -> 0 -> 1 -> 0 -> 0 -> 0 -> 1
        return compute(num -1)+compute(num-3);
    }
}

public class java_7 {
    public static void main(String[] args) {
        Parent obj = new Child(); //Child 객체의 compute 함수 실행
        System.out.println(obj.compute(4)); //1

    }
}
