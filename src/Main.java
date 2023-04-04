public class Main {
    public static void main(String[] args) {
        double array[] = new double[15];
        //Написал метод заполнения массива случайными положительными и отрицательными числами было лень придумывать самому (программисты ленивые люди)
        array = addItemInArray(array.length, -10, 10);
        for (double i : array) {
            System.out.println(i);
        }

        System.out.println();

        double previousValues = 0;
        boolean startAddition = false;
        int countOfIntNum = 0;
        double summ = 0;
        for (double i : array) {
            if (!startAddition)
                if (i > 0 && previousValues < 0)
                    startAddition = true;

            if (startAddition && i > 0) {
                summ += i;
                countOfIntNum++;
            }

            previousValues = i;
        }

        System.out.println(summ / countOfIntNum);
    }

    // Метод для заполнения массива случайными числами
    public static double[] addItemInArray(int arrayLength, int min, int max) {
        double arrayToReturn[] = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            //так же добавил метод генерации случайных дробных чисел в указанном диапазоне с расчетом что еще где пригодится(не повторяй сам себя)
            arrayToReturn[i] = generateRandomItem(min, max);
        }
        return arrayToReturn;
    }

    // Метод генерирующий случайные дробные числа
    // В этот раз использовал класс Math для практики. За одно изучил данную тему
    public static double generateRandomItem(int min, int max) {
        return (Math.random() * (max - min) + min);
    }
}