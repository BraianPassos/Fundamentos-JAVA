public class Funcionario
{
    //Atributos: nome, salário bruto e taxa de imposto
    private String Nome;
    private double Salario;
    private double SalarioBruto;
    //Metodos: retirada de imposto, aumentar salario com base em uma porcentagem
    public void setNome(String nome)
    {
        this.Nome = nome;
    }
    public void setSalario(double salario)
    {
        this.Salario = salario;
    }
    public void setSalarioBruto(double salario)
    {
        this.SalarioBruto = SalarioBruto;
    }
    public double getSalarioBruto()
    {
        return SalarioBruto;
    }
    public String getNome()
    {
        return Nome;
    }
    public double getSalario()
    {
        return Salario;
    }
    
    public double CalculoBruto(double imposto)
    {
        this.SalarioBruto = this.Salario - imposto;
        return getSalarioBruto();
    }
    public double AumentoSalarial(double bonus)
    {
        this.SalarioBruto += this.SalarioBruto * (bonus/100);
        this.Salario = this.SalarioBruto;
        return getSalario();
    }
}