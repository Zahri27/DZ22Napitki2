import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String вводПользователя;
        boolean заказ = true;

        while (заказ) {
            System.out.println("Выберите напиток (кофе, чай, лимонад, мохито, минералка, кока_кола):");
            вводПользователя = scanner.nextLine().toUpperCase();

            DrinksMachine выбор;
            try {
                выбор = DrinksMachine.valueOf(вводПользователя);
                DrinkSelector.выбратьНапиток(выбор);
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
                continue;
            }

            System.out.println("Желаете заказать еще один напиток? (да/нет)");
            вводПользователя = scanner.nextLine().toLowerCase();

            if (вводПользователя.equals("нет")) {
                заказ = false;
            }
        }

        System.out.println("Вы заказали " + DrinksCounter.получитьКоличествоНапитков() + " напитков.");
        System.out.println("Общая стоимость: $" + DrinksCounter.получитьОбщуюСумму());
    }
}