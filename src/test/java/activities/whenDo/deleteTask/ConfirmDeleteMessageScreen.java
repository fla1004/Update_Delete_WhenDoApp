package activities.whenDo.deleteTask;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class ConfirmDeleteMessageScreen {

    public Button confirmDelete = new Button(By.id("android:id/button1"));

    public Label confirmDeleteMessage= new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));

    public ConfirmDeleteMessageScreen(){}
}
