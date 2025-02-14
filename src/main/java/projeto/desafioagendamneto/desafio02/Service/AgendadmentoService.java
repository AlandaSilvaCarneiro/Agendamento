package projeto.desafioagendamneto.desafio02.Service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import projeto.desafioagendamneto.desafio02.Entity.Agendamento;
import projeto.desafioagendamneto.desafio02.Infra.Dtos.DtosAgendamentoEntrada;
import projeto.desafioagendamneto.desafio02.Infra.Mapper.MapperAgendamento;
import projeto.desafioagendamneto.desafio02.Repository.AgendamentoReposotory;

@Service
@RequiredArgsConstructor
public class AgendadmentoService {
    private final AgendamentoReposotory agendamentoReposotory;
    private final MapperAgendamento mapperAgendamento;
    
    public Agendamento registroAgendamneto(DtosAgendamentoEntrada agendamentoEntrada){
       return agendamentoReposotory.save(mapperAgendamento.paraEntity(agendamentoEntrada));
    }
}
