public class App {
    public static void main(String[] args) {
        //Cette initialisation utilise le tri par défaut
        Context c = new Context();
        c.afficher();

        //Changement de tri. l'affichage sera ce qu'il se trouve dans notre méthode trier surchagée dans Tribullle

        c.setTri(new Tribulle());//On change de méthode de tri
        c.afficher();

        //Changement de tri. l'affichage sera ce qu'il se trouve dans notre méthode trier surchagée dans Trifusion

        c.setTri(new Trifusion());//On change de méthode de tri
        c.afficher();



        //Pour apporter une nouvelle méthode de tri il suffit de créer une classe implémentant l'interface inTri
        //Et surcharger la méthode trier()

        //Pour rappel le pattern Strategy permet d'encapsuler une famille d'algorithme dans ce cas la famille d'algorithme est Trier

        //Le pattern strategy ne peut être défini que sur une seule méthode
        //Si vous mettez deux signatures de méthodes dans l'interface inTri ce ne sera plus le design pattern Strategy
    }
}
