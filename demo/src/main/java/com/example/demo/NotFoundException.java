package com.example.demo;

public class NotFoundException extends Exception {
    public NotFoundException(final String nome) {
        super("Aluno(a) " + nome + " não encontrado(a)!");
    }

}
