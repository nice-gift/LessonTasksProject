package by.kursy.luschik.javalessons.lesson13.util;

public class Convertor {
    public static String convertFromArrayToString (int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int element: array
             ) {
            builder.append(element).append(" ");
        }
    return builder+"";
    }
}
