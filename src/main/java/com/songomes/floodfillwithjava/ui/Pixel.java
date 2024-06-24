package com.songomes.floodfillwithjava.ui;

import com.songomes.floodfillwithjava.controller.ScreenController;

import javax.swing.*;
import java.awt.*;

public class Pixel extends JButton {

    public final int x;

    public final int y;

    private final ScreenController screenController;

    public Pixel(int x, int y, ScreenController screenController) {
        this.x = x;
        this.y = y;
        this.screenController = screenController;
        super.setBackground(Color.WHITE);
    }

    public void performClickPixel() {
        if (this.screenController.isFloodFillEnabled()) {
            this.screenController.performFloodFill(this);
        } else {
            if (super.getBackground() == Color.BLACK) {
                super.setBackground(Color.WHITE);
            } else {
                super.setBackground(Color.BLACK);
            }
        }
    }

}
