package com.pedrolgsoares.estudosdeactivity;

import java.io.Serializable;

// Para transmitir um objeto de uma activity para outra basta aplicar a interface Serializable
public class Usuario implements Serializable {
    private String nomeObjeto;
    private String emailDoObjeto;


    public Usuario(String nomeObjeto, String emailDoObjeto) {
        this.nomeObjeto = nomeObjeto;
        this.emailDoObjeto = emailDoObjeto;
    }

    public String getNomeObjeto() {
        return nomeObjeto;
    }

    public void setNomeObjeto(String nomeObjeto) {
        this.nomeObjeto = nomeObjeto;
    }

    public String getEmailDoObjeto() {
        return emailDoObjeto;
    }

    public void setEmailDoObjeto(String emailDoObjeto) {
        this.emailDoObjeto = emailDoObjeto;
    }
}
