package com.example;

import java.util.ArrayList;
import java.util.List;

public class ListeEtudiants {
    private static List<Etudiant> etudiants = new ArrayList<>();

    public static List<Etudiant> ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiants;
    }

    public static List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public static void setEtudiants(List<Etudiant> etudiants) {
        ListeEtudiants.etudiants = etudiants;
    }
}
