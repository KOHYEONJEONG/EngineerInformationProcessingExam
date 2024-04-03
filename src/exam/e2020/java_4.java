package exam.e2020;

public class java_4 {
    public static void main(String[] args) {
        int a=0, sum=0;
        while (a<10){
            a++;
            if(a%2==1){
                continue;
            }
            sum +=a;
        }
        System.out.println(sum); //30
    }
}
