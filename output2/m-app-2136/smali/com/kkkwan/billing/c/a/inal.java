class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 private android.content.Context a; //synthetic
	 private java.lang.String b; //synthetic
	 private com.kkkwan.billing.c.a.a c; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.c = p1;
		 this.a = p2;
		 this.b = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 5 */
		 try { // :try_start_0
			 final String v0 = "DownloadMgr"; // const-string v0, "DownloadMgr"
			 final String v1 = "\u8bbf\u95ee\u767e\u5ea6\u68c0\u67e5\u7f51\u7edc-------------------------------"; // const-string v1, "\u8bbf\u95ee\u767e\u5ea6\u68c0\u67e5\u7f51\u7edc-------------------------------"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* new-instance v0, Lcom/kkkwan/billing/h/d; */
			 /* invoke-direct {v0}, Lcom/kkkwan/billing/h/d;-><init>()V */
			 v1 = this.a;
			 final String v2 = "http://www.baidu.com"; // const-string v2, "http://www.baidu.com"
			 int v3 = 0; // const/4 v3, 0x0
			 int v4 = 0; // const/4 v4, 0x0
			 (( com.kkkwan.billing.h.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kkkwan/billing/h/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Landroid/os/Handler;)Ljava/lang/String;
			 final String v0 = "DownloadMgr"; // const-string v0, "DownloadMgr"
			 final String v1 = "\u8bbf\u95ee\u767e\u5ea6\u68c0\u67e5\u7f51\u7edc-------------------------------"; // const-string v1, "\u8bbf\u95ee\u767e\u5ea6\u68c0\u67e5\u7f51\u7edc-------------------------------"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 final String v0 = "DownloadMgr"; // const-string v0, "DownloadMgr"
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "\u5f00\u59cb\u4e0b\u8f7d\u90e8\u5206\uff0curl="; // const-string v2, "\u5f00\u59cb\u4e0b\u8f7d\u90e8\u5206\uff0curl="
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v2 = this.b;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 v0 = this.c;
			 v1 = this.b;
			 com.kkkwan.billing.c.a.a .a ( v0,v1 );
			 final String v0 = "DownloadMgr"; // const-string v0, "DownloadMgr"
			 final String v1 = "\u4e0b\u8f7d\u90e8\u5206\u7ed3\u675f"; // const-string v1, "\u4e0b\u8f7d\u90e8\u5206\u7ed3\u675f"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
