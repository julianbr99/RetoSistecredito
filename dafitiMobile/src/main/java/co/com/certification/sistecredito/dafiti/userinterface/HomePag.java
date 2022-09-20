package co.com.certification.sistecredito.dafiti.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePag {


    public static final Target BOTTON_CLOSE = Target.the("button close").located(By.xpath("//android.view.View[@content-desc='light']"));
    public static final Target CATEGORIE_MASCULINE = Target.the("button categorie").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));
    public static final Target BUTTON_CUENT = Target.the("button cuent").located(By.xpath("//*[@resource-id='br.com.dafiti:id/navigation_account']"));
    public static final Target BUTTON_ENTER = Target.the("button enter").located(By.xpath("//*[@resource-id='br.com.dafiti:id/icon']"));
    public static final Target BUTTON_CREATE_COUNT = Target.the("button create count").located(By.id("br.com.dafiti:id/create_account"));


}
