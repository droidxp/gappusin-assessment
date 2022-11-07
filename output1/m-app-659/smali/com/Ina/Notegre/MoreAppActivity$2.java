class com.Ina.Notegre.MoreAppActivity$2 implements java.lang.Runnable {
	 /* .source "MoreAppActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/MoreAppActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.MoreAppActivity this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.MoreAppActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 85 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 90 */
try { // :try_start_0
	 /* new-instance v1, Lcom/Ina/Control/NetWorkData; */
	 /* invoke-direct {v1}, Lcom/Ina/Control/NetWorkData;-><init>()V */
	 /* .line 91 */
	 /* .local v1, "net":Lcom/Ina/Control/NetWorkData; */
	 v2 = this.this$0;
	 (( com.Ina.Control.NetWorkData ) v1 ).getMoreAppList ( ); // invoke-virtual {v1}, Lcom/Ina/Control/NetWorkData;->getMoreAppList()Ljava/util/ArrayList;
	 com.Ina.Notegre.MoreAppActivity .access$0 ( v2,v3 );
	 /* .line 93 */
	 v2 = this.this$0;
	 com.Ina.Notegre.MoreAppActivity .access$1 ( v2 );
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 95 */
		 /* new-instance v0, Landroid/os/Message; */
		 /* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
		 /* .line 96 */
		 /* .local v0, "msg":Landroid/os/Message; */
		 int v2 = 1; // const/4 v2, 0x1
		 /* iput v2, v0, Landroid/os/Message;->what:I */
		 /* .line 97 */
		 v2 = this.this$0;
		 com.Ina.Notegre.MoreAppActivity .access$2 ( v2 );
		 (( android.os.Handler ) v2 ).sendMessage ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 102 */
	 } // .end local v0 # "msg":Landroid/os/Message;
} // .end local v1 # "net":Lcom/Ina/Control/NetWorkData;
} // :cond_0
} // :goto_0
return;
/* .line 99 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
