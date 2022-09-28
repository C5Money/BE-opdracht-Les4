public class Main {
    public static void main(String[] args) {

//      Mijn Poky's
        FirePoky zard = new FirePoky("fire", "charzar", 0, 2, "chari", "vuurballen", true);
        ElectroPoky pika = new ElectroPoky("Water", "Pika", 1, 0, true);
        AquaPoky driplet = new AquaPoky("water", "driplet", 3, 1, true);

//      Vuurpokemon:
        System.out.println("Mijn vuurpoky's naam is: " + zard.getName());
        System.out.println("When he speaks he sound like: ");
        zard.speaks();

//      Ik ga mijn vuurpoky laten levellen door VOLDOENDE te eten:
        zard.eats();
        zard.eats();
        zard.eats();



    }
}
