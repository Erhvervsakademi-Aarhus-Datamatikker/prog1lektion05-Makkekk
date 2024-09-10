package Exercise3.c;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        // Replace the statement here with your code.

        int canvasWidth = 200;
        int x1 = 80;
        int x2 = 100;
        int y =  20;
        int lineCount = 0;
        int gap = 40;


        while (lineCount <= 4) { //Lav linjer indtil der er 4

            //Find ud af hvor starts positionen for x1 er for at centrere
          int linjeLængde = x2 - x1;
          int centreretX1 = (canvasWidth - linjeLængde) / 2;
            gc.strokeLine(centreretX1, y, centreretX1 + linjeLængde, y);

            if (lineCount == 0) { //Er lige med linje 1.
                y += gap + 20; // Øger mellemrummet af den første linje
            } else {
                y += gap; //Lav normale gaps som er givet i variablerne
            }

            x2 += 40; // øger længden af hver linje
            lineCount++;
        }
    }
}
