package com.example.templatemodule2;

import com.example.templatemodule2.essential.course;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.templatemodule2.coursesController.*;

public class courseRemoveController implements Initializable {
    // Initialize page buttons
    @FXML
    public Button removeCourseBackButton;
    @FXML
    public Button removeCourseSubmitButton;
    @FXML
    public Label removeCourseStatus;

    // Initialize course menu and options
    @FXML
    public MenuButton removeMenuButton;
    @FXML
    public MenuItem removeMenu1;
    @FXML
    public MenuItem removeMenu2;
    @FXML
    public MenuItem removeMenu3;
    @FXML
    public MenuItem removeMenu4;
    @FXML
    public MenuItem removeMenu5;
    @FXML
    public MenuItem removeMenu6;
    @FXML
    public MenuItem removeMenu7;
    @FXML
    public MenuItem removeMenu8;
    @FXML
    public MenuItem removeMenu9;
    @FXML
    public MenuItem removeMenu10;

    // Initialize section menu and options
    @FXML
    public MenuButton removeSectionMenu;
    @FXML
    public MenuItem removeSectionM1;
    @FXML
    public MenuItem removeSectionM2;
    @FXML
    public MenuItem removeSectionM3;
    @FXML
    public MenuItem removeSectionM4;
    @FXML
    public MenuItem removeSectionM5;
    @FXML
    public MenuItem removeSectionMAll;

    // Define strings for the user choices
    String userChoiceCourse;
    String userChoiceSection;

    // Initialize menu arrays to use in for-loops
    MenuItem[] menuItems = new MenuItem[10];
    MenuItem[] sectionMenu = new MenuItem[6];

    // Initialize the page view
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Create array of menu items for the remove course menu to use in a for-loop
        menuItems[0] = removeMenu1;
        menuItems[1] = removeMenu2;
        menuItems[2] = removeMenu3;
        menuItems[3] = removeMenu4;
        menuItems[4] = removeMenu5;
        menuItems[5] = removeMenu6;
        menuItems[6] = removeMenu7;
        menuItems[7] = removeMenu8;
        menuItems[8] = removeMenu9;
        menuItems[9] = removeMenu10;

        // Fill menu items with course options
        for(int i = 0; i < 10; i++){
            String currentCourseName = coursesController.courseNameList[i];

            // Make empty menu items invisible
            if ((currentCourseName == null) || currentCourseName.equals("")) {
                menuItems[i].setVisible(false);
            }

            // Insert course name in menu item
            else {
                menuItems[i].setText(coursesController.courseNameList[i]);
            }
        }


        // Have remove status invisible before course is removed
        removeCourseStatus.setVisible(false);


        // Create array of section menu items to use in a for-loop
        sectionMenu[0] = removeSectionMAll;
        sectionMenu[1] = removeSectionM1;
        sectionMenu[2] = removeSectionM2;
        sectionMenu[3] = removeSectionM3;
        sectionMenu[4] = removeSectionM4;
        sectionMenu[5] = removeSectionM5;

        // Have section menu invisible before course is chosen
        removeSectionMenu.setVisible(false);
        for(int i = 0; i < 6; i++){
            sectionMenu[i].setVisible(false);
        }
    }

    // First course
    @FXML
    protected void onRemoveMenu1(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[0].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[0].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[0] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[0]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu2(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[1].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[1].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[1] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[1]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu3(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[2].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[2].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[2] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[2]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu4() {
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[3].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[3].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[3] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[3]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu5(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[4].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[4].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[4] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[4]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu6(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[5].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[5].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[5] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[5]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu7(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[6].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[6].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[6] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[6]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu8(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[7].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[7].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[7] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[7]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu9(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[8].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[8].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[8] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[8]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    @FXML
    protected void onRemoveMenu10(){
        removeCourseStatus.setVisible(false);
        userChoiceCourse = menuItems[9].getText(); // User has chosen course 1
        removeMenuButton.setText(menuItems[9].getText()); // Display chosen course in menu button

        // Display section options if more than 1 section exists
        if (coursesController.courseSectionsList[0] > 1){
            removeSectionMenu.setVisible(true);

            // Display menu options
            sectionMenu[0].setVisible(true);
            sectionMenu[0].setText("All"); // First option is all
            for (int j = 1; j < 6; j++) {
                if (j <= courseSectionsList[9]) {
                    sectionMenu[j].setText(String.valueOf(j));
                    sectionMenu[j].setVisible(true);
                } else {
                    sectionMenu[j].setVisible(false);
                }
            }
        }
        // Make sure menu is hidden if only 1 section
        else {
            removeSectionMenu.setVisible(false);
        }
    }

    // When the user chooses the section save their choice to userChoiceSection and display in menu button
    @FXML
    protected void onRemoveSectionMAll(){
        userChoiceSection = "0";
        removeSectionMenu.setText("All");
    }

    @FXML
    protected void onRemoveSectionM1(){
        userChoiceSection = "1";
        removeSectionMenu.setText("1");
    }

    @FXML
    protected void onRemoveSectionM2(){
        userChoiceSection = "2";
        removeSectionMenu.setText("2");
    }

    @FXML
    protected void onRemoveSectionM3(){
        userChoiceSection = "3";
        removeSectionMenu.setText("3");
    }

    @FXML
    protected void onRemoveSectionM4(){
        userChoiceSection = "4";
        removeSectionMenu.setText("4");
    }

    @FXML
    protected void onRemoveSectionM5(){
        userChoiceSection = "5";
        removeSectionMenu.setText("5");
    }

    // Remove course
    @FXML
    protected void onRemoveCourseSubmitButton() {
        // Find chosen course
        for (int i = 0; i < main.courses.length; i++){
            // Removing all sections
            if (userChoiceSection == null || userChoiceSection.equals("0")) {
                // Find and delete all sections with that name
                for (int j = 0; j < main.courses.length; j++) {
                    if (userChoiceCourse.equals(main.courses[j].getCourseName())) {
                        wipeCourse(main.courses[j],1);
                        removeMenuButton.setText("");
                        removeSectionMenu.setVisible(false);
                        removeCourseStatus.setVisible(true);
                    }
                }
            } else {
                // Find chosen course and section and wipe
                for (int j = 0; j < main.courses.length; j++) {
                    if (userChoiceCourse.equals(main.courses[j].getCourseName()) && userChoiceSection.equals(main.courses[j].getCourseSection())){
                        wipeCourse(main.courses[j],0);
                        removeMenuButton.setText("");
                        removeSectionMenu.setVisible(false);
                        removeCourseStatus.setVisible(true);
                    }
                }
            }

            // Reset course options
            for(int j = 0; j < 10; j++){
                String currentCourseName = coursesController.courseNameList[j];

                // Make empty menu items invisible
                if ((currentCourseName == null) || currentCourseName.equals("")) {
                    menuItems[j].setVisible(false);
                }

                // Insert course name in menu item
                else {
                    menuItems[j].setText(coursesController.courseNameList[j]);
                }
            }

        }


    }

    // Return to courses page
    @FXML
    protected void onRemoveCourseBackButton() throws IOException {
        Stage currentStage = (Stage) removeMenuButton.getScene().getWindow();
        FXMLLoader dataPage = new FXMLLoader(main.class.getResource("courseModule.fxml"));
        Scene dataPageScene = new Scene(dataPage.load());
        currentStage.setTitle("dataPageScene");
        currentStage.setScene(dataPageScene);
        currentStage.show();
    }


}
