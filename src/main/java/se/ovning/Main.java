//Hierarchical inheritance/arv
// One class serves as superklass and two or more classes serves as subklass
//           Mobile
//             |
//          Android
//   Xiaomi ---|--- Nokia
//          Samsung
package se.ovning;

public class Main {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Nokia n = new Nokia();
        Xiaomi x = new Xiaomi();
        s.setColor("Black");
        s.setCost(300000);
        s.setRAM("4GB");
        s.setAndroid_version("Android Pie");

        n.setColor("Red");
        n.setCost(30000000);
        n.setRAM("4GB");
        n.setAndroid_version("Android marshmelo");

        x.setColor("Red");
        x.setCost(987654321);
        x.setRAM("1GB");
        x.setAndroid_version("Android marsh");


        System.out.println("Samsung mobile details");
        System.out.println("Cost: " + s.getCost());
        System.out.println("Color: " + s.getColor());
        System.out.println("RAM: " + s.getRAM());
        System.out.println("Android version: " + s.getAndroid_version());

        System.out.println("Nokia mobile details");
        System.out.println("Cost: " + n.getCost());
        System.out.println("Color: " + n.getColor());
        System.out.println("RAM: " + n.getRAM());
        System.out.println("Android version: " + n.getAndroid_version());

        System.out.println("Xiaomi mobile details");
        System.out.println("Cost: " + x.getCost());
        System.out.println("Color: " + x.getColor());
        System.out.println("RAM: " + x.getRAM());
        System.out.println("Android version: " + x.getAndroid_version());
    }
}
