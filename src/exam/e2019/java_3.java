package exam.e2019;

public class java_3 {
    public static void main(String[] args) {

        int i, sum = 0;
        for(i=1; i<=110; i++){
            if(i%4==0){
                sum =  sum+1;
                System.out.println(sum);
            }
        }
        System.out.printf("%d", sum); // (4/110) = 27

    }
}
