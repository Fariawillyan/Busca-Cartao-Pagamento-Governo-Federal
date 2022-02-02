import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
    public class CartaoCGPF {


        private String codigoOrgaoSup, nomeOrgaoSuperior, codigoOrgao, nomeOrgao, codigoUnidadeGestoria;
        private String nomeUnidadeGestora, anoExtrato, mesExtrato, cpfPortador, nomePortador, cpfCnpjFavorecido;
        private String nomeFavorecido, transacao, dataTransacao;
        private Integer valorTransacao;


    }


