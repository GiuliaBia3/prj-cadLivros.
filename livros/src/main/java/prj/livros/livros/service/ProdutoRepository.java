package prj.livros.livros.service;


import org.springframework.data.jpa.repository.JpaRepository;

import  prj.livros.livros.entities.Produto

public interface ProdutoRepository extends JpaRepository <Produto,Long>{

}
