package projeto.desafioagendamneto.desafio02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.desafioagendamneto.desafio02.Entity.Agendamento;

public interface AgendamentoReposotory extends JpaRepository<Agendamento,Long> {
    
}
