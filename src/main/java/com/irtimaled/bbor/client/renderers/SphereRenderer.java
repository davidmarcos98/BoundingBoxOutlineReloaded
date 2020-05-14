package com.irtimaled.bbor.client.renderers;

import com.irtimaled.bbor.common.models.BoundingBoxSphere;
import com.irtimaled.bbor.common.models.Point;

public class SphereRenderer extends AbstractRenderer<BoundingBoxSphere> {
    @Override
    public void render(BoundingBoxSphere boundingBox) {
        Point point = boundingBox.getPoint();
        double radius = boundingBox.getRadius();
        renderSphere(point, radius, boundingBox.getColor(), 5, 5);
    }
}