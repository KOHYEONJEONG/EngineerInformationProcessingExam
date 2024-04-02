package exam.e2017;

public class java_3 {
    public static void main(String[] args) {
        int a[] = {10,30,50,70,90};
        int i, max, min;

        max = a[0];
        min = a[0];

        for(i=0; i<5; i++){
            if(a[i] > max ) { //a[i] 있는 자리에 (  ) 이거 였음
                max = a[i];
            }

            if(a[i] < min ) { //a[i] 있는 자리에 (  ) 이거 였음
                min = a[i];
            }
        }

        System.out.printf("%d\n",max);
        System.out.printf("%d\n",max);
    }
}
