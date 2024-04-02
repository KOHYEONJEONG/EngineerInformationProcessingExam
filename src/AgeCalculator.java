import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // 사용자로부터 태어난 년월일 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("태어난 년(YYYY): ");
        int birthYear = scanner.nextInt();
        System.out.print("태어난 월(MM): ");
        int birthMonth = scanner.nextInt();
        System.out.print("태어난 일(DD): ");
        int birthDay = scanner.nextInt();
        scanner.close();

        // 태어난 날짜로 LocalDate 객체 생성
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        // 나이 계산
        Period age = Period.between(birthDate, currentDate);

        // 결과 출력
        System.out.println("만 나이: " + age.getYears() + "세 " + age.getMonths() + "개월 " + age.getDays() + "일");
    }
}