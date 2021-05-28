package goodelivery;
public class user {
    String nama, email, tlpn, kode_pos;
    int kabupaten, kecamatan, kelurahan;

    public user(String nama, String email, String tlpn, String kode_pos, int kabupaten, int kecamatan, int kelurahan) {
        this.nama = nama;
        this.email = email;
        this.tlpn = tlpn;
        this.kode_pos = kode_pos;
        this.kabupaten = kabupaten;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlpn() {
        return tlpn;
    }

    public void setTlpn(String tlpn) {
        this.tlpn = tlpn;
    }

    public String getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(String kode_pos) {
        this.kode_pos = kode_pos;
    }

    public int getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(int kabupaten) {
        this.kabupaten = kabupaten;
    }

    public int getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(int kecamatan) {
        this.kecamatan = kecamatan;
    }

    public int getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(int kelurahan) {
        this.kelurahan = kelurahan;
    }
    
    
}
