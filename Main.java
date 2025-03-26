package org.example;

// 문제 : 아래 코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        new 자동차().달리다(); //일회용 객체
        new 자동차().달리다();
        new 자동차().달리다(); // -->3번 달린 것? 아니다..
        //1번 만들어지고 실행되고 소멸되고 또 만들어지고 실행되고 소멸되고.... 그렇게 3번 반복! 한 자동차가 3번 달린 것 아니다.
    }
}

class 자동차{
    void 달리다(){
        System.out.println("달리다");
    }
}