public class Warrior extends Character{
    public Warrior(String name) {
        super(name, "Warrior");
        int life = 100;
        int agility = 10;
        int strength = 8;
        int wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) {
        if (weapon.equals("hammer") || weapon.equals("sword")) {
            System.out.println(name + ": Rrrrrrrrr....");
            System.out.println(name + ": I'll crush you with my " + weapon + "!");
        } else {
            System.out.println(name + ": A " + weapon + "?? What should I do with this?!");
        }
    }
}
