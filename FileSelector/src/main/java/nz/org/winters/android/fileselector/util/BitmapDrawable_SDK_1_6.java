package nz.org.winters.android.fileselector.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class BitmapDrawable_SDK_1_6 {

	public static BitmapDrawable getNewBitmapDrawable(Resources resources, Bitmap bitmap) {
		return new BitmapDrawable(resources, bitmap);
	}
}
