package javaTest.spy;

public class Spy extends Person implements Teacher,SpySkills,Driver{
    @Override
    public void driveCar() {
        System.out.println("Driver for escape...");
    }

    @Override
    public void stealInfo() {
        System.out.println("Stealing information");
    }

    @Override
    public void crackingPasswords() {
        System.out.println("CrackingPasswords....");
    }

    @Override
    public void teach() {
        System.out.println("Teaching Geography...");
    }

    public void Computer(){
        System.out.println("Operating computer");
    }
}
