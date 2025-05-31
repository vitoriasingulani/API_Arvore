package model;
public class aluno {


    public class Aluno {
        public String rgm;
        public String nome;

        public Aluno(String rgm, String nome) {
            this.rgm = rgm;
            this.nome = nome;
        }

        @Override
        public String toString() {
            return rgm + " - " + nome;
        }
    }
}
