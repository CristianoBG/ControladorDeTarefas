package ControladorT.com.br.ControladordeTarefas.repository;

import ControladorT.com.br.ControladordeTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
