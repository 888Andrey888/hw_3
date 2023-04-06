import org.w3c.dom.ls.LSOutput;


import java.util.Arrays;

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

        System.out.print("Среднее арифметическое: " + summ / countOfIntNum + "\n");
        System.out.println();

        //ДЗ на сообразительность
        /*for (double sortedArray : sortArray(array)) {
            System.out.println(sortedArray);
        }*/
        System.out.println(Arrays.toString(sortArray(array)));
    }

    //ДЗ на сообразительность:
    public static double[] sortArray(double[] arrayForSorted) {
        boolean sorted = false;
        double buffer;
        int countOfIter = 1;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrayForSorted.length - 1; i++) {
                if (arrayForSorted[i] > arrayForSorted[i + 1]) {
                    sorted = false;

                    buffer = arrayForSorted[i];
                    arrayForSorted[i] = arrayForSorted[i + 1];
                    arrayForSorted[i + 1] = buffer;
                }
                /*for (double j : arrayForSorted)
                    System.out.println(j);*/
                System.out.println("Итерация №: " + countOfIter);
                System.out.println(Arrays.toString(arrayForSorted));
                System.out.println();
                countOfIter++;
            }
        }
        return arrayForSorted;
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
//        return (Math.random() * (max - min) + min);

        double random = (Math.random() * (max - min) + min);

        double roundOff = Math.round(random * 1000.0) / 1000.0;
        return roundOff;
    }
}