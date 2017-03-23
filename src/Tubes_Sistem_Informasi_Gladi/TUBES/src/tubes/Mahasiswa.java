package tubes;

public class Mahasiswa extends Orang{
    private String nim;
    private String fakultas;
    private final int sks;
    
    public Mahasiswa(String nama, String nim, String fakultas, int sks){
        super.setNama(nama);
        this.nim = nim;
        this.fakultas = fakultas;
        this.sks = sks;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    
}
