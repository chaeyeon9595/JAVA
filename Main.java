package org.example;


class Main {
    public static void main(String[] args) {


        Article article1 = new Article();
        System.out.println(article1.lastID); // 1


        Article article2= new Article();
        System.out.println(article2.lastID); // 2

        Article article3= new Article();
        System.out.println(article3.lastID); // 3

        Article article4= new Article();
        System.out.println(article4.lastID); // 3

        Article article5= new Article();
        System.out.println(article5.lastID); // 3

        Article article6= new Article();
        System.out.println(article6.lastID); // 3


    }

}

class Article{
    int id;
    String regDate;
    static int lastID = 0;

    Article() {
        this(lastID + 1, "2025-4-2");
        lastID++;
        //this메소드 : 객체(). 나 자신을 실행함. 생성자.
    }

    Article(int id, String regDate){
        this.id = id;
        this.regDate = regDate;
    }
}