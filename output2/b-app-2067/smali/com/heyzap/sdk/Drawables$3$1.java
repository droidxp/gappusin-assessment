class com.heyzap.sdk.Drawables$3$1 implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 final com.heyzap.sdk.Drawables$3 this$0; //synthetic
	 final android.graphics.drawable.Drawable val$d; //synthetic
	 /* # direct methods */
	 com.heyzap.sdk.Drawables$3$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 this.val$d = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 v0 = this.val$view;
		 v1 = this.val$d;
		 (( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
