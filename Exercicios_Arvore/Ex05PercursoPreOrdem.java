package Exercicios_Arvore;
import java.util.ArrayList;
import java.util.List;

public class Ex05PercursoPreOrdem {
    public static class Node {
    String nome;
    Node left;
    Node right;
 
        public Node(String nome) {
            this.nome = nome;
        }
    }

    public Node arvore1() {
        Node raiz = new Node("/");
        raiz.left = new Node("home");
        raiz.right = new Node("etc");
        raiz.left.left = new Node("user");
        raiz.left.left.left = new Node("documentos");
        return raiz;
    }

    public Node arvore2() {
        Node raiz = new Node("raiz");
        raiz.left = new Node("filho1");
        raiz.right = new Node("filho2");
        raiz.left.left = new Node("neto1");
        raiz.left.left.left = new Node("bisneto1");
        raiz.left.left.left.right = new Node("tataraneto1");
        return raiz;
    }

    public List<String> preOrdem(Node raiz) {
        List<String> resultado = new ArrayList<>();
        preOrdemRec(raiz, resultado);
        return resultado;
    }
    public void preOrdemRec(Node atual, List<String> resultado) {
        if(atual == null) {
            return;
        }
        resultado.add(atual.nome);
        preOrdemRec(atual.left, resultado);
        preOrdemRec(atual.right, resultado);
    }
}
