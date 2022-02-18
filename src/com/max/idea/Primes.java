package com.max.idea;

public class Primes {
    public static void main(String[] args) {
        for (int n=2; n<=100; n++)              //Перебор аргументов от 2 до 100
            if (isPrime(n)) {
                System.out.print(n + ";  ");    //Вывод простых чисел в консоль
            }
    }

    public static boolean isPrime(int n) {
        boolean Prime = true;
        for (int j = 2; j < n; j++) {           // Проверка на то, является ли число простым или нет
            if (n % j == 0) {
                Prime = false;
                break;
            }
        }
        return Prime;                           // Возврат переменной
    }

}



