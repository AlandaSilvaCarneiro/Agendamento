package projeto.desafioagendamneto.desafio02.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Agendamento_Tb")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHAgendamento;
    private LocalDateTime dataCancelamneto;
    private LocalDateTime dataRegistroagenda;
    private String telefoneDestinata;
    private String emailDestinata;
    private String messagem;
    private String  remetente_nome;
    private StatusAgendamento statusAgendamento;
}
