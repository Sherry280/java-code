package 重写HashCode和equals方法;

import java.util.Objects;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
