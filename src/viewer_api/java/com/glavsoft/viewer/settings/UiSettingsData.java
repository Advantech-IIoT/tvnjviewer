// Copyright (C) 2023-2024 The Advantech Company Ltd. All Rights Reserved.
// Copyright (C) 2010 - 2014 GlavSoft LLC.
// All rights reserved.
//
// -----------------------------------------------------------------------
// This file is part of the TightVNC software.  Please visit our Web site:
//
//                       http://www.tightvnc.com/
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along
// with this program; if not, write to the Free Software Foundation, Inc.,
// 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
// -----------------------------------------------------------------------
//
package com.glavsoft.viewer.settings;

import java.io.Serializable;

/**
 * @author dime at tightvnc.com
 */
public class UiSettingsData implements Serializable {
    private static final long serialVersionUID = 1L;
    private double scalePercent;
    private LocalMouseCursorShape mouseCursorShape;
    private boolean fullScreen;
    private boolean fitWindow;
    private String viewportBackgroundColor;


    public UiSettingsData() {
        scalePercent = 100;
        mouseCursorShape = LocalMouseCursorShape.DOT;
        fullScreen = false;
        fitWindow = false;
        viewportBackgroundColor = "0x000000";
    }

    public UiSettingsData(double scalePercent, LocalMouseCursorShape mouseCursorShape, boolean fullScreen, boolean fitWindow, String viewportBackgroundColor) {
        this.scalePercent = scalePercent;
        this.mouseCursorShape = mouseCursorShape;
        this.fullScreen = fullScreen;
        this.fitWindow = fitWindow;
        this.viewportBackgroundColor = viewportBackgroundColor;
    }

    public UiSettingsData(UiSettingsData other) {
        this(other.getScalePercent(), other.getMouseCursorShape(), other.isFullScreen(), other.isFitWindow(), other.getViewportBackgroundColor());
    }

    public double getScalePercent() {
        return scalePercent;
    }

    public boolean setScalePercent(double scalePercent) {
        if (this.scalePercent != scalePercent) {
            this.scalePercent = scalePercent;
            return true;
        }
        return false;
    }


    public LocalMouseCursorShape getMouseCursorShape() {
        return mouseCursorShape;
    }

    public boolean setMouseCursorShape(LocalMouseCursorShape mouseCursorShape) {
        if (this.mouseCursorShape != mouseCursorShape && mouseCursorShape != null) {
            this.mouseCursorShape = mouseCursorShape;
            return true;
        }
        return false;
    }

    public boolean isFullScreen() {
        return fullScreen;
    }

    public boolean setFullScreen(boolean fullScreen) {
        if (this.fullScreen != fullScreen) {
            this.fullScreen = fullScreen;
            return true;
        }
        return false;
    }

    public boolean isFitWindow() {
        return fitWindow;
    }

    public boolean setFitWindow(boolean fitWindow) {
        if (this.fitWindow != fitWindow) {
            this.fitWindow = fitWindow;
            return true;
        }
        return false;
    }

    public String getViewportBackgroundColor() {
        return viewportBackgroundColor;
    }

    public boolean setViewportBackgroundColor(String viewportBackgroundColor) {
        if (this.viewportBackgroundColor != viewportBackgroundColor && viewportBackgroundColor != null) {
            this.viewportBackgroundColor = viewportBackgroundColor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "UiSettingsData{" +
                "scalePercent=" + scalePercent +
                ", mouseCursorShape=" + mouseCursorShape +
                ", fullScreen=" + fullScreen +
                ", fitWindow=" + fitWindow +
                ", viewportBackgroundColor=" + viewportBackgroundColor +
                '}';
    }
}