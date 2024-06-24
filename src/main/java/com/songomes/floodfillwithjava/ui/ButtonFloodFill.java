package com.songomes.floodfillwithjava.ui;

import com.songomes.floodfillwithjava.controller.ScreenController;

import javax.swing.*;

public class ButtonFloodFill extends JButton {

    private static final String BUTTON_TEXT_DISABLED = "Flood Fill = disabled";
    private static final String BUTTON_TEXT_ENABLED = "Flood Fill = enabled";

    private final ScreenController screenController;

    public ButtonFloodFill(ScreenController screenController) {
        this.screenController = screenController;
        this.defineTextButton();
    }

    public void toggleFloodFillEnabled() {
        this.screenController.toggleFloodFillEnabled();
        this.defineTextButton();
    }

    private void defineTextButton() {
        if (this.screenController.isFloodFillEnabled()) {
            super.setText(BUTTON_TEXT_ENABLED);
        } else {
            super.setText(BUTTON_TEXT_DISABLED);
        }
    }

}
