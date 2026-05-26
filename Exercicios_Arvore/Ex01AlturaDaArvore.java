package Exercicios_Arvore;
public class Ex01AlturaDaArvore {
    public class Node {
        String nome;
        Node left;
        Node right;
    
        Node(String nome) {
            this.nome = nome;
        }
    }

    public int altura(Node raiz) {
        if (raiz == null) {
            //System.out.println(0);
            return 0;
        } else {
            int alturaLeft = altura(raiz.left);
            int alturaRight = altura(raiz.right);
            int maiorAltura;

            if (alturaLeft > alturaRight) {
                maiorAltura = alturaLeft;
            } else { 
                maiorAltura = alturaRight;
            }
            //System.out.println(1 + maiorAltura);
            return 1 + maiorAltura; 
            
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
}