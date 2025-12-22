package Module3.desafios.DesafioDoModulo;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa){
    this.nomePessoa = nomePessoa;
    this.pesoPessoa = pesoPessoa;
};
    public Pessoa(){}

    double comer(Comida Comida){
        return this.pesoPessoa += Comida.pesoComida;};

}
