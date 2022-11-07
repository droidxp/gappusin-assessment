class com.facebook.android.AsyncFacebookRunner$1 extends java.lang.Thread {
	 /* .source "AsyncFacebookRunner.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.facebook.android.AsyncFacebookRunner this$0; //synthetic
final android.content.Context val$context; //synthetic
final com.facebook.android.AsyncFacebookRunner$RequestListener val$listener; //synthetic
final java.lang.Object val$state; //synthetic
/* # direct methods */
 com.facebook.android.AsyncFacebookRunner$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 80 */
this.this$0 = p1;
this.val$context = p2;
this.val$listener = p3;
this.val$state = p4;
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 83 */
try { // :try_start_0
	 v2 = this.this$0;
	 v2 = this.fb;
	 v3 = this.val$context;
	 (( com.facebook.android.Facebook ) v2 ).logout ( v3 ); // invoke-virtual {v2, v3}, Lcom/facebook/android/Facebook;->logout(Landroid/content/Context;)Ljava/lang/String;
	 /* .line 84 */
	 /* .local v1, "response":Ljava/lang/String; */
	 v2 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 final String v2 = "false"; // const-string v2, "false"
		 v2 = 		 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 85 */
		 } // :cond_0
		 v2 = this.val$listener;
		 /* new-instance v3, Lcom/facebook/android/FacebookError; */
		 final String v4 = "auth.expireSession failed"; // const-string v4, "auth.expireSession failed"
		 /* invoke-direct {v3, v4}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
		 v4 = this.val$state;
		 /* .line 97 */
	 } // .end local v1 # "response":Ljava/lang/String;
} // :goto_0
return;
/* .line 89 */
/* .restart local v1 # "response":Ljava/lang/String; */
} // :cond_1
v2 = this.val$listener;
v3 = this.val$state;
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 90 */
} // .end local v1 # "response":Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 91 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
v2 = this.val$listener;
v3 = this.val$state;
/* .line 92 */
} // .end local v0 # "e":Ljava/io/FileNotFoundException;
/* :catch_1 */
/* move-exception v0 */
/* .line 93 */
/* .local v0, "e":Ljava/net/MalformedURLException; */
v2 = this.val$listener;
v3 = this.val$state;
/* .line 94 */
} // .end local v0 # "e":Ljava/net/MalformedURLException;
/* :catch_2 */
/* move-exception v0 */
/* .line 95 */
/* .local v0, "e":Ljava/io/IOException; */
v2 = this.val$listener;
v3 = this.val$state;
} // .end method
