package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class ConsolePrinter implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.err.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("print to console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
