package exam.e2020;

public class java_6 {
//    1 4 7 10 13
//    2 5 8 11 14
//    3 6 9 12 15
    public static void main(String[] args) {
        int ary[][] = new int[3][5]; // 3,5 <-- 값이 답
        int n = 1;

        for (int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                ary[i][j] = j*3+i+1;
                System.out.print(ary[i][j]+" ");
            }

            System.out.println();
        }
    }
}
