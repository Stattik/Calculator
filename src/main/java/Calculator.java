import java.util.Date;
import java.util.Scanner;
/**
 * Calculator
 * @author Stanislav Kulakov
 */
public class Calculator {
    public static void main(String[] args) {
        Double first, second, amount;
        //Ввод первого числа
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextDouble();
        //Ввод второго числа
        System.out.println("Введите второе число");
        second=scanner.nextDouble();
        amount = first + second;
        //Вывод результата сложения
        System.out.printf("Сумма числа %s и числа %s равна %10.4f", first, second, amount);
    }
}