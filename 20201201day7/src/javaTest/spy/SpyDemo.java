package javaTest.spy;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

public class SpyDemo extends Spy{
    public static void main(String[] args) {
        Person person=new Spy();

        person.setAge(30);
        person.setGender("M");
        person.setName("Tom");

        person.learn();

        if(person instanceof SpySkills){
            SpySkills spyer=(SpySkills)person;
            spyer.stealInfo();
            spyer.crackingPasswords();
        }

        if(person instanceof Driver){
           Driver driver=(Driver) person;
           driver.driveCar();

        }

        if(person instanceof Teacher){
            Teacher teacher=(Teacher)person;
            teacher.teach();
        }
    }
}
