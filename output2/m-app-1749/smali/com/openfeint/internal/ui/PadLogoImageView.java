public class com.openfeint.internal.ui.PadLogoImageView extends android.widget.ImageView {
	 /* .source "PadLogoImageView.java" */
	 /* # instance fields */
	 private final java.lang.String tag;
	 /* # direct methods */
	 public com.openfeint.internal.ui.PadLogoImageView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 /* .line 10 */
		 final String v0 = "ImageView2"; // const-string v0, "ImageView2"
		 this.tag = v0;
		 /* .line 15 */
		 return;
	 } // .end method
	 public com.openfeint.internal.ui.PadLogoImageView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 10 */
		 final String v0 = "ImageView2"; // const-string v0, "ImageView2"
		 this.tag = v0;
		 /* .line 19 */
		 return;
	 } // .end method
	 public com.openfeint.internal.ui.PadLogoImageView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .param p3, "defStyle" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 10 */
		 final String v0 = "ImageView2"; // const-string v0, "ImageView2"
		 this.tag = v0;
		 /* .line 23 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 2 */
		 /* .param p1, "changed" # Z */
		 /* .param p2, "left" # I */
		 /* .param p3, "top" # I */
		 /* .param p4, "right" # I */
		 /* .param p5, "bottom" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-super/range {p0 ..p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V */
		 /* .line 28 */
		 final String v0 = "ImageView2"; // const-string v0, "ImageView2"
		 java.lang.String .valueOf ( p1 );
		 android.util.Log .e ( v0,v1 );
		 /* .line 29 */
		 final String v0 = "ImageView2"; // const-string v0, "ImageView2"
		 java.lang.String .valueOf ( p3 );
		 android.util.Log .e ( v0,v1 );
		 /* .line 30 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 32 */
			 /* const/16 v0, 0x15e */
			 /* if-ge p3, v0, :cond_1 */
			 /* .line 33 */
			 int v0 = 4; // const/4 v0, 0x4
			 (( com.openfeint.internal.ui.PadLogoImageView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/PadLogoImageView;->setVisibility(I)V
			 /* .line 37 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 35 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( com.openfeint.internal.ui.PadLogoImageView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/PadLogoImageView;->setVisibility(I)V
} // .end method
