package br.org.serratec.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.org.serratec.livraria.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
