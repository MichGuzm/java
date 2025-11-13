package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo="A";
	private double saldo;
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cuenta(String id) {
		this.id=id;
		this.tipo="A";
	}
	
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	public void imprimir() {
		System.out.println("***************");
		System.out.println("CUENTA");
		System.out.println("***************");
		System.out.println("Numero de cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("***************");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("*-*_*-*_*-*_*-*_*-*_*-*");
		System.out.println("DATOS DE LA CUENTA");
		System.out.println("*-*_*-*_*-*_*-*_*-*_*-*");
		System.out.println("# Numero de cuenta: "+id);
		System.out.println("? Tipo: "+tipo);
		System.out.println("$ Saldo: USD "+saldo);
		System.out.println("*-*_*-*_*-*_*-*_*-*_*-*");
	}
}
