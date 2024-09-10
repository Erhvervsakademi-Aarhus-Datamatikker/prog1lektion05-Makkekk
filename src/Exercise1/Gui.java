package Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BackgroundRepeat;
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

        int x = 100;
        int y = 75;

        int x1 = 100;
        int y1 = 125;

        int x2 = 20;
        int y2 = 50;

        int sizeHøjde = 8;
        int sizeBrede = 8;

        gc.strokeLine(x, y, x + sizeBrede, y - sizeHøjde);
        gc.strokeLine(x, y, x + sizeHøjde, y + sizeBrede);

        gc.strokeLine(x1, y1 , x1 + sizeHøjde, y1 - sizeHøjde);
        gc.strokeLine(x1, y1 , + sizeHøjde, y1 + sizeBrede);

        gc.strokeLine(x2, y2, x2 + sizeBrede, y2 - sizeHøjde);
        gc.strokeLine(x2 , y2, x2 + sizeHøjde, y2 + sizeBrede);
    }
}
