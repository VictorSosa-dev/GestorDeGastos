package mx.com.team9.controllers

import mx.com.team9.domain.Usuario
import mx.com.team9.utils.Utilidades.mostrarOpcionesPrincipal

object SistemaPrincipalController {
    lateinit var usuario: Usuario
    //Logica de Manejo de Cuenta
    fun manejoCuenta(usuario: Usuario) {
        this.usuario = usuario

        mostrarOpcionesPrincipal()
        var opcion = readln().toInt()
        do {
            when (opcion) {
                1 -> { // reportes  -> resumen mensual, ultimos movimientos, por categorias
                    val contraladorReportes = ReportesController(usuario)
                    contraladorReportes.seleccionarReporte()

                }

                2 -> { // manejo de cuentas -> crear cuenta, editar cuenta, eliminar cuenta

                }

                3 -> { // Realizar movimientos -> ingreso, gasto, transferencia
                    val contraladorMovimientos = MovimientosController(usuario)
                    contraladorMovimientos.seleccionarMovimiento()
                }

                4 -> { // desloguearse

                }

                else -> {
                    println("Opcion no valida")
                }
            }
        } while (opcion != 4)
    }



}