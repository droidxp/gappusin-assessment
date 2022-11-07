class com.umeng.common.net.DownloadingService$c extends android.os.Handler {
	 /* .source "DownloadingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/DownloadingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "c" */
} // .end annotation
/* # instance fields */
final com.umeng.common.net.DownloadingService a; //synthetic
/* # direct methods */
 com.umeng.common.net.DownloadingService$c ( ) {
/* .locals 0 */
/* .prologue */
/* .line 176 */
this.a = p1;
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 8 */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
int v6 = 2; // const/4 v6, 0x2
int v5 = 0; // const/4 v5, 0x0
/* .line 179 */
com.umeng.common.net.DownloadingService .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "IncomingHandler(msg.what:"; // const-string v2, "IncomingHandler(msg.what:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p1, Landroid/os/Message;->what:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " msg.arg1:"; // const-string v2, " msg.arg1:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p1, Landroid/os/Message;->arg1:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 180 */
final String v2 = " msg.arg2:"; // const-string v2, " msg.arg2:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p1, Landroid/os/Message;->arg2:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " msg.replyTo:"; // const-string v2, " msg.replyTo:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.replyTo;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 179 */
com.umeng.common.Log .c ( v0,v1 );
/* .line 181 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 232 */
/* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
/* .line 234 */
} // :goto_0
return;
/* .line 183 */
/* :pswitch_0 */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
/* .line 184 */
com.umeng.common.net.DownloadingService .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "IncomingHandler(msg.getData():"; // const-string v3, "IncomingHandler(msg.getData():"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v1,v2 );
/* .line 185 */
com.umeng.common.net.a$a .a ( v0 );
/* .line 186 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
/* sget-boolean v2, Lcom/umeng/common/net/DownloadingService;->o:Z */
com.umeng.common.net.DownloadingService .b ( );
v4 = this.replyTo;
v0 = (( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/a$a;ZLjava/util/Map;Landroid/os/Messenger;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 187 */
com.umeng.common.net.DownloadingService .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
v1 = this.b;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = " is already in downloading list."; // const-string v1, " is already in downloading list."
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v0,v1 );
/* .line 188 */
v0 = this.a;
com.umeng.common.net.DownloadingService .b ( v0 );
/* .line 189 */
v1 = this.a;
com.umeng.common.net.DownloadingService .b ( v1 );
v1 = com.umeng.common.a.c .b ( v1 );
/* .line 188 */
android.widget.Toast .makeText ( v0,v1,v5 );
/* .line 190 */
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 191 */
android.os.Message .obtain ( );
/* .line 192 */
/* iput v6, v0, Landroid/os/Message;->what:I */
/* .line 193 */
/* iput v6, v0, Landroid/os/Message;->arg1:I */
/* .line 194 */
/* iput v5, v0, Landroid/os/Message;->arg2:I */
/* .line 196 */
try { // :try_start_0
	 v1 = this.replyTo;
	 (( android.os.Messenger ) v1 ).send ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
	 /* :try_end_0 */
	 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 197 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 198 */
	 (( android.os.RemoteException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
	 /* .line 202 */
} // :cond_0
v0 = this.a;
(( com.umeng.common.net.DownloadingService ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/DownloadingService;->getApplicationContext()Landroid/content/Context;
v0 = com.umeng.common.b .n ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 203 */
	 com.umeng.common.net.DownloadingService .b ( );
	 v2 = this.replyTo;
	 /* .line 204 */
	 android.os.Message .obtain ( );
	 /* .line 205 */
	 /* iput v7, v0, Landroid/os/Message;->what:I */
	 /* .line 206 */
	 /* iput v7, v0, Landroid/os/Message;->arg1:I */
	 /* .line 207 */
	 /* iput v5, v0, Landroid/os/Message;->arg2:I */
	 /* .line 209 */
	 try { // :try_start_1
		 v2 = this.replyTo;
		 (( android.os.Messenger ) v2 ).send ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
		 /* :try_end_1 */
		 /* .catch Landroid/os/RemoteException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* .line 214 */
	 } // :goto_1
	 v0 = this.a;
	 com.umeng.common.net.DownloadingService .a ( v0,v1 );
	 /* goto/16 :goto_0 */
	 /* .line 210 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* .line 212 */
	 (( android.os.RemoteException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
	 /* .line 216 */
} // :cond_1
v0 = this.a;
com.umeng.common.net.DownloadingService .b ( v0 );
/* .line 217 */
v1 = this.a;
com.umeng.common.net.DownloadingService .b ( v1 );
v1 = com.umeng.common.a.c .a ( v1 );
/* .line 216 */
android.widget.Toast .makeText ( v0,v1,v5 );
/* .line 218 */
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 219 */
android.os.Message .obtain ( );
/* .line 220 */
/* iput v6, v0, Landroid/os/Message;->what:I */
/* .line 221 */
int v1 = 4; // const/4 v1, 0x4
/* iput v1, v0, Landroid/os/Message;->arg1:I */
/* .line 222 */
/* iput v5, v0, Landroid/os/Message;->arg2:I */
/* .line 224 */
try { // :try_start_2
	 v1 = this.replyTo;
	 (( android.os.Messenger ) v1 ).send ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
	 /* :try_end_2 */
	 /* .catch Landroid/os/RemoteException; {:try_start_2 ..:try_end_2} :catch_2 */
	 /* goto/16 :goto_0 */
	 /* .line 225 */
	 /* :catch_2 */
	 /* move-exception v0 */
	 /* .line 226 */
	 (( android.os.RemoteException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
	 /* goto/16 :goto_0 */
	 /* .line 181 */
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x4 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
