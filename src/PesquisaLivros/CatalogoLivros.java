package PesquisaLivros;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Adiciona um livro ao catálogo.
    public void adicionarLivro(String title, String author, int publicationYear){
        livroList.add(new Livro(title, author, publicationYear));
    }


    //Pesquisa livros por autor e retorna uma lista com os livros encontrados
    public List<Livro> pesquisarPorAutor(String author){
        List<Livro> foundBooks = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAuthor().equalsIgnoreCase(author)) {
                    foundBooks.add(livro);
                }
            }
            if(foundBooks.isEmpty()){
                System.out.printf("\nNenhum livro de %s encontrado!\n", author);
            }
            System.out.println("Livros encontrados: ");
        } else {
            System.out.println("Catálogo está vazio!");
        }
        return foundBooks;
    }

    //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int inicialYear, int endYear){
        List<Livro> foundBooks = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getPublicationYear() >= inicialYear && livro.getPublicationYear() <= endYear){
                    foundBooks.add(livro);
                }
            }
            if(foundBooks.isEmpty()){
                System.out.printf("\nNenhum livro encontrado entre %s - %s\n", inicialYear, endYear);
            }
            System.out.println("Livros encontrados: ");
        } else {
            System.out.println("Catálogo está vazio!");
        }
        return foundBooks;
    }

    //Pesquisa livros por título e retorna o primeiro livro encontrado.
    public Livro pesquisarPorTitulo(String title) {
        Livro foundBook = new Livro();

        if(!livroList.isEmpty()) {
            for(Livro livro : livroList){
                if(livro.getTitle().equalsIgnoreCase(title)){
                    foundBook = livro;
                    System.out.println("Livros encontrados: ");
                    return foundBook;
                }
            }
            System.out.printf("\nNenhum livro encontrado com o título %s\n", title);
        } else {
            System.out.println("Catálogo está vazio!");
        }
        return foundBook;
    }

}
