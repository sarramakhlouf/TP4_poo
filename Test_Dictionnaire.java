public class Test_Dictionnaire{
    public static void main(String[] args) {
        Dictionnaire dico = new Dictionnaire("MonDictionnaire");
        Mot_dict mot1 = new Mot_dict ("chat","un animal domestique");
        Mot_dict mot2 = new Mot_dict ("chien","un animal loyal");
        Mot_dict mot3 = new Mot_dict ("cheval","un mammifère");
        dico.Ajouter_Mot(mot1);
        dico.Ajouter_Mot(mot2);
        dico.Ajouter_Mot(mot3);
        System.out.println("le contenu de mon dictionnaire:");
        dico.Lister_dictionnaire();
        System.out.println("recherche la definition de chien:");
        dico.Rechercher_dicho("chien");
        System.out.println("suppression du mot chat");
        dico.Supprimer_Mot(mot1);
        System.out.println("le dictionnaire après la suppression:");
        dico.Lister_dictionnaire();
        System.out.println("nombres des synonymes de mot cheval="+dico.Nombre_synonyme(mot3));
    }
}