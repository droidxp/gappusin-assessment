class com.mobfox.video.sdk.MobFoxAdManager$1 implements java.lang.Runnable {
	 /* .source "MobFoxAdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxAdManager;->requestAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxAdManager this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxAdManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 103 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.mobfox.video.sdk.MobFoxAdManager access$0 ( com.mobfox.video.sdk.MobFoxAdManager$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 103 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 3; // const/4 v7, 0x3
/* .line 106 */
} // :goto_0
v4 = com.mobfox.video.sdk.ResourceManager .isDownloading ( );
/* if-nez v4, :cond_4 */
/* .line 112 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v7 );
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 113 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
final String v5 = "starting request thread"; // const-string v5, "starting request thread"
android.util.Log .d ( v4,v5 );
/* .line 116 */
} // :cond_0
try { // :try_start_0
/* new-instance v2, Lcom/mobfox/video/sdk/RequestAd; */
/* invoke-direct {v2}, Lcom/mobfox/video/sdk/RequestAd;-><init>()V */
/* .line 117 */
/* .local v2, "requestAd":Lcom/mobfox/video/sdk/RequestAd; */
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$0 ( v4 );
/* .line 118 */
/* .local v1, "request":Lcom/mobfox/video/sdk/RequestData; */
v4 = this.this$0;
(( com.mobfox.video.sdk.RequestAd ) v2 ).sendRequest ( v1 ); // invoke-virtual {v2, v1}, Lcom/mobfox/video/sdk/RequestAd;->sendRequest(Lcom/mobfox/video/sdk/RequestData;)Lcom/mobfox/video/sdk/RichMediaAdData;
com.mobfox.video.sdk.MobFoxAdManager .access$1 ( v4,v5 );
/* .line 119 */
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$2 ( v4 );
v4 = (( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getType ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
if ( v4 != null) { // if-eqz v4, :cond_5
	 /* .line 120 */
	 final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
	 int v5 = 3; // const/4 v5, 0x3
	 v4 = 	 android.util.Log .isLoggable ( v4,v5 );
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* .line 121 */
		 final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
		 final String v5 = "response OK received"; // const-string v5, "response OK received"
		 android.util.Log .d ( v4,v5 );
		 /* .line 123 */
	 } // :cond_1
	 v4 = this.this$0;
	 com.mobfox.video.sdk.MobFoxAdManager .access$3 ( v4 );
	 if ( v4 != null) { // if-eqz v4, :cond_2
		 /* .line 124 */
		 v4 = this.this$0;
		 com.mobfox.video.sdk.MobFoxAdManager .access$4 ( v4 );
		 /* new-instance v5, Lcom/mobfox/video/sdk/MobFoxAdManager$1$1; */
		 /* invoke-direct {v5, p0}, Lcom/mobfox/video/sdk/MobFoxAdManager$1$1;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager$1;)V */
		 (( android.os.Handler ) v4 ).post ( v5 ); // invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .line 164 */
	 } // .end local v1 # "request":Lcom/mobfox/video/sdk/RequestData;
} // .end local v2 # "requestAd":Lcom/mobfox/video/sdk/RequestAd;
} // :cond_2
} // :goto_1
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v7 );
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 165 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
final String v5 = "finishing ad request thread"; // const-string v5, "finishing ad request thread"
android.util.Log .d ( v4,v5 );
/* .line 167 */
} // :cond_3
v4 = this.this$0;
int v5 = 0; // const/4 v5, 0x0
com.mobfox.video.sdk.MobFoxAdManager .access$5 ( v4,v5 );
/* .line 168 */
return;
/* .line 108 */
} // :cond_4
/* const-wide/16 v4, 0xc8 */
try { // :try_start_1
java.lang.Thread .sleep ( v4,v5 );
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 109 */
/* :catch_0 */
/* move-exception v4 */
/* .line 133 */
/* .restart local v1 # "request":Lcom/mobfox/video/sdk/RequestData; */
/* .restart local v2 # "requestAd":Lcom/mobfox/video/sdk/RequestAd; */
} // :cond_5
try { // :try_start_2
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
int v5 = 3; // const/4 v5, 0x3
v4 = android.util.Log .isLoggable ( v4,v5 );
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 134 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
final String v5 = "response NO AD received"; // const-string v5, "response NO AD received"
android.util.Log .d ( v4,v5 );
/* .line 136 */
} // :cond_6
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$3 ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 137 */
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$4 ( v4 );
/* new-instance v5, Lcom/mobfox/video/sdk/MobFoxAdManager$1$2; */
/* invoke-direct {v5, p0}, Lcom/mobfox/video/sdk/MobFoxAdManager$1$2;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager$1;)V */
(( android.os.Handler ) v4 ).post ( v5 ); // invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 146 */
} // .end local v1 # "request":Lcom/mobfox/video/sdk/RequestData;
} // .end local v2 # "requestAd":Lcom/mobfox/video/sdk/RequestAd;
/* :catch_1 */
/* move-exception v3 */
/* .line 147 */
/* .local v3, "t":Ljava/lang/Throwable; */
v4 = this.this$0;
/* new-instance v5, Lcom/mobfox/video/sdk/RichMediaAdData; */
/* invoke-direct {v5}, Lcom/mobfox/video/sdk/RichMediaAdData;-><init>()V */
com.mobfox.video.sdk.MobFoxAdManager .access$1 ( v4,v5 );
/* .line 148 */
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$2 ( v4 );
int v5 = -1; // const/4 v5, -0x1
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).setType ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 149 */
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$3 ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 150 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v7 );
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 151 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Ad Load failed.Reason:"; // const-string v6, "Ad Load failed.Reason:"
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v5 );
/* .line 152 */
(( java.lang.Throwable ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
/* .line 154 */
} // :cond_7
/* new-instance v0, Lcom/mobfox/video/sdk/RequestException; */
/* invoke-direct {v0, v3}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/Throwable;)V */
/* .line 155 */
/* .local v0, "e":Lcom/mobfox/video/sdk/RequestException; */
v4 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$4 ( v4 );
/* new-instance v5, Lcom/mobfox/video/sdk/MobFoxAdManager$1$3; */
/* invoke-direct {v5, p0, v0}, Lcom/mobfox/video/sdk/MobFoxAdManager$1$3;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager$1;Lcom/mobfox/video/sdk/RequestException;)V */
(( android.os.Handler ) v4 ).post ( v5 ); // invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* goto/16 :goto_1 */
} // .end method
