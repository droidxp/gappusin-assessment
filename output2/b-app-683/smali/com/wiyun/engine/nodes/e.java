class com.wiyun.engine.nodes.e {
	 /* .source "_A.java" */
	 /* # static fields */
	 private static java.io.File a;
	 /* # direct methods */
	 com.wiyun.engine.nodes.e ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 3249 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.String p0 ) {
		 /* .locals 15 */
		 /* .param p0, "id" # Ljava/lang/String; */
		 /* .prologue */
		 int v10 = 0; // const/4 v10, 0x0
		 int v9 = 1; // const/4 v9, 0x1
		 /* .line 3253 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 3255 */
		 /* .local v2, "fos":Ljava/io/FileOutputStream; */
		 try { // :try_start_0
			 v11 = com.wiyun.engine.nodes.e.a;
			 /* if-nez v11, :cond_0 */
			 /* .line 3256 */
			 /* new-instance v11, Ljava/io/File; */
			 android.os.Environment .getExternalStorageDirectory ( );
			 final String v13 = ".wiyun/winotice/lock"; // const-string v13, ".wiyun/winotice/lock"
			 /* invoke-direct {v11, v12, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
			 /* .line 3260 */
		 } // :cond_0
		 v11 = com.wiyun.engine.nodes.e.a;
		 (( java.io.File ) v11 ).getParentFile ( ); // invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;
		 v11 = 		 (( java.io.File ) v11 ).exists ( ); // invoke-virtual {v11}, Ljava/io/File;->exists()Z
		 /* if-nez v11, :cond_1 */
		 /* .line 3261 */
		 v11 = com.wiyun.engine.nodes.e.a;
		 (( java.io.File ) v11 ).getParentFile ( ); // invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;
		 (( java.io.File ) v11 ).mkdirs ( ); // invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z
		 /* .line 3262 */
	 } // :cond_1
	 v11 = com.wiyun.engine.nodes.e.a;
	 v11 = 	 (( java.io.File ) v11 ).exists ( ); // invoke-virtual {v11}, Ljava/io/File;->exists()Z
	 /* if-nez v11, :cond_3 */
	 /* .line 3263 */
	 v11 = com.wiyun.engine.nodes.e.a;
	 (( java.io.File ) v11 ).createNewFile ( ); // invoke-virtual {v11}, Ljava/io/File;->createNewFile()Z
	 /* .line 3264 */
	 /* new-instance v3, Ljava/io/FileOutputStream; */
	 v11 = com.wiyun.engine.nodes.e.a;
	 /* invoke-direct {v3, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 3265 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .local v3, "fos":Ljava/io/FileOutputStream; */
