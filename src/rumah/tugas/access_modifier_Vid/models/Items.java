package rumah.tugas.access_modifier_Vid.models;

public class Items {
    private Long id;
    private String nama;
    private String desc;
    private int rarity;
    private double effect;
    public Items(){

    }
    public Items(Long id,String nama, String desc, int rarity, double effect){
        this.id=id;
        this.nama=nama;
        this.desc=desc;
        this.rarity=rarity;
        this.effect=effect;

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public double getEffect() {
        return effect;
    }

    public void setEffect(double effect) {
        this.effect = effect;
    }

}
