package exam.e2017;

public class java_2 {
    public static void main(String[] args) {
        int a = 0, sum = 0;
        while (a<10){
            a++;
            if(a%2==1){//홀수 제외
                continue;
            }
            sum+=a;
            System.out.println(a); // 2->4->6->8->10
        }
        System.out.println(sum);//30
    }

}
