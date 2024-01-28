package br.com.alura.escola.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.domain.aluno.Email;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
            () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
            () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
            () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailsComEnderecosValidos() {
    	Email email = new Email("emailvalido@test.com");   	
    	assertNotNull(email);
    }
}
