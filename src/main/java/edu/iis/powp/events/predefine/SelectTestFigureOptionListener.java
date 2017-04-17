package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{

    private int option = 1;

    public SelectTestFigureOptionListener(int option) {
        this.option = option;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(option == 1) {
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
        } else if(option == 2) {
            FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
    }
}
