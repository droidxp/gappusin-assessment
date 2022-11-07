class com.wiyun.engine.nodes.Director$2 extends android.content.BroadcastReceiver {
	 /* .source "Director.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/nodes/Director; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.Director this$0; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.Director$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 211 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 214 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
/* .line 215 */
/* .local v0, "action":Ljava/lang/String; */
final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 216 */
	 v1 = this.this$0;
	 (( com.wiyun.engine.nodes.Director ) v1 ).pause ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->pause()V
	 /* .line 218 */
} // :cond_0
return;
} // .end method