try { // :try_start_1
	 java.lang.String .valueOf ( p0 );
	 com.wiyun.engine.nodes._U .c ( v11 );
	 (( java.io.FileOutputStream ) v3 ).write ( v11 ); // invoke-virtual {v3, v11}, Ljava/io/FileOutputStream;->write([B)V
	 /* .line 3266 */
	 (( java.io.FileOutputStream ) v3 ).flush ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_7 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
	 /* .line 3291 */
	 if ( v3 != null) { // if-eqz v3, :cond_9
		 /* .line 3293 */
		 try { // :try_start_2
			 (( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
			 /* :try_end_2 */
			 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
			 /* .line 3294 */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .line 3289 */
		 } // .end local v3 # "fos":Ljava/io/FileOutputStream;
		 /* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
	 } // :cond_2
} // :goto_0
/* .line 3295 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catch_0 */
/* move-exception v10 */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
/* .line 3269 */
} // :cond_3
try { // :try_start_3
v11 = com.wiyun.engine.nodes.e.a;
com.wiyun.engine.nodes._U .a ( v11 );
/* .line 3270 */
/* .local v0, "data":[B */
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 3271 */
/* .local v6, "lockedId":Ljava/lang/String; */
v11 = (( java.lang.String ) p0 ).equals ( v6 ); // invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_4
/* .line 3272 */
v11 = com.wiyun.engine.nodes.e.a;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v12 */
(( java.io.File ) v11 ).setLastModified ( v12, v13 ); // invoke-virtual {v11, v12, v13}, Ljava/io/File;->setLastModified(J)Z
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 3291 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 3293 */
try { // :try_start_4
	 (( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
	 /* :try_end_4 */
	 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_3 */
	 /* .line 3294 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 3276 */
} // :cond_4
try { // :try_start_5
	 v11 = com.wiyun.engine.nodes.e.a;
	 (( java.io.File ) v11 ).lastModified ( ); // invoke-virtual {v11}, Ljava/io/File;->lastModified()J
	 /* move-result-wide v4 */
	 /* .line 3277 */
	 /* .local v4, "lastModified":J */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v7 */
	 /* .line 3278 */
	 /* .local v7, "now":J */
	 /* sub-long v11, v7, v4 */
	 /* const-wide/32 v13, 0x927c0 */
	 /* cmp-long v11, v11, v13 */
	 /* if-lez v11, :cond_5 */
	 /* .line 3279 */
	 /* new-instance v3, Ljava/io/FileOutputStream; */
	 v11 = com.wiyun.engine.nodes.e.a;
	 /* invoke-direct {v3, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
	 /* :try_end_5 */
	 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
	 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
	 /* .line 3280 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
try { // :try_start_6
	 java.lang.String .valueOf ( p0 );
	 com.wiyun.engine.nodes._U .c ( v11 );
	 (( java.io.FileOutputStream ) v3 ).write ( v11 ); // invoke-virtual {v3, v11}, Ljava/io/FileOutputStream;->write([B)V
	 /* .line 3281 */
	 (( java.io.FileOutputStream ) v3 ).flush ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
	 /* :try_end_6 */
	 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_7 */
	 /* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
	 /* .line 3291 */
	 if ( v3 != null) { // if-eqz v3, :cond_9
		 /* .line 3293 */
		 try { // :try_start_7
			 (( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
			 /* :try_end_7 */
			 /* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_1 */
			 /* .line 3294 */
			 int v2 = 0; // const/4 v2, 0x0
		 } // .end local v3 # "fos":Ljava/io/FileOutputStream;
		 /* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
		 /* .line 3295 */
	 } // .end local v2 # "fos":Ljava/io/FileOutputStream;
	 /* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
	 /* :catch_1 */
	 /* move-exception v10 */
	 /* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
/* .line 3291 */
} // :cond_5
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 3293 */
try { // :try_start_8
	 (( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
	 /* :try_end_8 */
	 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_4 */
	 /* .line 3294 */
	 int v2 = 0; // const/4 v2, 0x0
} // :cond_6
} // :goto_1
/* move v9, v10 */
/* .line 3284 */
/* .line 3288 */
} // .end local v0 # "data":[B
} // .end local v4 # "lastModified":J
} // .end local v6 # "lockedId":Ljava/lang/String;
} // .end local v7 # "now":J
/* :catch_2 */
/* move-exception v1 */
/* .line 3291 */
/* .local v1, "e":Ljava/io/IOException; */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 3293 */
try { // :try_start_9
(( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_5 */
/* .line 3294 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_7
} // :goto_3
/* move v9, v10 */
/* .line 3289 */
/* .line 3290 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catchall_0 */
/* move-exception v9 */
/* .line 3291 */
} // :goto_4
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 3293 */
try { // :try_start_a
(( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
/* :try_end_a */
/* .catch Ljava/io/IOException; {:try_start_a ..:try_end_a} :catch_6 */
/* .line 3294 */
int v2 = 0; // const/4 v2, 0x0
/* .line 3298 */
} // :cond_8
} // :goto_5
/* throw v9 */
/* .line 3295 */
/* .restart local v0 # "data":[B */
/* .restart local v6 # "lockedId":Ljava/lang/String; */
/* :catch_3 */
/* move-exception v10 */
/* .restart local v4 # "lastModified":J */
/* .restart local v7 # "now":J */
/* :catch_4 */
/* move-exception v9 */
} // .end local v0 # "data":[B
} // .end local v4 # "lastModified":J
} // .end local v6 # "lockedId":Ljava/lang/String;
} // .end local v7 # "now":J
/* .restart local v1 # "e":Ljava/io/IOException; */
/* :catch_5 */
/* move-exception v9 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catch_6 */
/* move-exception v10 */
/* .line 3290 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_1 */
/* move-exception v9 */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
/* .line 3288 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catch_7 */
/* move-exception v1 */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
} // :cond_9
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "id" # Ljava/lang/String; */
/* .prologue */
/* .line 3303 */
v2 = com.wiyun.engine.nodes.e.a;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3304 */
v2 = com.wiyun.engine.nodes.e.a;
com.wiyun.engine.nodes._U .a ( v2 );
/* .line 3305 */
/* .local v0, "data":[B */
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 3306 */
/* .local v1, "lockedId":Ljava/lang/String; */
v2 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3307 */
v2 = com.wiyun.engine.nodes.e.a;
(( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
/* .line 3309 */
} // .end local v0 # "data":[B
} // .end local v1 # "lockedId":Ljava/lang/String;
} // :cond_0
return;
} // .end method
