class com.wiyun.engine.utils.ImagePickerActivity$4 extends android.view.OrientationEventListener {
	 /* # instance fields */
	 final com.wiyun.engine.utils.ImagePickerActivity this$0; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.utils.ImagePickerActivity$4 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onOrientationChanged ( Integer p0 ) {
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-eq p1, v0, :cond_0 */
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$8 ( v0,p1 );
	 } // :cond_0
	 return;
} // .end method
