public class Main {
    public static void main(String[] args) {
        double array[] = new double[15];
        array = addItemInArray(array.length, -10, 10);
        for(double i: array){
            System.out.println(i);
        }

        int previousValue = 0;
        for(double i: array){
            if(previousValue < 0){

            }
        }
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