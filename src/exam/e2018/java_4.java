package exam.e2018;

public class java_4 {
    public static void main(String[] args) {
        int i, sum = 0;
        for(i = 1; i<=110; i++){
            if(i%4==0){
                sum = sum + 1;

            }
        }
        // (110/4 = 27)
        System.out.printf("%d",sum); // 27 <--닶
    }
}
