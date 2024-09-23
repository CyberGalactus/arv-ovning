package se.ovning;

public class Main {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.setAndroid_version("Android Pie");
        System.out.println("Samsung Android version: " + s.getAndroid_version());
    }
}
