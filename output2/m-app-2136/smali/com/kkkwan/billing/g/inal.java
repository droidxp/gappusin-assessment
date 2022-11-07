public class inal extends android.os.AsyncTask {
	 /* # instance fields */
	 private android.app.Activity a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 try { // :try_start_0
			 final String v0 = "InitTask"; // const-string v0, "InitTask"
			 final String v1 = "\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b\u6784\u9020\u65b9\u6cd5"; // const-string v1, "\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b\u6784\u9020\u65b9\u6cd5"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 this.a = p1;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 static android.app.Activity a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 private java.lang.String a ( ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 final String v0 = "InitTask"; // const-string v0, "InitTask"
			 final String v1 = "\u6267\u884c\u5f02\u6b65\u64cd\u4f5c\u4e2d"; // const-string v1, "\u6267\u884c\u5f02\u6b65\u64cd\u4f5c\u4e2d"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* new-instance v0, Ljava/text/SimpleDateFormat; */
			 final String v1 = "yyyyMMdd"; // const-string v1, "yyyyMMdd"
			 /* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
			 /* new-instance v1, Ljava/util/Date; */
			 /* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
			 (( java.text.SimpleDateFormat ) v0 ).format ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
			 final String v1 = "InitTask"; // const-string v1, "InitTask"
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "today="; // const-string v3, "today="
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.kkkwan.billing.h.f .a ( v1,v2 );
			 v1 = this.a;
			 final String v2 = "today"; // const-string v2, "today"
			 v3 = com.kkkwan.billing.b.a.c;
			 com.kkkwan.billing.e.b.a .a ( v1,v2,v3 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 final String v2 = ""; // const-string v2, ""
				 v2 = 				 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez v2, :cond_0 */
				 v0 = 				 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez v0, :cond_1 */
			 } // :cond_0
			 v0 = this.a;
			 final String v1 = "upline"; // const-string v1, "upline"
			 final String v2 = "0"; // const-string v2, "0"
			 final String v3 = "upline"; // const-string v3, "upline"
			 com.kkkwan.billing.e.b.a .a ( v0,v1,v2,v3 );
		 } // :cond_1
		 v0 = this.a;
		 v0 = 		 com.kkkwan.billing.c.h .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 v0 = this.a;
			 v0 = 			 com.kkkwan.billing.c.f .a ( v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 final String v0 = "InitTask"; // const-string v0, "InitTask"
				 final String v1 = "\u4ece\u7f51\u7edc\u4e2d\u83b7\u53d6\u901a\u9053\u6570\u636e\u6210\u529f\uff0c\u5e76\u6210\u529f\u4fdd\u5b58\u5230sdk\u6587\u4ef6\u4e2d"; // const-string v1, "\u4ece\u7f51\u7edc\u4e2d\u83b7\u53d6\u901a\u9053\u6570\u636e\u6210\u529f\uff0c\u5e76\u6210\u529f\u4fdd\u5b58\u5230sdk\u6587\u4ef6\u4e2d"
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 v0 = this.a;
				 com.kkkwan.billing.c.c .a ( v0 );
				 v0 = this.a;
				 com.kkkwan.billing.c.c .b ( v0 );
			 } // :goto_0
			 /* new-instance v0, Ljava/lang/Thread; */
			 /* new-instance v1, Lcom/kkkwan/billing/g/c; */
			 /* invoke-direct {v1, p0}, Lcom/kkkwan/billing/g/c;-><init>(Lcom/kkkwan/billing/g/b;)V */
			 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
			 /* new-instance v0, Ljava/lang/Thread; */
			 /* new-instance v1, Lcom/kkkwan/billing/g/d; */
			 /* invoke-direct {v1, p0}, Lcom/kkkwan/billing/g/d;-><init>(Lcom/kkkwan/billing/g/b;)V */
			 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
		 } // :goto_1
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_2
	 final String v0 = "InitTask"; // const-string v0, "InitTask"
	 final String v1 = "\u4ece\u7f51\u7edc\u4e2d\u83b7\u53d6\u901a\u9053\u6570\u636e\u5931\u8d25"; // const-string v1, "\u4ece\u7f51\u7edc\u4e2d\u83b7\u53d6\u901a\u9053\u6570\u636e\u5931\u8d25"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_3
try { // :try_start_1
	 final String v0 = "InitTask"; // const-string v0, "InitTask"
	 final String v1 = "SIM\u5361\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5SIM\u5361!"; // const-string v1, "SIM\u5361\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5SIM\u5361!"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
/* # virtual methods */
protected final java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //synthethic
	 /* .locals 1 */
	 /* invoke-direct {p0}, Lcom/kkkwan/billing/g/b;->a()Ljava/lang/String; */
} // .end method
protected final void onPostExecute ( java.lang.Object p0 ) { //synthethic
	 /* .locals 2 */
	 /* check-cast p1, Ljava/lang/String; */
	 /* invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V */
	 try { // :try_start_0
		 final String v0 = "InitTask"; // const-string v0, "InitTask"
		 final String v1 = "\u5f02\u6b65\u64cd\u4f5c\u6267\u884c\u7ed3\u675f"; // const-string v1, "\u5f02\u6b65\u64cd\u4f5c\u6267\u884c\u7ed3\u675f"
		 com.kkkwan.billing.h.f .a ( v0,v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 com.kkkwan.billing.h.f .a ( v0 );
} // .end method
protected final void onPreExecute ( ) {
	 /* .locals 2 */
	 final String v0 = "InitTask"; // const-string v0, "InitTask"
	 final String v1 = "\u5f00\u59cb\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b"; // const-string v1, "\u5f00\u59cb\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 /* invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V */
	 return;
} // .end method
protected final void onProgressUpdate ( java.lang.Object[] p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 return;
} // .end method
