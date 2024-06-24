package com.songomes.floodfillwithjava.ui;

import com.songomes.floodfillwithjava.controller.ScreenController;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ButtonClearScreen extends JButton {

    private final Map<Point, Pixel> pixels;

    private final ScreenController screenController;

    public ButtonClearScreen(String s, Map<Point, Pixel> pixels, ScreenController screenController) {
        super(s);
        this.pixels = pixels;
        this.screenController = screenController;
    }

    public void clear() {
        this.screenController.clear(this.pixels);
    }

}
