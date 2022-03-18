import java.util.Scanner;

public class EXERCICIO1AULA3 {
    public static void main(String args[])
{
Scanner input = new Scanner(System.in);
    
String nome;
double salarioFixo; 
double venda; 
double comissao; 
double salarioF; 

System.out.println("Digite o nome do vendedor: ");
nome = input.nextLine();

System.out.println("Digite o salário fixo: ");
salarioFixo = input.nextDouble();

System.out.println("Digite quantas vendas foram feitas");
venda = input.nextDouble();

comissao = (salarioFixo * (double) 0.15) +salarioFixo;
salarioF = (comissao + salarioFixo);

System.out.println(nome);      
System.out.println("Salario Fixo: "+salarioFixo);
System.out.println("Salario Final: " +comissao);

        }
}

