class Pessoa {
    private String nome;
    private String endereco;
    private String email;

    //Metodo Construtor Pessoa
    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    //Get e Set da Calesse Pessoa
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    //Metodo construtor da calsse Pessoa Fisisca
    // Utilizando 'super' para chamar o construtor da classe Pessoa e herdar seus atributos
    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    // Get e Set para CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    //Metodo construtor da calsse Pessoa Juridica
    // Utilizando 'super' para chamar o construtor da classe Pessoa e herdar seus atributos

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    // Get e set para CNPJ
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
//Criando callse extendenedo a class Pessao
class Funcionario extends Pessoa {
    private String cpf;
    private double salario;

    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.salario = salario;
    }

    // Get e Set para CPF e Salário
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}