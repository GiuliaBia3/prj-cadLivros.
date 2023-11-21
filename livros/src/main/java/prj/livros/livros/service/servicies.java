package prj.livros.livros.service;

public class servicies {
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import prj.livros.livros.entities.Produto;

	@Service
	public class Produtoservicies {
	private  final ProdutoRepository produtoRepository;
	 
	 @Autowired
	 public void ProdutoService (ProdutoRepository produtoRepository) {
		 this.produtoRepository = produtoRepository;
	 }
	 public Produto  saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	 }
	 public List<Produto> getAllProdutos() {
		 return produtoRepository.findAll();
	 }
	 public Produto getProdutoById(Long id) {
		 return produtoRepository.findById(id).orElse(null);
	 }
	 public void deleteProduto(Long id) {
		 produtoRepository.deleteById(id); 
	 }
	}


