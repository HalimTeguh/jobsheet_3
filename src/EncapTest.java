public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap1 = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();

        encap1.setName("Halim");
        encap1.setAge(35);

        encap2.setName("Teguh");
        encap2.setAge(15);

        System.out.println("Name encap1\t: " + encap1.getName());
        System.out.println("Age encap1\t: " + encap1.getAge());

        System.out.println();

        System.out.println("Name encap2\t: " + encap2.getName());
        System.out.println("Age encap2\t: " + encap2.getAge());
    }
}
