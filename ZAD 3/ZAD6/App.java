package pl.edu.pja;

public class App {
    public static void main(String[] args) {
        player opponent = new player(100, Shield.No_SHIELD, Weapon.KNIFE );

        player me = new player (100, Shield.No_SHIELD, Weapon.KNIFE);

        System.out.println(opponent.getWeapon2() == me.getWeapon2());


        System.out.println(opponent == me);
        System.out.println(opponent.equals(me));

        do {
            opponent.hit(me.getWeapon().getValue());

            if (me.getLife() <= 0 || opponent.getLife() <= 0) {
                break;
            }
            me.hit(opponent.getWeapon().getValue());
        }while (me.getLife() > 0 && opponent.getLife() > 0);

        System.out.println(opponent.getLife() > 0 ? "You Lost" : "You Won");
        }
}
