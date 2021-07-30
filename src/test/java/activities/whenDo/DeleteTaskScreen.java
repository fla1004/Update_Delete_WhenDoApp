package activities.whenDo;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class DeleteTaskScreen {
    public Button deleteButton= new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmButton= new Button(By.id("android:id/button1"));

    public Label confirmDeleteMessage= new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));

    public DeleteTaskScreen(){}
}
