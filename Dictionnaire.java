public class Dictionnaire 
{
    private int  nb_mots;
    private Mot_dict[] dict ;
    private String nom;
    public Dictionnaire(String nom) 
    {
        this.nom = nom;
        this.dict = new Mot_dict[100];
        this.nb_mots = 0;
    }
    Void Ajouter_Mot (Mot_dict MotDict) 
    {
        if (nb_mots < dict.length)
        {
            dict[nb_mots]= MotDict;
            nb_mots ++;
            Trier ();
        }
        else 
        {
            System.out.println("le dictionnaire est plein");
        }
    }
    void Trier ()
    {
        for (int i=0;i<nb_mots;i++)
        {
            int min =i;
            for (int j=i; j < nb_mots-1;j ++)
            {
                if (dict[j].getMot().compareTo(dict[min].getMot())<0)
                {
                    min = j;
                }
            }
            Mot_dict temp=dict[min];
            dict[min]=dict[i];
            dict[i]=temp;
        }
    }
    Void Supprimer_Mot (Mot_dict MotDict) 
    {
        for (int i=0;i<nb_mots;i++)
        {
            if (dict[i].getMot().equals(MotDict.getMot()))
            {
                for (int j=i;j < nb_mots-1;j ++)
                {
                    dict[j]=dict[j+1];
                }
            }
            dict[nb_mots-1]= null;
            nb_mots--;
        }
    }
    public String Rechercher_dicho(String mot)
    {
        String ch = null;
        for (int i=0;i<nb_mots;i++)
        {
            if (dict[i].getMot().equals(mot))
            {
                ch= dict[i].getDefinition();
            }
            ch="mot non trouvé";
        }
        return ch;
    }
    public void Lister_dictionnaire()
    {
        for (int i=0;i<nb_mots;i++)
        {
            System.out.println("MOt:"+dict[i].getMot()+",definition:"+dict[i].getDefinition());
        }
    }
    int Nombre_synonyme (Mot_dict M)
    {
        int count=0;
        for (int i=0;i<nb_mots;i++)
        {
            if(M.synonyme(dict[i])) 
            {
                count++;
            }
        }
        return count;

    }
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