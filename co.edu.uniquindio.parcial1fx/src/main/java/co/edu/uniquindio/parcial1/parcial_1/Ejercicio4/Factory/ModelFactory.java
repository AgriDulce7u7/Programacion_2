package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Factory;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.*;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private EmpresaTransporte empresaTransporte;
    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();
    }

    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        VehiculoCarga vehiculoCarga1 = VehiculoCarga.builder()
                .placa("taf 123")
                .modelo("2009")
                .marca("Renault")
                .color("Amarillo")
                .capacidadCarga(120)
                .numeroEjes(4)
                .build();

        Propietario propietario1 = Propietario.builder()
                .nombre("John Alejandro")
                .cedula("1095684")
                .email("jhalejo@gmail.com")
                .celular("3012458971")
                .vehiculoPrincipal(vehiculoCarga1)
                .build();

        VehiculoTransporte vehiculoTransporte1 = VehiculoTransporte.builder()
                .placa("kdk 595")
                .modelo("2015")
                .marca("Chevrolet")
                .color("Blanco")
                .maximoPasajeros(12)
                .build();

        Usuario usuario1 = Usuario.builder()
                .edad(23)
                .vehiculoAsociado(vehiculoTransporte1)
                .build();


        empresaTransporte.getListaPropietarios().add(propietario1);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        propietario1.getListaVehiculosAsociados().add(vehiculoCarga1);
        vehiculoTransporte1.getListaUsuariosAsociados().add(usuario1);
        vehiculoCarga1.getListaPropietariosAsociados().add(propietario1);
        vehiculoTransporte1.getListaPropietariosAsociados().add(propietario1);

    }
}
