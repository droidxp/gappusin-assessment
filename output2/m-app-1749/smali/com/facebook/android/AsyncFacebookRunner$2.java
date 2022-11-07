class com.facebook.android.AsyncFacebookRunner$2 extends java.lang.Thread {
	 /* .source "AsyncFacebookRunner.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.facebook.android.AsyncFacebookRunner this$0; //synthetic
final java.lang.String val$graphPath; //synthetic
final java.lang.String val$httpMethod; //synthetic
final com.facebook.android.AsyncFacebookRunner$RequestListener val$listener; //synthetic
final android.os.Bundle val$parameters; //synthetic
final java.lang.Object val$state; //synthetic
/* # direct methods */
 com.facebook.android.AsyncFacebookRunner$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 250 */
this.this$0 = p1;
this.val$graphPath = p2;
this.val$parameters = p3;
this.val$httpMethod = p4;
this.val$listener = p5;
this.val$state = p6;
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 253 */
try { // :try_start_0
	 v2 = this.this$0;
	 v2 = this.fb;
	 v3 = this.val$graphPath;
	 v4 = this.val$parameters;
	 v5 = this.val$httpMethod;
	 (( com.facebook.android.Facebook ) v2 ).request ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
	 /* .line 254 */
	 /* .local v1, "resp":Ljava/lang/String; */
	 v2 = this.val$listener;
	 v3 = this.val$state;
	 /* :try_end_0 */
	 /* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .line 262 */
} // .end local v1 # "resp":Ljava/lang/String;
} // :goto_0
return;
/* .line 255 */
/* :catch_0 */
/* move-exception v0 */
/* .line 256 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
v2 = this.val$listener;
v3 = this.val$state;
/* .line 257 */
} // .end local v0 # "e":Ljava/io/FileNotFoundException;
/* :catch_1 */
/* move-exception v0 */
/* .line 258 */
/* .local v0, "e":Ljava/net/MalformedURLException; */
v2 = this.val$listener;
v3 = this.val$state;
/* .line 259 */
} // .end local v0 # "e":Ljava/net/MalformedURLException;
/* :catch_2 */
/* move-exception v0 */
/* .line 260 */
/* .local v0, "e":Ljava/io/IOException; */
v2 = this.val$listener;
v3 = this.val$state;
} // .end method
