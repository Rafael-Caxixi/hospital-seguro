package projeto.hospital_seguro.domain.paciente;

import jakarta.validation.constraints.NotNull;
import projeto.hospital_seguro.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
