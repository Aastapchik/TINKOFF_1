package com.tinkoff;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        String STR = "TINKOFF";
        char[] STR_CHARS = STR.toCharArray();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] strings = new String[length];
        for (int i = 0; i < strings.length; i++) strings[i] = scanner1.nextLine();
        scanner1.close(); scanner.close();
        for (String string : strings) {
            if (string.length() != STR.length()) System.out.println("NO");
            else {
                int count = 0;
                char[] chars = string.toCharArray();
                for (int j = 0; j < STR.length(); j++)
                    for (int k = 0; k < STR.length(); k++) if (chars[k] == STR_CHARS[j]) count++;
                if (count == 9) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}

