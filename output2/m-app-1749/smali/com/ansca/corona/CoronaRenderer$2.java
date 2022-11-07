class com.ansca.corona.CoronaRenderer$2 implements java.lang.Runnable {
	 /* .source "CoronaRenderer.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaRenderer;->onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaRenderer this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaRenderer$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 48 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 50 */
v0 = this.this$0;
v0 = this.fActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).hideSplashScreen ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->hideSplashScreen()V
/* .line 51 */
return;
} // .end method
