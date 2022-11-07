class com.wiyun.engine.nodes.Director$2 extends android.content.BroadcastReceiver {
	 /* # instance fields */
	 final com.wiyun.engine.nodes.Director this$0; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.nodes.Director$2 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 2 */
		 (( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.this$0;
			 (( com.wiyun.engine.nodes.Director ) v0 ).pause ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->pause()V
		 } // :cond_0
		 return;
	 } // .end method
