package com.devsuperior.dscatalog.dto;

public class UserInsertDTO extends UserDTO{
    private String passowrd;

    public UserInsertDTO() {
        super();
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
