package Mediator;

public interface IChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
