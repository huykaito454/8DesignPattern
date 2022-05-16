package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {
    private static final Map<String,ISoldier> soldiers = new HashMap<>();
    private SoldierFactory(){
    }
    public static synchronized ISoldier create(String type){
        ISoldier soldier = soldiers.get(type);
        if(soldier == null){
            soldier = new Soldier(type);
            soldiers.put(type,soldier);
        }
        return soldier;
    }
    public static synchronized int getTotalTypeSoldiers(){
        return soldiers.size();
    }
}
