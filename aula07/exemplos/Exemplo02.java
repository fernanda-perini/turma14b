package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 4); // 0 - índice, 4 - valor

        System.out.println(lista);
        System.out.println("2º elemento: " + lista.get(1));
        System.out.println("Quantidade de itens: " + lista.size());

        boolean naoAchou = true;
        for (int i = 0; i < lista.size() && naoAchou; i++) {
            if (lista.get(i) == 2) {
                System.out.println("Achei o valor " + lista.get(i));
                naoAchou = false;
            }
        }

        for (Integer item : lista) { // pra cada 'item' da 'lista' (coleção)
            if (item == 2) {
                System.out.println("Achei o valor " + item);
                break; // interrompe o laço
            }
        }

    }
}
