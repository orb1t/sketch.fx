package org.sketchfx.element;

import javafx.scene.control.SkinBase;
import javafx.scene.shape.Ellipse;

class OvalShapeSkin extends SkinBase<OvalShape> {


    private Ellipse ellipse = new Ellipse();

    OvalShapeSkin(OvalShape control) {
        super(control);
        ellipse.getStyleClass().add(VisualElement.STYLE_CLASS);
        getChildren().add(ellipse);

    }

    @Override
    protected void layoutChildren(double contentX, double contentY, double contentWidth, double contentHeight) {

        ellipse.setRadiusX( contentWidth/2);
        ellipse.setRadiusY( contentHeight/2);
        ellipse.setCenterX(contentX + ellipse.getRadiusX());
        ellipse.setCenterY(contentY + ellipse.getRadiusY());

    }
}
