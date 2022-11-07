class com.umeng.common.net.a$b extends android.os.Handler {
	 /* .source "DownloadAgent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "b" */
} // .end annotation
/* # instance fields */
final com.umeng.common.net.a a; //synthetic
/* # direct methods */
 com.umeng.common.net.a$b ( ) {
/* .locals 0 */
/* .prologue */
/* .line 76 */
this.a = p1;
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 83 */
try { // :try_start_0
	 com.umeng.common.net.a .b ( );
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "DownloadAgent.handleMessage("; // const-string v2, "DownloadAgent.handleMessage("
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* iget v2, p1, Landroid/os/Message;->what:I */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 /* .line 84 */
	 final String v2 = "): "; // const-string v2, "): "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 83 */
	 com.umeng.common.Log .c ( v0,v1 );
	 /* .line 85 */
	 /* iget v0, p1, Landroid/os/Message;->what:I */
	 /* packed-switch v0, :pswitch_data_0 */
	 /* .line 121 */
	 /* :pswitch_0 */
	 /* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
	 /* .line 128 */
} // :cond_0
} // :goto_0
return;
/* .line 87 */
/* :pswitch_1 */
v0 = this.a;
com.umeng.common.net.a .i ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 88 */
v0 = this.a;
com.umeng.common.net.a .i ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 123 */
/* :catch_0 */
/* move-exception v0 */
/* .line 124 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 125 */
com.umeng.common.net.a .b ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "DownloadAgent.handleMessage("; // const-string v3, "DownloadAgent.handleMessage("
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v3, p1, Landroid/os/Message;->what:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 126 */
final String v3 = "): "; // const-string v3, "): "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 125 */
com.umeng.common.Log .c ( v1,v0 );
/* .line 92 */
/* :pswitch_2 */
try { // :try_start_1
	 v0 = this.a;
	 com.umeng.common.net.a .i ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 93 */
		 v0 = this.a;
		 com.umeng.common.net.a .i ( v0 );
		 /* iget v1, p1, Landroid/os/Message;->arg1:I */
		 /* .line 97 */
		 /* :pswitch_3 */
		 v0 = this.a;
		 com.umeng.common.net.a .j ( v0 );
		 v1 = this.a;
		 com.umeng.common.net.a .k ( v1 );
		 (( android.content.Context ) v0 ).unbindService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
		 /* .line 98 */
		 v0 = this.a;
		 com.umeng.common.net.a .i ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 99 */
			 /* iget v0, p1, Landroid/os/Message;->arg1:I */
			 int v1 = 1; // const/4 v1, 0x1
			 /* if-eq v0, v1, :cond_1 */
			 /* .line 100 */
			 /* iget v0, p1, Landroid/os/Message;->arg1:I */
			 int v1 = 3; // const/4 v1, 0x3
			 /* if-ne v0, v1, :cond_2 */
			 /* .line 101 */
		 } // :cond_1
		 v0 = this.a;
		 com.umeng.common.net.a .i ( v0 );
		 /* .line 102 */
		 /* iget v1, p1, Landroid/os/Message;->arg1:I */
		 /* .line 103 */
		 /* iget v2, p1, Landroid/os/Message;->arg2:I */
		 /* .line 105 */
		 (( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
		 /* .line 107 */
		 final String v4 = "filename"; // const-string v4, "filename"
		 /* .line 106 */
		 (( android.os.Bundle ) v3 ).getString ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 102 */
		 /* goto/16 :goto_0 */
		 /* .line 109 */
	 } // :cond_2
	 v0 = this.a;
	 com.umeng.common.net.a .i ( v0 );
	 /* .line 110 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 111 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 112 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 109 */
	 /* .line 113 */
	 com.umeng.common.net.a .b ( );
	 final String v1 = "DownloadAgent.handleMessage(DownloadingService.DOWNLOAD_COMPLETE_FAIL): "; // const-string v1, "DownloadAgent.handleMessage(DownloadingService.DOWNLOAD_COMPLETE_FAIL): "
	 com.umeng.common.Log .c ( v0,v1 );
	 /* goto/16 :goto_0 */
	 /* .line 118 */
	 /* :pswitch_4 */
	 v0 = this.a;
	 com.umeng.common.net.a .i ( v0 );
	 /* iget v1, p1, Landroid/os/Message;->arg1:I */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* goto/16 :goto_0 */
	 /* .line 85 */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x1 */
	 /* :pswitch_1 */
	 /* :pswitch_4 */
	 /* :pswitch_2 */
	 /* :pswitch_0 */
	 /* :pswitch_3 */
} // .end packed-switch
} // .end method
