public class MegaBytes_Converter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kiloBytesReminder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB" + " = " + kiloBytes / 1024 + " MB and " +
                    kiloBytesReminder + " KB");
        }
    }
}