public class Motor {
    private int kecepatan = 95;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikamMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true && kecepatan < 100) {
            kecepatan += 5;
        } else if (kecepatan == 100) {
            System.out.println(
                    "Anda Telah mencapai kecepatan maksimal, Mohon Hati-Hati! \n");
        } else if (kontakOn == false) {
            System.out.println(
                    "Kecepatan tidak bisa bertambah karena Mesin OFF! \n");
        }

    }

    public void kurangiKecepatan() {
        if (kontakOn == true && kecepatan > 0) {
            kecepatan -= 5;
        } else {
            System.out.println(
                    "Kecepatan tidak bisa bertambah karena Mesin OFF! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
