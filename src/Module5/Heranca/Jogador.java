package Module5.Heranca;

public class Jogador {
    int y; //Coluna
    int x; //Linha
    String nome;
    int vida = 100;
    int dano = 8;
    int especial = 1;

    Jogador(String nome){
        this.nome = nome;
    }

    void atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1){
        oponente.vida -= dano;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= dano;
        }else{
             System.out.println("Ataque não realizado! Se aproxime do seu oponente!");
        }

        System.out.println("Ataque realizado com sucesso, o seu oponente " + oponente.nome + " ficou com a vida " +oponente.vida);
    }

    void especial(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(especial == 1 && (deltaX == 1 || deltaX ==0) && (deltaY == 1 || deltaY == 0)){
            oponente.vida -= 20;
            especial -= 1;
        }else{
            System.out.println("Especial não realizado!");
        }
         System.out.println("Especial realizado com sucesso! A vida do seu do seu oponente está " + oponente.vida);
    }

    Boolean andar(Direcao direcao) {

        switch (direcao){
            case Norte :
            y++;
            break;

            case Sul:
            y--;
            break;

            case Leste:
                x++;
                break;

            case Oeste:
                x--;
                break;
        }
        return true;
    }
}
