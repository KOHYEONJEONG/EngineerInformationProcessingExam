package exam.e2021;

public class java_9 {
    public static void main(String[] args) {
        int j,i ;
        for(j=0, i=0;i<=5; i++ ){
            j += i;
            System.out.print(i);
            if(i==5){
                System.out.print("=");
                System.out.print(j);
            }else{
                System.out.print("+");
            }
        }

        // 0+1+2+3+4+5=15
    }
}
