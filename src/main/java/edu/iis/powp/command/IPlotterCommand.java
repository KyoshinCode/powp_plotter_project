package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 * Created by rafal.franiewski on 27.04.2017.
 */
public interface IPlotterCommand {
    void execute(IPlotter plotter);
}
