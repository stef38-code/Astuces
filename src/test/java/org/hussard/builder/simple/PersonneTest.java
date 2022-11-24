package org.hussard.builder.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneTest {
    @Test
    @DisplayName("Creation d'une personne normalement")
    void build_OK() {
       Personne personne = Personne.PersonneBuilder.aPersonne()
               .nom( "O 'Connell")
               .prenom("Reilly")
               .age(LocalDate.now().minusYears(18))
               .build();
       assertThat(personne.getNom()).isEqualTo("O 'Connell");
       assertThat(personne.getPrenom()).isEqualTo("Reilly");
       assertThat(personne.getAge()).isEqualTo(LocalDate.now().minusYears(18));
    }
    @Test
    @DisplayName("Creation d'une personne avec double accès à une propriété")
    void build_KO() {
        Personne personne = Personne.PersonneBuilder.aPersonne()
                .nom( "O 'Connell")
                .prenom("Reilly")
                .age(LocalDate.now().minusYears(18))
                .nom("Schmitt") // modification du nom
                .build();
        //Le test ci-dessous n'est plus bon
        assertThat(personne.getNom()).isEqualTo("O 'Connell");
        assertThat(personne.getPrenom()).isEqualTo("Reilly");
        assertThat(personne.getAge()).isEqualTo(LocalDate.now().minusYears(18));
    }
}
