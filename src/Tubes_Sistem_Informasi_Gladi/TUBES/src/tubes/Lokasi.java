package tubes;

public class Lokasi {
    private String namaLokasi;
    private Pembimbing pembimbing;
    private final int kapasitasKelompok;
    private Kelompok[] isiKelompok;
    
    public Lokasi(String namaLokasi, int kapasitasKelompok){
        this.namaLokasi = namaLokasi;
        this.kapasitasKelompok = kapasitasKelompok;
        isiKelompok = new Kelompok[kapasitasKelompok];
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public Pembimbing getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(Pembimbing p) {
        this.pembimbing = p;
    }

    public int getKapasitasKelompok() {
        return kapasitasKelompok;
    }

    public void createKelompok(String namaKelompok, int kapasitas){
        Kelompok k = new Kelompok(namaKelompok, kapasitas);
        
        for(int i = 0; i <= isiKelompok.length; i++){
            if(isiKelompok[i] == null){
                isiKelompok[i] = k;
            }
        }
    }
    
    public void removeKelompok(int id){
        isiKelompok[id] = null;
    }
    
    @Override
    public String toString(){
        return "Nama Lokasi : " + this.namaLokasi + '\n' + "Kapasitas kelompok : " + this.kapasitasKelompok + '\n';
    }
    
    
}
