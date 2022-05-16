package Mediator;

public abstract class User {
    protected IChatMediator mediator;
    protected String name;
    public User(ChatMediator cm, String name){
        this.mediator = cm;
        this.name = name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg, User user);
}
