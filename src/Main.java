public class Main {
    public static void main(String[] args) {
        double array[] = new double[15];
    }

    // Метод для заполнения массива случайными числами
    public static double[] addItemInArray(int arrayLength, int min, int max) {
        double arrayToReturn[] = new double[arrayLength];
        for (int i = 0; i < arrayLength; i ++) {
            arrayToReturn[i] = generateRandomItem(min, max);
        }
        return arrayToReturn;
    }

    // Метод генерирующий случайные дробные числа
    public static double generateRandomItem(int min, int max) {
        return (Math.random() * (max - min) + min);
    }
}