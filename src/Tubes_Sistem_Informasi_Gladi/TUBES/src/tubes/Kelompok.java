package tubes;

public class Kelompok {
    private String namaKelompok;
    private final int kapasitas;
    private Mahasiswa[] anggota;
    
    public Kelompok(String namaKelompok, int kapasitas){
        this.namaKelompok = namaKelompok;
        this.kapasitas = kapasitas;
        anggota = new Mahasiswa[kapasitas];
    }

    public String getNamaKelompok() {
        return namaKelompok;
    }

    public void setNamaKelompok(String namaKelompok) {
        this.namaKelompok = namaKelompok;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public Mahasiswa[] getAnggota() {
        return anggota;
    }

    public void addAnggota(Mahasiswa m){
        for(int i = 0; i <= anggota.length; i++){
            if(anggota[i] == null){
                anggota[i] = m;
            }
        }
    }
    
    public void removeAnggota(int id){
        anggota[id] = null;
    }
    
    @Override
    public String toString(){
        return "Nama Kelompok : " + this.namaKelompok + '\n' + "Kapasitas kelompok : " + this.kapasitas + '\n';
        
    }
    
    
}
