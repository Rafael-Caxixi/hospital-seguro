package projeto.hospital_seguro.domain.medico;

import jakarta.validation.constraints.NotNull;
import projeto.hospital_seguro.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
