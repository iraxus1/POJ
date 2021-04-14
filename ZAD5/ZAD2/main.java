package pl.edu.pja;

public class main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("Kotarbinskiego 7", 1, new String[]{"METRO", "Wiedzmin", "Krzyzacy", "Potop"});
        Bakery bakery = new Bakery("Michalowskiego 13", 1, new String[]{"Chleb", "Bulki", "Bulka tarta", "Ciastka"});
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
