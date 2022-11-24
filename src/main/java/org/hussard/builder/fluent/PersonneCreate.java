package org.hussard.builder.fluent;

import java.time.LocalDate;

public class PersonneCreate implements PersonneFluent, PersonneFluent.Prenom, PersonneFluent.Age, PersonneFluent.Create {
    private String nom;
    private String prenom;
    private LocalDate age;

    @Override
    public PersonneCreate nom(String nom) {
        this.nom = nom;
        return this;
    }

    @Override
    public PersonneCreate prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    @Override
    public PersonneCreate age(LocalDate age) {
        this.age = age;
        return this;
    }


    @Override
    public Personne create() {
        return new Personne(nom, prenom, age);
    }


}
