public abstract class com.doodlemobile.gamecenter.ca extends android.widget.RelativeLayout {
	 /* # instance fields */
	 protected com.doodlemobile.gamecenter.GameCenterActivity h;
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.ca ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void b ( ) {
	 } // .end method
	 public final void c ( java.lang.String p0 ) {
		 /* .locals 1 */
		 v0 = this.h;
		 v0 = this.f;
		 (( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 return;
	 } // .end method
