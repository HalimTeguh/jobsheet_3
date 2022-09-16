import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinjam, angsur;

        AnggotaKoperasi anggota1 = new AnggotaKoperasi("111122223333", "Halim", 5000000);

        System.out.println("Nama Anggota\t: " + anggota1.getName());
        System.out.println("Limit Pinjamana\t: " + anggota1.getLimit());

        System.out.println("\nMeminjam Uang 10.000.000...");
        System.out.print("Masukkan nominal peminjaman: ");
        pinjam = sc.nextInt();
        anggota1.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlah());

        System.out.println("\nMeminjam Uang 4.000.000...");
        System.out.print("Masukkan nominal peminjaman: ");
        pinjam = sc.nextInt();
        anggota1.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlah());

        System.out.println("\nMembayar ansuran 1.000.000...");
        System.out.print("Masukkan nominal pembarayan angsuran: ");
        angsur = sc.nextInt();
        anggota1.ansuran(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlah());

        System.out.println("\nMembayar ansuran 100.000...");
        System.out.print("Masukkan nominal pembarayan angsuran: ");

        angsur = sc.nextInt();
        anggota1.ansuran(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlah());

        System.out.println("\nMembayar ansuran 3.000.000...");
        System.out.print("Masukkan nominal pembarayan angsuran: ");
        angsur = sc.nextInt();
        anggota1.ansuran(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlah());
    }
}
