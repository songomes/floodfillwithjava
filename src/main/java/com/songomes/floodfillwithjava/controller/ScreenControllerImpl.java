package com.songomes.floodfillwithjava.controller;

import com.songomes.floodfillwithjava.ui.Pixel;

import java.awt.*;
import java.util.Map;

public class ScreenControllerImpl implements ScreenController {

    private boolean floodFillEnabled;

    private final int width;

    private final int height;

    private Map<Point, Pixel> todosPixels;

    public ScreenControllerImpl(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean isFloodFillEnabled() {
        return floodFillEnabled;
    }

    @Override
    public void toggleFloodFillEnabled() {
        this.floodFillEnabled = !this.floodFillEnabled;
    }

    @Override
    public void drawSquare(Map<Point, Pixel> pixels) {

        int x_value_min = 6;
        int x_value_max = 34;

        int y_value_min = 6;
        int y_value_max = 34;

        if (x_value_max >= this.width || y_value_max >= this.height) {
            throw new IllegalStateException();
        }

        for (int y = y_value_min; y <= y_value_max; y++) {

            pixels.get(new Point(x_value_min, y)).setBackground(Color.BLACK);
            pixels.get(new Point(x_value_max, y)).setBackground(Color.BLACK);

            if (y == y_value_min || y == y_value_max) {
                for (int x = x_value_min; x <= x_value_max; x++) {
                    pixels.get(new Point(x, y)).setBackground(Color.BLACK);
                }
            }
        }
    }

    @Override
    public void setTodosPixels(Map<Point, Pixel> todosPixels) {
        this.todosPixels = todosPixels;
    }

    @Override
    public void clear(Map<Point, Pixel> pixels) {
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                pixels.get(new Point(x, y)).setBackground(Color.WHITE);
            }
        }
    }

    @Override
    public void performFloodFill(Pixel pixel) {
        throw new UnsupportedOperationException();
    }

}
