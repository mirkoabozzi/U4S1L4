package Esercitazione;

import enums.DepartmentValue;

import java.util.Date;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double stipendio, DepartmentValue departmentValue) {
        super(matricola, stipendio, departmentValue);
    }

    @Override
    public void calculateSalary() {
        System.out.println("La matricola " + this.getMatricola() + " guadagna " + this.getStipendio());
    }

    @Override
    public void checkIn() {
        System.out.println(this.getMatricola() + " orario check.in " + new Date());
    }
}
