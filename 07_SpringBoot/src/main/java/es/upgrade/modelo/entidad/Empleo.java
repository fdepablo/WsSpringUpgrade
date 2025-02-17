package es.upgrade.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@Scope("prototype")
@Getter
@AllArgsConstructor
@ToString
public class Empleo {
	private String empresa;
	private double salario;
	private boolean baja;
	
	public Empleo() {
		super();
	}
}
