/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movercarro;

/**
 *
 * @author Estudiante
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class MoverCarro extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
                Canvas canvas = new Canvas (300,300);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,300,300,Color.ANTIQUEWHITE);
            //obtener lapiz para dibujar sobre el tablero (canvas)
            GraphicsContext gc = canvas.getGraphicsContext2D();
            
            LoopCarro loop = new  LoopCarro(gc);
            loop.start();


            //titulo
            stage.setTitle("Ejemplo animacion");
            //establecerlo y mostrarlo
            stage.setScene(scene);
            stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
}
