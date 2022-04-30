package com.company.helper;

import javax.xml.crypto.Data;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Utils {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static NumberFormat nf = new DecimalFormat("R$ #,##0.00",new DecimalFormatSymbols(new Locale("pt","BR")));

    public static String dateParaString(Data date){
        return Utils.sdf.format(date);
    }

    public static String doubleParaString(Double valor){
        return Utils.nf.format(valor);
    }

    
}
