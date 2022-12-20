// В калькулятор добавьте возможность отменить последнюю операцию.

package hw4_java;

import java.util.Scanner;


public class task3b {
    public static void main(String[] args) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNext() && (!(s = scanner.next()).equalsIgnoreCase("q"))) {
            if (s.equals("u")) {
                task3a.undo();
            }
            float prevRes = task3a.getLastResult();
            System.out.println();
            if (prevRes != 0) {
                task3a.setA(prevRes);
                System.out.println("Число А (предыдущий результат): " + prevRes);
            } else {
                System.out.print("Введите число А: ");
                task3a.setA(scanner.nextFloat());
            }

            System.out.print("Введите число B: ");
            task3a.setB(scanner.nextFloat());

            System.out.print("Введите операцию: '/', '*', '+' или '-': ");
            task3a.setOperation(scanner.next());

            System.out.printf("Результат: %.1f", task3a.calc());
            System.out.println();
            printMenu();

        }
        scanner.close();

    }

    private static void printMenu() {
        System.out.print("""
                \nДля начала нового вычисления введите любой символ.
                Для отмены предыдущего вычисления – U.
                Для выхода – Q.

                Ваш выбор:\s""");
    }
}
