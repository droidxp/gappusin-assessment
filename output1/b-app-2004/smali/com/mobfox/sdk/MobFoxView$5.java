class com.mobfox.sdk.MobFoxView$5 implements java.lang.Runnable {
	 /* .source "MobFoxView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->loadContent()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 405 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 3; // const/4 v5, 0x3
/* .line 408 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v5 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 409 */
	 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
	 final String v3 = "starting request thread"; // const-string v3, "starting request thread"
	 android.util.Log .d ( v2,v3 );
	 /* .line 411 */
} // :cond_0
/* new-instance v1, Lcom/mobfox/sdk/RequestAd; */
/* invoke-direct {v1}, Lcom/mobfox/sdk/RequestAd;-><init>()V */
/* .line 414 */
/* .local v1, "requestAd":Lcom/mobfox/sdk/RequestAd; */
try { // :try_start_0
	 v2 = this.this$0;
	 v3 = this.this$0;
	 com.mobfox.sdk.MobFoxView .access$300 ( v3 );
	 (( com.mobfox.sdk.RequestAd ) v1 ).sendRequest ( v3 ); // invoke-virtual {v1, v3}, Lcom/mobfox/sdk/RequestAd;->sendRequest(Lcom/mobfox/sdk/data/Request;)Lcom/mobfox/sdk/data/Response;
	 com.mobfox.sdk.MobFoxView .access$202 ( v2,v3 );
	 /* .line 415 */
	 v2 = this.this$0;
	 com.mobfox.sdk.MobFoxView .access$200 ( v2 );
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 /* .line 416 */
		 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
		 int v3 = 3; // const/4 v3, 0x3
		 v2 = 		 android.util.Log .isLoggable ( v2,v3 );
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 417 */
			 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
			 final String v3 = "response received"; // const-string v3, "response received"
			 android.util.Log .d ( v2,v3 );
			 /* .line 420 */
		 } // :cond_1
		 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
		 int v3 = 3; // const/4 v3, 0x3
		 v2 = 		 android.util.Log .isLoggable ( v2,v3 );
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* .line 421 */
			 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v4 = "getVisibility: "; // const-string v4, "getVisibility: "
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v4 = this.this$0;
			 v4 = 			 (( com.mobfox.sdk.MobFoxView ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Lcom/mobfox/sdk/MobFoxView;->getVisibility()I
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .d ( v2,v3 );
			 /* .line 423 */
		 } // :cond_2
		 v2 = this.this$0;
		 v2 = this.updateHandler;
		 v3 = this.this$0;
		 v3 = this.showContent;
		 (( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 428 */
	 } // :cond_3
} // :goto_0
v2 = this.this$0;
int v3 = 0; // const/4 v3, 0x0
com.mobfox.sdk.MobFoxView .access$402 ( v2,v3 );
/* .line 429 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v5 );
if ( v2 != null) { // if-eqz v2, :cond_4
	 /* .line 430 */
	 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
	 final String v3 = "finishing request thread"; // const-string v3, "finishing request thread"
	 android.util.Log .d ( v2,v3 );
	 /* .line 432 */
} // :cond_4
return;
/* .line 425 */
/* :catch_0 */
/* move-exception v0 */
/* .line 426 */
/* .local v0, "e":Ljava/lang/Throwable; */
v2 = this.this$0;
(( com.mobfox.sdk.MobFoxView ) v2 ).notifyLoadAdFailed ( v0 ); // invoke-virtual {v2, v0}, Lcom/mobfox/sdk/MobFoxView;->notifyLoadAdFailed(Ljava/lang/Throwable;)V
} // .end method
