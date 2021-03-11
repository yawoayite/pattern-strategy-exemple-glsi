public class Context {
    private inTri tri;

    //Ici on initialise un client avec un tri  par défaut
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
