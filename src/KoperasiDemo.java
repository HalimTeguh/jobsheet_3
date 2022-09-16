public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Halim Teguh Saputro", "Jl. Niaga");
        System.out.println();
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Halim Teguh Saputro");
        anggota1.setAlamat("Jl. Niaga");
        anggota1.setor(100000);

        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

    }
}
