package TemplateMethod;

public abstract class PrepareTemplate {

    protected  void boilWater(){
        System.out.println("Boiling water");
    };
    protected  void pourInCup(){
        System.out.println("Pouring into cup");
    }
    abstract void brew();
    abstract void addCondiments();
    public final void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        System.out.println("\nComplete !!!");
    };
}
