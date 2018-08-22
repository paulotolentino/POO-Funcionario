
package gerenciamento;


public class Gerenciamento {


    public static void main(String[] args) {
        Funcionario paulo = new Funcionario();
        Funcionario fulano = new Funcionario("Fulano", 30, "Analista", 5000.00);
        paulo.setNome("Paulo Sergio");
        paulo.setIdade(25);
        paulo.setFuncao("Desenvolvedor Java");
        paulo.setSalario(5000.00);
        
        System.out.println("Nome: " + paulo.getNome());
        System.out.println("Idade: " + paulo.getIdade());
        System.out.println("Função: " + paulo.getFuncao());
        System.out.println("Salário: " + paulo.getSalario());
        
        System.out.println("");
        
        System.out.println("Nome: " + fulano.getNome());
        System.out.println("Idade: " + fulano.getIdade());
        System.out.println("Função: " + fulano.getFuncao());
        System.out.println("Salário: " + fulano.getSalario());
        
        
    }
    
}
