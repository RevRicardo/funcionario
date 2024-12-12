import funcionario.appication.api.FuncionarioAPI;
import funcionario.domain.Funcionario;

public class FuncionarioApplication {

    public static void main(String[] args) {
        FuncionarioAPI api = new FuncionarioAPI();

        // Adicionar funcionários
        api.postFuncionario(new Funcionario(1, "João Silva", "Desenvolvedor", 5000.0, "11987654321", "Rua Exemplo, 123"));
        api.postFuncionario(new Funcionario(2, "Maria Oliveira", "Gerente", 6000.0, "11987654322", "Rua Exemplo, 124"));
    }

}