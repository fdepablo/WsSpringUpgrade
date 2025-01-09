package configuracion;

import org.springframework.context.annotation.ComponentScan;


//Esto aplica igual que en el xml, es decir, busca anotaciones Spring en
//los paquetes que le digamos
@ComponentScan(basePackages = "modelo")
public class ConfiguracionSpring {

}
