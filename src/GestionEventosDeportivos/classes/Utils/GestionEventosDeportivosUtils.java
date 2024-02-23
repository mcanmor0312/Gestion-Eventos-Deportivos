package GestionEventosDeportivos.classes.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestionEventosDeportivosUtils {

        private static final String EXP_REG_DNI = "^\\d{8}(\\s|-)?[A-Za-z]$";

        public static boolean checkDniFormat(String dni) {
            Pattern pattern = Pattern.compile(EXP_REG_DNI);
            Matcher matcher = pattern.matcher(dni);
            return matcher.find();
        }
}
