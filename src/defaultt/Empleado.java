package defaultt;

public class Empleado {
	
public enum TipoEmpleado{Vendedor, Encargado};
	
	private float salarioBase = 0;
	private float primas = 0;
	private float extras = 0;
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		// Salario Base
		if (tipo == TipoEmpleado.Vendedor) {
			salarioBase = 2000;
		}
		else if (tipo == TipoEmpleado.Encargado) {
			salarioBase = 2500;
		}
		else {
			return -1;
		}
		
		// Primas
		if (ventasMes >= 1500) {
			primas = 200;
		}
		else if (ventasMes >= 1000) {
			primas = 100;
		}
		
		// Determinar los extras
		if (horasExtra >= 0) {
			extras = horasExtra * 30;
		}
		else {
			extras = 0;
		}
		
		return salarioBase + primas + extras;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		
		if (nominaBruta >= 2500) {
			retencion = 0.18f;
		}
		else if (nominaBruta >= 2100) {
			retencion = 0.15f;
		}
		
		return nominaBruta * (1 - retencion);
	}
}
