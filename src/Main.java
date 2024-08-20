import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        double ans;
        int sum = 0;
        int count = 0;
        while(num > 0) {
            sum += num % 10;
            count ++;
            num /= 10;

        }
        ans = (double)sum / count;
        return ans; //todo заменить 0 на корректный результат.
    }
}
