package rumah.oop.game1;

public class Potions {
    static Item smallPotion = new Item(1L,"Small Potion","Menambahkan Darah Sebanyak 10%",
            1,0.1);
    static Item medPotion = new Item(2L,"Medium Potion","Mendambahkan Darah sebanyak 30%",
            2,0.3);
    static Item bigPotion = new Item(3L,"Big Potion","Menambahkan Darah sebanyak 50%",
            3,0.5);

    public static Item getSmallPotion() {
        return smallPotion;
    }

    public static Item getMedPotion() {
        return medPotion;
    }

    public static Item getBigPotion() {
        return bigPotion;
    }

}
