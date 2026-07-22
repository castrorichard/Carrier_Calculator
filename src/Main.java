void main() {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	IO.println("Digite quantos minutos de uso: " );
	int minutos = sc.nextInt();
	
	double conta = 50.0;
	if (minutos > 100) {
		conta += (minutos - 100) * 2.0;
	}
	System.out.printf("Valor a pagar da conta R$: %.2f%n", conta);
	
	sc.close();
}