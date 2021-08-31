package calendar;

import java.util.Scanner;

public class Calendar {
    public static void main(String args[]) {
        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] splitedValue = numbers.split(" ");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        System.out.printf("%d와 %d의 합은 %d입니다.", first, second, first+second);

        scanner.close();
    }
}
