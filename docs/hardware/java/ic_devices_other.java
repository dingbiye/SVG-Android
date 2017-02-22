package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_devices_other extends SVGRenderer {

    public ic_devices_other(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(3.0f, 6.0f);
        mPath.rLineTo(18.0f, 0f);
        mPath.lineTo(21.0f, 4.0f);
        mPath.lineTo(3.0f, 4.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(3.0f, 18.0f);
        mPath.lineTo(3.0f, 6.0f);
        mPath.close();
        mPath.moveTo(3.0f, 6.0f);
        mPath.rMoveTo(10.0f, 6.0f);
        mPath.lineTo(9.0f, 12.0f);
        mPath.rLineTo(0f, 1.78f);
        mPath.rCubicTo(-0.61f, 0.55f, -1.0f, 1.33f, -1.0f, 2.22f);
        mPath.rCubicTo(0.0f, 0.89000034f, 0.39f, 1.67f, 1.0f, 2.22f);
        mPath.lineTo(9.0f, 20.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, -1.78f);
        mPath.rCubicTo(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        mPath.rCubicTo(0.0f, -0.8800001f, -0.39f, -1.67f, -1.0f, -2.22f);
        mPath.lineTo(13.0f, 12.0f);
        mPath.close();
        mPath.moveTo(13.0f, 12.0f);
        mPath.rMoveTo(-2.0f, 5.5f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(11.0f, 17.5f);
        mPath.moveTo(22.0f, 8.0f);
        mPath.rLineTo(-6.0f, 0f);
        mPath.rCubicTo(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.rCubicTo(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rCubicTo(0.5f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        mPath.lineTo(23.0f, 9.0f);
        mPath.rCubicTo(0.0f, -0.5f, -0.5f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(22.0f, 8.0f);
        mPath.rMoveTo(-1.0f, 10.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rLineTo(0f, -8.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, 8.0f);
        mPath.close();
        mPath.moveTo(21.0f, 18.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}