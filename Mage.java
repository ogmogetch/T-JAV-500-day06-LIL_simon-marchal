public class Mage extends Character{
    public Mage(String name) {
        super(name, "Mage");
        int life = 70;
        int agility = 10;
        int strength = 3;
        int wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        if (weapon.equals("magic") || weapon.equals("wand")) {
            System.out.println(name + ": Rrrrrrrrr....");
            System.out.println(name + ": Feel the power of my " + weapon + "!");
        } else {
            System.out.println(name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back furtively.");
    }
}
