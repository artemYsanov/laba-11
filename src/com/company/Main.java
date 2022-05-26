package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ip-адрес ");
        String input = scanner.nextLine();
        //matches проверяет регулярное выражение
        boolean result = input.matches("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        if (result) {
            System.out.println("адрес корректный");
        } else {
            System.out.println("адрес некорректный");
        }
    }

}