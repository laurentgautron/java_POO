package heritage;

public class Main {
    public static void main(String[] args) {
        var chris = new Guerrier("christian", 200, "M16 A4");
        var bamos  =new Magicien("Bamos", 500, "Baguette Zozor");
        var mamadou = new Sorcier("Mamadou", 500, "BaguetteDou", "BatonZor");

        System.out.println(chris);
        System.out.println(bamos);
        System.out.println(mamadou);
    }
}
