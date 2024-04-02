package exam.e2017;

public class java_1 {

    public static void main(String[] args) {
        int[] a = {3,4,10,2,5};
        int temp;
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.println("t/f => "+i+"/"+a[i]+" / "+j+"/"+a[j]);
                if(a[i]<a[j]){
                    temp = a[i]; // 3 -> 4 -> 3 -> 4 -> 3- > 2
                    a[i] = a[j]; // 4 -> 10 -> 4 -> 5-> 4 -> 3
                    a[j] = temp; // 3 -> 4 -> 3 -> 4 -> 3 -> 2
                    System.out.println(i+"/"+a[i]+" / "+j+"/"+a[j]);
                }

            }
        }
        System.out.println(a[4]);

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
            //10
            //5
            //4
            //3
            //2
        }
    }

}
