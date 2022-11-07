class org.anddev.andengine.util.ActivityUtils$2$1 implements org.anddev.andengine.util.progress.IProgressListener {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.util.ActivityUtils$2 this$1; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.ActivityUtils$2$1 ( ) {
		 /* .locals 0 */
		 this.this$1 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onProgressChanged ( Integer p0 ) {
		 /* .locals 4 */
		 v0 = this.this$1;
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-array v1, v1, [Ljava/lang/Integer; */
		 int v2 = 0; // const/4 v2, 0x0
		 java.lang.Integer .valueOf ( p1 );
		 /* aput-object v3, v1, v2 */
		 (( org.anddev.andengine.util.ActivityUtils$2 ) v0 ).onProgressUpdate ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/ActivityUtils$2;->onProgressUpdate([Ljava/lang/Integer;)V
		 return;
	 } // .end method
