public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void checkHealthPer(int healthPercentage){
        if (healthPercentage>100){
            this.healthPercentage = 100;
        } else if(healthPercentage<0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }
    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        checkHealthPer(healthPercentage);
        this.weapon = weapon;
    }


    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        int remain = healthPercentage - damage;
        if (remain <= 0) {
            System.out.println(name + " player has been knocked out of the game");

        }
        checkHealthPer(remain);
    }
    public void restoreHealth(int healthPotion){
       checkHealthPer(healthPercentage+healthPotion);
    }


}
