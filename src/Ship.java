public class Ship {
    private String name;
    private int length;
    private int width;
    private int hitpoints;
    private int damage;



}
public class Builder {
    private String name;
    private int length;
    private int width;
    private int hitpoints;
    private int damage;

    private Ship(Builder b){
        name=b.name;
        length = b.length;
        width = b.width;
        hitpoints = b.hitpoints;
        damage = b.damage;

    }

    public Builder(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;

    }
    public Builder hitpoints(int hp){
        hitpoints = hp;
        return this;
    }
    public Builder damage(int dmg){
        damage = dmg;
        return this;
    }
public Ship build(){
        return new Ship();
}
}
