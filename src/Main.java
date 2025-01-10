import Models.Etudiants;
import Models.Formateurs;
import Models.Formations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //...................................................Listes Formateurs

        ArrayList<String> commands = new ArrayList<>();
        commands.add("Help");
        commands.add("Form");
        commands.add("Forma");
        commands.add("Students");

        //...................................................Listes Commandes Formations

        ArrayList<String> formCommands = new ArrayList<>();
        formCommands.add("HelpForm");
        formCommands.add("AddFormation");
        formCommands.add("DisplayFormations");
        formCommands.add("UpdateFormation");
        formCommands.add("RemoveFormation");
        formCommands.add("Exit");

        //...................................................Listes Commandes Formateurs

        ArrayList<String> formaCommands = new ArrayList<>();
        formaCommands.add("HelpForma");
        formaCommands.add("AddFormateur");
        formaCommands.add("DisplayFormateurs");
        formaCommands.add("UpdateFormateur");
        formaCommands.add("RemoveFormateur");
        formaCommands.add("Exit");

        //...................................................Listes Commandes Etudiants

        ArrayList<String> studentCommands = new ArrayList<>();
        studentCommands.add("HelpStudent");
        studentCommands.add("AddEtudiant");
        studentCommands.add("DisplayEtudiants");
        studentCommands.add("Inscrire");
        studentCommands.add("UpdateEtudiant");
        studentCommands.add("RemoveEtudiant");
        studentCommands.add("Exit");

        //...................................................Listes Formateurs

        ArrayList<Formateurs> formateurList = new ArrayList<>();
        formateurList.add(new Formateurs(1,"Einstein", "Data analysis"));
        formateurList.add(new Formateurs(2,"Safia", "Data Engineer"));
        formateurList.add(new Formateurs(3,"Fally", "Python developper"));
        formateurList.add(new Formateurs(4,"Roga", "Chef Security officer"));
        formateurList.add(new Formateurs(5,"Marc", "Java Jee"));
        formateurList.add(new Formateurs(6,"Koffi", "Administrateur D'infrastructure sécurisées"));
        formateurList.add(new Formateurs(7,"Gaz", "Développement Python Ia"));
        formateurList.add(new Formateurs(8,"John", "JavaScript"));
        formateurList.add(new Formateurs(9,"Jun", "Concepteur développeur d'application"));
        formateurList.add(new Formateurs(10,"Kimia", "Ingénieur Data et IA"));

        //...................................................Listes Etudiants

        ArrayList<Etudiants> etudiantList = new ArrayList<>();
        etudiantList.add(new Etudiants(1, "Ngando", "ngando@gmail.com"));
        etudiantList.add(new Etudiants(2, "Nguma", "nguma@gmail.com"));
        etudiantList.add(new Etudiants(3, "Innoss", "balumé@gmail.com"));
        etudiantList.add(new Etudiants(4, "Fabregas", "fab@gmail.com"));
        etudiantList.add(new Etudiants(5, "Nzola", "Nzl@gmail.com"));
        etudiantList.add(new Etudiants(6, "Rebo", "rbt@gmail.com"));
        etudiantList.add(new Etudiants(7, "Suichiro", "sui@gmail.com"));
        etudiantList.add(new Etudiants(8, "Itchigo", "Itchi@gmail.com"));
        etudiantList.add(new Etudiants(9, "Gon", "gfr@gmail.com"));
        etudiantList.add(new Etudiants(10, "Kirua", "kzold@gmail.com"));


        //...................................................Listes Formations

        ArrayList<Formations> formationsList = new ArrayList<>();
        formationsList.add(new Formations(1, "Data Engineer", "Gestion et sécurisation des données", formateurList.get(1)));
        formationsList.add(new Formations(2, "MS Java JEE", "Spécialisation java entreprise", formateurList.get(4)));
        formationsList.add(new Formations(3, "Developpeur Fullstack", "Developpement Python IA", formateurList.get(6)));
        formationsList.add(new Formations(4, "AIS", "Administration infrastructures sécurisées", formateurList.get(5)));
        formationsList.add(new Formations(5, "Data Analyst", "Analyse, formatage et mis a disposition de données", formateurList.get(0)));
        formationsList.add(new Formations(6, "Ingenieur Data et IA", "Dévéloppement intelligence artificielle", formateurList.get(9)));
        formationsList.add(new Formations(7, "C.D.A", "Dévéloppement application", formateurList.get(8)));
        formationsList.add(new Formations(8, "MS JavaScript", "Developpement JavaScript", formateurList.get(7)));
        formationsList.add(new Formations(9, "Développeur Data et IA", "Big Data", formateurList.get(6)));
        formationsList.add(new Formations(10, "Chief security officer", "Management projet cybersécurité", formateurList.get(4)));



        boolean continuer = true;

        while (continuer) {

            System.out.println("Bienvenue dans le systeme de gestion !!!) : ");
            System.out.println();
            System.out.println("*********************************************");
            System.out.println("**************** 1 - Help *******************");
            System.out.println("**************** 2 - Formateur **************");
            System.out.println("**************** 3 - Formation **************");
            System.out.println("**************** 4 - Etudiants **************");
            System.out.println("**************** 5 - Exit     ***************");
            System.out.println("*********************************************");
            System.out.println();
            String saisie = sc.next();


            switch (saisie) {
                case "Help":

                    System.out.println(List.of("Help", "Formateur", "Formation", "Etudiant", "Exit"));

                break;

                case "Formateur":

                    handleFormateursMenu(sc, formateurList);

                break;

                case "Formation":

                    handleFormationsMenu(sc, formationsList, formateurList);

                break;

                case "Etudiant":

                    handleEtudiantsMenu(sc, etudiantList, formationsList);

                break;

                case "Exit":

                    continuer = false;

                    System.out.println("Au revoir!");

                break;

                default:

                    System.out.println("Commande invalide.");

                break;
            }
        }
    }

    private static void handleFormateursMenu(Scanner sc, ArrayList<Formateurs> formateurList) {

        boolean continuer = true;

        while (continuer) {

            System.out.println();
            System.out.println("Menu Formateur (Tapez une commandes) : ");

            System.out.println();
            System.out.println("*********************************************");
            System.out.println("**************** 1 - AddFormateur ************");
            System.out.println("**************** 2 - DisplayFormateur *******");
            System.out.println("**************** 3 - Formation **************");
            System.out.println("*********************************************");
            System.out.println();


            String entry = sc.next();

            switch (entry) {
                case "HelpFormateur":

                    System.out.println(List.of("AddFormateur", "DisplayFormateurs", "Exit"));

                break;

                case "AddFormateur":

                    System.out.println("Entrez le nom du formateur : ");
                    sc.nextLine();
                    String nom = sc.nextLine();

                    System.out.println("Entrez l'expertise du formateur : ");
                    String expertise = sc.nextLine();

                    formateurList.add(new Formateurs(formateurList.size() + 1, nom, expertise));
                    System.out.println("Formateur ajouté avec succès !");

                break;

                case "DisplayFormateurs":

                    formateurList.forEach(System.out::println);

                break;

                case "Exit":

                    continuer = false;

                break;

                default:

                    System.out.println("Commande invalide.");

                break;
            }
        }

    }


    public static void handleFormationsMenu(Scanner sc, ArrayList<Formations> formationsList, ArrayList<Formateurs>formateurList) {

        boolean continuer = true;

        while (continuer) {

            System.out.println("Menu Formation (Tapez une commandes) : ");

            System.out.println();
            System.out.println("*********************************************");
            System.out.println("**************** 1 - AddFormation ***********");
            System.out.println("**************** 2 - DisplayFormation *******");
            System.out.println("**************** 3 - Exit  ******************");
            System.out.println("*********************************************");
            System.out.println();

            String saisie = sc.next();

            switch (saisie) {

                case "HelpFormation":

                    System.out.println(List.of("AddFormation", "DisplayFormations", "Exit"));

                break;

                case "AddFormation":

                    addFormation(sc, formationsList, formateurList);

                break;

                case "DisplayFormations":

                    formationsList.forEach(System.out::println);

                break;

                case "Exit":

                    continuer = false;

                break;

                default:

                    System.out.println("Commande invalide.");

                break;
            }
        }
    }

    public static void addFormation (Scanner sc, ArrayList < Formations > formationsList, ArrayList < Formateurs > formateurList) {

        System.out.println("Saisissez le titre de la formation : ");
        sc.nextLine();
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
    }

    public static void handleEtudiantsMenu (Scanner sc, ArrayList<Etudiants> etudiantList, ArrayList<Formations> formationsList){

        boolean continuer = true;

        while (continuer) {

            System.out.println();
            System.out.println("Menu Etudiant (Tapez une commandes)");

            System.out.println();
            System.out.println("*********************************************");
            System.out.println("************ 1 - AddEtudiant ****************");
            System.out.println("************ 2 - DisplayEtudiant ************");
            System.out.println("************ 3 - IncrireEtudiant ************");
            System.out.println("************ 4 - DisplayEtudiant ************");
            System.out.println("************ 5 - Exit ***********************");
            System.out.println("*********************************************");
            System.out.println();

            String saisie = sc.next();

            switch (saisie) {

                case "HelpEtudiant":

                    System.out.println(List.of("AddEtudiant", "InscriptOnForm", "DisplayEtudiants", "Exit"));

                break;

                case "AddEtudiant":

                    System.out.println("Entrez le nom de l'étudiant : ");
                    sc.nextLine();
                    String nom = sc.nextLine();

                    etudiantList.add(new Etudiants(etudiantList.size() + 1, nom));

                    System.out.println("Étudiant ajouté avec succès ! ");

                break;

                case "InscrireEtudiant":

                    inscrireEtudiant(sc, etudiantList, formationsList);

                break;

                case "DisplayEtudiants":

                    etudiantList.forEach(System.out::println);

                break;

                case "Exit":

                    continuer = false;

                break;

                default:

                    System.out.println("Commande invalide.");

                break;
            }
        }
    }

    public static void inscrireEtudiant (Scanner sc, ArrayList<Etudiants> etudiantList, ArrayList <Formations> formationsList) {

        System.out.println("Entrez l'ID de la formation : ");
        int formationId = sc.nextInt();

        Formations selectedFormation = formationsList.stream()
            .filter(f -> f.getId() == formationId)
            .findFirst()
            .orElse(null);

        if (selectedFormation == null) {

            System.out.println("Formation introuvable.");

            return;
        }

        System.out.println("Entrez l'ID de l'étudiant : ");
        int etudiantId = sc.nextInt();

        Etudiants selectedEtudiant = etudiantList.stream()
            .filter(e -> e.getId() == etudiantId)
            .findFirst()
            .orElse(null);

        if (selectedEtudiant == null) {

            System.out.println("Étudiant introuvable.");

        } else {

            selectedFormation.getEtudiant().add(selectedEtudiant);

            System.out.println("Étudiant inscrit avec succès à la formation !");
        }
    }
}