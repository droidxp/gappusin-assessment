public class net.chobin.android.psdxylz.app.aj {
	 /* # static fields */
	 private static a;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.aj ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public static android.graphics.Bitmap a ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 5 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( p1 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
			 (( android.content.res.AssetManager ) v0 ).open ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 android.graphics.BitmapFactory .decodeStream ( v1 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 try { // :try_start_1
					 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
					 /* :try_end_1 */
					 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
				 } // :cond_0
			 } // :goto_0
			 java.lang.System .gc ( );
			 /* :catch_0 */
			 /* move-exception v0 */
			 try { // :try_start_2
				 /* new-instance v3, Lnet/chobin/android/psdxylz/app/ah; */
				 /* const/16 v4, 0xb */
				 /* invoke-direct {v3, v0, v4}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
				 (( net.chobin.android.psdxylz.app.ah ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Lnet/chobin/android/psdxylz/app/ah;->a(Ljava/lang/String;)V
				 /* throw v3 */
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 try { // :try_start_3
						 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
						 /* :try_end_3 */
						 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
					 } // :cond_1
				 } // :goto_1
				 java.lang.System .gc ( );
				 /* throw v0 */
				 /* :catch_1 */
				 /* move-exception v1 */
				 /* :catch_2 */
				 /* move-exception v1 */
			 } // .end method
			 public static android.graphics.Bitmap a ( android.content.Context p0, java.lang.String p1, Integer p2, Object[] p3 ) {
				 /* .locals 3 */
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( p1 );
				 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 try { // :try_start_0
					 net.chobin.android.psdxylz.app.aj .a ( p0,v0 );
					 net.chobin.android.psdxylz.app.aj .a ( v0,p3 );
					 int v1 = 0; // const/4 v1, 0x0
					 /* array-length v2, v0 */
					 android.graphics.BitmapFactory .decodeByteArray ( v0,v1,v2 );
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* :catch_0 */
					 /* move-exception v0 */
					 /* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
					 int v2 = 7; // const/4 v2, 0x7
					 /* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
					 (( net.chobin.android.psdxylz.app.ah ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Lnet/chobin/android/psdxylz/app/ah;->a(I)V
					 /* throw v1 */
				 } // .end method
				 public static a ( android.content.Context p0, java.lang.String p1 ) {
					 /* .locals 5 */
					 int v1 = 0; // const/4 v1, 0x0
					 /* move-object v0, v1 */
					 /* check-cast v0, [B */
					 try { // :try_start_0
						 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
						 (( android.content.res.Resources ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
						 (( android.content.res.AssetManager ) v0 ).open ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
						 /* :try_end_0 */
						 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_3 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
						 try { // :try_start_1
							 /* new-instance v2, Ljava/io/ByteArrayOutputStream; */
							 /* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
							 /* :try_end_1 */
							 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_4 */
							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
							 /* const/16 v0, 0x100 */
							 try { // :try_start_2
								 /* new-array v0, v0, [B */
							 } // :goto_0
							 v1 = 							 (( java.io.InputStream ) v3 ).read ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I
							 int v4 = -1; // const/4 v4, -0x1
							 /* if-ne v1, v4, :cond_2 */
							 (( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
							 /* :try_end_2 */
							 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
							 /* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
							 if ( v2 != null) { // if-eqz v2, :cond_0
								 try { // :try_start_3
									 (( java.io.ByteArrayOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
								 } // :cond_0
								 if ( v3 != null) { // if-eqz v3, :cond_1
									 (( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
									 /* :try_end_3 */
									 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
								 } // :cond_1
							 } // :goto_1
							 java.lang.System .gc ( );
						 } // :cond_2
						 int v4 = 0; // const/4 v4, 0x0
						 try { // :try_start_4
							 (( java.io.ByteArrayOutputStream ) v2 ).write ( v0, v4, v1 ); // invoke-virtual {v2, v0, v4, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
							 /* :try_end_4 */
							 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
							 /* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
							 /* :catch_0 */
							 /* move-exception v0 */
							 /* move-object v1, v2 */
							 /* move-object v2, v3 */
						 } // :goto_2
						 try { // :try_start_5
							 /* new-instance v3, Lnet/chobin/android/psdxylz/app/ah; */
							 /* const/16 v4, 0xb */
							 /* invoke-direct {v3, v0, v4}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
							 (( net.chobin.android.psdxylz.app.ah ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Lnet/chobin/android/psdxylz/app/ah;->a(Ljava/lang/String;)V
							 /* throw v3 */
							 /* :try_end_5 */
							 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* move-object v3, v2 */
						 } // :goto_3
						 if ( v1 != null) { // if-eqz v1, :cond_3
							 try { // :try_start_6
								 (( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
							 } // :cond_3
							 if ( v3 != null) { // if-eqz v3, :cond_4
								 (( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
								 /* :try_end_6 */
								 /* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_2 */
							 } // :cond_4
						 } // :goto_4
						 java.lang.System .gc ( );
						 /* throw v0 */
						 /* :catch_1 */
						 /* move-exception v1 */
						 /* :catch_2 */
						 /* move-exception v1 */
						 /* :catchall_1 */
						 /* move-exception v0 */
						 /* move-object v3, v1 */
						 /* :catchall_2 */
						 /* move-exception v0 */
						 /* :catchall_3 */
						 /* move-exception v0 */
						 /* move-object v1, v2 */
						 /* :catch_3 */
						 /* move-exception v0 */
						 /* move-object v2, v1 */
						 /* :catch_4 */
						 /* move-exception v0 */
						 /* move-object v2, v3 */
					 } // .end method
					 public static a ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
						 /* .locals 2 */
						 /* new-instance v0, Ljava/lang/StringBuilder; */
						 java.lang.String .valueOf ( p1 );
						 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
						 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 net.chobin.android.psdxylz.app.aj .a ( p0,v0 );
					 } // .end method
					 private static a ( Object[] p0, Object[] p1 ) {
						 /* .locals 10 */
						 /* const/16 v8, 0x100 */
						 int v3 = 0; // const/4 v3, 0x0
						 /* array-length v0, p0 */
						 /* new-array v5, v0, [B */
						 /* array-length v0, p0 */
						 java.lang.System .arraycopy ( p0,v3,v5,v3,v0 );
						 /* const/16 v0, 0x21 */
					 } // :goto_0
					 /* add-int/lit8 v1, v0, 0x0 */
					 /* aget-byte v1, p0, v1 */
					 /* and-int/lit16 v1, v1, 0xff */
					 /* shl-int/lit8 v1, v1, 0x18 */
					 /* add-int/lit8 v2, v0, 0x1 */
					 /* aget-byte v2, p0, v2 */
					 /* and-int/lit16 v2, v2, 0xff */
					 /* shl-int/lit8 v2, v2, 0x10 */
					 /* or-int/2addr v1, v2 */
					 /* add-int/lit8 v2, v0, 0x2 */
					 /* aget-byte v2, p0, v2 */
					 /* and-int/lit16 v2, v2, 0xff */
					 /* shl-int/lit8 v2, v2, 0x8 */
					 /* or-int/2addr v1, v2 */
					 /* add-int/lit8 v2, v0, 0x3 */
					 /* aget-byte v2, p0, v2 */
					 /* and-int/lit16 v2, v2, 0xff */
					 /* shl-int/lit8 v2, v2, 0x0 */
					 /* or-int/2addr v1, v2 */
					 /* add-int/lit8 v0, v0, 0x4 */
					 /* add-int/lit8 v2, v0, 0x0 */
					 /* aget-byte v2, p0, v2 */
					 /* and-int/lit16 v2, v2, 0xff */
					 /* shl-int/lit8 v2, v2, 0x18 */
					 /* add-int/lit8 v4, v0, 0x1 */
					 /* aget-byte v4, p0, v4 */
					 /* and-int/lit16 v4, v4, 0xff */
					 /* shl-int/lit8 v4, v4, 0x10 */
					 /* or-int/2addr v2, v4 */
					 /* add-int/lit8 v4, v0, 0x2 */
					 /* aget-byte v4, p0, v4 */
					 /* and-int/lit16 v4, v4, 0xff */
					 /* shl-int/lit8 v4, v4, 0x8 */
					 /* or-int/2addr v2, v4 */
					 /* add-int/lit8 v4, v0, 0x3 */
					 /* aget-byte v4, p0, v4 */
					 /* and-int/lit16 v4, v4, 0xff */
					 /* shl-int/lit8 v4, v4, 0x0 */
					 /* or-int/2addr v2, v4 */
					 /* add-int/lit8 v6, v0, 0x4 */
					 /* const v0, 0x504c5445 */
					 /* if-ne v2, v0, :cond_7 */
					 /* array-length v0, p1 */
					 /* if-le v1, v0, :cond_0 */
					 /* new-array v0, v1, [B */
					 /* array-length v2, p1 */
					 java.lang.System .arraycopy ( p1,v3,v0,v3,v2 );
					 /* move-object p1, v0 */
				 } // :cond_0
				 /* array-length v0, p1 */
				 /* if-ge v1, v0, :cond_2 */
				 /* move v0, v1 */
			 } // :goto_1
			 java.lang.System .arraycopy ( p1,v3,v5,v6,v0 );
			 v1 = net.chobin.android.psdxylz.app.aj.a;
			 /* if-nez v1, :cond_1 */
			 /* new-array v1, v8, [I */
			 /* move v4, v3 */
		 } // :goto_2
		 /* if-lt v4, v8, :cond_3 */
	 } // :cond_1
	 int v1 = -1; // const/4 v1, -0x1
	 /* add-int v2, v6, v0 */
	 /* add-int/lit8 v0, v6, -0x4 */
	 /* move v9, v1 */
	 /* move v1, v0 */
	 /* move v0, v9 */
} // :goto_3
/* if-lt v1, v2, :cond_6 */
/* xor-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v2, v1, 0x1 */
/* ushr-int/lit8 v3, v0, 0x18 */
/* and-int/lit16 v3, v3, 0xff */
/* int-to-byte v3, v3 */
/* aput-byte v3, v5, v1 */
/* add-int/lit8 v1, v2, 0x1 */
/* ushr-int/lit8 v3, v0, 0x10 */
/* and-int/lit16 v3, v3, 0xff */
/* int-to-byte v3, v3 */
/* aput-byte v3, v5, v2 */
/* add-int/lit8 v2, v1, 0x1 */
/* ushr-int/lit8 v3, v0, 0x8 */
/* and-int/lit16 v3, v3, 0xff */
/* int-to-byte v3, v3 */
/* aput-byte v3, v5, v1 */
/* add-int/lit8 v1, v2, 0x1 */
/* ushr-int/lit8 v0, v0, 0x0 */
/* and-int/lit16 v0, v0, 0xff */
/* int-to-byte v0, v0 */
/* aput-byte v0, v5, v2 */
} // :cond_2
/* array-length v0, p1 */
} // :cond_3
/* move v2, v3 */
/* move v1, v4 */
} // :goto_4
/* const/16 v7, 0x8 */
/* if-lt v2, v7, :cond_4 */
v2 = net.chobin.android.psdxylz.app.aj.a;
/* aput v1, v2, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_4
/* and-int/lit8 v7, v1, 0x1 */
if ( v7 != null) { // if-eqz v7, :cond_5
/* ushr-int/lit8 v1, v1, 0x1 */
/* const v7, -0x12477ce0 */
/* xor-int/2addr v1, v7 */
} // :goto_5
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
/* ushr-int/lit8 v1, v1, 0x1 */
} // :cond_6
v3 = net.chobin.android.psdxylz.app.aj.a;
/* aget-byte v4, v5, v1 */
/* xor-int/2addr v4, v0 */
/* and-int/lit16 v4, v4, 0xff */
/* aget v3, v3, v4 */
/* ushr-int/lit8 v0, v0, 0x8 */
/* xor-int/2addr v0, v3 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
/* add-int/lit8 v0, v1, 0x4 */
/* add-int/2addr v0, v6 */
/* goto/16 :goto_0 */
} // .end method
