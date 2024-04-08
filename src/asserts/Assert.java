package asserts;

/**
 * Класс для тестирование алгоритмов строк
 */
public class Assert {
    /**
     * Проверка на соответствие ожидаемой строки с полученной
     *
     * @param assertStr строка, которую мы ожидаем
     * @param assumeStr строка, которую мы проверяем
     * @return `true` в случае, если строки совпадают. `false`, если строки не совпадают
     */
    public static boolean assertEquals(String assertStr, String assumeStr) {
        return assertStr.equals(assumeStr);
    }

    /**
     * Проверка на соответствие ожидаемой строки с полученной
     *
     * @param assertStr строка, которую мы ожидаем
     * @param assumeStr строка, которую мы проверяем
     * @return `true` в случае, если строки совпадают. `false`, если строки не совпадают
     */
    public static boolean assertEquals(int assertStr, int assumeStr) {
        return assertStr == assumeStr;
    }

    /**
     * Функция для моментального вывода true или false
     *
     * @param assertStr строка, которую мы ожидаем
     * @param assumeStr строка, которую мы проверяем
     */
    public static void print(String assertStr, String assumeStr) {
        System.out.println(Assert.assertEquals(assertStr, assumeStr));
    }

    /**
     * Функция для моментального вывода true или false
     *
     * @param assertInt строка, которую мы ожидаем
     * @param assumeInt строка, которую мы проверяем
     */
    public static void print(int assertInt, int assumeInt) {
        System.out.println(Assert.assertEquals(assertInt, assumeInt));
    }

}
