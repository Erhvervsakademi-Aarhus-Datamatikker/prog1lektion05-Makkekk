package Example5.b;

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

        // In cirkel med center i 90, 110 og med en radius på 40
        //Udregningen er som følge for (90-40, 110-40) = (50,70)

        // gc.strokeOval(50, 70, 80, 80); hvis du har alle kordinator ellers se følgende

        int x = 50;
        int y = 70;
        int r = 40;
        gc.strokeOval(x - r, y - r, 2 * r, 2 * r);

        }

    }

