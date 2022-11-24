package org.hussard.builder.fluent;

import java.time.LocalDate;

public interface PersonneFluent  {
    Prenom nom(String nom);

    interface Prenom {
        Age prenom(String prenom);
    }

    interface Age {
        Create age(LocalDate age);
    }
    interface Create {
        Personne create();

    }
}
