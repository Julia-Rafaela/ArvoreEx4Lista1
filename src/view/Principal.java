package view;

import model.Arvore;

public class Principal {

	public static void main(String[] args) {
	    int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
        Arvore arvore = new Arvore();
        for (int i : vetor) {
            arvore.insert(i);
        }
        try {
        	arvore.remove(7);
        	arvore.remove(6);
        	System.out.print("pré-ordem: ");
            arvore.prefixSearch();
            System.out.println();
            System.out.print("ordem crescente: ");
            arvore.infixSearch();
            System.out.println();
            System.out.print("pós-ordem: ");
            arvore.postfixSearch();
            System.out.println();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println();

	}
}
