package com.java.practise;

public class CamelToSnake {
    public static void main(String[] args) {
        String input = "HelloWassupBoi";
        System.out.println(toSnakeCase(input));
    }

    private static String toSnakeCase(String input) {
////        char[] ch = new char[input.length()];
//        char ch = input.charAt(0);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(Character.toLowerCase(ch));
//        for (int i = 1; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (Character.isUpperCase(c)) {
//                stringBuilder.append("_" + Character.toLowerCase(c));
//            } else {
//                stringBuilder.append(c);
//            }
//
//        }
//
//        return stringBuilder.toString();
//
////        System.out.println(ch[9]);


        String result = "";
        char ch = input.charAt(0);
        result = result + Character.toLowerCase(ch);
        System.out.println(ch);

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result = result + "_";
                result = result + Character.toLowerCase(c);
            } else {
                result = result + c;
            }
        }
        return result;
    }
}
