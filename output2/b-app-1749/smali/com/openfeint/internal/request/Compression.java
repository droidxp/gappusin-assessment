public class com.openfeint.internal.request.Compression {
	 /* .source "Compression.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/request/Compression$1;, */
	 /* Lcom/openfeint/internal/request/Compression$CompressionMethod; */
	 /* } */
} // .end annotation
/* # static fields */
private static final MagicHeader;
private static java.lang.String TAG;
/* # direct methods */
static com.openfeint.internal.request.Compression ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 16 */
	 final String v0 = "Compression"; // const-string v0, "Compression"
	 /* .line 90 */
	 final String v0 = "OFZLHDR0"; // const-string v0, "OFZLHDR0"
	 (( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
	 return;
} // .end method
public com.openfeint.internal.request.Compression ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 14 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
private static _compress ( Object[] p0 ) {
	 /* .locals 3 */
	 /* .param p0, "data" # [B */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 110 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 111 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
/* new-instance v1, Ljava/util/zip/DeflaterOutputStream; */
/* invoke-direct {v1, v0}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 113 */
/* .local v1, "dos":Ljava/util/zip/DeflaterOutputStream; */
(( java.util.zip.DeflaterOutputStream ) v1 ).write ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/zip/DeflaterOutputStream;->write([B)V
/* .line 114 */
(( java.util.zip.DeflaterOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/util/zip/DeflaterOutputStream;->close()V
/* .line 115 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // .end method
public static compress ( Object[] p0 ) {
/* .locals 12 */
/* .param p0, "uncompressedData" # [B */
/* .prologue */
/* const/high16 v11, 0x42c80000 # 100.0f */
/* .line 19 */
/* move-object v4, p0 */
/* .line 22 */
/* .local v4, "uploadData":[B */
try { // :try_start_0
	 v5 = com.openfeint.internal.request.Compression$1.$SwitchMap$com$openfeint$internal$request$Compression$CompressionMethod;
	 com.openfeint.internal.request.Compression .compressionMethod ( );
	 v6 = 	 (( com.openfeint.internal.request.Compression$CompressionMethod ) v6 ).ordinal ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/request/Compression$CompressionMethod;->ordinal()I
	 /* aget v5, v5, v6 */
	 /* packed-switch v5, :pswitch_data_0 */
	 /* .line 45 */
	 v5 = com.openfeint.internal.request.Compression.TAG;
	 final String v6 = "Using Uncompressed strategy"; // const-string v6, "Using Uncompressed strategy"
	 com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
} // :goto_0
/* move-object v5, v4 */
/* .line 52 */
} // :goto_1
/* .line 25 */
/* :pswitch_0 */
com.openfeint.internal.request.Compression ._compress ( p0 );
/* .line 26 */
/* .local v2, "tenativeData":[B */
/* array-length v5, p0 */
com.openfeint.internal.request.Compression .integerToLittleEndianByteArray ( v5 );
/* .line 27 */
/* .local v3, "uncompressedSize":[B */
/* array-length v5, v2 */
v6 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v6, v6 */
/* add-int/2addr v5, v6 */
/* array-length v6, v3 */
/* add-int v0, v5, v6 */
/* .line 28 */
/* .local v0, "compressedLength":I */
/* array-length v5, p0 */
/* if-ge v0, v5, :cond_0 */
/* .line 29 */
/* new-array v4, v0, [B */
/* .line 30 */
v5 = com.openfeint.internal.request.Compression.MagicHeader;
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
v8 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v8, v8 */
java.lang.System .arraycopy ( v5,v6,v4,v7,v8 );
/* .line 31 */
int v5 = 0; // const/4 v5, 0x0
v6 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v6, v6 */
/* array-length v7, v3 */
java.lang.System .arraycopy ( v3,v5,v4,v6,v7 );
/* .line 32 */
int v5 = 0; // const/4 v5, 0x0
v6 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v6, v6 */
/* add-int/lit8 v6, v6, 0x4 */
/* array-length v7, v2 */
java.lang.System .arraycopy ( v2,v5,v4,v6,v7 );
/* .line 33 */
v5 = com.openfeint.internal.request.Compression.TAG;
final String v6 = "Using Default strategy: orig %d bytes, compressed %d bytes (%.2f%% of original size)"; // const-string v6, "Using Default strategy: orig %d bytes, compressed %d bytes (%.2f%% of original size)"
int v7 = 3; // const/4 v7, 0x3
/* new-array v7, v7, [Ljava/lang/Object; */
int v8 = 0; // const/4 v8, 0x0
/* array-length v9, p0 */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
int v8 = 1; // const/4 v8, 0x1
java.lang.Integer .valueOf ( v0 );
/* aput-object v9, v7, v8 */
int v8 = 2; // const/4 v8, 0x2
/* int-to-float v9, v0 */
/* array-length v10, p0 */
/* int-to-float v10, v10 */
/* div-float/2addr v9, v10 */
/* mul-float/2addr v9, v11 */
java.lang.Float .valueOf ( v9 );
/* aput-object v9, v7, v8 */
java.lang.String .format ( v6,v7 );
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 48 */
} // .end local v0 # "compressedLength":I
} // .end local v2 # "tenativeData":[B
} // .end local v3 # "uncompressedSize":[B
/* :catch_0 */
/* move-exception v1 */
/* .line 49 */
/* .local v1, "e":Ljava/io/IOException; */
int v5 = 0; // const/4 v5, 0x0
/* .line 35 */
} // .end local v1 # "e":Ljava/io/IOException;
/* .restart local v0 # "compressedLength":I */
/* .restart local v2 # "tenativeData":[B */
/* .restart local v3 # "uncompressedSize":[B */
} // :cond_0
v5 = com.openfeint.internal.request.Compression.TAG;
final String v6 = "Using Default strategy: compression declined"; // const-string v6, "Using Default strategy: compression declined"
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 40 */
} // .end local v0 # "compressedLength":I
} // .end local v2 # "tenativeData":[B
} // .end local v3 # "uncompressedSize":[B
/* :pswitch_1 */
com.openfeint.internal.request.Compression ._compress ( p0 );
/* .line 41 */
v5 = com.openfeint.internal.request.Compression.TAG;
final String v6 = "Using Default strategy: orig %d bytes, compressed %d bytes (%.2f%% of original size)"; // const-string v6, "Using Default strategy: orig %d bytes, compressed %d bytes (%.2f%% of original size)"
int v7 = 3; // const/4 v7, 0x3
/* new-array v7, v7, [Ljava/lang/Object; */
int v8 = 0; // const/4 v8, 0x0
/* array-length v9, p0 */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
int v8 = 1; // const/4 v8, 0x1
/* array-length v9, v4 */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
int v8 = 2; // const/4 v8, 0x2
/* array-length v9, v4 */
/* int-to-float v9, v9 */
/* array-length v10, p0 */
/* int-to-float v10, v10 */
/* div-float/2addr v9, v10 */
/* mul-float/2addr v9, v11 */
java.lang.Float .valueOf ( v9 );
/* aput-object v9, v7, v8 */
java.lang.String .format ( v6,v7 );
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* .line 22 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
private static com.openfeint.internal.request.Compression$CompressionMethod compressionMethod ( ) {
/* .locals 3 */
/* .prologue */
/* .line 99 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getSettings ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getSettings()Ljava/util/Map;
final String v2 = "SettingCloudStorageCompressionStrategy"; // const-string v2, "SettingCloudStorageCompressionStrategy"
/* check-cast v0, Ljava/lang/String; */
/* .line 100 */
/* .local v0, "s":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 101 */
final String v1 = "CloudStorageCompressionStrategyLegacyHeaderlessCompression"; // const-string v1, "CloudStorageCompressionStrategyLegacyHeaderlessCompression"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 102 */
v1 = com.openfeint.internal.request.Compression$CompressionMethod.LegacyHeaderless;
/* .line 106 */
} // :goto_0
/* .line 103 */
} // :cond_0
final String v1 = "CloudStorageCompressionStrategyNoCompression"; // const-string v1, "CloudStorageCompressionStrategyNoCompression"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 104 */
v1 = com.openfeint.internal.request.Compression$CompressionMethod.Uncompressed;
/* .line 106 */
} // :cond_1
v1 = com.openfeint.internal.request.Compression$CompressionMethod.Default;
} // .end method
public static decompress ( Object[] p0 ) {
/* .locals 6 */
/* .param p0, "body" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 56 */
v4 = com.openfeint.internal.request.Compression$1.$SwitchMap$com$openfeint$internal$request$Compression$CompressionMethod;
com.openfeint.internal.request.Compression .compressionMethod ( );
v5 = (( com.openfeint.internal.request.Compression$CompressionMethod ) v5 ).ordinal ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/request/Compression$CompressionMethod;->ordinal()I
/* aget v4, v4, v5 */
/* packed-switch v4, :pswitch_data_0 */
/* .line 87 */
} // :cond_0
} // :goto_0
/* .line 59 */
/* :pswitch_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 60 */
/* .local v1, "i":I */
v4 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v4, v4 */
/* array-length v5, p0 */
/* if-ge v4, v5, :cond_1 */
/* .line 61 */
} // :goto_1
v4 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v4, v4 */
/* if-ge v1, v4, :cond_1 */
/* .line 62 */
v4 = com.openfeint.internal.request.Compression.MagicHeader;
/* aget-byte v4, v4, v1 */
/* aget-byte v5, p0, v1 */
/* if-eq v4, v5, :cond_2 */
/* .line 67 */
} // :cond_1
v4 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v4, v4 */
/* if-ne v1, v4, :cond_0 */
/* .line 69 */
v4 = com.openfeint.internal.request.Compression.MagicHeader;
/* array-length v4, v4 */
/* add-int/lit8 v3, v4, 0x4 */
/* .line 70 */
/* .local v3, "skip":I */
/* new-instance v2, Ljava/io/ByteArrayInputStream; */
/* array-length v4, p0 */
/* sub-int/2addr v4, v3 */
/* invoke-direct {v2, p0, v3, v4}, Ljava/io/ByteArrayInputStream;-><init>([BII)V */
/* .line 73 */
/* .local v2, "postHeaderStream":Ljava/io/ByteArrayInputStream; */
/* new-instance v0, Ljava/util/zip/InflaterInputStream; */
/* invoke-direct {v0, v2}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 74 */
/* .local v0, "decompressedStream":Ljava/io/InputStream; */
com.openfeint.internal.Util .toByteArray ( v0 );
/* .line 61 */
} // .end local v0 # "decompressedStream":Ljava/io/InputStream;
} // .end local v2 # "postHeaderStream":Ljava/io/ByteArrayInputStream;
} // .end local v3 # "skip":I
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 80 */
} // .end local v1 # "i":I
/* :pswitch_1 */
/* new-instance v4, Ljava/util/zip/InflaterInputStream; */
/* new-instance v5, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v5, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* invoke-direct {v4, v5}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V */
com.openfeint.internal.Util .toByteArray ( v4 );
/* .line 81 */
/* .line 56 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
private static integerToLittleEndianByteArray ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "i" # I */
/* .prologue */
/* .line 120 */
int v1 = 4; // const/4 v1, 0x4
/* new-array v0, v1, [B */
/* .line 121 */
/* .local v0, "rv":[B */
int v1 = 0; // const/4 v1, 0x0
/* shr-int/lit8 v2, p0, 0x0 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 122 */
int v1 = 1; // const/4 v1, 0x1
/* shr-int/lit8 v2, p0, 0x8 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 123 */
int v1 = 2; // const/4 v1, 0x2
/* shr-int/lit8 v2, p0, 0x10 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 124 */
int v1 = 3; // const/4 v1, 0x3
/* shr-int/lit8 v2, p0, 0x18 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 125 */
} // .end method
