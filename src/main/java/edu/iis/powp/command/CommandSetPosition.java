package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 * Created by rafal.franiewski on 27.04.2017.
 */
public class CommandSetPosition implements IPlotterCommand{

    private int x;
    private int y;

    public CommandSetPosition(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(IPlotter plotter) {
        plotter.drawTo(x, y);
    }
}
