public class Beyonce {
    private final int age = 42;
    private final int experience = 20;

    public void Lemonade() {
        System.out.println("Jay Z's car has been smashed");
    }

    public void SpiceReunion() {
        System.out.println("The Spice Girls have reunited again!");
    }

    public void YoungFame() {
        int x = age - experience;
        System.out.println("I was " + x + " years old when fame found me");
    }

    public static void main(String[] args) {
        Beyonce bee = new Beyonce();
        bee.Lemonade();
        bee.YoungFame();
        bee.SpiceReunion();
    }
}
