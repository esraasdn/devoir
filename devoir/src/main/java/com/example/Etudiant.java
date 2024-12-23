package com.example;

public class Etudiant {
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Etudiant() {
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }
}

