package Module5.RelacionamentoUmPraUm;

public class CarroTeste {
    static void main(String[] args) {

        Carro c1 = new Carro();

        c1.ligar();
        c1.acelerar();
        c1.freiar();
        c1.freiar();
        c1.acelerar();
        c1.acelerar();
        c1.desligar();
        c1.acelerar();

        System.out.println(c1.motor.giros());
    }
}
