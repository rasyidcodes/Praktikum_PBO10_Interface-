package Assignment;

public class Potion extends Item implements itemInterface {
    private int duration;
    private int effect_point;
    private String type;

    @Override
    public void use() {
        if (this.type.equalsIgnoreCase("attack")){
            System.out.println("Damage dealt by "+this.effect_point);
        }
        else if (this.type.equalsIgnoreCase("heal")){
            System.out.println("Healed by "+this.effect_point);
        }
    }

    public Potion(String nama, String rank, int price, int duration, int effect_point, String type) {
        super(nama, rank, price);
        this.duration = duration;
        this.effect_point = effect_point;
        this.type = type;
    }
}