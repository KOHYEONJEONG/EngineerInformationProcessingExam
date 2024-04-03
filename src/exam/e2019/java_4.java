package exam.e2019;

public class java_4 {

    public static int[] arr(int[] a){
        int i, j, sw, temp, n = 5;
        if(a[0] == 0 || a[0]<1){
            return a;
        }

        for(i=0;i<n-1; i++){
            sw = i;
            for(j=i+1; j<n; j++){
                if(a[j]>a[sw]){
                    sw = j;
                }
            }

            temp = a[i];
            a[i] = a[sw];
            a[sw] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int i;
        int n[] = {4,3,5,2,10};
        arr(n);
        for(i = 0; i<5; i++){
            System.out.println(n[i]);
            // 10
            // 5
            // 4
            // 3
            // 2
        }

    }
}
