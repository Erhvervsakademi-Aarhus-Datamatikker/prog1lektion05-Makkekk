package Exercise6;

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

        int y1 = 175;
        int y2 = 180;
        for (int i = 0; i <= 10; i++) {
            int x = 10 + i * 16;
            gc.strokeLine(x, y1, x, y2);
            gc.strokeLine(10, 175, 190, 175);

        }

        //Arrowhead
        int horisontal = 5;
        int vertikal = 5;

        int x = 190;
        int y = 175;

        gc.strokeLine(x,y, x - horisontal, y - vertikal);
        gc.strokeLine(x, y , x - horisontal, y + vertikal);

        //TAl
        gc.fillText("0", 15 , 190);
        gc.fillText("10", 95, 190);
        gc.fillText("15",175, 190);

        for (int i = 0; i < 3; i++) {
            int x2 = 10 + i * 80;

            gc.strokeLine(x2, 165, x2,185);


        }
    }
}