package Esercitazione;

import enums.DepartmentValue;

public class Main {
    public static void main(String[] args) {
       /* Dipendente mirko = new Dipendente(12345, 1000.00, DepartmentValue.AMMINISTRAZIONE);
        Dipendente mario = new Dipendente(6789, 800.00, DepartmentValue.PRODUZIONE);
        Dipendente leonardo = new Dipendente(9876, 600.00, DepartmentValue.VENDITE);
        Dipendente[] dipendenti = {mirko, mario, leonardo};

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Elenco dipendenti: " + dipendenti[i]);
        } */

        Dirigente mirko = new Dirigente(12345, 1000.00, DepartmentValue.AMMINISTRAZIONE);
        Dipendente mario = new DipendenteFullTime(6789, 800.00, DepartmentValue.PRODUZIONE);
        Dipendente leonardo = new DipendentePartTime(9876, 600.00, DepartmentValue.VENDITE, 20);
        Dipendente[] dipendenti = {mirko, mario, leonardo};

        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].calculateSalary();
            dipendenti[i].checkIn();
        }


        Volontario giovanni = new Volontario("Giovanni", 20, true);
        Volontario francesco = new Volontario("Francesco", 30, false);
        Volontario andrea = new Volontario("Andrea", 40, true);
        Volontario[] volontari = {giovanni, francesco, andrea};

        for (int i = 0; i < volontari.length; i++) {
            volontari[i].checkIn();
        }
    }
}