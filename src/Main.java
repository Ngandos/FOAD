import Models.Etudiants;
import Models.Formateurs;
import Models.Formations;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Listes de commandes

        ArrayList<String> commands = new ArrayList<>();
        commands.add("Help");
        commands.add("Form");
        commands.add("Forma");
        commands.add("Students");

        ArrayList<String> formCommands = new ArrayList<>();
        formCommands.add("HelpForm");
        formCommands.add("AddFormation");
        formCommands.add("DisplayFormations");
        formCommands.add("UpdateFormation");
        formCommands.add("RemoveFormation");
        formCommands.add("Exit");

        ArrayList<String> formaCommands = new ArrayList<>();
        formaCommands.add("HelpForma");
        formaCommands.add("AddFormateur");
        formaCommands.add("DisplayFormateurs");
        formaCommands.add("UpdateFormateur");
        formaCommands.add("RemoveFormateur");
        formaCommands.add("Exit");

        ArrayList<String> studentCommands = new ArrayList<>();
        studentCommands.add("HelpStudent");
        studentCommands.add("AddEtudiant");
        studentCommands.add("DisplayEtudiants");
        studentCommands.add("UpdateEtudiant");
        studentCommands.add("RemoveEtudiant");
        studentCommands.add("Exit");

        // Listes d'objets

        ArrayList<Formateurs> formateurList = new ArrayList<>();
        formateurList.add(new Formateurs("Einstein", "Data analysis"));
        formateurList.add(new Formateurs("Safia", "Data Engineer"));
        formateurList.add(new Formateurs("Fally", "Python developper"));
        formateurList.add(new Formateurs("Roga", "Chef Security officer"));


        ArrayList<Etudiants> etudiantList = new ArrayList<>();
        etudiantList.add(new Etudiants(1, "Ngando", "ngando@gmail.com"));
        etudiantList.add(new Etudiants(2, "Nguma", "nguma@gmail.com"));
        etudiantList.add(new Etudiants(2, "Innoss", "balumé@gmail.com"));
        etudiantList.add(new Etudiants(2, "Fabregas", "fab@gmail.com"));

        ArrayList<Formations> formationsList = new ArrayList<>();
        formationsList.add(new Formations(1, "Data Engineer", "Gestion et sécurisation des données", formateurList.get(0)));
        formationsList.add(new Formations(2, "MS Java JEE", "Spécialisation java entreprise", formateurList.get(0)));
        formationsList.add(new Formations(3, "Developpeur Fullstack", "Developpement Python IA", formateurList.get(0)));
        formationsList.add(new Formations(4, "AIS", "Administration infrastructures sécurisées", formateurList.get(0)));

        // Scanner pour les entrées utilisateur

        Scanner sc = new Scanner(System.in);

        boolean continuer = true;

        while (continuer) {
            System.out.println("\nQue voulez-vous faire ? (Tapez 'Help' pour la liste des commandes)");
            String saisie = sc.next();

            switch (saisie) {
                case "Help":
                    System.out.println(commands);
                    break;

                case "Form":
                    boolean goOn = true;
                    while (goOn) {
                        System.out.println("\nMenu Formation (Tapez 'HelpForm' pour les commandes) : ");
                        String formSaisie = sc.next();

                        switch (formSaisie) {
                            case "HelpForm":
                                System.out.println(formCommands);
                                break;

                            case "AddFormation":
                                System.out.println("Saisissez le titre de la formation : ");
                                sc.nextLine(); // Consommer le saut de ligne
                                String titre = sc.nextLine();
                                System.out.println("Saisissez la description de la formation : ");
                                String description = sc.nextLine();

                                System.out.println("Formateurs disponibles : " + formateurList);
                                System.out.println("Sélectionnez un formateur par nom : ");
                                String nomFormateur = sc.nextLine();

                                Formateurs formateurAssocie = formateurList.stream()
                                        .filter(f -> f.getNom().equalsIgnoreCase(nomFormateur))
                                        .findFirst()
                                        .orElse(null);

                                if (formateurAssocie != null) {
                                    formationsList.add(new Formations(formationsList.size() + 1, titre, description, formateurAssocie));
                                    System.out.println("Formation ajoutée avec succès !");
                                } else {
                                    System.out.println("Formateur introuvable.");
                                }
                                break;

                            case "DisplayFormations":
                                formationsList.forEach(System.out::println);
                                break;

                            case "UpdateFormation":
                                System.out.println("Indiquez l'ID de la formation à modifier : ");
                                int id = sc.nextInt();
                                formationsList.stream()
                                        .filter(f -> f.getId() == id)
                                        .findFirst()
                                        .ifPresentOrElse(
                                                formation -> {
                                                    System.out.println("Saisissez le nouveau titre : ");
                                                    sc.nextLine(); // Consommer le saut de ligne
                                                    formation.setTitre(sc.nextLine());
                                                    System.out.println("Formation mise à jour avec succès !");
                                                },
                                                () -> System.out.println("Formation introuvable.")
                                        );
                                break;

                            case "RemoveFormation":
                                System.out.println("Indiquez l'ID de la formation à supprimer : ");
                                int removeId = sc.nextInt();
                                formationsList.removeIf(f -> f.getId() == removeId);
                                System.out.println("Formation supprimée.");
                                break;

                            case "Exit":
                                System.out.println("Vous quittez le menu Formation.");
                                goOn = false;
                                break;

                            default:
                                System.out.println("Commande invalide. Tapez 'HelpForm' pour la liste des commandes.");
                                break;
                        }
                    }
                    break;

                case "Forma":

                    boolean continueForma = true;

                    while (continueForma) {

                        System.out.println("\nMenu Formateur (Tapez 'HelpForma' pour les commandes) : ");
                        String formaSaisie = sc.next();

                        switch (formaSaisie) {

                            case "HelpForma":
                                System.out.println(formaCommands);
                                break;

                            case "AddFormateur":
                                System.out.println("Saisissez le nom du formateur : ");
                                sc.nextLine(); // Consommer le saut de ligne
                                String nomForma = sc.nextLine();
                                System.out.println("Saisissez l'expertise du formateur : ");
                                String expertise = sc.nextLine();
                                formateurList.add(new Formateurs(nomForma, expertise));
                                System.out.println("Formateur ajouté.");
                                break;

                            case "DisplayFormateurs":
                                formateurList.forEach(System.out::println);
                                break;

                            case "Exit":
                                System.out.println("Vous quittez le menu Formateur.");
                                continueForma = false;
                                break;

                            default:
                                System.out.println("Commande invalide. Tapez 'HelpForma' pour la liste des commandes.");
                                break;
                        }
                    }
                    break;

                case "Students":
                    boolean continueStudents = true;
                    while (continueStudents) {
                        System.out.println("\nMenu Étudiant (Tapez 'HelpStudent' pour les commandes) : ");
                        String studentSaisie = sc.next();

                        switch (studentSaisie) {
                            case "HelpStudent":
                                System.out.println(studentCommands);
                                break;

                            case "AddEtudiant":
                                System.out.println("Saisissez le nom de l'étudiant : ");
                                sc.nextLine(); // Consommer le saut de ligne
                                String nomEtudiant = sc.nextLine();
                                System.out.println("Saisissez l'email de l'étudiant : ");
                                String emailEtudiant = sc.nextLine();
                                etudiantList.add(new Etudiants(etudiantList.size() + 1, nomEtudiant, emailEtudiant));
                                System.out.println("Étudiant ajouté.");
                                break;

                            case "DisplayEtudiants":
                                etudiantList.forEach(System.out::println);
                                break;

                            case "Exit":
                                System.out.println("Vous quittez le menu Étudiant.");
                                continueStudents = false;
                                break;

                            default:
                                System.out.println("Commande invalide. Tapez 'HelpStudent' pour la liste des commandes.");
                                break;
                        }
                    }
                    break;

                case "Exit":
                    System.out.println("Fin du programme.");
                    continuer = false;
                    break;

                default:
                    System.out.println("Commande invalide. Tapez 'Help' pour la liste des commandes.");
                    break;
            }
        }

        sc.close();
    }
}
