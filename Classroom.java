public class Classroom {
    public static void main(String[] args) {

        Wilder rey = new Wilder("Reynald", true);
        Wilder julien = new Wilder("Julien", true);
        Wilder dylan = new Wilder("Dylan", false);
        Wilder sarah = new Wilder("Sarah", false);
        Wilder arthur = new Wilder("Arthur", true);

        arthur.setName("yass");

        System.out.println(rey.whoAmI());
        System.out.println(julien.whoAmI());
        System.out.println(dylan.whoAmI());
        System.out.println(sarah.whoAmI());
        System.out.println(arthur.whoAmI());
    }
}