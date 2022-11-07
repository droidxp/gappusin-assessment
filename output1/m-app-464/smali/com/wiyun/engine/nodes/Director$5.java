class com.wiyun.engine.nodes.Director$5 extends java.lang.Thread {
	 /* # instance fields */
	 final com.wiyun.engine.nodes.Director this$0; //synthetic
	 private final java.lang.Runnable val$runnable; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.nodes.Director$5 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 this.val$runnable = p2;
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 v0 = this.val$runnable;
		 v0 = this.this$0;
		 com.wiyun.engine.nodes.Director .access$0 ( v0 );
		 return;
	 } // .end method
