package kata.bijak.kartun_anime.bantuan;


public class Act_set_get {
    private static String nama;
    private static String foto;
    private static String detail;

    public String get_nama() {
        return nama;
    }

    public void set_nama(final String namax) {
        this.nama = namax;
    }
    public String get_detail() {
        return detail;
    }

    public void set_detail(final String detailx) {
        this.detail = detailx;
    }
    public String get_foto() {
        return foto;
    }

    public void set_foto(final String fotox) {
        this.foto = foto;
    }

}
