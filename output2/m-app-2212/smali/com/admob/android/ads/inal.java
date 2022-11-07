public class inal {
	 /* .source "ViewInfo.java" */
	 /* # instance fields */
	 public Float a;
	 public android.graphics.PointF b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/admob/android/ads/f;->a:F */
		 /* .line 20 */
		 /* new-instance v0, Landroid/graphics/PointF; */
		 /* invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V */
		 this.b = v0;
		 /* .line 21 */
		 return;
	 } // .end method
	 public static Float a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 36 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 38 */
			 com.admob.android.ads.f .c ( p0 );
			 /* .line 39 */
			 /* iget v0, v0, Lcom/admob/android/ads/f;->a:F */
			 /* .line 41 */
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public static android.graphics.PointF b ( android.view.View p0 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 66 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 68 */
		 com.admob.android.ads.f .c ( p0 );
		 /* .line 69 */
		 v0 = this.b;
		 /* .line 71 */
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static com.admob.android.ads.f c ( android.view.View p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 85 */
(( android.view.View ) p0 ).getTag ( ); // invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* .line 86 */
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* instance-of v0, p0, Lcom/admob/android/ads/f; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 89 */
		 /* check-cast p0, Lcom/admob/android/ads/f; */
		 /* move-object v0, p0 */
		 /* .line 95 */
	 } // :goto_0
	 /* .line 93 */
} // :cond_0
/* new-instance v0, Lcom/admob/android/ads/f; */
/* invoke-direct {v0}, Lcom/admob/android/ads/f;-><init>()V */
} // .end method
