public class com.cont.tools.DeCode {
	 /* .source "DeCode.java" */
	 /* # static fields */
	 private static java.lang.String PSP;
	 private static java.util.Random rdm;
	 /* # direct methods */
	 static com.cont.tools.DeCode ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 33 */
		 final String v0 = "mxj49458"; // const-string v0, "mxj49458"
		 /* .line 34 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 return;
	 } // .end method
	 public com.cont.tools.DeCode ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static final bytesCombine ( Object[] p0, Object[] p1 ) {
		 /* .locals 4 */
		 /* .param p0, "a" # [B */
		 /* .param p1, "b" # [B */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 88 */
		 /* if-nez p0, :cond_1 */
		 /* if-nez p1, :cond_1 */
		 /* .line 89 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 97 */
	 } // .end local p1 # "b":[B
} // :cond_0
} // :goto_0
/* .line 90 */
/* .restart local p1 # "b":[B */
} // :cond_1
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 92 */
/* if-nez p1, :cond_2 */
/* move-object p1, p0 */
/* .line 93 */
/* .line 94 */
} // :cond_2
/* array-length v1, p0 */
/* array-length v2, p1 */
/* add-int/2addr v1, v2 */
/* new-array v0, v1, [B */
/* .line 95 */
/* .local v0, "c":[B */
/* array-length v1, p0 */
java.lang.System .arraycopy ( p0,v3,v0,v3,v1 );
/* .line 96 */
/* array-length v1, p0 */
/* array-length v2, p1 */
java.lang.System .arraycopy ( p1,v3,v0,v1,v2 );
/* move-object p1, v0 */
/* .line 97 */
} // .end method
public static decode ( Object[] p0, Object p1 ) {
/* .locals 3 */
/* .param p0, "bytes" # [B */
/* .param p1, "addType" # B */
/* .prologue */
/* .line 17 */
/* if-nez p0, :cond_0 */
/* .line 18 */
int v2 = 0; // const/4 v2, 0x0
/* .line 30 */
} // :goto_0
/* .line 20 */
} // :cond_0
/* const/16 v2, 0x10 */
com.cont.tools.DeCode .makeRantou ( v2 );
/* .line 21 */
/* .local v1, "mesTo":[B */
/* const/16 v2, 0xf */
/* aput-byte p1, v1, v2 */
/* .line 22 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne p1, v2, :cond_1 */
/* .line 24 */
try { // :try_start_0
v2 = com.cont.tools.DeCode.PSP;
(( java.lang.String ) v2 ).getBytes ( ); // invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
com.cont.tools.DESEncode .encrypt ( p0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 30 */
} // :cond_1
} // :goto_1
com.cont.tools.DeCode .bytesCombine ( v1,p0 );
/* .line 25 */
/* :catch_0 */
/* move-exception v0 */
/* .line 27 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static java.lang.String getExceptionMsg ( java.lang.Exception p0 ) {
/* .locals 5 */
/* .param p0, "e" # Ljava/lang/Exception; */
/* .prologue */
/* .line 176 */
int v2 = 0; // const/4 v2, 0x0
/* .line 177 */
/* .local v2, "stackInfo":Ljava/lang/String; */
(( java.lang.Exception ) p0 ).getStackTrace ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;
/* .line 178 */
/* .local v1, "stack":[Ljava/lang/StackTraceElement; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "exception:"; // const-string v4, "exception:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\r\n"; // const-string v4, "\r\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 179 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_0 */
/* .line 182 */
/* .line 180 */
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
/* .line 179 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static Integer getRandom ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "min" # I */
/* .param p1, "max" # I */
/* .prologue */
/* .line 101 */
v1 = com.cont.tools.DeCode.rdm;
v1 = (( java.util.Random ) v1 ).nextInt ( ); // invoke-virtual {v1}, Ljava/util/Random;->nextInt()I
v0 = java.lang.Math .abs ( v1 );
/* .line 102 */
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
/* .line 137 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v5 */
/* .line 138 */
/* .local v5, "t1":J */
/* if-nez p0, :cond_0 */
/* .line 139 */
int v2 = 0; // const/4 v2, 0x0
/* .line 165 */
} // :goto_0
/* .line 141 */
} // :cond_0
/* new-instance v3, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 142 */
/* .local v3, "byteArrayOutputStream":Ljava/io/ByteArrayOutputStream; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* .line 144 */
/* .local v7, "t2":J */
int v4 = 0; // const/4 v4, 0x0
/* .line 145 */
/* .local v4, "byteread":I */
/* const/16 v21, 0x400 */
/* move/from16 v0, v21 */
/* new-array v1, v0, [B */
/* .line 146 */
/* .local v1, "buffer":[B */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v9 */
/* .line 148 */
/* .local v9, "t3":J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v13 */
/* .line 149 */
/* .local v13, "t5":J */
} // :goto_1
/* move-object/from16 v0, p0 */
v4 = (( java.io.InputStream ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
/* const/16 v21, -0x1 */
/* move/from16 v0, v21 */
/* if-ne v4, v0, :cond_1 */
/* .line 156 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v15 */
/* .line 158 */
/* .local v15, "t6":J */
(( java.io.ByteArrayOutputStream ) v3 ).toByteArray ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 159 */
/* .local v2, "bys":[B */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v17 */
/* .line 161 */
/* .local v17, "t7":J */
(( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 162 */
/* invoke-virtual/range {p0 ..p0}, Ljava/io/InputStream;->close()V */
/* .line 163 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v19 */
/* .line 165 */
/* .local v19, "t8":J */
/* .line 150 */
} // .end local v2 # "bys":[B
} // .end local v15 # "t6":J
} // .end local v17 # "t7":J
} // .end local v19 # "t8":J
} // :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v11 */
/* .line 152 */
/* .local v11, "t4":J */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
(( java.io.ByteArrayOutputStream ) v3 ).write ( v1, v0, v4 ); // invoke-virtual {v3, v1, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 153 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v13 */
} // .end method
public static inputStreamToBytesztb ( java.io.InputStream p0 ) {
/* .locals 8 */
/* .param p0, "inStream" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 118 */
/* if-nez p0, :cond_0 */
/* .line 119 */
int v0 = 0; // const/4 v0, 0x0
/* .line 133 */
} // :goto_0
/* .line 121 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 122 */
/* .local v1, "count":I */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 127 */
/* new-array v0, v1, [B */
/* .line 128 */
/* .local v0, "buffer":[B */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* .line 129 */
/* .local v2, "t1":J */
(( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
/* .line 130 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 132 */
/* .local v4, "t2":J */
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 123 */
} // .end local v0 # "buffer":[B
} // .end local v2 # "t1":J
} // .end local v4 # "t2":J
} // :cond_1
v1 = (( java.io.InputStream ) p0 ).available ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->available()I
/* .line 125 */
/* const-wide/16 v6, 0xa */
java.lang.Thread .sleep ( v6,v7 );
} // .end method
public static Boolean iswxStr ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 170 */
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
/* .line 171 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 173 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static jbz ( Object[] p0 ) {
/* .locals 4 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* const/16 v3, 0x10 */
/* .line 37 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v2, p0 */
/* if-ge v2, v3, :cond_2 */
/* .line 38 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 52 */
/* .local v0, "addt":B */
} // :cond_1
} // :goto_0
/* .line 40 */
} // .end local v0 # "addt":B
} // :cond_2
/* const/16 v2, 0xf */
/* aget-byte v0, p0, v2 */
/* .line 41 */
/* .restart local v0 # "addt":B */
/* if-nez v0, :cond_3 */
/* .line 42 */
com.cont.tools.DeCode .qxxt ( p0,v3 );
/* .line 43 */
} // :cond_3
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_1 */
/* .line 44 */
com.cont.tools.DeCode .qxxt ( p0,v3 );
/* .line 46 */
try { // :try_start_0
v2 = com.cont.tools.DeCode.PSP;
(( java.lang.String ) v2 ).getBytes ( ); // invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
com.cont.tools.DESEncode .decrypt ( p0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 47 */
/* :catch_0 */
/* move-exception v1 */
/* .line 49 */
/* .local v1, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
private static jys ( Object[] p0 ) {
/* .locals 8 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 56 */
int v1 = 0; // const/4 v1, 0x0
/* .line 58 */
/* .local v1, "bytes1":[B */
try { // :try_start_0
/* new-instance v3, Ljava/util/zip/GZIPInputStream; */
/* new-instance v6, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v6, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* invoke-direct {v3, v6}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 59 */
/* .local v3, "gis":Ljava/util/zip/GZIPInputStream; */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 60 */
/* .local v0, "bos1":Ljava/io/ByteArrayOutputStream; */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 61 */
/* .local v2, "dos":Ljava/io/DataOutputStream; */
/* const/16 v6, 0x400 */
/* new-array v5, v6, [B */
/* .line 62 */
/* .local v5, "temp1":[B */
int v4 = 0; // const/4 v4, 0x0
/* .line 63 */
/* .local v4, "num1":I */
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
/* array-length v7, v5 */
v4 = (( java.util.zip.GZIPInputStream ) v3 ).read ( v5, v6, v7 ); // invoke-virtual {v3, v5, v6, v7}, Ljava/util/zip/GZIPInputStream;->read([BII)I
int v6 = -1; // const/4 v6, -0x1
/* if-ne v4, v6, :cond_0 */
/* .line 66 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 67 */
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
/* .line 68 */
(( java.util.zip.GZIPInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/util/zip/GZIPInputStream;->close()V
/* .line 73 */
} // .end local v0 # "bos1":Ljava/io/ByteArrayOutputStream;
} // .end local v2 # "dos":Ljava/io/DataOutputStream;
} // .end local v3 # "gis":Ljava/util/zip/GZIPInputStream;
} // .end local v4 # "num1":I
} // .end local v5 # "temp1":[B
} // :goto_1
/* .line 64 */
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
/* .line 69 */
} // .end local v0 # "bos1":Ljava/io/ByteArrayOutputStream;
} // .end local v2 # "dos":Ljava/io/DataOutputStream;
} // .end local v3 # "gis":Ljava/util/zip/GZIPInputStream;
} // .end local v4 # "num1":I
} // .end local v5 # "temp1":[B
/* :catch_0 */
/* move-exception v6 */
} // .end method
private static makeRantou ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "ws" # I */
/* .prologue */
/* .line 77 */
int v2 = -1; // const/4 v2, -0x1
/* if-le p0, v2, :cond_0 */
/* const/16 v2, 0x64 */
/* if-lt p0, v2, :cond_1 */
/* .line 78 */
} // :cond_0
/* const/16 p0, 0x10 */
/* .line 80 */
} // :cond_1
/* new-array v0, p0, [B */
/* .line 81 */
/* .local v0, "bytes":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, p0, :cond_2 */
/* .line 84 */
/* .line 82 */
} // :cond_2
/* const/16 v2, -0x80 */
/* const/16 v3, 0x7f */
v2 = com.cont.tools.DeCode .getRandom ( v2,v3 );
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 81 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
private static qxxt ( Object[] p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "bytes" # [B */
/* .param p1, "touleng" # I */
/* .prologue */
/* .line 108 */
/* array-length v2, p0 */
/* sub-int/2addr v2, p1 */
/* new-array v0, v2, [B */
/* .line 109 */
/* .local v0, "bytes_qdt":[B */
/* move v1, p1 */
/* .local v1, "i":I */
} // :goto_0
/* array-length v2, p0 */
/* if-lt v1, v2, :cond_0 */
/* .line 112 */
/* .line 110 */
} // :cond_0
/* sub-int v2, v1, p1 */
/* aget-byte v3, p0, v1 */
/* aput-byte v3, v0, v2 */
/* .line 109 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
