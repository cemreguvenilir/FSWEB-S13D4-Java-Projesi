public class Main2 {
    public static void main(String[] args) {
        Player player1 = new Player("Cemre", 80, Weapon.ARROW);
        player1.loseHealth(30);
        System.out.println( "remaining health after damage: " + player1.healthRemaining());
        player1.loseHealth(50);
        System.out.println(player1.healthRemaining());

        player1.restoreHealth(40);
        System.out.println(player1.healthRemaining());
        player1.restoreHealth(200);
        System.out.println(player1.healthRemaining());

    }
}
