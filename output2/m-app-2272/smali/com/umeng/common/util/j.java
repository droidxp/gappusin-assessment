public class com.umeng.common.util.j {
	 /* .source "SizeFactory.java" */
	 /* # static fields */
	 private static Float a;
	 /* # direct methods */
	 static com.umeng.common.util.j ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 6 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 return;
	 } // .end method
	 public com.umeng.common.util.j ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 9 */
		 com.umeng.common.util.j .a ( p1 );
		 /* .line 10 */
		 return;
	 } // .end method
	 public static Integer a ( Float p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 20 */
		 /* mul-float/2addr v0, p0 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* add-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 13 */
		 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* .line 14 */
		 return;
	 } // .end method
	 public static Integer b ( Float p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 28 */
		 /* div-float v0, p0, v0 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* add-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public static Integer c ( Float p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 36 */
		 /* mul-float/2addr v0, p0 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* add-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public static Integer d ( Float p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 44 */
		 /* div-float v0, p0, v0 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* add-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
	 } // .end method
