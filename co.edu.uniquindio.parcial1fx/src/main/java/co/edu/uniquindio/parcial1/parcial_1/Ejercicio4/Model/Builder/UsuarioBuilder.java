package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.EmpresaTransporte;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Propietario;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Usuario;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.VehiculoTransporte;

public class UsuarioBuilder {
    protected int edad;
    protected VehiculoTransporte vehiculoAsociado;
    EmpresaTransporte ownedByEmpresaTransporte;

    public UsuarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }
    public UsuarioBuilder vehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
        return this;
    }
    public UsuarioBuilder ownedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
        return this;
    }
    public Usuario build() {
        return new Usuario(edad, vehiculoAsociado, ownedByEmpresaTransporte);
    }
}
