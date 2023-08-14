import java.util.Scanner;

/*Используя класс SmartArray реализуйте следующую программу: пользователь с клавиатуры вводит целые числа.
Как только пользователь вводит 0, программа выдает следующее:
You have input the following numbers: …введенные_значения…..
Total …колмчество_чисел… numbers
Average value: …среднее…
*/
public class Main {
    public static void main(String[] args) {
        NumbeReader numbeReader = new NumbeReader();
        SmartArray numbers = numbeReader.read();
        System.out.println(numbers);
        NumberHandler handler = new NumberHandler(numbers);
        handler.printStat();


    }
}






