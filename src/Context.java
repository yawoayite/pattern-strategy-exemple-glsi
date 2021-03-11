public class Context {
    private inTri tri; //Pour pouvoir utiliser les différents types de tri il faut déclarer un objet de type inTri

    //Ici on initialise un context avec un tri  par défaut
    public Context(){
        this.tri = new Tridefault();
    }

    //pour afficher la méthode en cours d'utilisation
    public void afficher(){
        tri.trier();
    }
    //pour modifier la méthode de tri utilisée
    public void setTri(inTri tri) {
        this.tri = tri;
    }

}
