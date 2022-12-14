package pgdp.poly;

public class Main {

	public static void main(String... args) {
		final HPCPoly.Master m = new HPCPoly.Master();
		final HPCPoly.SuperMUC s = new HPCPoly.SuperMUC();
		m.connectByCopper(s);
	}

}
