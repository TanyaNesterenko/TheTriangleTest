package triangle.utils;

import java.util.Random;

/**
 * Класс генерирующий случайные числа
 */
public class RND {

    /**
     * Метод генерирует случайное целое число от 0 до Integer.MAX_VALUE
     * @return случайное число типа Integer
     */
    static public Integer randomInteger() {
        Random random = new Random();
        Integer rnd = random.nextInt(Integer.MAX_VALUE);
        return rnd;
    }

    /**
     * Метод генерирует случайное целое число от 0 до bound (не включая)
     * @param bound число до которого будет сгенерировано целое число
     * @return случайное число типа Integer
     */
    static public Integer randomInteger(Integer bound) {
        Random random = new Random();
        Integer rnd = random.nextInt(bound);
        return rnd;
    }

    /**
     * Метод генерирует случайное десятичное число от 0 до Float.MAX_VALUE
     * @return случайное число типа Float
     */
    static public Float randomFloat() {
        Random random = new Random();
        Float rnd = random.nextFloat();
        return rnd;
    }

    /**
     * Метод генерирует случайную строку от 1 до 10 знаков
     * @return случайная строка типа String
     */
    static public String randomString() {
        Random random = new Random();
        String ALPH = "ABCDEFGHIJKLMNOPQRSTQVWXYZabcdefghijklmnopqrstuvwxyz";
        int count = random.nextInt(9) + 1;
        StringBuilder rnd = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            rnd.append(ALPH.charAt(random.nextInt(ALPH.length())));
        }
        return rnd.toString();
    }

    /**
     * Метод генерирует случайный набор символов длиной от 1 до 10
     * @return случайная строка типа String, содержащая символы
     */
    public static String randomSymbols() {
        Random random = new Random();
        String SYMBOLS = "!@#$%^&*<>|?№:_-+={}[]/";
        int count = random.nextInt(9) + 1;
        StringBuilder rnd = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            rnd.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
        }
        return rnd.toString();
    }

    /**
     * Метод генерирует случайную строку от 2 до 10 знаков содержащую первым символом цифру
     * @return случайная строка типа String
     */
    static public String randomStringAfterNum(int size) {
        Random random = new Random();
        String ALPH = "ABCDEFGHIJKLMNOPQRSTQVWXYZabcdefghijklmnopqrstqvwxyz";
        int count = size;
        StringBuilder rnd = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            rnd.append(ALPH.charAt(random.nextInt(ALPH.length())));
        }
        String randomString = RND.randomInteger(10)+ rnd.toString();
        return randomString;
    }

    /**
     * Метод генерирует случайный набор символов длиной от 2 до 10, содержащую первым символом цифру
     * @return случайная строка типа String
     */
    public static String randomSymbolsAfterNum(int size) {
        Random random = new Random();
        String SYMBOLS = "!@#$%^&*<>|?№:_-+={}[]/";
        int count = size;
        StringBuilder rnd = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            rnd.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
        }
        String randomSymbols = RND.randomInteger(10)+ rnd.toString();
        return randomSymbols;
    }
}
