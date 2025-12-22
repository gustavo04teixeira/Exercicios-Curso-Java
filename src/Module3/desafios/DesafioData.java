package Module3.desafios;


public class DesafioData {

        int dia;
        int mes;
        int ano;

        static double teste = 174.7;

        String ObterDataFormatada(){
            return String.format("%d/%d/%d", dia, mes, ano);
        };

        DesafioData(){
            dia = 01;
            mes = 01;
            ano = 1970;
        }

        DesafioData(int data1, int mes1, int ano1){
            dia = data1;
            mes = mes1;
            ano = ano1;
        }
}
