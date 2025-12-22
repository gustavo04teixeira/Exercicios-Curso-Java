package Module2;

public class Continue11 {
    static void main(String[] args) {
        for (int i=0; i<10; i++) {
            if(i%2==0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("");
        for (int j=0; j<10; j++) {
            if(j == 4 || j== 8) {
                continue;
            }
            System.out.println(j);
        }
    }
}
