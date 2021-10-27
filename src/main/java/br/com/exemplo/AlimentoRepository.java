package br.com.exemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exemplo.model.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long>{

}
