class com.openfeint.internal.OpenFeintInternal$2 extends com.openfeint.internal.request.RawRequest {
	 /* .source "OpenFeintInternal.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->createDeviceSession()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$2 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 361 */
this.this$0 = p1;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/RawRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 362 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public Boolean needsDeviceSession ( ) {
/* .locals 1 */
/* .prologue */
/* .line 364 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onResponse ( Integer p0, java.lang.Object p1 ) {
/* .locals 5 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 366 */
v2 = this.this$0;
int v3 = 0; // const/4 v3, 0x0
com.openfeint.internal.OpenFeintInternal .access$102 ( v2,v3 );
/* .line 368 */
/* const/16 v2, 0xc8 */
/* if-gt v2, p1, :cond_1 */
/* const/16 v2, 0x12c */
/* if-ge p1, v2, :cond_1 */
/* .line 369 */
v2 = this.this$0;
int v3 = 1; // const/4 v3, 0x1
com.openfeint.internal.OpenFeintInternal .access$202 ( v2,v3 );
/* .line 370 */
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$300 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 371 */
	 v2 = com.openfeint.internal.OpenFeintInternal$2.TAG;
	 final String v3 = "Launching post-device-session runnable now."; // const-string v3, "Launching post-device-session runnable now."
	 com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
	 /* .line 372 */
	 v2 = this.this$0;
	 v2 = this.mMainThreadHandler;
	 v3 = this.this$0;
	 com.openfeint.internal.OpenFeintInternal .access$300 ( v3 );
	 (( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* .line 381 */
} // :cond_0
} // :goto_0
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$600 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$600 ( v2 );
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v1, Ljava/lang/Runnable; */
/* .line 382 */
/* .local v1, "r":Ljava/lang/Runnable; */
v2 = this.this$0;
v2 = this.mMainThreadHandler;
(( android.os.Handler ) v2 ).post ( v1 ); // invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 376 */
} // .end local v0 # "i$":Ljava/util/Iterator;
} // .end local v1 # "r":Ljava/lang/Runnable;
} // :cond_1
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$402 ( v2,v4 );
/* .line 377 */
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$500 ( v2,p1,p2 );
/* .line 385 */
} // :cond_2
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$302 ( v2,v4 );
/* .line 386 */
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$602 ( v2,v4 );
/* .line 387 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 363 */
final String v0 = "/xp/devices"; // const-string v0, "/xp/devices"
} // .end method
