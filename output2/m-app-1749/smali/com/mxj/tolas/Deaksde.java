public class com.mxj.tolas.Deaksde {
	 /* .source "Deaksde.java" */
	 /* # static fields */
	 private static java.lang.String PSP;
	 private static java.util.Random rdm;
	 /* # direct methods */
	 static com.mxj.tolas.Deaksde ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 31 */
		 final String v0 = "mxj49459"; // const-string v0, "mxj49459"
		 /* .line 32 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 return;
	 } // .end method
	 public com.mxj.tolas.Deaksde ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static baoZask ( Object[] p0, Object p1 ) {
		 /* .locals 3 */
		 /* .param p0, "bytes" # [B */
		 /* .param p1, "bojiam" # B */
		 /* .prologue */
		 /* .line 15 */
		 /* if-nez p0, :cond_0 */
		 /* .line 16 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 28 */
	 } // :goto_0
	 /* .line 18 */
} // :cond_0
/* const/16 v2, 0x10 */
com.mxj.tolas.Deaksde .cssjt ( v2 );
/* .line 19 */
/* .local v1, "xxt":[B */
/* const/16 v2, 0xf */
/* aput-byte p1, v1, v2 */
/* .line 20 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne p1, v2, :cond_1 */
/* .line 22 */
try { // :try_start_0
	 v2 = com.mxj.tolas.Deaksde.PSP;
	 (( java.lang.String ) v2 ).getBytes ( ); // invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
	 com.mxj.tolas.DsgMse .encrypt ( p0,v2 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 28 */
} // :cond_1
} // :goto_1
com.mxj.tolas.Deaksde .bytesCombine ( v1,p0 );
/* .line 23 */
/* :catch_0 */
/* move-exception v0 */
/* .line 25 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static final bytesCombine ( Object[] p0, Object[] p1 ) {
/* .locals 4 */
/* .param p0, "a" # [B */
/* .param p1, "b" # [B */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 86 */
/* if-nez p0, :cond_1 */
/* if-nez p1, :cond_1 */
/* .line 87 */
int p1 = 0; // const/4 p1, 0x0
/* .line 95 */
} // .end local p1 # "b":[B
} // :cond_0
} // :goto_0
/* .line 88 */
/* .restart local p1 # "b":[B */
} // :cond_1
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 90 */
/* if-nez p1, :cond_2 */
/* move-object p1, p0 */
/* .line 91 */
/* .line 92 */
} // :cond_2
/* array-length v1, p0 */
/* array-length v2, p1 */
/* add-int/2addr v1, v2 */
/* new-array v0, v1, [B */
/* .line 93 */
/* .local v0, "c":[B */
/* array-length v1, p0 */
java.lang.System .arraycopy ( p0,v3,v0,v3,v1 );
/* .line 94 */
/* array-length v1, p0 */
/* array-length v2, p1 */
java.lang.System .arraycopy ( p1,v3,v0,v1,v2 );
/* move-object p1, v0 */
/* .line 95 */
} // .end method
private static cssjt ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "ws" # I */
/* .prologue */
/* .line 75 */
int v2 = -1; // const/4 v2, -0x1
/* if-le p0, v2, :cond_0 */
/* const/16 v2, 0x64 */
/* if-lt p0, v2, :cond_1 */
/* .line 76 */
} // :cond_0
/* const/16 p0, 0x10 */
/* .line 78 */
} // :cond_1
/* new-array v0, p0, [B */
/* .line 79 */
/* .local v0, "bytes":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, p0, :cond_2 */
/* .line 82 */
/* .line 80 */
} // :cond_2
/* const/16 v2, -0x80 */
/* const/16 v3, 0x7f */
v2 = com.mxj.tolas.Deaksde .getRandom ( v2,v3 );
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 79 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static java.lang.String getExceptionMsg ( java.lang.Exception p0 ) {
/* .locals 5 */
/* .param p0, "e" # Ljava/lang/Exception; */
/* .prologue */
/* .line 174 */
int v2 = 0; // const/4 v2, 0x0
/* .line 175 */
/* .local v2, "stackInfo":Ljava/lang/String; */
(( java.lang.Exception ) p0 ).getStackTrace ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;
/* .line 176 */
/* .local v1, "stack":[Ljava/lang/StackTraceElement; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "exception:"; // const-string v4, "exception:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\r\n"; // const-string v4, "\r\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 177 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_0 */
/* .line 180 */
/* .line 178 */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "\t\t"; // const-string v4, "\t\t"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v4, v1, v0 */
(( java.lang.StackTraceElement ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\r\n"; // const-string v4, "\r\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 177 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static Integer getRandom ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "min" # I */
/* .param p1, "max" # I */
/* .prologue */
/* .line 99 */
v1 = com.mxj.tolas.Deaksde.rdm;
v1 = (( java.util.Random ) v1 ).nextInt ( ); // invoke-virtual {v1}, Ljava/util/Random;->nextInt()I
v0 = java.lang.Math .abs ( v1 );
/* .line 100 */
/* .local v0, "r":I */
/* sub-int v1, p1, p0 */
/* add-int/lit8 v1, v1, 0x1 */
/* rem-int v1, v0, v1 */
/* add-int/2addr v1, p0 */
} // .end method
public static inputStreamToBytes ( java.io.InputStream p0 ) {
/* .locals 22 */
/* .param p0, "inStream" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/net/SocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 135 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v5 */
/* .line 136 */
/* .local v5, "t1":J */
/* if-nez p0, :cond_0 */
/* .line 137 */
int v2 = 0; // const/4 v2, 0x0
/* .line 163 */
} // :goto_0
/* .line 139 */
} // :cond_0
/* new-instance v3, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 140 */
/* .local v3, "byteArrayOutputStream":Ljava/io/ByteArrayOutputStream; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* .line 142 */
/* .local v7, "t2":J */
int v4 = 0; // const/4 v4, 0x0
/* .line 143 */
/* .local v4, "byteread":I */
/* const/16 v21, 0x400 */
/* move/from16 v0, v21 */
/* new-array v1, v0, [B */
/* .line 144 */
/* .local v1, "buffer":[B */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v9 */
/* .line 146 */
/* .local v9, "t3":J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v13 */
/* .line 147 */
/* .local v13, "t5":J */
} // :goto_1
/* move-object/from16 v0, p0 */
v4 = (( java.io.InputStream ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
/* const/16 v21, -0x1 */
/* move/from16 v0, v21 */
/* if-ne v4, v0, :cond_1 */
/* .line 154 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v15 */
/* .line 156 */
/* .local v15, "t6":J */
(( java.io.ByteArrayOutputStream ) v3 ).toByteArray ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 157 */
/* .local v2, "bys":[B */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v17 */
/* .line 159 */
/* .local v17, "t7":J */
(( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 160 */
/* invoke-virtual/range {p0 ..p0}, Ljava/io/InputStream;->close()V */
/* .line 161 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v19 */
/* .line 163 */
/* .local v19, "t8":J */
/* .line 148 */
} // .end local v2 # "bys":[B
} // .end local v15 # "t6":J
} // .end local v17 # "t7":J
} // .end local v19 # "t8":J
} // :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v11 */
/* .line 150 */
/* .local v11, "t4":J */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
(( java.io.ByteArrayOutputStream ) v3 ).write ( v1, v0, v4 ); // invoke-virtual {v3, v1, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 151 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v13 */
} // .end method
public static inputStreamToBytesZt ( java.io.InputStream p0 ) {
/* .locals 8 */
/* .param p0, "inStream" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 116 */
/* if-nez p0, :cond_0 */
/* .line 117 */
int v0 = 0; // const/4 v0, 0x0
/* .line 131 */
} // :goto_0
/* .line 119 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 120 */
/* .local v1, "count":I */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 125 */
/* new-array v0, v1, [B */
/* .line 126 */
/* .local v0, "buffer":[B */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* .line 127 */
/* .local v2, "t1":J */
(( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
/* .line 128 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 130 */
/* .local v4, "t2":J */
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 121 */
} // .end local v0 # "buffer":[B
} // .end local v2 # "t1":J
} // .end local v4 # "t2":J
} // :cond_1
v1 = (( java.io.InputStream ) p0 ).available ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->available()I
/* .line 123 */
/* const-wide/16 v6, 0xa */
java.lang.Thread .sleep ( v6,v7 );
} // .end method
public static Boolean isWx ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 168 */
if ( p0 != null) { // if-eqz p0, :cond_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_0 */
final String v0 = "null"; // const-string v0, "null"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = "000000000000000"; // const-string v0, "000000000000000"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 169 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 171 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static jbz ( Object[] p0 ) {
/* .locals 4 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* const/16 v3, 0x10 */
/* .line 35 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v2, p0 */
/* if-ge v2, v3, :cond_2 */
/* .line 36 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 50 */
/* .local v1, "jfms":B */
} // :cond_1
} // :goto_0
/* .line 38 */
} // .end local v1 # "jfms":B
} // :cond_2
/* const/16 v2, 0xf */
/* aget-byte v1, p0, v2 */
/* .line 39 */
/* .restart local v1 # "jfms":B */
/* if-nez v1, :cond_3 */
/* .line 40 */
com.mxj.tolas.Deaksde .qdxxt ( p0,v3 );
/* .line 41 */
} // :cond_3
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
/* .line 42 */
com.mxj.tolas.Deaksde .qdxxt ( p0,v3 );
/* .line 44 */
try { // :try_start_0
v2 = com.mxj.tolas.Deaksde.PSP;
(( java.lang.String ) v2 ).getBytes ( ); // invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
com.mxj.tolas.DsgMse .decrypt ( p0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 45 */
/* :catch_0 */
/* move-exception v0 */
/* .line 47 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
private static jys ( Object[] p0 ) {
/* .locals 8 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 54 */
int v1 = 0; // const/4 v1, 0x0
/* .line 56 */
/* .local v1, "bytes1":[B */
try { // :try_start_0
/* new-instance v3, Ljava/util/zip/GZIPInputStream; */
/* new-instance v6, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v6, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* invoke-direct {v3, v6}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 57 */
/* .local v3, "gis":Ljava/util/zip/GZIPInputStream; */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 58 */
/* .local v0, "bos1":Ljava/io/ByteArrayOutputStream; */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 59 */
/* .local v2, "dos":Ljava/io/DataOutputStream; */
/* const/16 v6, 0x400 */
/* new-array v5, v6, [B */
/* .line 60 */
/* .local v5, "temp1":[B */
int v4 = 0; // const/4 v4, 0x0
/* .line 61 */
/* .local v4, "num1":I */
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
/* array-length v7, v5 */
v4 = (( java.util.zip.GZIPInputStream ) v3 ).read ( v5, v6, v7 ); // invoke-virtual {v3, v5, v6, v7}, Ljava/util/zip/GZIPInputStream;->read([BII)I
int v6 = -1; // const/4 v6, -0x1
/* if-ne v4, v6, :cond_0 */
/* .line 64 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 65 */
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
/* .line 66 */
(( java.util.zip.GZIPInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/util/zip/GZIPInputStream;->close()V
/* .line 71 */
} // .end local v0 # "bos1":Ljava/io/ByteArrayOutputStream;
} // .end local v2 # "dos":Ljava/io/DataOutputStream;
} // .end local v3 # "gis":Ljava/util/zip/GZIPInputStream;
} // .end local v4 # "num1":I
} // .end local v5 # "temp1":[B
} // :goto_1
/* .line 62 */
/* .restart local v0 # "bos1":Ljava/io/ByteArrayOutputStream; */
/* .restart local v2 # "dos":Ljava/io/DataOutputStream; */
/* .restart local v3 # "gis":Ljava/util/zip/GZIPInputStream; */
/* .restart local v4 # "num1":I */
/* .restart local v5 # "temp1":[B */
} // :cond_0
int v6 = 0; // const/4 v6, 0x0
(( java.io.DataOutputStream ) v2 ).write ( v5, v6, v4 ); // invoke-virtual {v2, v5, v6, v4}, Ljava/io/DataOutputStream;->write([BII)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 67 */
} // .end local v0 # "bos1":Ljava/io/ByteArrayOutputStream;
} // .end local v2 # "dos":Ljava/io/DataOutputStream;
} // .end local v3 # "gis":Ljava/util/zip/GZIPInputStream;
} // .end local v4 # "num1":I
} // .end local v5 # "temp1":[B
/* :catch_0 */
/* move-exception v6 */
} // .end method
private static qdxxt ( Object[] p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "bytes" # [B */
/* .param p1, "tld" # I */
/* .prologue */
/* .line 106 */
/* array-length v2, p0 */
/* sub-int/2addr v2, p1 */
/* new-array v0, v2, [B */
/* .line 107 */
/* .local v0, "bytes_td":[B */
/* move v1, p1 */
/* .local v1, "i":I */
} // :goto_0
/* array-length v2, p0 */
/* if-lt v1, v2, :cond_0 */
/* .line 110 */
/* .line 108 */
} // :cond_0
/* sub-int v2, v1, p1 */
/* aget-byte v3, p0, v1 */
/* aput-byte v3, v0, v2 */
/* .line 107 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
