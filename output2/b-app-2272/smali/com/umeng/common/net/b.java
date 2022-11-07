class com.umeng.common.net.b implements android.content.ServiceConnection {
	 /* .source "DownloadAgent.java" */
	 /* # interfaces */
	 /* # instance fields */
	 final com.umeng.common.net.a a; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.b ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 /* .line 134 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 137 */
		 com.umeng.common.net.a .b ( );
		 final String v1 = "ServiceConnection.onServiceConnected"; // const-string v1, "ServiceConnection.onServiceConnected"
		 com.umeng.common.Log .c ( v0,v1 );
		 /* .line 138 */
		 v0 = this.a;
		 /* new-instance v1, Landroid/os/Messenger; */
		 /* invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V */
		 com.umeng.common.net.a .a ( v0,v1 );
		 /* .line 143 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 144 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* .line 143 */
		 try { // :try_start_0
			 android.os.Message .obtain ( v0,v1 );
			 /* .line 145 */
			 /* new-instance v1, Lcom/umeng/common/net/a$a; */
			 v2 = this.a;
			 com.umeng.common.net.a .a ( v2 );
			 v3 = this.a;
			 com.umeng.common.net.a .b ( v3 );
			 v4 = this.a;
			 com.umeng.common.net.a .c ( v4 );
			 /* invoke-direct {v1, v2, v3, v4}, Lcom/umeng/common/net/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 146 */
			 v2 = this.a;
			 com.umeng.common.net.a .d ( v2 );
			 this.d = v2;
			 /* .line 147 */
			 v2 = this.a;
			 com.umeng.common.net.a .e ( v2 );
			 this.e = v2;
			 /* .line 148 */
			 v2 = this.a;
			 com.umeng.common.net.a .f ( v2 );
			 this.f = v2;
			 /* .line 149 */
			 v2 = this.a;
			 v2 = 			 com.umeng.common.net.a .g ( v2 );
			 /* iput-boolean v2, v1, Lcom/umeng/common/net/a$a;->g:Z */
			 /* .line 151 */
			 (( com.umeng.common.net.a$a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/umeng/common/net/a$a;->a()Landroid/os/Bundle;
			 (( android.os.Message ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
			 /* .line 152 */
			 v1 = this.a;
			 v1 = this.a;
			 this.replyTo = v1;
			 /* .line 153 */
			 v1 = this.a;
			 com.umeng.common.net.a .h ( v1 );
			 (( android.os.Messenger ) v1 ).send ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
			 /* :try_end_0 */
			 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 156 */
		 } // :goto_0
		 return;
		 /* .line 154 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public void onServiceDisconnected ( android.content.ComponentName p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 160 */
		 com.umeng.common.net.a .b ( );
		 final String v1 = "ServiceConnection.onServiceDisconnected"; // const-string v1, "ServiceConnection.onServiceDisconnected"
		 com.umeng.common.Log .c ( v0,v1 );
		 /* .line 161 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 com.umeng.common.net.a .a ( v0,v1 );
		 /* .line 162 */
		 return;
	 } // .end method
