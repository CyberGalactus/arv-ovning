//Multi Level inheritance/arv
// a subklass inherit from superklass and superklass also act as superklass to other klass
// mobile --> Android --> Samsung
package se.ovning;

public class Main {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.setColor("Black");
        s.setCost(300000);
        s.setRAM("4GB");
        s.setAndroid_version("Android Pie");
        System.out.println("Samsung mobile details");
        System.out.println("Cost: " + s.getCost());
        System.out.println("Color: " + s.getColor());
        System.out.println("RAM: " + s.getRAM());
        System.out.println("Android version: " + s.getAndroid_version());
    }
}
