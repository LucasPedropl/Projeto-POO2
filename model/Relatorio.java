package model;

public class Relatorio {

    public boolean isModoEscuro() {
        return modoEscuro;
    }

    public void setModoEscuro(boolean modoEscuro) {
        this.modoEscuro = modoEscuro;
    }

    public boolean isManterLogin() {
        return manterLogin;
    }

    public void setManterLogin(boolean manterLogin) {
        this.manterLogin = manterLogin;
    }
    boolean modoEscuro, manterLogin;
    
}
