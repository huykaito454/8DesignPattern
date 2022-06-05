package SOLID.Liskov;

public class Eagle extends Bird implements IFly{
    @Override
    public void Eat(){
        System.out.println("Eagle Can Eat");
    }

    @Override
    public void Fly() {
        System.out.println("Eagle Can Fly");
    }
}