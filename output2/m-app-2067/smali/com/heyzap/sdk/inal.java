class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 final android.content.Context val$context; //synthetic
	 final android.os.Handler val$h; //synthetic
	 final Integer val$id; //synthetic
	 final android.widget.ImageView val$view; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.val$context = p1;
		 /* iput p2, p0, Lcom/heyzap/sdk/Drawables$3;->val$id:I */
		 this.val$h = p3;
		 this.val$view = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 3 */
		 v0 = this.val$context;
		 /* iget v1, p0, Lcom/heyzap/sdk/Drawables$3;->val$id:I */
		 com.heyzap.sdk.Drawables .getDrawable ( v0,v1 );
		 v1 = this.val$h;
		 /* new-instance v2, Lcom/heyzap/sdk/Drawables$3$1; */
		 /* invoke-direct {v2, p0, v0}, Lcom/heyzap/sdk/Drawables$3$1;-><init>(Lcom/heyzap/sdk/Drawables$3;Landroid/graphics/drawable/Drawable;)V */
		 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
