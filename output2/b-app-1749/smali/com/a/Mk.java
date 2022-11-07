class com.a.Mk implements java.lang.Runnable {
	 /* # interfaces */
	 /* # direct methods */
	 com.a.Mk ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 4 */
		 v0 = com.a.Gb.c;
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
try { // :try_start_0
/* new-instance v0, Ljava/io/File; */
v1 = com.a.Gb.f;
com.a.Gb .b ( );
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_3 */
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
v1 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_2 */
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
(( java.io.File ) v1 ).mkdirs ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
} // :cond_2
(( java.io.File ) v0 ).createNewFile ( ); // invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_3
try { // :try_start_1
final String v1 = ""; // const-string v1, ""
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
com.a.Gb .a ( v1 );
(( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v3 = ""; // const-string v3, ""
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
com.a.Gb .b ( v1 );
v2 = com.acv.bc.bc.Gb.b;
com.a.Gb .a ( v2,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* array-length v1, v1 */
/* if-lez v1, :cond_0 */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
