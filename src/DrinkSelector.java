public class DrinkSelector {
    public static void выбратьНапиток(DrinksMachine выбор) {
        switch (выбор) {
            case КОФЕ:
                DrinksMachineMain.приготовитьКофе();
                break;
            case ЧАЙ:
                DrinksMachineMain.приготовитьЧай();
                break;
            case ЛИМОНАД:
                DrinksMachineMain.приготовитьЛимонад();
                break;
            case МОХИТО:
                DrinksMachineMain.приготовитьМохито();
                break;
            case МИНЕРАЛКА:
                DrinksMachineMain.приготовитьМинералку();
                break;
            case КОКА_КОЛА:
                DrinksMachineMain.приготовитьКолу();
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
    }
}