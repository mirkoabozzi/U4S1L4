package Esercitazione;

import enums.DepartmentValue;
import interfaces.Worker;

public abstract class Dipendente implements Worker {
    //Attributi
    private double oreLavorative;
    private int matricola;
    private double stipendio;
    private DepartmentValue departmentValue;


    //Costruttore
    public Dipendente(int matricola, double stipendio, DepartmentValue departmentValue) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.departmentValue = departmentValue;

        //System.out.println(matricola);
        //System.out.println(stipendio);
        //System.out.println(departmentValue);

    }

    public Dipendente(int matricola, double stipendio, DepartmentValue departmentValue, double oreLavorative) {
        this(matricola, stipendio, departmentValue);
        this.oreLavorative = oreLavorative;
    }

    //metodi
    public abstract void calculateSalary();

    //Getter & Setter
    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public DepartmentValue getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(DepartmentValue departmentValue) {
        this.departmentValue = departmentValue;
    }

    public double getOreLavorative() {
        return oreLavorative;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", departmentValue=" + departmentValue +
                '}';
    }
}
