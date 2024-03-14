package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder.UsuarioBuilder;

public class Usuario {
    private int edad;
    public VehiculoTransporte vehiculoAsociado;
    EmpresaTransporte ownedByEmpresaTransporte;

    /* Constructor */

    public Usuario(int edad, VehiculoTransporte vehiculoAsociado, EmpresaTransporte ownedByEmpresaTransporte) {
        this.edad = edad;
        this.vehiculoAsociado = vehiculoAsociado;
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    public static UsuarioBuilder builder(){return new UsuarioBuilder();}

    /* Getter */
    public int getEdad() {
        return edad;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                '}';
    }
}
