package academy.digitallab.store.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {
//es un servidor de configuracion centralizado en donde todas als configuraciones
	//de nuestros servicios se van a centralizar en este proyecto. Permite tener una jerarquía de
	//configuración a través de profile vas a definir las configuraciones para distintos entornso
	//también permite tener un histórico de la configuración ya que se puede guardar todo en un controlador de versiones
	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
