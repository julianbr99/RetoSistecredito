package co.com.certification.sistecredito.dafiti.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUser {
    public static final Target EMAIL = Target.the("email").located(By.xpath("//*[@resource-id='br.com.dafiti:id/form_email']"));
    public static final Target PASWORD = Target.the("password").located(By.id("br.com.dafiti:id/form_password"));
    public static final Target CONFIRM_PASWORD = Target.the("password confirm").located(By.id("br.com.dafiti:id/form_password_confirm"));
    public static final Target TIPO_DOCUMENTO = Target.the("tipe document").located(By.id("br.com.dafiti:id/form_document_type"));
    public static final Target SELECT_DOCUMENTO = Target.the("selection tipe document").located(By.xpath("//*[@resource-id='br.com.dafiti:id/md_control']"));
    public static final Target NUMERO_DOCUMENTO = Target.the("numer document").located(By.id("br.com.dafiti:id/form_identification"));
    public static final Target NOMBRE = Target.the("fristname").located(By.id("br.com.dafiti:id/form_first_name"));
    public static final Target APELLIDO = Target.the("lastname").located(By.id("br.com.dafiti:id/form_last_name"));
    public static final Target NACIMIENTO = Target.the("fecha nacimiento").located(By.id("br.com.dafiti:id/form_birthday"));
    public static final Target GENERO = Target.the("button genero").located(By.id("br.com.dafiti:id/form_gender"));
    public static final Target SELECT_GENERO = Target.the("selecct genero").located(By.id("br.com.dafiti:id/md_control"));
    public static final Target BOTTON_SAVE = Target.the("button save").located(By.id("br.com.dafiti:id/register_button"));


}
