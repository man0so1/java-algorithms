package asserts.strings;

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
}
