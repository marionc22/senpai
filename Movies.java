public class Movies {
    public static void main(String[] args) {
        String[] movies = {
                "Les Aventuriers de l'Arche perdue ",
                "Indiana Jones et le Temple maudit", "Indiana Jones et la Dernière Croisade "};

        String[][] actors;
        actors = new String[][]{
                {"Harrison Ford", "Kate Capshaw", "Reynald Prudent"},
                {"Harrison Ford", "Sean Connery", "Julien Omont"},
                {"Harrison Ford", "Cate Blanchett", "Dylan Legrand"}
        };
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Dans le film"  + movies[i] + " les acteurs principaux sont");
            for (int j = 0; j < actors.length; j++) {
                System.out.println(actors[i][j]);
            }
        }
    }
}
