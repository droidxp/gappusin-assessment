class inal implements java.lang.Runnable {
	 /* .source "PolicyManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/analytics/d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x12 */
/* name = "b" */
} // .end annotation
/* # instance fields */
final com.umeng.analytics.d a; //synthetic
private android.content.Context b;
/* # direct methods */
 inal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 409 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 410 */
(( android.content.Context ) p2 ).getApplicationContext ( ); // invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.b = v0;
/* .line 411 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 415 */
try { // :try_start_0
	 v0 = this.a;
	 com.umeng.analytics.d .a ( v0 );
	 /* monitor-enter v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/lang/Error; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .line 416 */
	 try { // :try_start_1
		 v0 = this.a;
		 v2 = this.b;
		 com.umeng.analytics.d .a ( v0,v2 );
		 /* .line 415 */
		 /* monitor-exit v1 */
		 /* .line 428 */
	 } // :goto_0
	 return;
	 /* .line 415 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 try { // :try_start_2
		 /* throw v0 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
		 /* .catch Ljava/lang/Error; {:try_start_2 ..:try_end_2} :catch_1 */
		 /* .line 418 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 419 */
		 final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
		 final String v2 = "Exception occurred in ReportMessageHandler"; // const-string v2, "Exception occurred in ReportMessageHandler"
		 com.umeng.common.Log .b ( v1,v2,v0 );
		 /* .line 420 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* .line 421 */
		 final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "Error : "; // const-string v3, "Error : "
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Error ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Error;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.umeng.common.Log .b ( v1,v0 );
		 /* .line 423 */
		 try { // :try_start_3
			 v0 = this.b;
			 com.umeng.analytics.j .j ( v0 );
			 /* :try_end_3 */
			 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
			 /* .line 424 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 /* .line 425 */
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 } // .end method
