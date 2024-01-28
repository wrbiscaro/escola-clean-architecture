package br.com.alura.escola.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.domain.aluno.Telefone;

class TelefoneTest {
	
    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
            () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("1", "123456789"));
    }
}