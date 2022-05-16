import Flyweight.Context;
import Flyweight.ISoldier;
import Flyweight.SoldierFactory;
import Interperter.AddExpression;
import Interperter.Expression;
import Interperter.InterpreterEngineContext;
import Interperter.SubtractExpression;
import Iterator.Student;
import Iterator.StudentGroup;
import Iterator.StudentIterator;
import Mediator.ChatMediator;
import Mediator.User;
import Mediator.UserImpl;
import Observer.YoutubeChannel;
import Observer.YoutubeUser;
import Prototype.Car;
import Prototype.CarPrototype;
import Singleton.APISingleton;
import Singleton.HttpDataHandler;
import TemplateMethod.Coffee;
import TemplateMethod.PrepareTemplate;
import TemplateMethod.Tea;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<ISoldier> soldiers = new ArrayList<>();
    public static void main(String[] args) {
        // Prototype
//        Car car = new Car("Mercedes C300",4,4,"");
//        CarPrototype carPrototype = new CarPrototype(car);
//        Car redCar = carPrototype.clone();
//        redCar.setColor("red");
//        System.out.println(car);
//        System.out.println(redCar);
        // Singleton
//        String data;
//        HttpDataHandler httpDataHandler = new HttpDataHandler();
//        data = httpDataHandler.getHttpData(APISingleton.getInstance().getAPI());
//        System.out.println(data);

        //Flyweight
//        createSoldier("Magician",3,"Red",1);
//        createSoldier("Assassin",3,"Black",2);
//        createSoldier("Magician",3,"Blue",2);
//        System.out.println("Total soldiers made : " + soldiers.size());
//        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalTypeSoldiers());

        //Iterator
//        StudentGroup studentGroup = new StudentGroup();
//        studentGroup.addStudent(new Student("Nguyen Trong Huy"));
//        studentGroup.addStudent(new Student("Pham Thanh Loi"));
//        studentGroup.addStudent(new Student("Nguyen Trong Tin"));
//        StudentIterator<Student> studentGroupIterator = studentGroup.getIterator();
//        while (studentGroupIterator.hasNext()){
//            Student sd = studentGroupIterator.next();
//            System.out.println(sd);
//        }

        //Mediator
//        ChatMediator mediator = new ChatMediator("Group Chat");
//
//        User user1 = new UserImpl(mediator,"Huy");
//        User user2 = new UserImpl(mediator,"Loi");
//        User user3 = new UserImpl(mediator,"Tin");
//
//        mediator.addUser(user1);
//        mediator.addUser(user2);
//        mediator.addUser(user3);
//
//        user1.send("Hello");
//        user2.send("Hi");

        //Observer
//        YoutubeUser youtubeUser1 = new YoutubeUser("User 1");
//        YoutubeUser youtubeUser2 = new YoutubeUser("User 2");
//        YoutubeUser youtubeUser3 = new YoutubeUser("User 3");
//
//        YoutubeChannel channel = new YoutubeChannel("Channel1");
//        channel.subscribe(youtubeUser1);
//        channel.subscribe(youtubeUser2);
//        channel.uploadVideo("Vlog 1","youtube.com/vlog1");
//
//        YoutubeChannel channel2 = new YoutubeChannel("Channel2");
//        channel2.subscribe(youtubeUser2);
//        channel2.subscribe(youtubeUser3);
//        channel2.uploadVideo("Vlog 2","youtube.com/vlog2");

        //Template Method
//        PrepareTemplate coffee = new Coffee();
//        PrepareTemplate tea = new Tea();
//        coffee.prepare();
//        System.out.println("\n--------------------------");
//        tea.prepare();
        //Interperter
//        System.out.println("20 cộng 8 = " + interpret("20 cộng 8"));
//        System.out.println("10 trừ 4 = " + interpret("10 trừ 4"));
    }
    //Flyweight
    private static void createSoldier( String type, int quantity, String color, int level){
        for(int i = 1; i <= quantity; i++){
            Context context = new Context((soldiers.size() +1),color,level);
            ISoldier soldier = SoldierFactory.create(type);
            soldier.setExtrinsicState(context);
            soldiers.add(soldier);
        }
    }
    //Interpreter
    private static int interpret(String input) {
        Expression exp = null;
        if (input.contains("cộng")) {
            exp = new AddExpression(input);
        } else if (input.contains("trừ")) {
            exp = new SubtractExpression(input);
        } else {
            throw new UnsupportedOperationException();
        }
        return exp.interpret(new InterpreterEngineContext());
    }
}
