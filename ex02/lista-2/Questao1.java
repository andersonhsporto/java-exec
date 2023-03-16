import java.util.Date;

public class Questao1 {

  public static void main(String[] args) {
    ContaSimples conta1 = new ContaSimples(1, "Joao", new Date(), 1000);
    ContaSimples conta2 = new ContaSimples(2, "Maria", new Date(), 2000);
    ContaSimples conta3 = new ContaSimples(2, "Pedro", new Date(), 2000);

    System.out.println(conta1.toString());
    System.out.println(conta2.toString());
    System.out.println(conta3.toString());

    System.out.println("\n\tDeposito de 100, 200 e 300 reais\n");

    conta1.depositar(100);
    conta2.depositar(200);
    conta3.depositar(300);

    System.out.println(conta1.toString());
    System.out.println(conta2.toString());
    System.out.println(conta3.toString());
  }

  public static class ContaSimples {

    private int numero;
    private String titular;
    private Date dataAbertura;
    private float saldo;

    public ContaSimples(int numero, String titular, Date dataAbertura, float saldo) {
      this.numero = numero;
      this.titular = titular;
      this.dataAbertura = dataAbertura;
      this.saldo = saldo;
    }

    public void depositar(float valor) {
      this.saldo += valor;
    }

    public String toString() {
      return "ContaSimples{" +
          "numero=" + numero +
          ", titular=" + titular +
          ", dataAbertura=" + dataAbertura +
          ", saldo R$ " + saldo +
          '}';
    }
  }
}