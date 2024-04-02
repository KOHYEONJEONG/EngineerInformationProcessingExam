package exam.e2018;

public class java_3 {
    public static void main(String[] args) {
        int a,b,c,sum;

        a = b = 1; // a = 1, b = 1

        sum = a+b;

        for(int i=3; i<=5; i++){
            c = a+b;
            sum +=c;
            a=b;
            b=c;
        }

        System.out.println(sum); //12  <- 답
    }
}
