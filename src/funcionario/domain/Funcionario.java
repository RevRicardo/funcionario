package funcionario.domain;

public class Funcionario {
    private int idFuncionario;
    private String nomeCompleto;
    private String cargo;
    private double salario;
    private String celular;
    private String endereco;

    // Construtor
    public Funcionario(int idFuncionario, String nomeCompleto, String cargo, double salario,
                       String celular, String endereco) {
        this.idFuncionario = idFuncionario;
        this.nomeCompleto = nomeCompleto;
        this.cargo = cargo;
        this.salario = salario;
        this.celular = celular;
        this.endereco = endereco; }

    // Getters e Setters
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
