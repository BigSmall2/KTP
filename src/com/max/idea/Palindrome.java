package com.max.idea;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        for (int i=0; i<args.length; i++){
            String s = args[i];
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = scan.next();
        isPalindrome(s);
    }

    public static String reverseString(String s){
        String s1 = "";                                           /* Объявление переменной, в которую будет
                                                                     записываться перевернутое слово */
        for (int length = s.length()-1; length >= 0; length--)    // Цикл для записи слова
            s1 += s.charAt(length);
        return s1;                                                // Возвращаемое слово при вызове функции
    }

    public static boolean isPalindrome(String s) {
       if (s.equalsIgnoreCase(reverseString(s)))                            // Проверка слова на палиндром
           System.out.println(s + " - Данное слово явялется палиндромом");
       else
           System.out.println(s + " - Данное слово  не является палиндромом");
       return s.equals(reverseString(s));
    }
}
