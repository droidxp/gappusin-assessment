public class net.chobin.android.psdxylz.app.e {
	 /* # direct methods */
	 public static void a ( android.content.Context p0, Integer p1, Object[] p2, java.lang.String p3 ) {
		 /* .locals 4 */
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 net.chobin.android.psdxylz.app.e .a ( p0,p3 );
			 int v2 = 0; // const/4 v2, 0x0
			 /* array-length v3, p2 */
			 java.lang.System .arraycopy ( p2,v2,v0,p1,v3 );
			 net.chobin.android.psdxylz.app.e .a ( p0,v0,p3 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 try { // :try_start_1
					 (( java.io.OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
					 /* :try_end_1 */
					 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
				 } // :cond_0
			 } // :goto_0
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 try { // :try_start_2
				 /* new-instance v2, Lnet/chobin/android/psdxylz/app/ah; */
				 int v3 = 3; // const/4 v3, 0x3
				 /* invoke-direct {v2, v0, v3}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
				 /* throw v2 */
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 try { // :try_start_3
						 (( java.io.OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
						 /* :try_end_3 */
						 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
					 } // :cond_1
				 } // :goto_1
				 /* throw v0 */
				 /* :catch_1 */
				 /* move-exception v1 */
				 /* :catch_2 */
				 /* move-exception v0 */
			 } // .end method
			 public static void a ( android.content.Context p0, Object[] p1, java.lang.String p2 ) {
				 /* .locals 4 */
				 int v2 = 0; // const/4 v2, 0x0
				 int v0 = 0; // const/4 v0, 0x0
				 try { // :try_start_0
					 (( android.content.Context ) p0 ).openFileOutput ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
					 /* :try_end_0 */
					 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
					 try { // :try_start_1
						 /* new-instance v1, Ljava/io/BufferedOutputStream; */
						 /* invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V */
						 /* :try_end_1 */
						 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
						 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
						 int v0 = 0; // const/4 v0, 0x0
						 try { // :try_start_2
							 /* array-length v2, p1 */
							 (( java.io.BufferedOutputStream ) v1 ).write ( p1, v0, v2 ); // invoke-virtual {v1, p1, v0, v2}, Ljava/io/BufferedOutputStream;->write([BII)V
							 /* :try_end_2 */
							 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_4 */
							 /* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
							 if ( v1 != null) { // if-eqz v1, :cond_0
								 try { // :try_start_3
									 (( java.io.BufferedOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
								 } // :cond_0
								 if ( v3 != null) { // if-eqz v3, :cond_1
									 (( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
									 /* :try_end_3 */
									 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
								 } // :cond_1
							 } // :goto_0
							 return;
							 /* :catch_0 */
							 /* move-exception v0 */
							 /* move-object v1, v2 */
						 } // :goto_1
						 try { // :try_start_4
							 /* throw v0 */
							 /* :try_end_4 */
							 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* move-object v3, v2 */
						 } // :goto_2
						 if ( v1 != null) { // if-eqz v1, :cond_2
							 try { // :try_start_5
								 (( java.io.BufferedOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
							 } // :cond_2
							 if ( v3 != null) { // if-eqz v3, :cond_3
								 (( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
								 /* :try_end_5 */
								 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
							 } // :cond_3
						 } // :goto_3
						 /* throw v0 */
						 /* :catch_1 */
						 /* move-exception v0 */
						 /* :catch_2 */
						 /* move-exception v1 */
						 /* :catchall_1 */
						 /* move-exception v0 */
						 /* move-object v1, v2 */
						 /* move-object v3, v2 */
						 /* :catchall_2 */
						 /* move-exception v0 */
						 /* move-object v1, v2 */
						 /* :catchall_3 */
						 /* move-exception v0 */
						 /* :catch_3 */
						 /* move-exception v0 */
						 /* move-object v1, v2 */
						 /* move-object v2, v3 */
						 /* :catch_4 */
						 /* move-exception v0 */
						 /* move-object v2, v3 */
					 } // .end method
					 public static Boolean a ( android.content.Context p0, java.lang.String p1 ) {
						 /* .locals 1 */
						 (( android.content.Context ) p0 ).getFileStreamPath ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
						 v0 = 						 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
					 } // .end method
					 public static a ( android.content.Context p0, java.lang.String p1 ) {
						 /* .locals 6 */
						 int v1 = 0; // const/4 v1, 0x0
						 /* move-object v0, v1 */
						 /* check-cast v0, [B */
						 try { // :try_start_0
							 /* new-instance v2, Ljava/io/ByteArrayOutputStream; */
							 /* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
							 /* :try_end_0 */
							 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_3 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
							 try { // :try_start_1
								 /* new-instance v3, Ljava/io/BufferedInputStream; */
								 (( android.content.Context ) p0 ).openFileInput ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
								 /* invoke-direct {v3, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
								 /* :try_end_1 */
								 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_4 */
								 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
								 /* const/16 v0, 0x400 */
								 try { // :try_start_2
									 /* new-array v0, v0, [B */
								 } // :goto_0
								 v1 = 								 (( java.io.BufferedInputStream ) v3 ).read ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/BufferedInputStream;->read([B)I
								 int v4 = -1; // const/4 v4, -0x1
								 /* if-ne v1, v4, :cond_2 */
								 (( java.io.BufferedInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
								 (( java.io.ByteArrayOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
								 (( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
								 /* :try_end_2 */
								 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
								 if ( v2 != null) { // if-eqz v2, :cond_0
									 try { // :try_start_3
										 (( java.io.ByteArrayOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
									 } // :cond_0
									 if ( v3 != null) { // if-eqz v3, :cond_1
										 (( java.io.BufferedInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
										 /* :try_end_3 */
										 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
									 } // :cond_1
								 } // :goto_1
							 } // :cond_2
							 int v4 = 0; // const/4 v4, 0x0
							 try { // :try_start_4
								 (( java.io.ByteArrayOutputStream ) v2 ).write ( v0, v4, v1 ); // invoke-virtual {v2, v0, v4, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
								 /* :try_end_4 */
								 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
								 /* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
								 /* :catch_0 */
								 /* move-exception v0 */
								 /* move-object v1, v2 */
								 /* move-object v2, v3 */
							 } // :goto_2
							 try { // :try_start_5
								 /* throw v0 */
								 /* :try_end_5 */
								 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* move-object v3, v2 */
								 /* move-object v2, v1 */
							 } // :goto_3
							 if ( v2 != null) { // if-eqz v2, :cond_3
								 try { // :try_start_6
									 (( java.io.ByteArrayOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
								 } // :cond_3
								 if ( v3 != null) { // if-eqz v3, :cond_4
									 (( java.io.BufferedInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
									 /* :try_end_6 */
									 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_2 */
								 } // :cond_4
							 } // :goto_4
							 /* throw v0 */
							 /* :catch_1 */
							 /* move-exception v1 */
							 /* :catch_2 */
							 /* move-exception v1 */
							 /* :catchall_1 */
							 /* move-exception v0 */
							 /* move-object v2, v1 */
							 /* move-object v3, v1 */
							 /* :catchall_2 */
							 /* move-exception v0 */
							 /* move-object v3, v1 */
							 /* :catchall_3 */
							 /* move-exception v0 */
							 /* :catch_3 */
							 /* move-exception v0 */
							 /* move-object v2, v1 */
							 /* :catch_4 */
							 /* move-exception v0 */
							 /* move-object v5, v2 */
							 /* move-object v2, v1 */
							 /* move-object v1, v5 */
						 } // .end method
