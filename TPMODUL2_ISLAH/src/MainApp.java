public class MainApp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("Bebasdeh", 16, 4.6f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(false, "Gataudah", 16, 3.6f);
        hp.informasi();
        hp.telfon(81234);
        hp.kirimSMS(21234);
        hp.manyMessage(46578, 98765);

        System.out.println();

        Laptop laptop = new Laptop("Yuhuuu", 32, 4.8f, false);
        laptop.informasi();
        laptop.bukaGame("Free Fire");
        laptop.kirimEmail("islah.ihya@gmail.com");
        laptop.multiEmail("islah.ihya@gmail.com", "ihya.islah@mail.com");
    }
}
