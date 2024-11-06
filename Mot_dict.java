public class Mot_dict
{ 
    private String  Mot;
    private String  Definition;
    public Mot_dict (String mot, String def)
    {
        this.Mot=mot;
        this.Definition=def;
    }
    String getMot ()
    {
        return Mot;
    }
    public String getDefinition () 
    {
        return Definition;
    }
    /*public Void setMot (String M)
    {
        this.Mot = M;
    }
    public Void setDéfinition (String D) 
    {
        this.Definition = D;
    }*/
    public Boolean synonyme (Mot_dict M)
    {
        return M.Definition.equals(this.Definition);
    }
    public Boolean synonyme (String Definition)
    {
        return Definition.equals(this.Definition);
    }
    public String ToString () 
    {
        return "Mot :"+Mot+"\n Definition:"+Definition;
    }
    public static void main(String[] args) {
        Mot_dict premier_mot = new Mot_dict("michael jackson", "c'est un pop star");
        Mot_dict deuxieme_mot = new Mot_dict("dsi", "c'est le developpement des sys informatique");
        
        // Affichage du premier mot et de sa définition
        System.out.println("Mot1 : " + premier_mot.getMot() + "\nDefinition1 : " + premier_mot.getDefinition());
        
        // Vérification des synonymes
        System.out.println("Le premier mot et le deuxième mot sont-ils synonymes ? " + premier_mot.synonyme(deuxieme_mot));
    }

    
}


