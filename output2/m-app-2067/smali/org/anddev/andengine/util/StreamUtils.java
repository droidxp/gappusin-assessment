public class org.anddev.andengine.util.StreamUtils {
	 /* # static fields */
	 public static final Integer IO_BUFFER_SIZE;
	 /* # direct methods */
	 public org.anddev.andengine.util.StreamUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void close ( java.io.Closeable p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 try { // :try_start_0
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 } // .end method
	 public static void copy ( java.io.InputStream p0, java.io.OutputStream p1 ) {
		 /* .locals 2 */
		 /* const-wide/16 v0, -0x1 */
		 org.anddev.andengine.util.StreamUtils .copy ( p0,p1,v0,v1 );
		 return;
	 } // .end method
	 public static void copy ( java.io.InputStream p0, java.io.OutputStream p1, Long p2 ) {
		 /* .locals 8 */
		 int v7 = -1; // const/4 v7, -0x1
		 int v6 = 0; // const/4 v6, 0x0
		 /* const/16 v0, 0x2000 */
		 /* new-array v0, v0, [B */
		 /* const-wide/16 v1, 0x0 */
		 /* cmp-long v1, p2, v1 */
		 /* if-gez v1, :cond_2 */
	 } // :goto_0
	 v1 = 	 (( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
	 /* if-ne v1, v7, :cond_1 */
} // :cond_0
} // :goto_1
(( java.io.OutputStream ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
return;
} // :cond_1
(( java.io.OutputStream ) p1 ).write ( v0, v6, v1 ); // invoke-virtual {p1, v0, v6, v1}, Ljava/io/OutputStream;->write([BII)V
} // :cond_2
/* move-wide v1, p2 */
} // :goto_2
v3 = (( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
/* if-eq v3, v7, :cond_0 */
/* int-to-long v4, v3 */
/* cmp-long v4, v1, v4 */
/* if-lez v4, :cond_3 */
(( java.io.OutputStream ) p1 ).write ( v0, v6, v3 ); // invoke-virtual {p1, v0, v6, v3}, Ljava/io/OutputStream;->write([BII)V
/* int-to-long v3, v3 */
/* sub-long/2addr v1, v3 */
} // :cond_3
/* long-to-int v1, v1 */
(( java.io.OutputStream ) p1 ).write ( v0, v6, v1 ); // invoke-virtual {p1, v0, v6, v1}, Ljava/io/OutputStream;->write([BII)V
} // .end method
public static Boolean copyAndClose ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 2 */
/* const-wide/16 v0, -0x1 */
try { // :try_start_0
org.anddev.andengine.util.StreamUtils .copy ( p0,p1,v0,v1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
org.anddev.andengine.util.StreamUtils .close ( p1 );
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
org.anddev.andengine.util.StreamUtils .close ( p1 );
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
org.anddev.andengine.util.StreamUtils .close ( p1 );
/* throw v0 */
} // .end method
public static void flushCloseStream ( java.io.OutputStream p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
try { // :try_start_0
(( java.io.OutputStream ) p0 ).flush ( ); // invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_1
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
/* :catchall_0 */
/* move-exception v0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
/* throw v0 */
} // .end method
public static void flushCloseWriter ( java.io.Writer p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
try { // :try_start_0
(( java.io.Writer ) p0 ).flush ( ); // invoke-virtual {p0}, Ljava/io/Writer;->flush()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_1
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
/* :catchall_0 */
/* move-exception v0 */
org.anddev.andengine.util.StreamUtils .close ( p0 );
/* throw v0 */
} // .end method
public static final java.lang.String readFully ( java.io.InputStream p0 ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* new-instance v1, Ljava/util/Scanner; */
/* invoke-direct {v1, p0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V */
} // :goto_0
v2 = (( java.util.Scanner ) v1 ).hasNextLine ( ); // invoke-virtual {v1}, Ljava/util/Scanner;->hasNextLine()Z
/* if-nez v2, :cond_0 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
(( java.util.Scanner ) v1 ).nextLine ( ); // invoke-virtual {v1}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
public static streamToBytes ( java.io.InputStream p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
org.anddev.andengine.util.StreamUtils .streamToBytes ( p0,v0 );
} // .end method
public static streamToBytes ( java.io.InputStream p0, Integer p1 ) {
/* .locals 3 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
int v1 = -1; // const/4 v1, -0x1
/* if-ne p1, v1, :cond_0 */
/* const/16 v1, 0x2000 */
} // :goto_0
/* invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
/* int-to-long v1, p1 */
org.anddev.andengine.util.StreamUtils .copy ( p0,v0,v1,v2 );
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // :cond_0
/* move v1, p1 */
} // .end method
