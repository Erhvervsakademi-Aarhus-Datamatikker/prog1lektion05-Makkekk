package Exercise11;

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

        this.DrawCircle(gc, 50, 100, 40);

    }

    private void DrawCircle(GraphicsContext gc, int x, int y, int r) {

        while (x <= 150) {
            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);

            this.DrawCross(gc, x, y, 20);
            x += 25;

        }
    }
        private void DrawCross(GraphicsContext gc, int x, int y, int w) {

            //Den horisontale linje
            gc.strokeLine(x - w / 2, y, x + w / 2, y);

            // Vertikale linje
            gc.strokeLine(x, y - w / 2, x, y + w / 2);
        }

    }





