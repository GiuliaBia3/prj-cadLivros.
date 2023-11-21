package prj.livros.livros.controllers;

public class controller {
	   import java.util.List;

	   import org.springframework.beans.factory.annotation.Autowired;
	   import org.springframework.web.bind.annotation.DeleteMapping;
	   import org.springframework.web.bind.annotation.GetMapping;
	   import org.springframework.web.bind.annotation.PathVariable;
	   import org.springframework.web.bind.annotation.PostMapping;
	   import org.springframework.web.bind.annotation.RequestBody;
	   import org.springframework.web.bind.annotation.RequestMapping;
	   import org.springframework.web.bind.annotation.RestController;

import prj.livros.livros.entities.Produto;
import prj.livros.livros.service.ProdutoService;

	   @RestController
	   @RequestMapping("/products")
	      class Product  publicController {

	   	private final ProdutoServicies produtoService;
	   	
	   	@Autowired
	   	public void ProdutoController (ProdutoService produtoService) {
	   		this.produtoService = produtoService;
	   	}
	   	@PostMapping
	   	public Produto createProduct(@RequestBody Produto produto) {
	   		return produtoService.saveProduto(produto);
	   	}
	   	@GetMapping ("/{id}")
	   	public Produto getProduto(@PathVariable Long id) {
	   	return produtoService.getProdutosById(id);
	   	
	   	} 
	   	@GetMapping
	   	public List<Produto> getAllProdutos(){
	   		return produtoService.getAllProdutos();
	   	}
	   	@DeleteMapping ("/{id}")
	   	public void deleteProduto (@PathVariable Long id) {
	   		produtoService.deleteProdutos(id);
	   	}
	       
	   }

