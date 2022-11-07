public class com.umeng.common.util.f {
	 /* .source "DeflaterHelper.java" */
	 /* # static fields */
	 public static Integer a;
	 /* # direct methods */
	 public com.umeng.common.util.f ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/UnsupportedEncodingException;, */
		 /* Ljava/util/zip/DataFormatException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 60 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* array-length v0, p0 */
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 71 */
} // :goto_0
/* .line 61 */
} // :cond_1
/* new-instance v0, Ljava/util/zip/Inflater; */
/* invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V */
/* .line 62 */
/* const/16 v1, 0x64 */
/* new-array v1, v1, [B */
/* .line 63 */
/* array-length v2, p0 */
(( java.util.zip.Inflater ) v0 ).setInput ( p0, v5, v2 ); // invoke-virtual {v0, p0, v5, v2}, Ljava/util/zip/Inflater;->setInput([BII)V
/* .line 64 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 66 */
} // :goto_1
v3 = (( java.util.zip.Inflater ) v0 ).needsInput ( ); // invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 70 */
(( java.util.zip.Inflater ) v0 ).end ( ); // invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V
/* .line 71 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 67 */
} // :cond_2
v3 = (( java.util.zip.Inflater ) v0 ).inflate ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/zip/Inflater;->inflate([B)I
/* .line 68 */
/* new-instance v4, Ljava/lang/String; */
/* invoke-direct {v4, v1, v5, v3, p1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
public static a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 27 */
v1 = com.umeng.common.util.h .d ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 47 */
} // :goto_0
/* .line 28 */
} // :cond_0
/* new-instance v2, Ljava/util/zip/Deflater; */
/* invoke-direct {v2}, Ljava/util/zip/Deflater;-><init>()V */
/* .line 29 */
(( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
(( java.util.zip.Deflater ) v2 ).setInput ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/zip/Deflater;->setInput([B)V
/* .line 30 */
(( java.util.zip.Deflater ) v2 ).finish ( ); // invoke-virtual {v2}, Ljava/util/zip/Deflater;->finish()V
/* .line 32 */
/* const/16 v1, 0x2000 */
/* new-array v3, v1, [B */
/* .line 33 */
/* .line 36 */
try { // :try_start_0
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 37 */
} // :goto_1
try { // :try_start_1
v0 = (( java.util.zip.Deflater ) v2 ).finished ( ); // invoke-virtual {v2}, Ljava/util/zip/Deflater;->finished()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 42 */
(( java.util.zip.Deflater ) v2 ).end ( ); // invoke-virtual {v2}, Ljava/util/zip/Deflater;->end()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 44 */
if ( v1 != null) { // if-eqz v1, :cond_1
(( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 46 */
} // :cond_1
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 38 */
} // :cond_2
try { // :try_start_2
v0 = (( java.util.zip.Deflater ) v2 ).deflate ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/zip/Deflater;->deflate([B)I
/* .line 39 */
/* add-int/2addr v4, v0 */
/* .line 40 */
int v4 = 0; // const/4 v4, 0x0
(( java.io.ByteArrayOutputStream ) v1 ).write ( v3, v4, v0 ); // invoke-virtual {v1, v3, v4, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 43 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 44 */
} // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_3
(( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 45 */
} // :cond_3
/* throw v0 */
/* .line 43 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v5, v1 */
/* move-object v1, v0 */
/* move-object v0, v5 */
} // .end method
