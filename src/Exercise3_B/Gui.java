package Exercise3_B;

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

        int x1 = 50;
        int x2 = 180;
        int y =  20;
        int lineCount = 0;
        int gap = 40;
        while (lineCount <= 4) {
            gc.strokeLine(x1, y, x2, y);
            if (lineCount == 0) {
                y += gap + 20; // Øger mellemrummet af den første linje
            } else {
                y += gap;
            }
            lineCount++;
        }
    }
}
