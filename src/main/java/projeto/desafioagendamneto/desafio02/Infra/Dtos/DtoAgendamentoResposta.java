package projeto.desafioagendamneto.desafio02.Infra.Dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public record DtoAgendamentoResposta(
    Long id,
    String emailDestinatario,
    String emailTelefoneDestinatario,
    String messagem,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss" )
    LocalDateTime dataEnvio
) {
   
}
