package calendar;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {

    private static final int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int month) {
        return Months[month - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("반복횟수를 입력하세요");
        int repeat = scanner.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.println("달을 입력하세요");
            int month = scanner.nextInt();
            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
        }

        System.out.println("Bye~");
        scanner.close();
    }
}
