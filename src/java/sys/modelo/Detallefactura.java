package sys.modelo;
// Generated 15-sep-2023 14:44:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Detallefactura generated by hbm2java
 */
public class Detallefactura  implements java.io.Serializable {


     private Integer idDetalle;
     private Factura factura;
     private Producto producto;
     private String idBarra;
     private String nombreProducto;
     private int cantidad;
     private BigDecimal precioVenta;
     private BigDecimal total;

    public Detallefactura() {
    }

    public Detallefactura(Factura factura, Producto producto, String idBarra, String nombreProducto, int cantidad, BigDecimal precioVenta, BigDecimal total) {
       this.factura = factura;
       this.producto = producto;
       this.idBarra = idBarra;
       this.nombreProducto = nombreProducto;
       this.cantidad = cantidad;
       this.precioVenta = precioVenta;
       this.total = total;
    }
   
    public Integer getIdDetalle() {
        return this.idDetalle;
    }
    
    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public String getIdBarra() {
        return this.idBarra;
    }
    
    public void setIdBarra(String idBarra) {
        this.idBarra = idBarra;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }




}


