package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //학생1 정보 저장
        //학생번호, 나이, 키, 반, 이름

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;



        Student stu1 = new Student();
        stu1.name = "홍길동";
        stu1.no = 2;
        stu1.class_no = 5;
        stu1.height = 180;
        stu1.score = 80.7;

        Student stu2 = new Student();
        stu2.name = "김철수";
        stu2.score = 90.0;
        System.out.println(stu2.name);

        //Student stu2 = stu1; -> 잘실행됨.

        //int sut2 = sut1;
        //-> 왜 오류? stu2가 받을 수 있는 타입은 Student로 설정됨
        //int 타입은 받을 수 없어 오류

        System.out.println(stu1.height);
        System.out.println(stu2.height);
        System.out.println(stu1.score);
        System.out.println(stu2.score);

    }

}


//클래스(설계도.틀) = 새로운 타입 이름!
class Student {
    String name;
    int no;
    int height;
    int class_no;
    double score;
}
