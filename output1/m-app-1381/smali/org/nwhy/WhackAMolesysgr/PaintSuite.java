public class org.nwhy.WhackAMolesysgr.PaintSuite {
	 /* .source "PaintSuite.java" */
	 /* # static fields */
	 static android.graphics.Paint KV4text;
	 /* # direct methods */
	 static org.nwhy.WhackAMolesysgr.PaintSuite ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 7 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 /* .line 9 */
		 v0 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
		 /* const/high16 v1, -0x1000000 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 10 */
		 v0 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 11 */
		 v0 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
		 /* const/high16 v1, 0x41a00000 # 20.0f */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* .line 6 */
		 return;
	 } // .end method
	 public org.nwhy.WhackAMolesysgr.PaintSuite ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 6 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
