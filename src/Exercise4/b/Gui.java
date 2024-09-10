package Exercise4.b;

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

        int startX = 0;
        int startY = 100;
        int r = 12;
        int forøgelse = 1;
        int nummerCirkel = 8;

        int i = 1;

        while (i < nummerCirkel) {
            int nuværendeRadius = r * i * forøgelse; // nuværende radius

            //Ryk cirklen mod højre
            int x = startX + (i * r * forøgelse);

            gc.strokeOval(x - nuværendeRadius, startY - nuværendeRadius, 2 * nuværendeRadius, 2 * nuværendeRadius);
            i++;

        }

    }
}