package domain;

public class Exercise {

    public static String Calculate(int start, int end) {
        if (end < 2 || start > end) {
            return "";
        }

        int[] tempPrimes = new int[end - start + 1];
        int count = 0;

        for (int number = Math.max(2, start); number <= end; number++) {
            if (isPrime(number)) {
                tempPrimes[count++] = number;
            }
        }

        // Формуємо результат з масиву
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(tempPrimes[i]);
        }

        return result.toString();
    }

    // Приватний метод для перевірки, чи є число простим
    private static boolean isPrime(int number) {
        if (number == 2) return true;
        if (number < 2 || number % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
