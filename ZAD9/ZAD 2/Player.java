package pl.edu.pja;

public class Player implements Comparable<Player>{
    String firstname;
    String lastname;
    Integer ranking;
    Double maxSpeed;

    public Player(String firstname, String lastname, Integer ranking, Double maxSpeed) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ranking = ranking;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ranking=" + ranking +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Player o) {
        if (this.firstname.compareTo(o.firstname) != 0)
        {
            return this.firstname.compareTo(o.firstname);
        }
        else if (this.lastname.compareTo(o.lastname) != 0)
        {
            return this.lastname.compareTo(o.lastname);
        }
        else
        {
            return this.ranking.compareTo(o.ranking);
        }
    }
}
