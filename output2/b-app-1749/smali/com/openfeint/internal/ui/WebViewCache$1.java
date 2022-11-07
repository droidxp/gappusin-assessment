class com.openfeint.internal.ui.WebViewCache$1 implements java.lang.Runnable {
	 /* .source "WebViewCache.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;->setRootUriSdcard(Ljava/io/File;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
final java.io.File val$baseDir; //synthetic
final java.io.File val$inPhoneWebui; //synthetic
final java.io.File val$webui; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 107 */
this.this$0 = p1;
this.val$inPhoneWebui = p2;
this.val$webui = p3;
this.val$baseDir = p4;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 110 */
try { // :try_start_0
	 v1 = this.val$inPhoneWebui;
	 v1 = 	 (( java.io.File ) v1 ).isDirectory ( ); // invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 111 */
		 v1 = this.val$inPhoneWebui;
		 v2 = this.val$webui;
		 com.openfeint.internal.Util .copyDirectory ( v1,v2 );
		 /* .line 112 */
		 v1 = this.this$0;
		 com.openfeint.internal.ui.WebViewCache .access$000 ( v1 );
		 /* .line 113 */
		 final String v1 = "WebViewCache"; // const-string v1, "WebViewCache"
		 final String v2 = "copy in phone data finish"; // const-string v2, "copy in phone data finish"
		 com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
		 /* .line 114 */
		 v1 = this.this$0;
		 com.openfeint.internal.ui.WebViewCache .access$100 ( v1 );
		 /* .line 124 */
	 } // :goto_0
	 return;
	 /* .line 116 */
} // :cond_0
final String v1 = "WebViewCache"; // const-string v1, "WebViewCache"
final String v2 = "copy from asset"; // const-string v2, "copy from asset"
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 117 */
v1 = this.this$0;
v2 = this.val$baseDir;
com.openfeint.internal.ui.WebViewCache .access$200 ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 119 */
/* :catch_0 */
/* move-exception v0 */
/* .line 120 */
/* .local v0, "e":Ljava/io/IOException; */
final String v1 = "WebViewCache"; // const-string v1, "WebViewCache"
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 121 */
v1 = this.this$0;
(( com.openfeint.internal.ui.WebViewCache ) v1 ).setRootUriInternal ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/ui/WebViewCache;->setRootUriInternal()V
} // .end method
