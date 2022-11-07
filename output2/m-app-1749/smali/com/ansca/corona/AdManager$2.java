class com.ansca.corona.AdManager$2 implements java.lang.Runnable {
	 /* .source "AdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/AdManager;->hideInMobiAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AdManager this$0; //synthetic
/* # direct methods */
 com.ansca.corona.AdManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 366 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 368 */
v1 = this.this$0;
com.ansca.corona.AdManager .access$300 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 369 */
	 v1 = this.this$0;
	 com.ansca.corona.AdManager .access$300 ( v1 );
	 (( java.util.Timer ) v1 ).cancel ( ); // invoke-virtual {v1}, Ljava/util/Timer;->cancel()V
	 /* .line 370 */
	 v1 = this.this$0;
	 com.ansca.corona.AdManager .access$300 ( v1 );
	 (( java.util.Timer ) v1 ).purge ( ); // invoke-virtual {v1}, Ljava/util/Timer;->purge()I
	 /* .line 371 */
	 v1 = this.this$0;
	 com.ansca.corona.AdManager .access$302 ( v1,v2 );
	 /* .line 373 */
} // :cond_0
v1 = this.this$0;
v1 = this.this$0;
/* .line 381 */
return;
} // .end method
