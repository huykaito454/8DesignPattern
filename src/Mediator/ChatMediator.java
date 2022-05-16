package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{
    private List<User> userList = new ArrayList<>();
    public ChatMediator(String groupName){
    }
    @Override
    public void sendMessage(String msg, User user) {
    for(User u : this.userList){
        if(!u.equals(user)){
            u.receive(msg,user);
        }
    }
    }
    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
