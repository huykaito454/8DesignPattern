package Mediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator,String name){
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg, User user) {
        System.out.println(this.name + " received the message from "
                + "[ " + user.name + " ] : " + msg );
    }
}
