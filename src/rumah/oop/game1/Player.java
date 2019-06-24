package rumah.oop.game1;

public class Player {
    //property
    private String name;
    private int speed = 30;
    private int health = 200;
    private int maxhealth = 200;
    private boolean isAlive=true;
    private Backpack backpack = new Backpack(20);

    public void status(){
        System.out.println(name);
        System.out.println("Kecepatan: "+speed);
        System.out.println("Darah: "+health);
        System.out.println("Max Health: "+maxhealth);
    }
    public void run() {
        System.out.println(name + " Sedang Lari");
        System.out.println("Kecepatan:" + speed);
    }
    public void takeDamage(int damage){
        health-=damage;
        System.out.println("Player Menerima damage "+damage+" Sisa Darah : "+health);
        if (health<=0){
            this.isAlive=false;
        }
    }
    public boolean isAlive(){
       return this.isAlive;
    }
    public void useItem(Item x){
        double effect= x.getEffect()*this.getMaxhealth();
        this.health+=effect;
        if (health>maxhealth){
            health =maxhealth;
        }
        System.out.printf("Player %s Menggunakan item %s Health Bertambah %f Menjadi %d \n",this.getName(),x.getNama()
                ,effect,this.getHealth());
    }
    public void backpack(){

    }
    //contructor
    public Player(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    public Player(String name, int speed, int health, int maxhealth) {
        this.name = name;
        this.speed = speed;
        this.health = health;
        this.maxhealth = maxhealth;

    }
    public Player(String name){
        this.name= name;
    }
}