package Exercicios_Arvore;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1");
        Ex01AlturaDaArvore ex1 = new Ex01AlturaDaArvore();
        System.out.println(ex1.altura(ex1.arvore1()));
        System.out.println(ex1.altura(ex1.arvore2()));
        System.out.println();

        System.out.println("Exercício 2");
        Ex02ProfundidadeDoNO ex2 = new Ex02ProfundidadeDoNO();
        System.out.println(ex2.profundidade(ex2.arvore1(), "existe"));
        System.out.println(ex2.profundidade(ex2.arvore2(), "bisneto1"));
        System.out.println(ex2.profundidade(ex2.arvore2(), "raiz"));
        System.out.println();

        System.out.println("Exercício 3");
        Ex03AlturaDoNo ex3 = new Ex03AlturaDoNo();
        System.out.println(ex3.alturaNo(ex3.arvore1(), "documentos"));
        System.out.println(ex3.alturaNo(ex3.arvore2(), "a"));
        System.out.println();

        System.out.println("Exercício 4");
        Ex04BuscaABB ex4 = new Ex04BuscaABB();
        System.out.println(ex4.buscar(ex4.arvore1(), "home"));
        System.out.println(ex4.buscar(ex4.arvore2(), ""));
        System.out.println();

        System.out.println("Exercício 5");
        Ex05PercursoPreOrdem ex5 = new Ex05PercursoPreOrdem();
        System.out.println(ex5.preOrdem(ex5.arvore1()));
        System.out.println(ex5.preOrdem(ex5.arvore2()));
    }
}