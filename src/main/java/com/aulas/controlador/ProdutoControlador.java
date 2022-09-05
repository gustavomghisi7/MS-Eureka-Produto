package com.aulas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aulas.entidades.Produto;
import com.aulas.servico.ProdutoServico;

@RestController
@RequestMapping("/")
public class ProdutoControlador {
	
	@Autowired
	ProdutoServico servico;
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> consutar(){
		return ResponseEntity.status(HttpStatus.OK).body(servico.consultarProdutos());
	}
	
	@PutMapping("/produto")
	public ResponseEntity<String> atualizarEstoque(@RequestParam("idproduto") Long idproduto,
		@RequestParam("qtde") float qtde) {
		servico.atualizaEstoque(idproduto, qtde);
		
		return ResponseEntity.status(HttpStatus.OK).body("Estoque atualizado com sucesso");
	}
	
}

