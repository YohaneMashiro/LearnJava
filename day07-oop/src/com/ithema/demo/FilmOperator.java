package com.ithema.demo;

public class FilmOperator {
    private Film[] films;
    public FilmOperator(Film[] films) {
        this.films = films;
    }
    //1.展示主要信息
    public void printMainInfo(){
        System.out.println("====all main info as follow=====");
        for(int i=0;i<films.length;++i){
            Film m=films[i];
            System.out.println("id: " + m.getId());
            System.out.println("name: " + m.getName());
            System.out.println("price: " + m.getPrice());
            System.out.println("-----------------------");
        }
    }
    //2.搜索某电影详细信息
    public void searchFilmById(int id){
        for(int i=0;i<films.length;++i){
            Film m=films[i];
            if(m.getId()!=id) continue;
            System.out.println("====detailed info as follow=====");
            System.out.println("id: " + m.getId());
            System.out.println("name: " + m.getName());
            System.out.println("score: " + m.getScore());
            System.out.println("director: " + m.getDirector());
            System.out.println("actor: " + m.getActor());
            System.out.println("info: " + m.getInfo());
            System.out.println("-----------------------");
            return ;
        }
        System.out.println("didn't find the id");
    }
}
