package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
public class TestTelefono {

	public static void main(String[] args) {
		Telefono tel1 =new Telefono("movi","09941234123",10);
		System.out.println("Operadora: "+tel1.getOperadora()+" Numero:"+tel1.getNumero()+" Codigo: "+tel1.getCodigo());
		

	}

}
