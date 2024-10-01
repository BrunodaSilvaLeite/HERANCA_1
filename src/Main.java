public class Main {
    public static void main(String[] args) {
        // Criando cliente pessoa física
        PessoaFisica pf1 = new PessoaFisica("Bruno Silva", "Rua A, 123", "bruno2@gmail", "123.456.789-00");

        // Criando cliente pessoas jurídica
        PessoaJuridica pj1 = new PessoaJuridica("Empresa SYG", "Rua C, 789", "bruno@gmail.com", "11.342.674/0001-99");

        // Criando funcionários
        Funcionario fun1 = new Funcionario("Carlos Souza", "Rua E, 202", "carlos@empresa.com", "111.222.333-44", 3500.00);
        Funcionario fun2 = new Funcionario("Bruno", "Rua E, 202", "bruno@empresa.com", "222.222.333-44", 3000.00);

        Pessoa[] clientes = {pf1, pj1};
        Funcionario[] funcionarios = {fun1, fun2};

        // Mostrando informações utilizando getters
        for (Pessoa cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Email: " + cliente.getEmail());
            // Verificando se é Pessoa Física ou Pessoa Jurídica
            if (cliente instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) cliente;
                System.out.println("CPF: " + pf.getCpf());
            } else if (cliente instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) cliente;
                System.out.println("CNPJ: " + pj.getCnpj());
            }
            System.out.println();
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário:");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Endereço: " + funcionario.getEndereco());
            System.out.println("Email: " + funcionario.getEmail());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: R$ " + funcionario.getSalario());
            System.out.println();
        }
    }
}