class com.ansca.corona.Controller$21 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->flurryInit(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$applicationId; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$21 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1351 */
this.this$0 = p1;
this.val$applicationId = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1353 */
/* monitor-enter p0 */
/* .line 1354 */
try { // :try_start_0
	 v0 = this.this$0;
	 com.ansca.corona.Controller .access$300 ( v0 );
	 v1 = this.val$applicationId;
	 com.flurry.android.FlurryAgent .onStartSession ( v0,v1 );
	 /* .line 1355 */
	 /* monitor-exit p0 */
	 /* .line 1356 */
	 return;
	 /* .line 1355 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
