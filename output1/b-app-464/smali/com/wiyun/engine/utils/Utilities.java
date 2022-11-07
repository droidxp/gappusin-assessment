public class com.wiyun.engine.utils.Utilities {
	 /* # static fields */
	 private static final java.util.Random sRandom;
	 /* # direct methods */
	 static com.wiyun.engine.utils.Utilities ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 return;
	 } // .end method
	 public com.wiyun.engine.utils.Utilities ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Float d2r ( Float p0 ) {
		 /* .locals 2 */
		 /* const/high16 v0, 0x43340000 # 180.0f */
		 /* div-float v0, p0, v0 */
		 /* const v1, 0x40490fdb # (float)Math.PI */
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 public static dataOfFile ( java.io.File p0 ) {
		 /* .locals 7 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 try { // :try_start_0
			 /* new-instance v1, Ljava/io/FileInputStream; */
			 /* invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* const/16 v3, 0x400 */
			 try { // :try_start_1
				 /* new-array v3, v3, [B */
				 /* new-instance v4, Ljava/io/ByteArrayOutputStream; */
				 /* invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V */
			 } // :goto_0
			 int v5 = -1; // const/4 v5, -0x1
			 /* if-ne v2, v5, :cond_1 */
			 (( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
			 (( java.io.ByteArrayOutputStream ) v4 ).flush ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->flush()V
			 (( java.io.ByteArrayOutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_4 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
			 try { // :try_start_2
				 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
				 /* :try_end_2 */
				 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_3 */
			 } // :cond_0
		 } // :goto_1
	 } // :cond_1
	 int v5 = 0; // const/4 v5, 0x0
	 try { // :try_start_3
		 (( java.io.ByteArrayOutputStream ) v4 ).write ( v3, v5, v2 ); // invoke-virtual {v4, v3, v5, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
		 (( java.io.InputStream ) v1 ).read ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I
		 /* :try_end_3 */
		 /* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_4 */
		 v2 = 		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 /* move-object v1, v0 */
	 } // :goto_2
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 try { // :try_start_4
			 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
			 /* :try_end_4 */
			 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
			 /* :catch_1 */
			 /* move-exception v1 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* move-object v6, v1 */
			 /* move-object v1, v0 */
			 /* move-object v0, v6 */
		 } // :goto_3
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 try { // :try_start_5
				 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
				 /* :try_end_5 */
				 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
			 } // :cond_2
		 } // :goto_4
		 /* throw v0 */
		 /* :catch_2 */
		 /* move-exception v1 */
		 /* :catch_3 */
		 /* move-exception v1 */
		 /* :catchall_1 */
		 /* move-exception v0 */
		 /* :catch_4 */
		 /* move-exception v2 */
	 } // .end method
	 public static dataOfRawResource ( android.content.Context p0, Integer p1 ) {
		 /* .locals 7 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) v1 ).openRawResource ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* const/16 v3, 0x400 */
			 try { // :try_start_1
				 /* new-array v3, v3, [B */
				 /* new-instance v4, Ljava/io/ByteArrayOutputStream; */
				 /* invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V */
			 } // :goto_0
			 int v5 = -1; // const/4 v5, -0x1
			 /* if-ne v2, v5, :cond_1 */
			 (( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
			 (( java.io.ByteArrayOutputStream ) v4 ).flush ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->flush()V
			 (( java.io.ByteArrayOutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_4 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 try { // :try_start_2
					 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
					 /* :try_end_2 */
					 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_3 */
				 } // :cond_0
			 } // :goto_1
		 } // :cond_1
		 int v5 = 0; // const/4 v5, 0x0
		 try { // :try_start_3
			 (( java.io.ByteArrayOutputStream ) v4 ).write ( v3, v5, v2 ); // invoke-virtual {v4, v3, v5, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
			 (( java.io.InputStream ) v1 ).read ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I
			 /* :try_end_3 */
			 /* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_4 */
			 v2 = 			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* move-object v1, v0 */
		 } // :goto_2
		 try { // :try_start_4
			 final String v2 = "libwiengine"; // const-string v2, "libwiengine"
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 final String v4 = "Can\'t read the raw resource: "; // const-string v4, "Can\'t read the raw resource: "
			 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .e ( v2,v3 );
			 /* :try_end_4 */
			 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 try { // :try_start_5
					 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
					 /* :try_end_5 */
					 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_1 */
					 /* :catch_1 */
					 /* move-exception v1 */
					 /* :catchall_0 */
					 /* move-exception v1 */
					 /* move-object v6, v1 */
					 /* move-object v1, v0 */
					 /* move-object v0, v6 */
				 } // :goto_3
				 if ( v1 != null) { // if-eqz v1, :cond_2
					 try { // :try_start_6
						 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
						 /* :try_end_6 */
						 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_2 */
					 } // :cond_2
				 } // :goto_4
				 /* throw v0 */
				 /* :catch_2 */
				 /* move-exception v1 */
				 /* :catch_3 */
				 /* move-exception v1 */
				 /* :catchall_1 */
				 /* move-exception v0 */
				 /* :catch_4 */
				 /* move-exception v2 */
			 } // .end method
			 public static java.lang.String getFileNameWithoutExt ( java.lang.String p0 ) {
				 /* .locals 2 */
				 /* const/16 v0, 0x2e */
				 v0 = 				 (( java.lang.String ) p0 ).lastIndexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I
				 int v1 = -1; // const/4 v1, -0x1
				 /* if-eq v0, v1, :cond_0 */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 int v1 = 0; // const/4 v1, 0x0
					 (( java.lang.String ) p0 ).substring ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
				 } // :cond_0
			 } // .end method
			 public static Float getFloat ( java.lang.String p0 ) {
				 /* .locals 2 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* if-nez p0, :cond_0 */
			 } // :goto_0
		 } // :cond_0
		 try { // :try_start_0
			 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
			 java.lang.Float .parseFloat ( v1 );
			 /* :try_end_0 */
			 v0 = 			 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
		 } // .end method
		 public static Float getFloat ( java.lang.String p0, Float p1 ) {
			 /* .locals 1 */
			 /* if-nez p0, :cond_0 */
		 } // :goto_0
	 } // :cond_0
	 try { // :try_start_0
		 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
		 java.lang.Float .parseFloat ( v0 );
		 /* :try_end_0 */
		 p1 = 		 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public static Integer getInt ( Integer p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 com.wiyun.engine.utils.Utilities .getInt ( p0,p1,v0 );
	 } // .end method
	 public static Integer getInt ( Integer p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 2 */
		 /* if-nez p1, :cond_0 */
	 } // :goto_0
} // :cond_0
try { // :try_start_0
	 (( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
	 java.lang.Long .parseLong ( v0,p0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* move-result-wide v0 */
	 /* long-to-int p2, v0 */
	 /* :catch_0 */
	 /* move-exception v0 */
} // .end method
public static Integer getInt ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* const/16 v0, 0xa */
	 v0 = 	 com.wiyun.engine.utils.Utilities .getInt ( v0,p0 );
} // .end method
public static Integer getInt ( java.lang.String p0, Integer p1 ) {
	 /* .locals 1 */
	 /* const/16 v0, 0xa */
	 v0 = 	 com.wiyun.engine.utils.Utilities .getInt ( v0,p0,p1 );
} // .end method
public static Long getLong ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* const-wide/16 v0, 0x0 */
	 /* if-nez p0, :cond_0 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Long .parseLong ( v2 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v0 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
public static Integer getNextPOT ( Integer p0 ) {
/* .locals 2 */
/* add-int/lit8 v0, p0, -0x1 */
/* shr-int/lit8 v1, v0, 0x1 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x2 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x4 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x8 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x10 */
/* or-int/2addr v0, v1 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static java.lang.String getUTF8String ( Object[] p0 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
final String v0 = ""; // const-string v0, ""
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.wiyun.engine.utils.Utilities .getUTF8String ( p0,v0,v1 );
} // .end method
public static java.lang.String getUTF8String ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
final String v0 = ""; // const-string v0, ""
} // :goto_0
} // :cond_0
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
/* invoke-direct {v0, p0, p1, p2, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v0 = ""; // const-string v0, ""
} // .end method
public static com.wiyun.engine.utils.BitmapRawData loadImage ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapRawData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapRawData;-><init>()V */
com.wiyun.engine.utils.Utilities .nativeloadImage ( p0,v0 );
} // .end method
public static com.wiyun.engine.utils.BitmapRawData loadImage ( java.lang.String p0, Boolean p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapRawData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapRawData;-><init>()V */
com.wiyun.engine.utils.Utilities .nativeloadImage ( p0,p1,v0 );
} // .end method
private static native void nativeloadImage ( Integer p0, com.wiyun.engine.utils.BitmapRawData p1 ) {
} // .end method
private static native void nativeloadImage ( java.lang.String p0, Boolean p1, com.wiyun.engine.utils.BitmapRawData p2 ) {
} // .end method
public static Float r2d ( Float p0 ) {
/* .locals 2 */
/* const v0, 0x40490fdb # (float)Math.PI */
/* div-float v0, p0, v0 */
/* const/high16 v1, 0x43340000 # 180.0f */
/* mul-float/2addr v0, v1 */
} // .end method
public static Integer rand ( Integer p0 ) {
/* .locals 1 */
v0 = com.wiyun.engine.utils.Utilities.sRandom;
v0 = (( java.util.Random ) v0 ).nextInt ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I
} // .end method
public static Float randMinusOneToOne ( ) {
/* .locals 2 */
java.lang.Math .random ( );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* mul-float/2addr v0, v1 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, v1 */
} // .end method
public static Float randZeroToOne ( ) {
/* .locals 2 */
java.lang.Math .random ( );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static void swap ( Float[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* aget v0, p0, p1 */
/* aget v1, p0, p2 */
/* aput v1, p0, p1 */
/* aput v0, p0, p2 */
return;
} // .end method
