package exam.e2020;

public class java_5 {
    public static void main(String[] args) {
        int a[] = new int[8];
        int i= 0;
        int n=10;

        while (n>0){ // n>0 <-- 값
            a[i++] = n%2; //  n%2 <--값
            n/=2;
        }

        for (i=7; i>=0; i--){
            System.out.println(a[i]);//8자리
            //0
            //0
            //0
            //0
            //1
            //0
            //1
            //0
        }
    }
}
