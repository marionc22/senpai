public class Hangar {
        public static void main(String[] args) {
           Car clio = new Car ("clio", 44) ;
            Car peugeot = new Car ("peugeot", 45) ;
            Boat voilier = new Boat ("voilier", 46) ;
            System.out.println(voilier.doStuff());
            System.out.println(peugeot.doStuff());
            System.out.println(clio.doStuff());
        }
}
