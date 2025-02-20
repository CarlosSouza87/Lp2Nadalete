package org.example.dtos;

import io.micronaut.serde.annotation.Serdeable;
import io.micronaut.core.annotation.Introspected;

@Serdeable
@Introspected
public class EntidadesFinanceirasDto {

    private Integer entfinId;

    private String entfinNome;
    
    

    public EntidadesFinanceirasDto(Integer entfinId, String entfinNome) {
		super();
		this.entfinId = entfinId;
		this.entfinNome = entfinNome;
	}

	public Integer getEntfinId() {
        return entfinId;
    }

    public void setEntfinId(Integer entfinId) {
        this.entfinId = entfinId;
    }

    public String getEntfinNome() {
        return entfinNome;
    }

    public void setEntfinNome(String entfinNome) {
        this.entfinNome = entfinNome;
    }

}
