package Module5.RelacionamentoMuitosParaMuitos;

import java.util.ArrayList;

public class Aluno {

    String nome;

     ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    void adicionarCursos(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString() {
        return nome;
    }
}
