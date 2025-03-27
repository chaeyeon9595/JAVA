package org.example;


class Main {
    public static void main(String[] args) {
        Cal.plus_print(10, 20);
        // 출력 => 결과 : 30

        Cal.plus_print(50, 20);
        // 출력 => 결과 : 70

        Cal.minus_print(50, 20);
        // 출력 => 결과 : 30

        Cal.minus_print(5, 2);
        // 출력 => 결과 : 3

        Cal.multi_print(5, 2);
        // 출력 => 결과 : 10
    }
}

class Cal {
    public static void plus_print(int a, int b) {
        System.out.println(a + b);
    }

    public static void minus_print(int a, int b) {
        System.out.println(a - b);
    }

    public static void multi_print(int a, int b) {
        System.out.println(a * b);
    }
}
