package javaTest.file;

import javaTest.file.People;

public class peopleDemo {


    public static void main(String[] args) {
        People people=new People("老谢",13);
        people.num=200;
        System.out.println(people.toString());
        people.setAge(20);
        System.out.println(people.toString());
        System.out.println(people.getAge());




    }


}

