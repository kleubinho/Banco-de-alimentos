package br.com.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.AlimentoRepository;
import br.com.exemplo.model.Alimento;
	


@RestController
@RequestMapping("/alimentos")
public class ProdutoController {
	
	@Autowired
	private AlimentoRepository ar;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Alimento> listar(){
		return ar.findAll();
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Alimento alimento) {
		 ar.save(alimento);
		 return "Alimento cadastrado com sucesso";
	}
	
	@PutMapping("atualizar/{id}")
	public String atualizar(@RequestBody Alimento alimento, @PathVariable Long id) {
		Optional<Alimento> me = ar.findById(id);
		
		if(!me.isPresent()) {
			return "O alimento não foi encontrado";
		}
		
		alimento.setIdalimento(id);
		ar.save(alimento);
		return "Alimento atualizado com sucesso";
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		ar.deleteById(id);
		return "Alimento apagado";
	}
	
}
