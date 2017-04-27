package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 * Created by rafal.franiewski on 27.04.2017.
 */
public class CommandDrawToLinePosition implements IPlotterCommand{
    private int x;
    private int y;

    public CommandDrawToLinePosition(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(IPlotter plotter) {

    }
}
