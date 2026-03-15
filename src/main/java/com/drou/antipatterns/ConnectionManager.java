package com.drou.antipatterns;

public class ConnectionManager {
    private final SlowService service;
    private String status;
    
    /*
       Contexte: J'ai du contrôle sur l'instantiation de ma classe

       Utilité de cette approche:
       * Permet d'isoler le TUF pour ne pas en dépendre durant les tests automatisés
       * Rends explicite les dépendances requises pour que ConnectionManager s'exécute avec succès.
       * Favorise l'immutabilité (dépendance à SlowService)

       Inconvénient(s) de cette approche:
       * Inflige un minimum de maintenance sur les consommateurs de cette classe si on ne fourni
         plus le constructeur sans paramètre.

         MONTRER QU'ON PEUT FAIRE ÇA ÉGALEMENT AVEC DES DÉPENDANCES QU'ON NE POSSÈDE PAS SI ON EST CAPABLE D'ISOLER DANS QUELLE METHODE SE CACHE LE TUF
         EXPLIQUER QUE C'EST MIEUX QU'UN MOCK QUI RETIRE TOUT EXÉCUTION VS SEULEMENT OVERRIDER L'EXÉCUTION DU TUF (LORSQUE MÉTHODE NON FINALE)
    */
    public ConnectionManager(SlowService service) {
        // Constructor does slow work
        this.service = service;
    }

    public void connect() {
        status = this.service.call("connect");
    }

    public boolean isConnected() {
        return status.equalsIgnoreCase("Processed: connect");
    }
}
