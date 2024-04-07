public class DrinksCounter {
    private static int количествоНапитков = 0;
    private static double общаяСумма = 0.0;

    public static void добавитьНапиток(double цена) {
        количествоНапитков++;
        общаяСумма += цена;
    }

    public static int получитьКоличествоНапитков() {
        return количествоНапитков;
    }

    public static double получитьОбщуюСумму() {
        return общаяСумма;
    }
}