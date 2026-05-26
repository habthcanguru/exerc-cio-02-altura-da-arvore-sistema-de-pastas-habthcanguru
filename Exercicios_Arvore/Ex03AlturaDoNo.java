package Exercicios_Arvore;
public class Ex03AlturaDoNo {

    public class Node {
        String nome;
        Node left;
        Node right;
    
        Node(String nome) {
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

    public int alturaNo(Node raiz, String alvo) {
        Node noAlvo = buscarNo(raiz, alvo);

        if (noAlvo == null) {
            return -1;
        } else {
            return alturaSubArvore(noAlvo);
        }
    }

    public int alturaSubArvore(Node raiz) {
        if (raiz == null) {
            return 0;
        } else {
            int alturaEsquerda = alturaSubArvore(raiz.left);
            int alturaDireita = alturaSubArvore(raiz.right);

            return 1 + max(alturaEsquerda, alturaDireita);
        }
    }

    public int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public Node buscarNo(Node atual, String alvo) {
        if (atual == null) {
            return null;
        } 
        
        if (atual.nome.equals(alvo)) {
            return atual;
        }
        
        // Busca na esquerda
        Node resultadoEsquerda = buscarNo(atual.left, alvo);
        if (resultadoEsquerda != null) {
            return resultadoEsquerda;
        }
        return buscarNo(atual.right, alvo);
    }
}