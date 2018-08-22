
package gerenciamento;


public class Funcionario {
    String nome;
    int idade;
    String funcao;
    double salario;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, int idade, String funcao, double salario){
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
    public String getFuncao(){
        return this.funcao;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
}
