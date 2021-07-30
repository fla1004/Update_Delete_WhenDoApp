package cleanTest;

import activities.whenDo.*;
import activities.whenDo.deleteTask.ConfirmDeleteMessageScreen;
import activities.whenDo.deleteTask.SelectDeleteOptionScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    private MainScreen mainScreen= new MainScreen();
    private CreateTaskScreen createTaskScreen= new CreateTaskScreen();
    private SelectDeleteOptionScreen selectDeleteOptionScreen = new SelectDeleteOptionScreen();
    private ConfirmDeleteMessageScreen confirmDeleteScreen = new ConfirmDeleteMessageScreen();
    private EditTaskScreen editTaskScreen = new EditTaskScreen();
    private DeleteTaskScreen deleteTaskScreen = new DeleteTaskScreen();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String title="CLEAN";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("this is a description");
        createTaskScreen.saveButton.click();

        Assertions.assertEquals(title,mainScreen.nameTaskLabel.getText(),"ERROR! task was not created");
    }

    @Test
    public void editTask() throws MalformedURLException {
        String titleEdit="Edit";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue("Create");
        createTaskScreen.descriptionTextBox.setValue("create task");
        createTaskScreen.saveButton.click();

        mainScreen.selectTask.click();
        editTaskScreen.titleTextBox.setValue(titleEdit);
        editTaskScreen.descriptionTextBox.setValue("edit task");
        editTaskScreen.saveButton.click();

        Assertions.assertEquals(titleEdit,mainScreen.nameTaskLabel.getText(),"ERROR! task was not update");
    }

    @Test
    public void deleteTaskOption1() throws MalformedURLException {
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue("task for delete");
        createTaskScreen.descriptionTextBox.setValue("this is a delete test");
        createTaskScreen.saveButton.click();

        mainScreen.selectTaskCheckbox.click();
        mainScreen.selectMoreOptions.click();
        selectDeleteOptionScreen.selectDeleteOption.click();
        confirmDeleteScreen.confirmDelete.click();

        Assertions.assertEquals("No tasks added", confirmDeleteScreen.confirmDeleteMessage.getText(),"ERROR! task was not deleted");
    }

    @Test
    public void deleteTaskOption2() throws MalformedURLException {
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue("task for delete");
        createTaskScreen.descriptionTextBox.setValue("this is a delete test");
        createTaskScreen.saveButton.click();

        mainScreen.selectTask.click();
        deleteTaskScreen.deleteButton.click();
        deleteTaskScreen.confirmButton.click();

        Assertions.assertEquals("No tasks added", deleteTaskScreen.confirmDeleteMessage.getText(),"ERROR! task was not deleted");
    }

    /*@AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }*/
}
