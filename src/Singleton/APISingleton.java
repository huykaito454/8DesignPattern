package Singleton;

public class APISingleton {
    private static APISingleton instance;
    private  APISingleton(){};
    public static APISingleton getInstance(){
        if(instance == null) {
            instance = new APISingleton();
        }
        return instance;
    }
    public String getAPI() {
        return "https://randomuser.me/api/";
    }

}
