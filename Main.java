package org.example;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {
    사람 a사람;
    사람 b사람;
    사람 c사람;
    int lastId = 0;


    void add사람(String name, int age) {
        사람 temp = new 사람();
        lastId++;
        temp.id = lastId;
        temp.name = name;
        temp.age = age;

        if (lastId == 1) {
            a사람 = temp;
        }
        if (lastId == 2) {
            b사람 = temp;
        }
        if (lastId == 3) {
            c사람 = temp;
        }
        System.out.println("나이가 " + temp.age + "살인 " + temp.id + "번째 사람(" + temp.name + ")이 추가되었습니다.");


    }

    사람 get사람(int i) {

        if (i == 1) {
            return a사람;
        }
        if (i == 2) {
            return b사람;
        }
        if (i == 3) {
            return c사람;
        }

        return null;
    }
}


class 사람{
    int id;
    String name;
    int age;

    void 자기소개(){
        System.out.println("저는 " + this.id + "번," + this.name + "," + this.age + "살입니다.");

    }
}