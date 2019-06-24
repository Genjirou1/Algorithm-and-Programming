package rumah.tugas.access_modifier_Vid.models;

public class Player {
    public String nama;
    private int health = 100;
    int strength = 20;
    protected int agility =20;
    int maxHealth= 100;
    public boolean isAlive = true;

    public void cekStatus(){
        cekHidup();
        if (isAlive==true) {

            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println(nama);
            System.out.printf("Darah : %d/%d \nAgility: %d\nStrength: %d\n", health, maxHealth, agility,strength);
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }else {
            System.out.println("You Lose");
        }
    }
    public void takeDamage(int damage){
        health-=damage;
        System.out.println("Player Terkena Damage: "+damage+" Sisa Darah: "+health);
    }
    public boolean cekHidup(){
        if (health<=0){
            isAlive = false;
        }else{
            isAlive = true;
        }
        return true;
    }
    public void useItem(Items item){
        double effect= item.getEffect()*this.getMaxHealth();
        this.health+=effect;
        if (health>maxHealth){
            health =maxHealth;
        }
        System.out.printf("Player %s Menggunakan item %s Health Bertambah %d Menjadi %d \n",this.getNama(),item.getNama()
                ,Math.round(effect),this.getHealth());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
