package com.drou.antipatterns;

public class ConnectionManager {
    private String status;

    /*
        Contexte: je n'ai pas de contrôle sur l'instantiation de ma classe

        Utilité de cette approche:
        * Permet d'isoler le TUF pour ne pas en dépendre durant les tests automatisés
        * Intervention minimaliste qui ne créée pas d'effets de bord.

        Inconvénient(s) de cette approche:
        * On doit ajouter une méthode protected qui ne sera utilisée seulement que pour les
          fins de tests.
     */

    //Signature du constructeur reste telle quelle (n'inflige pas de mise à jour des utilisateurs de la classe)
    public ConnectionManager() {
    }

    // On délègue à getService() la responsabilité de trouver et fournir le service,
    // sans faire de modification au comportement d'affaire en place.
    public void connect(){
        SlowService service = getService();
        this.status = service.call("connect");
    }

    //On isole le TUF dans une méthode non finale pour pouvoir l'overrider en test
    protected SlowService getService() {
        return new SlowService();
    }

    public boolean isConnected() {
        return status.equalsIgnoreCase("Processed: connect");
    }
}
