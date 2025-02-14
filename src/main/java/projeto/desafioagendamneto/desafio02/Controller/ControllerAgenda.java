package projeto.desafioagendamneto.desafio02.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import projeto.desafioagendamneto.desafio02.Infra.Dtos.DtoAgendamentoResposta;
import projeto.desafioagendamneto.desafio02.Infra.Dtos.DtosAgendamentoEntrada;
import projeto.desafioagendamneto.desafio02.Infra.Mapper.MapperAgendamento;
import projeto.desafioagendamneto.desafio02.Service.AgendadmentoService;

@RestController
@RequestMapping("/agendamneto")
@RequiredArgsConstructor
public class ControllerAgenda {
    private final AgendadmentoService agendadmentoService;
    private final MapperAgendamento mapperAgendamento;
    @PostMapping
    public ResponseEntity<DtoAgendamentoResposta> agendamento(@RequestBody DtosAgendamentoEntrada dtosAgendamentoEntrada){
       var registre_agen =agendadmentoService.registroAgendamneto(dtosAgendamentoEntrada);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapperAgendamento.paraDto(registre_agen));
    }
}
