package com.example;

import java.util.ArrayList;

public class Classe {
    Integer anno;
    String sezione;
    String classe;
    ArrayList<Alunno> students = new ArrayList<>();
    public Classe(Integer year, String section, String room) {
        this.anno = year;
        this.sezione = section;
        this.classe = room;
    }

    public Classe() { }
    public Integer getAnno() {
        return anno;
    }
    public void setAnno(Integer year) {
        this.anno = year;
    }
    public String getSezione() {
        return sezione;
    }
    public void setSezione(String section) {
        this.sezione = section;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String room) {
        this.classe = room;
    }
    public ArrayList<Alunno> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Alunno> students) {
        this.students = students;
    }
    public void addStudent(Alunno s) {
        this.students.add(s);
    }
    
}
