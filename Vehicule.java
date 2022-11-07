public abstract class Vehicule {

        // attributs
        private String brand;
        private int kilometers;

        // constructeurs
        public Vehicule(String brand, int kilometers) {
            this.brand = brand;
            this.kilometers = kilometers;
        }

        // accesseurs et mutateurs


    public int getKilometers() {
        return this.kilometers;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

        public void setKilometers(int kilometers) {
            this.kilometers = kilometers;
        }
    public abstract String doStuff();

    }

