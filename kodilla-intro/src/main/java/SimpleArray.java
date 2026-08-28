public class SimpleArray {
    public static void main(String[] args) {
        String[] bands = new String[5];
        bands[0] = "Pearl Jam";
        bands[1] = "Pink Floyd";
        bands[2] = "Led Zeppelin";
        bands[3] = "The Beatles";
        bands[4] = "Alice in Chains";

        int numberOfElements = bands.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementow");
    }
}