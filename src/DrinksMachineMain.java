public class DrinksMachineMain {
    public static void приготовитьКофе() {
        System.out.println("Готовим кофе...");
        DrinksCounter.добавитьНапиток(Drinks.КОФЕ_ЦЕНА);
    }

    public static void приготовитьЧай() {
        System.out.println("Готовим чай...");
        DrinksCounter.добавитьНапиток(Drinks.ЧАЙ_ЦЕНА);
    }

    public static void приготовитьЛимонад() {
        System.out.println("Готовим лимонад...");
        DrinksCounter.добавитьНапиток(Drinks.ЛИМОНАД_ЦЕНА);
    }

    public static void приготовитьМохито() {
        System.out.println("Готовим мохито...");
        DrinksCounter.добавитьНапиток(Drinks.МОХИТО_ЦЕНА);
    }

    public static void приготовитьМинералку() {
        System.out.println("Готовим минералку...");
        DrinksCounter.добавитьНапиток(Drinks.МИНЕРАЛКА_ЦЕНА);
    }

    public static void приготовитьКолу() {
        System.out.println("Готовим Кока-Колу...");
        DrinksCounter.добавитьНапиток(Drinks.КОКА_КОЛА_ЦЕНА);
    }
}