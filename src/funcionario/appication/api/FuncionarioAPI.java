package funcionario.appication.api;

import funcionario.appication.service.FuncionarioService;
import funcionario.domain.Funcionario;

public class FuncionarioAPI {
    private FuncionarioService funcionarioService = new FuncionarioService();

    // POST: Adicionar novo funcionário
    public void postFuncionario(Funcionario funcionario) { funcionarioService.adicionarFuncionario(funcionario);
        System.out.println("Funcionário adicionado: " + funcionario.getNomeCompleto());
    }
}
