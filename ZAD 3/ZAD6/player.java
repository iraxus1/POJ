package pl.edu.pja;

public class player {

    private double life;
    private Shield shield;
    private Weapon weapon;
    private Weapon2 weapon2;

    public player(double life, Shield shield, Weapon weapon)
    {
        this.life = life;
        this.shield = shield;
        this.weapon = weapon;

        this.weapon2 = Weapon2.ONE;
    }
    enum Weapon2
    {
        ONE,
    }

    public void hit(double strength)
    {
        double power = strength / this.shield.getValue();
        this.life = this.life - (power == 0 ? strength : power);
    }

    public double getLife()
    {
        return life;
    }
    public Weapon getWeapon()
    {
        return weapon;
    }

    public Weapon2 getWeapon2() {
        return weapon2;
    }
}
