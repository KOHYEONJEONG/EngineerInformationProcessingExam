package exam.e2018;

public class java_1 {
    public static void main(String[] args) {
        /*
        * <처리조건>
        - 배열에는 95,75,85,100,50
        - 배열에 저장된 값을 오름차순으로 정렬하여 출력한다.
        * */

        int E[] = {95, 75, 85, 100, 50}; // {} 들어갈 값 : 95, 75, 85, 100, 50
        int i = 0;
        int Temp = 0;

        do {
            int j = i;
            do {
                if (E[i] > E[j]) { //  () 들어갈 값 : E[j]
                    Temp = E[i];
                    E[i] = E[j];
                    E[j] = Temp;
                }
                j++;
            } while (j < 5);
            i++;
        } while (i > 4);
        for (int a = 0; a < 5; a++) {
            System.out.printf(E[a]+"\t"); //50	95	85	100	75
        }
        System.out.println();
    }

}
