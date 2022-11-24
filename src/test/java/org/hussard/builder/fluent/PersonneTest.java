package org.hussard.builder.fluent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneTest {
    @Test
    @DisplayName("Creation d'une personne normalement")
    void build_OK() {
        Personne personne = Personne.aNew()
                .nom("O 'Connell")
                .prenom("Reilly")
                .age(LocalDate.now().minusYears(18))
                .create();
        assertThat(personne.getNom()).isEqualTo("O 'Connell");
        assertThat(personne.getPrenom()).isEqualTo("Reilly");
        assertThat(personne.getAge()).isEqualTo(LocalDate.now().minusYears(18));
    }

}
