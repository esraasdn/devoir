package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAjout extends HttpServlet {
  
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les informations saisies
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        int age = Integer.parseInt(request.getParameter("age"));

        // Créer une instance d'Étudiant
        Etudiant etudiant = new Etudiant(nom, prenom, age);

        // Ajouter l'étudiant à la liste
        ListeEtudiants.ajouterEtudiant(etudiant);

        // Passer la nouvelle liste à la JSP
        request.setAttribute("etudiants", ListeEtudiants.getEtudiants());

        // Rediriger vers la JSP confirmationAjout.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("confirmationAjout.jsp");
        dispatcher.forward(request, response);
    }
}
