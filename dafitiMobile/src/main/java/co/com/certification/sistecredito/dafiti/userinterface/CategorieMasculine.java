package co.com.certification.sistecredito.dafiti.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategorieMasculine {
    public static final Target SHOP_ADIDAS = Target.the("shop adidas").located(By.xpath("//*[@resource-id='br.com.dafiti:id/fragment_container']"));
    public static final Target TENNIS_ADIDAS = Target.the("button tenniis adidas").located(By.xpath("(//android.widget.Button[@content-desc='AGREGAR AL CARRITO'])[2]"));
    public static final Target TALLA_TENNIS = Target.the("talla tennis").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]"));
    public static final Target BUTTON_CARRITO = Target.the("talla tennis").located(By.xpath("//android.widget.ImageView[@content-desc='Carrito']"));


}
