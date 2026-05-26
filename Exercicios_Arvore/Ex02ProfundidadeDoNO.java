package Exercicios_Arvore;
public class Ex02ProfundidadeDoNO {

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

    public int profundidade(Node raiz, String alvo) {
        return nivel(raiz, alvo, 0);
    }

    public int nivel(Node atual, String alvo, int nivelAtual) {
        if(atual == null) {
            return -1;
        } 
        
        if(atual.nome.equals(alvo)) {
            return nivelAtual;
        }
        
        int resultadoEsquerda = nivel(atual.left, alvo, nivelAtual + 1);
        if (resultadoEsquerda != -1) {
            return resultadoEsquerda;
        }
        
        return nivel(atual.right, alvo, nivelAtual + 1);
    }
}