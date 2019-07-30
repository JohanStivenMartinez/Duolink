package Modelo;

public class Frase {
    
     String fraseEspañol;
    String FraseIngles;

    public Frase(String fraseEspañol, String FraseIngles) {
        this.fraseEspañol = fraseEspañol;
        this.FraseIngles = FraseIngles;
    }

    public String getFraseEspañol() {
        return fraseEspañol;
    }

    public void setFraseEspañol(String fraseEspañol) {
        this.fraseEspañol = fraseEspañol;
    }

    public String getFraseIngles() {
        return FraseIngles;
    }

    public void setFraseIngles(String FraseIngles) {
        this.FraseIngles = FraseIngles;
    }
}
