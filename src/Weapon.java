public enum Weapon {
    GUN(20, 1.2),
    ARROW(18, 1.6),
    SWORD(10, 1.8),
    KNIFE(15, 1.5);

    private int damage;
    private double attackSpeed;
    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
