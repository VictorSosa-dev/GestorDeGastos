package mx.com.team9.activities

import java.time.LocalDateTime

/*  mx.com.team9.models.Cuenta.kt tendra los atributos para poder manejar las cuentas de los usuarios y las
    operaciones que se pueden realizar en ellas.

    Posible atributos:
    - Numero de cuenta
    - Saldo
    - Tipo de cuenta
    - Fecha de creacion
    - Estado de la cuenta
    - Usuario
    - Movimientos

    */


class Cuenta(
    val idCuenta: String,
    var saldo: Double,
    var fechaCreacion: LocalDateTime
) {
    private val movimientos =  mutableListOf<Movimiento>()
    lateinit var usuario: Usuario

    fun consultaSaldo() {
        println("El saldo de la cuenta es: $saldo")
    }

    // consultar los movimientos de la cuenta
    fun obtenerMovimientos(): List<Movimiento> {
        return movimientos
    }

}
