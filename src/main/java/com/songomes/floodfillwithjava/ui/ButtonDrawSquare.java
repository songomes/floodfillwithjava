package com.songomes.floodfillwithjava.ui;

import com.songomes.floodfillwithjava.controller.ScreenController;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ButtonDrawSquare extends JButton {

    private final Map<Point, Pixel> pixels;

    private final ScreenController screenController;

    public ButtonDrawSquare(String s, Map<Point, Pixel> pixels, ScreenController screenController) {
        super(s);
        this.pixels = pixels;
        this.screenController = screenController;
    }

    public void draw() {
        this.screenController.drawSquare(this.pixels);
    }

}
