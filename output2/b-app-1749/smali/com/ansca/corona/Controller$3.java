class com.ansca.corona.Controller$3 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->startTimer()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 326 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 328 */
v0 = this.this$0;
v0 = com.ansca.corona.Controller .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 329 */
	 v0 = this.this$0;
	 com.ansca.corona.Controller .access$200 ( v0 );
	 v1 = this.this$0;
	 v1 = 	 com.ansca.corona.Controller .access$100 ( v1 );
	 /* int-to-long v1, v1 */
	 (( android.os.Handler ) v0 ).postDelayed ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
	 /* .line 330 */
	 com.ansca.corona.Controller .requestRender ( );
	 /* .line 332 */
} // :cond_0
return;
} // .end method
