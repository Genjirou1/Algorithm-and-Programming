package rumah.tugas.access_modifier_Vid.models;

public class Game {
    public static void main(String[] args) {
        Items smallPotion = new Items(1L, "Small Potion", "Menambahkan Darah Sebanyak 10%",
                1, 0.1);
        Items medPotion = new Items(2L, "Medium Potion", "Menambahkan Darah Sebanyak 30%",
                2, 0.3);

        Items bigPotion = new Items(3L, "Big Potion", "Menambahkan Darah sebanyak 50%",
                3, 0.5);

        Player genjirou = new Player();
        genjirou.nama = "Genjirou";


        genjirou.cekStatus();
        genjirou.takeDamage(50);
        genjirou.useItem(medPotion);
    }
}
