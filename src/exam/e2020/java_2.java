package exam.e2020;

public class java_2 {

    public static void main(String[] args) {
        int i=0, c=0;
        while(i<10){
            i++;
            c*=i;

            //System.out.println(c+"*"+i+" = "+(c*=i));
        }
        System.out.println(c);//0 <-- 답
    } 
}
