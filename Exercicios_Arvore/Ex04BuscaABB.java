package Exercicios_Arvore;
public class Ex04BuscaABB {
    public class Node {
    String nome;
    Node left;
    Node right;
 
        Node(String nome) {
            this.nome = nome;
        }
    }


    public Node arvore1() {
        Node raiz = new Node("home");
        raiz.left = new Node("etc");
        raiz.right = new Node("user");
        raiz.left.left = new Node("documentos");
        raiz.left.left.left = new Node("pasta secreta");
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

    public boolean buscar(Node raiz, String codigo) {
        Node atual = raiz;
        while (atual != null) {
            if (codigo.equals(atual.nome)) {
                return true;
            } else if (codigo.compareTo(atual.nome) < 0) {
                atual = atual.left;
            } else {
                atual = atual.right;
            }
        }
        return false;
    }
}
