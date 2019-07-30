
package Modelo;

public class Aprender {
  
    String FraseIngles;
    String Significado;

    public Aprender(String FraseIngles, String Significado) {
        this.FraseIngles = FraseIngles;
        this.Significado = Significado;
    }

    public String getFraseIngles() {
        return FraseIngles;
    }

    public void setFraseIngles(String FraseIngles) {
        this.FraseIngles = FraseIngles;
    }

    public String getSignificado() {
        return Significado;
    }

    public void setSignificado(String Significado) {
        this.Significado = Significado;
    }
    
}
