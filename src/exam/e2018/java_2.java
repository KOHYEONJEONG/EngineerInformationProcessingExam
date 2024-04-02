package exam.e2018;

public class java_2 {
    public static void main(String[] args) {
        /**
         * [출력값]
         * 01234
         * 12345
         * 23456
         * */

        int[][] a = new int [3][5];// [][]에 들어갈 값 문제 : 3,5
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                a[i][j]  = i+j;
                System.out.printf("%d",a[i][j]);
            }

            System.out.println();
        }

    }
}
