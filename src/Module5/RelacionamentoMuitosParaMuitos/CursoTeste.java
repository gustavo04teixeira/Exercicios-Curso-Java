package Module5.RelacionamentoMuitosParaMuitos;

public class CursoTeste {
    static void main(String[] args) {

        Aluno aluno1 = new Aluno("gustavo");
        Aluno aluno2 = new Aluno("João");
        Aluno aluno3 = new Aluno("Rafael");

        Curso curso1 = new Curso("Curso React");
        Curso curso2 = new Curso("Java Online");
        Curso curso3 = new Curso("Github");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno3.adicionarCursos(curso1);
        aluno2.adicionarCursos(curso3);

        for (Aluno aluno : curso1.alunos){
            System.out.println("Estou matriculado no curso 1");
            System.out.println("Nome: " + aluno.nome);
        }
        System.out.println(curso2.alunos.toString());

        Curso cursoEncontrado = aluno2.obterCursoPorNome("curso react");

        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
