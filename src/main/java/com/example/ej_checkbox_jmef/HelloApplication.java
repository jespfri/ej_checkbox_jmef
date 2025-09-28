package com.example.ej_checkbox_jmef;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       GridPane grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setHgap(10);
       grid.setVgap(10);
       grid.setPadding(new Insets(25));
       Scene scene = new Scene(grid,300,300);

       CheckBox cb1 = new CheckBox();
       CheckBox cb2 = new CheckBox();
       CheckBox cb3 = new CheckBox();
       Label l1 = new Label("¿Has hecho la cama?");
       Label l2 = new Label("¿Has terminado los deberes");
       Label l3 = new Label("¿Quedan galletas en casa?");
       Button b1 = new Button("Pedir galletas");
       Label l4 = new Label();
       Label l5 = new Label();

       cb3.setAllowIndeterminate(true);


       grid.add(l1,0,0);
       grid.add(cb1,1,0);
       grid.add(l2,0,1);
       grid.add(cb2,1,1);
       grid.add(l3,0,2);
       grid.add(cb3,1,2);
       grid.add(b1,0,3);
       grid.add(l4,0,4);
       grid.add(l5,0,5);


       b1.setOnAction(e ->
       {
            if (cb1.selectedProperty().get()==true && cb2.selectedProperty().get()==true)
            {
                l4.setText("Vale, puedes coger una galleta.");
                if (cb3.isIndeterminate())
                {
                    l5.setText("Vamos a mirar si quedan primero.");
                }
                else if (cb3.isSelected())
                {
                    l5.setText("Todavía quedan algunas.");
                }
                else
                {
                    l5.setText("Que pena que no queden galletas...");
                }

            }
            else
            {
                l4.setText("No hay galletas.");
                if (cb3.isIndeterminate())
                {
                    l5.setText("De todas formas no se si quedan.");
                }
                else if (cb3.isSelected())
                {
                    l5.setText("Las galletas se quedan en el armario.");
                }
                else
                {
                    l5.setText("Si te portas bien igual compro mas.");
                }
            }
       });




        stage.setTitle("Ejemplo Checkbox Juan María");
        stage.setScene(scene);
        stage.show();
    }
}
