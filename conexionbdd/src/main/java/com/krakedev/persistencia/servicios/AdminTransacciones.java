package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.perisistencia.utils.ConexionBDD;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Transacciones;

public class AdminTransacciones {
	private static final Logger LOGGER=LogManager.getLogger(AdminTransacciones.class);
	public static void insertar (Transacciones transaciones) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Transaccion a insertar>>>> "+transaciones);
		try {
		con=ConexionBDD.conectar();
		ps=con.prepareStatement("insert into transactions (codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+ "values(?,?,?,?,?,?)");
		ps.setInt(1,transaciones.getCodigo());
		ps.setString(2,transaciones.getNumeroCuenta());
		ps.setBigDecimal(3,transaciones.getMonto());
		ps.setString(4,transaciones.getTipo());
		ps.setDate(5, new java.sql.Date(transaciones.getFecha().getTime()));
		ps.setTime(6, new Time(transaciones.getHora().getTime()));
		
		ps.executeUpdate();
		
	}catch (Exception e) {
		LOGGER.error("error al insertar ", e);
		throw new Exception("error al insertar ");
	}finally {
		try {
			con.close();
			} catch (SQLException e) {
				LOGGER.error("error con la base de datos", e);
				throw new Exception ("error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Transacciones transaciones) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Transaccion a actulizar"+transaciones);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("update transactions set numero_cuenta=?, monto=?, tipo=?, fecha=?, hora=? where codigo=?");
	       
			ps.setString(1, transaciones.getNumeroCuenta());
			ps.setBigDecimal(2, transaciones.getMonto());
			ps.setString(3, transaciones.getTipo());
			ps.setDate(4, new java.sql.Date(transaciones.getFecha().getTime()));
			ps.setTime(5, new Time(transaciones.getHora().getTime()));
			ps.setInt(6, transaciones.getCodigo());
			
			ps.executeUpdate();
			
		}catch (Exception e) {
	        LOGGER.error("Error al actualizar", e);
	        throw new Exception("Error al actualizar");
	    } finally {
	        try {
	            con.close();
	        } catch (SQLException e) {
	            LOGGER.error("Error con la base de datos", e);
	            throw new Exception("Error con la base de datos");
	        }
	    }
	}
	
	public static void eliminar(int codigo) throws Exception {
	    Connection con=null;
	    PreparedStatement ps;
	    LOGGER.trace("Transaccion a eliminar con codigo: >>> " + codigo);
	    try {
	        con=ConexionBDD.conectar();
	        ps=con.prepareStatement("delete from transactions where codigo=?");
	        ps.setInt(1, codigo);
	        
	        ps.executeUpdate();
	        
	    } catch (Exception e) {
	        LOGGER.error("Error al eliminar", e);
	        throw new Exception("Error al eliminar");
	    } finally {
	        try {
	            con.close();
	        } catch (SQLException e) {
	            LOGGER.error("Error con la base de datos", e);
	            throw new Exception("Error con la base de datos");
	        }
	    }
	}
}
