package Module4;

public class Usuario5 {
    String nome;
    String email;

    public boolean equals(Object objeto) {
       if(objeto instanceof Usuario5) {
           Usuario5 outro = (Usuario5) objeto;

           boolean nomeIgual = outro.nome.equals(this.nome);
           boolean emailIgual = outro.email.equals(this.email);

           return nomeIgual && emailIgual;
       }
       return false;
    }
}
