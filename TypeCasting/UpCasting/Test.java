package UpCasting;
import java.util.ArrayList;

import javafx.scene.chart.PieChart.Data;

public class Test {
    public static void main(String[] args) {
        var var = new ArrayList<>();
        Data input = new Data("my data",0);
        var.add(input);
        Object output = var.get(0);
        System.out.println(output);
    }
}