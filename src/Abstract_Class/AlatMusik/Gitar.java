package Abstract_Class.AlatMusik;

public class Gitar extends Instrument{
    private int noSenar;

    public Gitar(String nama, String bunyi, int noSenar){
        super(nama, bunyi);
        this.noSenar = 6;
    }

    public int getNoSenar(){
        return this.noSenar;
    }


    @Override
    public void display() {
        System.out.println("Anda akan memainkan gitar " + getNama());
        
    }

    @Override
    public void bunyikanAlat() {
        System.out.println("Ke-" + getNoSenar() + " senar digenjreng..");
    }

    public void bunyikanAlat(int petikSenar){
        this.noSenar = petikSenar;
        System.out.println("Senar " + getNoSenar() + " dipetik..");
    }
}
