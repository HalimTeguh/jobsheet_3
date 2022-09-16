public class EncapDemo {
    private String nama;
    private int age;

    public String getName() {
        return nama;
    }

    public void setName(String newName) {
        nama = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 18) {
            age = 18;
        } else if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}
