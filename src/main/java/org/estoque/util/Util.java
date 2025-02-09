package org.estoque.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public java.sql.Date formatarData(Date data){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return (java.sql.Date) data;

    }
}
