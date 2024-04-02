package exam.e2019;

public class java_1 {
    public static void main(String[] args) {
        int numArr[] = new int[5];
        int result = 0;

        for(int i=0; i<5; i++){
            numArr[i] = i+1;
        }

        for(int i:numArr){
            result += i;
        }

        System.out.printf("%d", result);//15 <-- 닶
    }
}
