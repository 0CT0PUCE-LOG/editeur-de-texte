package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;indice;texte");
            return;
        }
        String texte = parameters[2];
        this.document.remplacer(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[1]),texte);
        super.executer();
    }
}
