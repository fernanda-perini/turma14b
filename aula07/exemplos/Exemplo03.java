package exemplos;

import java.util.Stack;

public class Exemplo03 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("um");
        pilha.push("dois");
        pilha.push("três");
        pilha.push("quatro");

        System.out.println(pilha);

        while (!pilha.isEmpty()) { // ! = not (operador lógico de negação)
            System.out.println(pilha.pop());
        }

    }
}
