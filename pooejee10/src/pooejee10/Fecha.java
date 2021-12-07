
package pooejee10;

public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer año;

    public Fecha(Integer dia, Integer mes, Integer año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha() {
    dia = 1;
    mes = 1;
    año = 1990;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public void bisiesto() {
        if (año % 4 == 0 && año % 100 != 0 && año % 400 == 0) {
            System.out.println("el año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
    
    
    public void diaMes(){
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dia = 31;
            case 4: case 6: case 9: case 11:
                dia = 30;
            case 2:
                if((año % 4 == 0 && año % 100 != 0 && año % 400 == 0)){
                    dia = 29;
                }
                else{
                    dia = 28;
                }
    }
    }
    public void validar() {
        if (dia < 1 && dia > 31) {
            dia = 1;
        } else {
            dia = dia;
        }
        if (mes < 1 && mes > 31) {
            mes = 1;
        } else {
            mes = mes;
        }
        if (año < 1900 && año > 2050) {
            año = 1990;
        } else {
            año = año;
        }
    }





}
