class com.openfeint.internal.ui.WebViewCache$ManifestRequest extends com.openfeint.internal.request.CacheRequest {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "ManifestRequest" */
} // .end annotation
/* # instance fields */
private com.openfeint.internal.ui.WebViewCache$ManifestData data;
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
/* # direct methods */
public com.openfeint.internal.ui.WebViewCache$ManifestRequest ( ) {
/* .locals 1 */
/* .param p2, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 463 */
this.this$0 = p1;
/* .line 464 */
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/CacheRequest;-><init>(Ljava/lang/String;)V */
/* .line 461 */
int v0 = 0; // const/4 v0, 0x0
this.data = v0;
/* .line 465 */
return;
} // .end method
static com.openfeint.internal.ui.WebViewCache$ManifestData access$702 ( com.openfeint.internal.ui.WebViewCache$ManifestRequest p0, com.openfeint.internal.ui.WebViewCache$ManifestData p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest; */
/* .param p1, "x1" # Lcom/openfeint/internal/ui/WebViewCache$ManifestData; */
/* .prologue */
/* .line 460 */
this.data = p1;
} // .end method
static void access$800 ( com.openfeint.internal.ui.WebViewCache$ManifestRequest p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest; */
/* .prologue */
/* .line 460 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->finishManifest()V */
return;
} // .end method
static void access$900 ( com.openfeint.internal.ui.WebViewCache$ManifestRequest p0, org.apache.http.HttpResponse p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest; */
/* .param p1, "x1" # Lorg/apache/http/HttpResponse; */
/* .prologue */
/* .line 460 */
(( com.openfeint.internal.ui.WebViewCache$ManifestRequest ) p0 ).updateLastModifiedFromResponse ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->updateLastModifiedFromResponse(Lorg/apache/http/HttpResponse;)V
return;
} // .end method
private void finishManifest ( ) {
/* .locals 5 */
/* .prologue */
/* .line 522 */
v2 = this.data;
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 524 */
	 try { // :try_start_0
		 v2 = this.data;
		 v3 = com.openfeint.internal.db.DB.storeHelper;
		 (( com.openfeint.internal.db.DB$DataStorageHelperX ) v3 ).getWritableDatabase ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 (( com.openfeint.internal.ui.WebViewCache$ManifestData ) v2 ).saveTo ( v3 ); // invoke-virtual {v2, v3}, Lcom/openfeint/internal/ui/WebViewCache$ManifestData;->saveTo(Landroid/database/sqlite/SQLiteDatabase;)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 528 */
	 } // :goto_0
	 v2 = this.this$0;
	 v2 = this.mHandler;
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = this.data;
	 android.os.Message .obtain ( v2,v3,v4 );
	 /* .line 529 */
	 /* .local v1, "msg":Landroid/os/Message; */
	 (( android.os.Message ) v1 ).sendToTarget ( ); // invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
	 /* .line 533 */
} // .end local v1 # "msg":Landroid/os/Message;
} // :goto_1
return;
/* .line 525 */
/* :catch_0 */
/* move-exception v0 */
/* .line 526 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v2 = "WebViewCache"; // const-string v2, "WebViewCache"
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 531 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_0
v2 = this.this$0;
com.openfeint.internal.ui.WebViewCache .access$1000 ( v2 );
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 473 */
return;
} // .end method
public void onResponseOffMainThread ( Integer p0, Object[] p1 ) {
/* .locals 3 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 476 */
/* const/16 v1, 0xc8 */
/* if-ne p1, v1, :cond_1 */
/* .line 478 */
try { // :try_start_0
/* new-instance v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestData; */
/* invoke-direct {v1, p2}, Lcom/openfeint/internal/ui/WebViewCache$ManifestData;-><init>([B)V */
this.data = v1;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 492 */
} // :goto_0
v1 = this.data;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.data;
v1 = v1 = this.objects;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 494 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
this.data = v1;
/* .line 496 */
/* new-instance v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest$1; */
/* invoke-direct {v1, p0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest$1;-><init>(Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;)V */
(( com.openfeint.internal.ui.WebViewCache$ManifestRequest$1 ) v1 ).launch ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest$1;->launch()V
/* .line 519 */
} // :goto_1
return;
/* .line 479 */
/* :catch_0 */
/* move-exception v0 */
/* .line 480 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "WebViewCache"; // const-string v1, "WebViewCache"
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 485 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_1
try { // :try_start_1
/* new-instance v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestData; */
v2 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v2 ).getReadableDatabase ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* invoke-direct {v1, v2}, Lcom/openfeint/internal/ui/WebViewCache$ManifestData;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V */
this.data = v1;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 486 */
/* :catch_1 */
/* move-exception v0 */
/* .line 487 */
/* .restart local v0 # "e":Ljava/lang/Exception; */
final String v1 = "WebViewCache"; // const-string v1, "WebViewCache"
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 516 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_2
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->finishManifest()V */
/* .line 517 */
(( com.openfeint.internal.ui.WebViewCache$ManifestRequest ) p0 ).getResponse ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->getResponse()Lorg/apache/http/HttpResponse;
(( com.openfeint.internal.ui.WebViewCache$ManifestRequest ) p0 ).updateLastModifiedFromResponse ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->updateLastModifiedFromResponse(Lorg/apache/http/HttpResponse;)V
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 469 */
v0 = this.this$0;
v0 = this.appContext;
com.openfeint.internal.ui.WebViewCache .access$600 ( v0 );
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 467 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
