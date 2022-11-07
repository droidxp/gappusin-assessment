class com.ansca.corona.Controller$22 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->flurryEvent(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$eventId; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$22 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1364 */
this.this$0 = p1;
this.val$eventId = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1366 */
/* monitor-enter p0 */
/* .line 1367 */
try { // :try_start_0
	 v0 = this.val$eventId;
	 com.flurry.android.FlurryAgent .onEvent ( v0 );
	 /* .line 1368 */
	 /* monitor-exit p0 */
	 /* .line 1369 */
	 return;
	 /* .line 1368 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
