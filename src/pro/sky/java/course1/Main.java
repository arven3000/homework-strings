package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        /*Task 1*/
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.printf("ФИО сотрудника — %s.\n", fullName);

        /*Task 2*/
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s.\n", fullName.toUpperCase());

        /*Task 3*/
        System.out.printf("Данные ФИО сотрудника для административного отдела — %s.\n", fullName.replace(" ", "; "));

        /*Task 4*/
        /*Вариант 1*/
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("Ё", "Е");
        System.out.printf("Данные ФИО сотрудника — %s.\n", fullName.replace("ё", "е"));

        /*Вариант 2*/
        fullName = "Ёжиков Семён Семёнович";
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == 'ё') {
                System.out.print('е');
            } else if (fullName.charAt(i) == 'Ё') {
                System.out.print('Е');
            } else {
                System.out.print(fullName.charAt(i));
            }
        }
        System.out.println(".");

        /*Вариант 3*/

        StringBuilder newFullName = new StringBuilder();
        if (fullName.contains("ё") || fullName.contains("Ё")) {
            String[] strings = fullName.split("[Ёё]");
            if (strings[0].isEmpty()) {
                newFullName.append("Е");
            } else {
                newFullName.append(strings[0]);
            }
            for (int i = 1; i < strings.length; i++) {
                if (i != strings.length - 1 || fullName.endsWith("ё")) {
                    newFullName.append(strings[i]).append("e");
                } else {
                    newFullName.append(strings[i]);
                }
            }
            fullName = newFullName.toString();
        }
        System.out.printf("Данные ФИО сотрудника — %s.\n", fullName);
    }
}
