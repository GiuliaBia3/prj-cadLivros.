package prj.livros.livros.entities;

  public class Produtos {
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table (name = "tb_produto")
	public class Produto {
		//atributos
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome")
		private String name;
		
		@Column(name = "preco")
		private double price;
		
		//construtor vazio
		public Produto() {
			
		}
		public Produto (long id, String descriçao,double price ) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		//metodos de acesso
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
			
		}
		public String getName() {
			return name;
		}
		public void setName (String name) {
			this.name = name;
		}
		public double getPrince () {
			return price;
		}
		public void setPrice (double price) {
			this.price = price;
			
		}
	}


