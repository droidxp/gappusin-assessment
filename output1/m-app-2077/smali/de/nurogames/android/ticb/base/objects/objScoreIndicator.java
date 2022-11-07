public class de.nurogames.android.ticb.base.objects.objScoreIndicator {
	 /* .source "objScoreIndicator.java" */
	 /* # instance fields */
	 private android.graphics.Paint mPaint;
	 private Integer mX;
	 private Integer mY;
	 private android.graphics.Typeface tf;
	 private java.lang.String value;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objScoreIndicator ( ) {
		 /* .locals 2 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "nums" # Ljava/lang/String; */
		 /* .param p4, "font_size" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v0;
		 /* .line 25 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;->mX:I */
		 /* .line 26 */
		 /* iput p2, p0, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;->mY:I */
		 /* .line 28 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 final String v1 = "font_ingame.ttf"; // const-string v1, "font_ingame.ttf"
		 android.graphics.Typeface .createFromAsset ( v0,v1 );
		 this.tf = v0;
		 /* .line 29 */
		 v0 = this.mPaint;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 30 */
		 v0 = this.mPaint;
		 v1 = this.tf;
		 (( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* .line 31 */
		 v0 = this.mPaint;
		 /* int-to-float v1, p4 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* .line 32 */
		 v0 = this.mPaint;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 34 */
		 this.value = p3;
		 /* .line 35 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 4 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 /* .line 39 */
		 v0 = this.value;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;->mX:I */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;->mY:I */
		 /* int-to-float v2, v2 */
		 v3 = this.mPaint;
		 (( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 /* .line 40 */
		 return;
	 } // .end method
