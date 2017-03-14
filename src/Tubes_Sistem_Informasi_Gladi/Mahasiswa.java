/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

/**
 *
 * Nama : Gangsar Yoga Pamungkas
 * NIM : 1301154096
 * KLS : IF 39 12
 */
public class Mahasiswa {
    private int nim;
    private String nama;
    private String jurusan;
    private int tgl;
    private String alamat;
    private int notelp;
    int i;
    private Mahasiswa[] daftar = new Mahasiswa[i];
    public Mahasiswa(int nim,String nama, String jurusan,int tgl, String alamat, int notelp){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tgl = tgl;
        this.alamat = alamat;
        this.notelp = notelp;
        
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTgl() {
        return tgl;
    }

    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNotelp() {
        return notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}