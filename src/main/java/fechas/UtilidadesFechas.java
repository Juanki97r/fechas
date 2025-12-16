package fechas;

import java.time.LocalDate;

public class UtilidadesFechas {

    public static boolean bisiesto(LocalDate fecha ){
        return fecha.isLeapYear();
    }
}