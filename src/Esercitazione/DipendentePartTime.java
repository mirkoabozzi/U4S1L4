package Esercitazione;

import enums.DepartmentValue;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int matricola, double stipendio, DepartmentValue departmentValue, double oreLavorative) {
        super(matricola, stipendio, departmentValue, oreLavorative);

    }

    @Override
    public void calculateSalary() {
        System.out.println("La matricola " + this.getMatricola() + " guadagna " + this.getStipendio() / this.getOreLavorative());
    }

}
