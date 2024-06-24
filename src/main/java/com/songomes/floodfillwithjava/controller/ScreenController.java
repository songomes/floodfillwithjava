package com.songomes.floodfillwithjava.controller;

import com.songomes.floodfillwithjava.ui.Pixel;

import java.awt.*;
import java.util.Map;

public interface ScreenController {

    void clear(Map<Point, Pixel> pixels);

    boolean isFloodFillEnabled();

    void toggleFloodFillEnabled();

    void drawSquare(Map<Point, Pixel> pixels);

    void performFloodFill(Pixel pixel);

    void setTodosPixels(Map<Point, Pixel> todosPixels);

}
