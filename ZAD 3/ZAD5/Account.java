package pl.edu.pja;

public class Account {
    private int id;
    private int money;

    public Account(int id)
    {
        this.id = 0;
        this.money = 100;
    }

    public void setmoney(int money)
    {
        this.money = money;
    }

    public int getmoney() {
        return money;
    }
    public void setId(int id) {
        this.id = id;
    }
}
