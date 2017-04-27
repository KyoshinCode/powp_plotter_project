package edu.iis.powp.command;

import java.util.*;
import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements IPlotterCommand {

    private List<IPlotterCommand> commandList;

    public ComplexCommand(){
        commandList = new ArrayList<>();
    }

    public void add(IPlotterCommand command){
        commandList.add(command);
    }

    public void add(IPlotterCommand... commands){
        for(IPlotterCommand command: commands)
            commandList.add(command);
    }

    @Override
    public void execute(IPlotter driver) {
        for (IPlotterCommand plotterCommand: commandList){
            plotterCommand.execute(driver);
        }
    }
}