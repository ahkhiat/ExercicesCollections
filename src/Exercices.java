import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercices {
    public void exo1(){

        // - Exercice 1

        // 1 - Créer une Liste countries et y insérer les pays suivants :
        //     France, Espagne, Chine, Mexique, Russie, Tunisie

        ArrayList <String> countries = new ArrayList<>();

        countries.add("France");
        countries.add("Espagne");
        countries.add("Chine");
        countries.add("Mexique");
        countries.add("Russie");
        countries.add("Tunisie");

        // 2- Afficher countries selon la même forme qu'au tableau
        System.out.println(utils.parcourirList(countries));

        // 3- Taille de coiuntries
        System.out.println("Taille de countries : " + countries.size());

        // 4- Suprrimer la Chine puis afficher 2 et 3
        countries.remove("Chine");
        System.out.println("Après suppression de Chine : " + utils.parcourirList(countries));

        // 5 - Remplacer Russie par Ukraine puis 2 et 3
        countries.set(countries.indexOf("Russie"), "Ukraine" );
        System.out.println(utils.parcourirList(countries));

        // 6 - Ajouter le Mali après l'Espagne puis 2 et 3
        countries.add(countries.indexOf("Espagne")+1, "Mali");
        System.out.println(utils.parcourirList(countries));

        // 7 - Supprimer tous les pays puis 2 et 3
        countries.clear();
        System.out.println("Après clear : " + utils.parcourirList(countries));
    }



    public void exo2() {

        // - Exercice 2

        // 1- Créer le map suivant (Pays -> Population)
        // France -> 70 000 000, Tunisie -> 11 800 000, Mexique -> 133 000 000

        Map<String, String> countries = new Map<>();

        countries.put("France", "70 000 000");
        countries.put("Tunisie", "11 800 000");
        countries.put("Mexique", "133 000 000");


        // 2- Afficher le map

        countries.forEach((country,population) ->
                System.out.println(country + ", " + population)
        );

        // 3- Ajouter la Russie après la Tunisie->146 000 000 puis 2-

        // 4- Remplacer la Russie par le Sénégal -> 17 700 000 puis 2-
        // 5- Afficher les pays par ordre croissant de population puis 2-
        // 6- Afficher les pays par ordre alpha
        // 7- Supprimer le Sénégal puis 2-
        // 8- Tout supprimer puis 2-


    }
}
