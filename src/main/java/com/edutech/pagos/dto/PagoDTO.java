package com.edutech.pagos.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class PagoDTO {

    private Integer idPago;
    private String formaPago;
    private LocalDate fechaPago;
    private int montoTotal;
    private String estadoPago;
    private String descripcion;

    // Incluimos el DTO del cupón para ver sus detalles en la respuesta
    private CuponDTO cupon; 

    // Incluimos el DTO del carrito para saber qué se pagó
    private CarritoInfoDTO carrito; 
}
