package com.vitor.bookstore.services;

import com.vitor.bookstore.domain.Categoria;
import com.vitor.bookstore.domain.Livro;
import com.vitor.bookstore.repositories.CategoriaRepository;
import com.vitor.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados() {
        Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
        Categoria cat2 = new Categoria(null, "Fantsia", "Livro de Fantasia");
        Categoria cat3 = new Categoria(null, "Terror", "Livro de Terror");


        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren Ipsum", cat1);
        Livro l2 = new Livro(null, "ALGORITMOS em linguagem C", "Paulo Feofilof", "Loren Ipsum", cat1);
        Livro l3 = new Livro(null, "Jogos Vorazes", "Suzane Colins", "Loren Ipsum", cat2);
        Livro l4 = new Livro(null, "Harry Potter", "Jk Rowling", "Loren Ipsum", cat2);
        Livro l5 = new Livro(null, "O Ceifador", "Neal Shusterman", "Loren Ipsum", cat2);


        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }
}
