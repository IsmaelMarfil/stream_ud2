package org.iesvdm.jardineria.modelo;
// Generated 3 dic 2023 12:28:04 by Hibernate Tools 5.6.15.Final

import java.util.HashSet;
import java.util.Set;

/**
 * GamaProducto generated by hbm2java
 */
public class GamaProducto implements java.io.Serializable {

	private String gama;
	private String descripcionTexto;
	private String descripcionHtml;
	private String imagen;
	private Set productos = new HashSet(0);

	public GamaProducto() {
	}

	public GamaProducto(String gama) {
		this.gama = gama;
	}

	public GamaProducto(String gama, String descripcionTexto, String descripcionHtml, String imagen, Set productos) {
		this.gama = gama;
		this.descripcionTexto = descripcionTexto;
		this.descripcionHtml = descripcionHtml;
		this.imagen = imagen;
		this.productos = productos;
	}

	public String getGama() {
		return this.gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getDescripcionTexto() {
		return this.descripcionTexto;
	}

	public void setDescripcionTexto(String descripcionTexto) {
		this.descripcionTexto = descripcionTexto;
	}

	public String getDescripcionHtml() {
		return this.descripcionHtml;
	}

	public void setDescripcionHtml(String descripcionHtml) {
		this.descripcionHtml = descripcionHtml;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Set getProductos() {
		return this.productos;
	}

	public void setProductos(Set productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "GamaProducto{" +
				"gama='" + gama + '\'' +
				", descripcionTexto='" + descripcionTexto + '\'' +
				", descripcionHtml='" + descripcionHtml + '\'' +
				", imagen='" + imagen + '\'' +
				'}';
	}
}
