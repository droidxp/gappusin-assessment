class com.ansca.corona.Controller$2 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->stop()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 204 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 207 */
v0 = this.this$0;
v0 = com.ansca.corona.Controller .access$000 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 208 */
	 com.ansca.corona.JavaToNativeShim .pause ( );
	 /* .line 209 */
	 v0 = this.this$0;
	 int v1 = 0; // const/4 v1, 0x0
	 com.ansca.corona.Controller .access$002 ( v0,v1 );
	 /* .line 211 */
} // :cond_0
return;
} // .end method
