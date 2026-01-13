package Module5.Heranca;

import static Module5.Heranca.Direcao.*;

public class Jogo {
    public void main(String[] args) {

        Jogador j1 = new Jogador("gustavo");
        Heroi j2 = new Heroi("joao");
        Monstro m1 = new Monstro("lara");

        j1.y = 10;
        j1.x = 10;

        j2.y = 10;
        j2.x = 10;

        m1.y = 12;
        m1.x = 7;

        j1.andar(Norte);
        j1.andar(Oeste);
        j1.andar(Norte);
        j1.andar(Oeste);

        System.out.println(j1.y);
        System.out.println(j1.x);

        j2.andar(Norte);
        j2.andar(Norte);
        j2.andar(Oeste);

        System.out.println(j2.y);
        System.out.println(j2.x);

        j2.atacar(j1);
        j2.atacar(j1);

        j1.especial(j2);
        j1.especial(j2); //Aqui não roda, pois ele só tem um especial por partida.

        m1.atacar(j1);
        m1.atacar(j2);
    }

}
