public class AnggotaKoperasi {
    private String noKTP;
    private String nama;
    private int limit;
    private int jumlah;

    AnggotaKoperasi(String noKTP, String nama, int limit) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getName() {
        return nama;
    }

    public int getLimit() {
        return limit;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void pinjam(int pinjam) {
        if (pinjam >= 10000000) {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.\n");
        } else if (pinjam <= 0) {
            System.out.println("Maaf, inputan tidak valid");
        } else {
            jumlah += pinjam;
        }
    }

    public void ansuran(int ansur) {
        int kembalian;
        if (ansur > jumlah) {
            kembalian = jumlah - ansur;
            jumlah = 0;
            System.out.println("Anda membayar melebihi pinjaman, kembalian anda sebanyak Rp" + kembalian);
        } else if (ansur > jumlah * 10 / 100) {
            jumlah -= ansur;
        } else {
            System.out.println("Maaf, ansuran harus 10% dari jumlah pinjaman");
        }
    }
}
