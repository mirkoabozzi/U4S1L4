package Esercitazione;

import enums.DepartmentValue;

import java.util.Date;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int matricola, double stipendio, DepartmentValue departmentValue, double oreLavorative) {
        super(matricola, stipendio, departmentValue, oreLavorative);

    }

    @Override
    public void calculateSalary() {
        System.out.println("La matricola " + this.getMatricola() + " guadagna " + this.getStipendio() / this.getOreLavorative());
    }

    @Override
    public void checkIn() {
        System.out.println(this.getMatricola() + " orario check.in " + new Date());
    }
}
