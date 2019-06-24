package rumah.oop.game1;

import rumah.tugas.access_modifier_Vid.models.Potion;

import javax.swing.*;

public class Game {

    public static void main(String[] args) {




        Player genjirou = new Player("Genjirou");

        genjirou.status();
        genjirou.run();
        genjirou.takeDamage(20);
        genjirou.status();
        genjirou.useItem(Potions.getBigPotion());
        genjirou.takeDamage(50);




//        do{ if (genjirou.isDead()== false){
//            String langkah = JOptionPane.showInputDialog("Langkah Anda(lari,heal)").toLowerCase();
//            if (langkah=="lari"){
//                genjirou.run();genjirou.health-=2;genjirou.status();
//
//            }else if(langkah=="heal"){
//                genjirou.heal();genjirou.health-=2;genjirou.status();
//            }else{
//                JOptionPane.showMessageDialog(null,"Inputan Salah Silahkan Coba lagi");
//            }
//
//        }
//        }while(genjirou.health<=0);
    }
}
