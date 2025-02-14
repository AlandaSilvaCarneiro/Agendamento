package projeto.desafioagendamneto.desafio02.Infra.Mapper;

import org.mapstruct.Mapper;

import projeto.desafioagendamneto.desafio02.Entity.Agendamento;
import projeto.desafioagendamneto.desafio02.Infra.Dtos.DtoAgendamentoResposta;
import projeto.desafioagendamneto.desafio02.Infra.Dtos.DtosAgendamentoEntrada;

@Mapper(componentModel ="spring")
public interface MapperAgendamento {

    Agendamento paraEntity(DtosAgendamentoEntrada agendamentoEntrada);
    
    DtoAgendamentoResposta paraDto(Agendamento agendamento);
}
