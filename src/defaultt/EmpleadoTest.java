package defaultt;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import defaultt.Empleado.TipoEmpleado;

class EmpleadoTest {

	private Empleado empleado;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.empleado = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// 3 tipos empleados contando el null
	// 3 primas
	// 2 extras 
	
	//VENDEDOR
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1000_ExtrasPositivas() { 
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 800, 2);
		assertEquals(2060, resultado); //assertEquals(resultadoEsperado, resultadoRecibido)
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1000_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 800, -2);		
		assertEquals(2000, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1500_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1300, 2);
		assertEquals(2160, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1500_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1300, -2);
		assertEquals(2100, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasSuperior1500_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1800, 2);
		assertEquals(2260, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasSuperior1500_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1800, -2);
		assertEquals(2200, resultado);
	}
	
	//ENCARGADO
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1000_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 800, 2);
		
		assertEquals(2560, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1000_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 800, -2);
		
		assertEquals(2500, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1500_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1300, 2);
		
		assertEquals(2660, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1500_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1300, -2);
		
		assertEquals(2600, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasSuperior1500_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1800, 2);
		assertEquals(2760, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasSuperior1500_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1800, -2);
		assertEquals(2700, resultado);
	}
	
	//NULL
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1000_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(null, 800, 2);
		assertEquals(-1, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1000_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(null, 800, -2);
		assertEquals(-1, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1500_ExtrasPositivas() {
		float resultado  = empleado.calculoNominaBruta(null, 1300, 2);
		assertEquals(-1, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1500_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(null, 1300, -2);
		assertEquals(-1, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasSuperior1500_ExtrasPositivas() {
		float resultado = empleado.calculoNominaBruta(null, 1800, 2);
		assertEquals(-1, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasSuperior1500_ExtrasNegativas() {
		float resultado = empleado.calculoNominaBruta(null, 1800, -2);
		assertEquals(-1, resultado);
	}
	
	//NOMINA NETA
	@Test
	void testCalculoNominaNeta_BrutaSuperior2500() {
		float resultado = empleado.calculoNominaNeta(2800);
		assertEquals(2296, resultado);
	}
	
	@Test
	void testCalculoNominaNeta_BrutaSuperior2100() {
		float resultado = empleado.calculoNominaNeta(2200);
		assertEquals(1870, resultado);
	}

	
	@Test
	void testCalculoNominaNeta_BrutaInferior2100() {
		float resultado = empleado.calculoNominaNeta(1700);
		assertEquals(1700, resultado);
	}

}
