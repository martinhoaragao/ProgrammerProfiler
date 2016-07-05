import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResultsPlotter extends Application{

    private static Map<String, ArrayList<Project>> profileToProjects;
    private static int minX, maxX, minY, maxY;
    private static String directory;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Programmer Profiler");
        final NumberAxis xAxis = new NumberAxis(minX, maxX, 1);
        final NumberAxis yAxis = new NumberAxis(minY, maxY, 1);
        final ScatterChart<Number,Number> sc = new ScatterChart<>(xAxis,yAxis);
        xAxis.setLabel("Skill");
        yAxis.setLabel("Readability");
        sc.setTitle("Profile");

        for (Map.Entry<String, ArrayList<Project>> entry : profileToProjects.entrySet()) {
            String profileName = entry.getKey();
            XYChart.Series series = new XYChart.Series();
            series.setName(profileName);
            for (Project p : entry.getValue()) {
                XYChart.Data<Number, Number> xyc = new XYChart.Data<Number, Number>(p.getSkill(), p.getReadability());
                xyc.setExtraValue(p.getProjectName());
                series.getData().add(xyc);
            }
            sc.getData().add(series);
        }

        Scene scene = new Scene(sc, 800, 600);
        stage.setScene(scene);
        stage.show();

        for (XYChart.Series<Number, Number> s : sc.getData()) {
            for (XYChart.Data<Number, Number> d : s.getData()) {
                Tooltip.install(
                        d.getNode(),
                        new Tooltip(d.getExtraValue() + "\n" +
                                "Skill: " + d.getXValue().toString() + "\n" +
                                "Readability: " + d.getYValue())
                );
                //Adding class on hover
                d.getNode().setOnMouseEntered(event -> d.getNode().getStyleClass().add("onHover"));

                //Removing class on exit
                d.getNode().setOnMouseExited(event -> d.getNode().getStyleClass().remove("onHover"));

                d.getNode().setOnMouseClicked(event -> {
                    try {
                        Desktop.getDesktop().open(new File(directory + "\\" + d.getExtraValue()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            }
        }
    }

    public static void main(LinkedHashMap<String, ArrayList<Project>> projects,
                            int minS, int maxS, int minR, int maxR,
                            String dir) {
        profileToProjects = projects;
        minX = minS;
        maxX = maxS;
        minY = minR;
        maxY = maxR;
        directory = dir;
        launch((String[]) null);
    }
}