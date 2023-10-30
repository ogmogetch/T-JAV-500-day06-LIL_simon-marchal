public abstract class Character {
    protected String name = "Unknown";
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected String RPGClass = "SomethingSetByTestCharacter";

    protected Character(String name, String RPGClass) {
        this.name=name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }


    public void attack(String weapon) {
        System.out.println(name + ": Rrrrrrrrr....");
    }

    public void moveRight() {
        System.out.println(name + ": moves right");
    }

    public void moveLeft() {
        System.out.println(name + ": moves left");
    }

    public void moveForward() {
        System.out.println(name + ": moves forward");
    }

    public void moveBack() {
        System.out.println(name + ": moves back");
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }
}
