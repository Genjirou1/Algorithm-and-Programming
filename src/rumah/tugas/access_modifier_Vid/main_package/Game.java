package rumah.tugas.access_modifier_Vid.main_package;

import rumah.tugas.access_modifier_Vid.models.Items;
import rumah.tugas.access_modifier_Vid.models.Player;

public class Game {
    public static void main(String[] args) {
        Items smallPotion = new Items(1L,"Small Potion","Menambahkan Darah Sebanyak 10%",
                1,0.1);
        Items medPotion = new Items();
        medPotion.setId(2L);
        medPotion.setNama("Medium Potion");
        medPotion.setDesc("Menambahkan Darah Sebanyak 30%");
        medPotion.setRarity(2);
        medPotion.setEffect(0.3);
        Items bigPotion = new Items(3L,"Big Potion","Menambahkan Darah sebanyak 50%",
                3,0.5);


        Player genjirou = new Player();
        genjirou.nama = "Genjirou";


        genjirou.cekStatus();


    }
}
