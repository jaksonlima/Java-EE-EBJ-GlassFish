package com.soft.link.med.model.enuns;

/**
 * @author jakson wilson bonfim de lima
 */
public enum EnumEmprestimo {

    EP("EMPRESTADO"),
    LV("LIVRE");

    private final String status;

    private EnumEmprestimo(String status) {
        this.status = status;
    }

    public static EnumEmprestimo getEP() {
        return EP;
    }

    public static EnumEmprestimo getLV() {
        return LV;
    }

    public String getStatus() {
        return status;
    }

}
