package Abstract_Class.AlatMusik;

public class Keyboard extends Instrument {
    private int noKunci;
    public Keyboard(String nama, String bunyi, int noKunci){
        super(nama, bunyi);
        this.noKunci = 7;
    }

    public int getNokunci(){
        return this.noKunci;
    }
    @Override
    public void display() {
        System.out.println("\nAnda akan memainkan keyboard " + getNama());
        
    }

    @Override
    public void bunyikanAlat() {
        System.out.println("Anda menekan ke-" + getNokunci() + " Kunci");
    }

    public void bunyikanAlat(int pilihKunci){
        System.out.println("Anda menekan kunci " + pilihKunci + " Menghasilkan nada ke-" + pilihKunci);
    }
}
