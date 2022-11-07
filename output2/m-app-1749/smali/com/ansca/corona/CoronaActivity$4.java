class com.ansca.corona.CoronaActivity$4 implements java.lang.Runnable {
	 /* .source "CoronaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaActivity;->onActivityResult(IILandroid/content/Intent;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaActivity this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaActivity$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1154 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1157 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1158 */
	 final String v0 = "sms"; // const-string v0, "sms"
	 int v1 = 0; // const/4 v1, 0x0
	 com.ansca.corona.JavaToNativeShim .popupClosedEvent ( v0,v1 );
	 /* .line 1160 */
} // :cond_0
return;
} // .end method
