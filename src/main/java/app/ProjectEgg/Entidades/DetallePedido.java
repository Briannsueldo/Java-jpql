package app.ProjectEgg.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Declaro una clase como entidad
@Table(name = "detalle_pedido") // Especifico como quiero llamar la tabla.
public class DetallePedido {
    // Generacion y declaración del id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " id_detalle_pedido")
    private int idDetallePedido;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "numero_linea")
    private int numeroLinea;

    @Column(name = "precio_unidad")
    private double precioUnidad;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto Producto;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    // Constructor Vacio
    public DetallePedido() {
    }

    // Getter y Setter
    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    @Override
    public String toString() {
        return "DetallePedido [idDetallePedido=" + idDetallePedido + ", cantidad=" + cantidad + ", numeroLinea="
                + numeroLinea + ", precioUnidad=" + precioUnidad + ", Producto=" + Producto + ", pedido=" + pedido
                + "]";
    }
}
