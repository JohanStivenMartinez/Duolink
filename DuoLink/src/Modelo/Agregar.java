package Modelo;

public class Agregar {
    
    String fraseEnIngles;
    String Significado;

    public Agregar(String fraseEnIngles, String Significado) {
        this.fraseEnIngles = fraseEnIngles;
        this.Significado = Significado;
    }

    public String getFraseEnIngles() {
        return fraseEnIngles;
    }

    public void setFraseEnIngles(String fraseEnIngles) {
        this.fraseEnIngles = fraseEnIngles;
    }

    public String getSignificado() {
        return Significado;
    }

    public void setSignificado(String Significado) {
        this.Significado = Significado;
    }
    
    
}
