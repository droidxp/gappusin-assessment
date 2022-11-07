class com.a.f.t implements android.content.DialogInterface$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 private final java.lang.String a; //synthetic
	 /* # direct methods */
	 com.a.f.t ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 3 */
		 final String v0 = "UpdateClient"; // const-string v0, "UpdateClient"
		 final String v1 = "\u5df2\u7ecf\u5b58\u5728\u66f4\u65b0\u7248\u672c"; // const-string v1, "\u5df2\u7ecf\u5b58\u5728\u66f4\u65b0\u7248\u672c"
		 android.util.Log .i ( v0,v1 );
		 v0 = this.a;
		 com.a.f.o .a ( v0 );
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v2 = "chmod 777 "; // const-string v2, "chmod 777 "
		 /* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 try { // :try_start_0
			 java.lang.Runtime .getRuntime ( );
			 (( java.lang.Runtime ) v2 ).exec ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 com.a.f.o .a ( v1 );
		 com.a.f.o .e ( );
		 (( com.calmei.jmsn.PlaneFightActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/calmei/jmsn/PlaneFightActivity;->finish()V
		 v0 = 		 android.os.Process .myPid ( );
		 android.os.Process .killProcess ( v0 );
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 } // .end method
