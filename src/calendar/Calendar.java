package calendar;


import java.util.Scanner;

public class Calendar {

    private static final int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int month) {
        return Months[month - 1];
    }

    public static void main(String[] args) {

        String PROMPT = "cal> ";
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        while (true)
        {
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            if (month == -1) {
                break;
            }

            if (month > 12) {
                continue;
            }

            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
        }

        System.out.println("Bye~");
        scanner.close();
    }
}
