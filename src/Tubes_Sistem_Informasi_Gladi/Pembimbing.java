package Tubes_Sistem_Informasi_Gladi;

public class Pembimbing extends Orang{
    private String nip;
    private String prodi;
    private String fakultas;
    private String ruangan;
    
    public Pembimbing(String nama, String nip, String prodi, String fakultas, String ruangan){
        super.setNama(nama);
        this.nip = nip;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.ruangan = ruangan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
    
    
}
