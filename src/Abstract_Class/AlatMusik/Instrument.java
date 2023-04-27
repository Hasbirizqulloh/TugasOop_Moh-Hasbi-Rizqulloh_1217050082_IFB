package Abstract_Class.AlatMusik;

public abstract class Instrument {
    private String nama;
    private String bunyi;

    public Instrument(String nama, String bunyi) {
        this.nama = nama;
        this.bunyi = bunyi;
     }

    public String getNama(){
        return this.nama;
    }

    public String getBunyi(){
        return this.bunyi;
    }
    public abstract void display();
    public abstract void bunyikanAlat();
    
}
