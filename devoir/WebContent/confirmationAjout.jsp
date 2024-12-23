<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.List" %>
<%@ page import="Etudiant" %>
<!DOCTYPE html>
<html>
<head>
    <title>Confirmation Ajout</title>
</head>
<body>
    <h1>Étudiant ajouté avec succès !</h1>
    <h2>Liste des étudiants :</h2>
    <ul>
        <%
            List<Etudiant> etudiants = (List<Etudiant>) request.getAttribute("etudiants");
            for (Etudiant etudiant : etudiants) {
        %>
            <li><%= etudiant.getNom() %> <%= etudiant.getPrenom() %>, <%= etudiant.getAge() %> ans</li>
        <%
            }
        %>
    </ul>
</body>
</html>
