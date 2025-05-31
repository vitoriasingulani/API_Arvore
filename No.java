package model;

public class No {
    public aluno.Aluno aluno;
    public No esquerda, direita;

    public No(aluno.Aluno aluno) {
        this.aluno = aluno;
        this.esquerda = this.direita = null;
    }
}

