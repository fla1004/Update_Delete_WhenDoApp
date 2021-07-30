package activities.whenDo;

import controlAppium.Button;
import controlAppium.Checkbox;
import controlAppium.Label;
import controlAppium.MoreOptions;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label nameTaskLabel = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

    public Checkbox selectTaskCheckbox = new Checkbox(By.id("com.vrproductiveapps.whendo:id/home_list_item_marked"));
    public MoreOptions selectMoreOptions = new MoreOptions(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));

    public Button selectTask = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout"));

    public MainScreen(){}

}
