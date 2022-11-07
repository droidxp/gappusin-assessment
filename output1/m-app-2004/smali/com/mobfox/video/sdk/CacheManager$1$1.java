class com.mobfox.video.sdk.CacheManager$1$1 implements java.lang.Runnable {
	 /* .source "CacheManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/CacheManager$1;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.CacheManager$1 this$1; //synthetic
private final com.mobfox.video.sdk.RequestData val$requestData; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.CacheManager$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
this.val$requestData = p2;
/* .line 318 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 321 */
v0 = this.this$1;
com.mobfox.video.sdk.CacheManager$1 .access$0 ( v0 );
v1 = this.val$requestData;
(( com.mobfox.video.sdk.CacheManager ) v0 ).downloadVideoInfo ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/CacheManager;->downloadVideoInfo(Lcom/mobfox/video/sdk/RequestData;)V
/* .line 322 */
return;
} // .end method
