public class org.anddev.andengine.util.ColorUtils {
	 /* # static fields */
	 private static final Integer COLOR_FLOAT_TO_INT_FACTOR;
	 private static final HSV_TO_COLOR;
	 private static final Integer HSV_TO_COLOR_HUE_INDEX;
	 private static final Integer HSV_TO_COLOR_SATURATION_INDEX;
	 private static final Integer HSV_TO_COLOR_VALUE_INDEX;
	 /* # direct methods */
	 static org.anddev.andengine.util.ColorUtils ( ) {
		 /* .locals 1 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [F */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.ColorUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer HSVToColor ( Float p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 v0 = org.anddev.andengine.util.ColorUtils.HSV_TO_COLOR;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput p0, v0, v1 */
		 v0 = org.anddev.andengine.util.ColorUtils.HSV_TO_COLOR;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput p1, v0, v1 */
		 v0 = org.anddev.andengine.util.ColorUtils.HSV_TO_COLOR;
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput p2, v0, v1 */
		 v0 = org.anddev.andengine.util.ColorUtils.HSV_TO_COLOR;
		 v0 = 		 android.graphics.Color .HSVToColor ( v0 );
	 } // .end method
	 public static Integer RGBToColor ( Float p0, Float p1, Float p2 ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x437f0000 # 255.0f */
		 /* mul-float v0, p0, v2 */
		 /* float-to-int v0, v0 */
		 /* mul-float v1, p1, v2 */
		 /* float-to-int v1, v1 */
		 /* mul-float/2addr v2, p2 */
		 /* float-to-int v2, v2 */
		 v0 = 		 android.graphics.Color .rgb ( v0,v1,v2 );
	 } // .end method
