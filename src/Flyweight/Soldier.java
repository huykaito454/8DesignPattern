package Flyweight;

public class Soldier implements ISoldier {
    private final String type;

    public Soldier(String type) {
        this.type = type;
        System.out.println("Soldier " + type + " created !");
    }

    @Override
    public void setExtrinsicState(Context context) {
        System.out.println( "ID : " + context.getId() + " | " +context.getColor() + " " +
                type + " soldier level " + context.getLevel());
    }
}
