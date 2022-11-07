public class com.mobfox.video.sdk.AspectRatioImageViewWidth extends android.widget.ImageView {
	 /* .source "AspectRatioImageViewWidth.java" */
	 /* # direct methods */
	 public com.mobfox.video.sdk.AspectRatioImageViewWidth ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 /* .line 11 */
		 return;
	 } // .end method
	 public com.mobfox.video.sdk.AspectRatioImageViewWidth ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public com.mobfox.video.sdk.AspectRatioImageViewWidth ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .param p3, "defStyle" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .param p1, "widthMeasureSpec" # I */
		 /* .param p2, "heightMeasureSpec" # I */
		 /* .prologue */
		 /* .line 25 */
		 v1 = 		 android.view.View$MeasureSpec .getSize ( p1 );
		 /* .line 26 */
		 /* .local v1, "width":I */
		 v0 = 		 android.view.View$MeasureSpec .getSize ( p2 );
		 /* .line 27 */
		 /* .local v0, "height":I */
		 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) p0 ).setMeasuredDimension ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setMeasuredDimension(II)V
		 /* .line 28 */
		 return;
	 } // .end method
