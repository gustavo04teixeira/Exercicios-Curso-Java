package Module5.RelacionamentoUmPraUm;

public class Motor {

    Carro carro;
    boolean ligado = false;

    Motor(Carro carro){
        this.carro = carro;
    }

    double fatorinjecao = 1.0;

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorinjecao * 3000);
        }
    }
}
