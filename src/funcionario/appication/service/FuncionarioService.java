package funcionario.appication.service;

import funcionario.domain.Funcionario;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioService {
    private Map<Integer, Funcionario> funcionarios = new HashMap<>();

    // Adicionar novo funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getIdFuncionario(), funcionario);
    }

}
