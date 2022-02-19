package pro.sky.java.course1;

import java.util.Arrays;

public class ComplexTaskStrings {

    /*Task 5*/
    public static void separatorName(String fullName) {
        int indexFirst = fullName.indexOf(' ');
        int indexLast = fullName.lastIndexOf(' ');

        String lastName = fullName.substring(0, indexFirst);
        String firstName = fullName.substring(indexFirst + 1, indexLast);
        String middleName = fullName.substring(indexLast + 1);

        System.out.printf("Имя сотрудника — %s\n", firstName);
        System.out.printf("Фамилия сотрудника — %s\n", lastName);
        System.out.printf("Отчество сотрудника — %s\n", middleName);
    }

    /*Task 6*/
    public static String registerControl(String fullName) {

        char[] arr = fullName.toCharArray();
        int index = 1;
        arr[0] = Character.toUpperCase(arr[0]);

        while (index < arr.length - 1) {
            if (arr[index] == ' ') {
                arr[index + 1] = Character.toUpperCase(arr[index + 1]);
                index++;
            }
            index++;
        }

        return String.valueOf(arr);
    }

    /*Task 7*/
    public static String theUnifier(String one, String two) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            stringBuilder.append(one.charAt(i)).append(two.charAt(i));
        }
        return stringBuilder.toString();
    }

    /*Task 8*/
    public static String doubleLetters(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                sb.append(str.charAt(i));
                i += count;
                count = 0;
            }
        }
        if(!sb.isEmpty()) {
            return "Повторяющиеся символы: " + sb.toString();
        } else {
            return "Нет повторяющихся символов";
        }
    }


    public static void main(String[] args) {

        System.out.println("*Task 5*");
        separatorName("Ivanov Ivan Ivanovich");

        System.out.println("*Task 6*");
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — "
                + registerControl("ivanov ivan ivanovich"));

        System.out.println("*Task 7*");
        System.out.println("Данные строки — "
                + theUnifier("135", "246"));

        System.out.println("*Task 8*");
        System.out.println(doubleLetters("aabccddefgghiijjkk"));
        System.out.println(doubleLetters("adghijk"));
    }
}
