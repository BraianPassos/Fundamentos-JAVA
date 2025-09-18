public class ContaBanco
{
    //Atributos:
    private int NumeroDaConta;
    private String Nome;
    private double Deposito;

    //Métodos:
    
    public void setNumeroConta(int numero)
    {
        this.NumeroDaConta = numero;
    }
    public int getNumeroConta()
    {
        return NumeroDaConta;
    }
    
    public void setNome(String nome)
    {
        this.Nome = nome;
    }
    public String getNome()
    {
        return Nome;
    }
    public void setDeposito(double deposito)
    {
        this.Deposito = deposito;
    }
    public double getDeposito()
    {
        return Deposito;
    }
    
    public void MostracontaAtual()
    {
        System.out.println("\nConta: " + getNumeroConta() + ", " + "Titular: " + getNome() + ", " + "Saldo: "+ getDeposito()+"\n");
    }
    
    public void Depositar(double deposito)
    {
        this.Deposito += deposito;
    }
    public void Saque(double saque)
    {
        this.Deposito -= (saque+5);
    }
}
    