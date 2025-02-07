package org.estoque.estoque.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public String formatarData(Date data){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);

    }
}
