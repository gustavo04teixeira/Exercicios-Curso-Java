package Module3.desafios;
import Module3.Produto;

public class DesafioData2 {
    static void main(String[] args) {

    DesafioData d1 = new DesafioData();
    d1.dia = 19;
    d1.mes = 12;
    d1.ano = 2021;

    var d2 = new DesafioData();
   /* d2.dia = 23;
    d2.mes = 01;
    d2.ano = 2012;*/

        System.out.println(d1.ObterDataFormatada());

        System.out.println(d2.ObterDataFormatada());

    }
}
