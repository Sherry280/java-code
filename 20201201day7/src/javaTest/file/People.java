package javaTest.file;

public class People {

        private String name;
        private int age;
        public  int num;

        public People(String name, int age){
            this.age=age;
            this.name=name;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }



        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", num=" + num +
                    '}';
        }

}
