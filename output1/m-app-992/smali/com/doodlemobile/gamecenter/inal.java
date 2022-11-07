class inal implements android.view.View$OnKeyListener {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.gamecenter.DMTabHost a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Boolean onKey ( android.view.View p0, Integer p1, android.view.KeyEvent p2 ) {
		 /* .locals 2 */
		 /* sparse-switch p2, :sswitch_data_0 */
		 v0 = this.a;
		 com.doodlemobile.gamecenter.DMTabHost .a ( v0 );
		 int v1 = 2; // const/4 v1, 0x2
		 (( android.widget.FrameLayout ) v0 ).requestFocus ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->requestFocus(I)Z
		 v0 = this.a;
		 com.doodlemobile.gamecenter.DMTabHost .a ( v0 );
		 v0 = 		 (( android.widget.FrameLayout ) v0 ).dispatchKeyEvent ( p3 ); // invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
	 } // :goto_0
	 /* :sswitch_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* :sswitch_data_0 */
	 /* .sparse-switch */
	 /* 0x13 -> :sswitch_0 */
	 /* 0x14 -> :sswitch_0 */
	 /* 0x15 -> :sswitch_0 */
	 /* 0x16 -> :sswitch_0 */
	 /* 0x17 -> :sswitch_0 */
	 /* 0x42 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
