package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

/**
 * Created by kyoshincode on 17/04/17.
 */
public class NewLinePlotterAdapter implements IPlotter{

    private DrawPanelController drawPanelController;
    private  int x = 0, y = 0;
    private ILine line;

    public NewLinePlotterAdapter(DrawPanelController drawPanelController, ILine iLine) {
        this.drawPanelController = drawPanelController;
        this.line = iLine;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void drawTo(int x, int y) {
        line.setStartCoordinates(this.x, this.y);
        line.setEndCoordinates(x, y);

        drawPanelController.drawLine(line);

        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "Line Simulator";
    }

}
