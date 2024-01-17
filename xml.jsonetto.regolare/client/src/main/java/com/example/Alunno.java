package com.example;

public class Alunno {
    String nome;
    String cognome;
    String compleanno;
    
    public Alunno(String name, String surname, String compleanno) {
        this.nome = name;
        this.cognome = surname;
        this.compleanno = compleanno;
    }

    public Alunno() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String surname) {
        this.cognome = surname;
    }

    public String getCompleanno() {
        return compleanno;
    }

    public void setCompleanno(String compleanno) {
        this.compleanno = compleanno;
    }
}
