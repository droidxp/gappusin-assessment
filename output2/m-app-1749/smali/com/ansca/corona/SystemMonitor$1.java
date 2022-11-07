class com.ansca.corona.SystemMonitor$1 implements java.lang.Runnable {
	 /* .source "SystemMonitor.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/SystemMonitor;->isLowOnMemory()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.SystemMonitor this$0; //synthetic
/* # direct methods */
 com.ansca.corona.SystemMonitor$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 123 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 126 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 127 */
	 com.ansca.corona.JavaToNativeShim .memoryWarningEvent ( );
	 /* .line 129 */
} // :cond_0
return;
} // .end method
