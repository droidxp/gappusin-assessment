public class com.wiyun.engine.utils.Utilities {
	 /* .source "Utilities.java" */
	 /* # static fields */
	 private static final java.util.Random sRandom;
	 /* # direct methods */
	 static com.wiyun.engine.utils.Utilities ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 21 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public com.wiyun.engine.utils.Utilities ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Float d2r ( Float p0 ) {
		 /* .locals 2 */
		 /* .param p0, "angle" # F */
		 /* .prologue */
		 /* .line 48 */
		 /* const/high16 v0, 0x43340000 # 180.0f */
		 /* div-float v0, p0, v0 */
		 /* const v1, 0x40490fdb # (float)Math.PI */
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 public static dataOfFile ( java.io.File p0 ) {
		 /* .locals 8 */
		 /* .param p0, "file" # Ljava/io/File; */
		 /* .prologue */
		 /* .line 192 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 193 */
		 /* .local v3, "in":Ljava/io/InputStream; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* check-cast v1, [B */
		 /* .line 197 */
		 /* .local v1, "bytes":[B */
		 try { // :try_start_0
			 /* new-instance v4, Ljava/io/FileInputStream; */
			 /* invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 200 */
		 } // .end local v3 # "in":Ljava/io/InputStream;
		 /* .local v4, "in":Ljava/io/InputStream; */
		 /* const/16 v6, 0x400 */
		 try { // :try_start_1
			 /* new-array v0, v6, [B */
			 /* .line 201 */
			 /* .local v0, "buf":[B */
			 /* new-instance v5, Ljava/io/ByteArrayOutputStream; */
			 /* invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V */
			 /* .line 202 */
			 /* .local v5, "out":Ljava/io/ByteArrayOutputStream; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .local v2, "i":I */
		 } // :goto_0
		 int v6 = -1; // const/4 v6, -0x1
		 /* if-ne v2, v6, :cond_1 */
		 /* .line 207 */
		 (( java.io.ByteArrayOutputStream ) v5 ).toByteArray ( ); // invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
		 /* .line 210 */
		 (( java.io.ByteArrayOutputStream ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->flush()V
		 /* .line 211 */
		 (( java.io.ByteArrayOutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_4 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
		 /* .line 215 */
		 if ( v4 != null) { // if-eqz v4, :cond_3
			 /* .line 216 */
			 try { // :try_start_2
				 (( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
				 /* :try_end_2 */
				 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
				 /* move-object v3, v4 */
				 /* .line 221 */
			 } // .end local v0 # "buf":[B
		 } // .end local v2 # "i":I
	 } // .end local v4 # "in":Ljava/io/InputStream;
} // .end local v5 # "out":Ljava/io/ByteArrayOutputStream;
/* .restart local v3 # "in":Ljava/io/InputStream; */
} // :cond_0
} // :goto_1
/* .line 203 */
} // .end local v3 # "in":Ljava/io/InputStream;
/* .restart local v0 # "buf":[B */
/* .restart local v2 # "i":I */
/* .restart local v4 # "in":Ljava/io/InputStream; */
/* .restart local v5 # "out":Ljava/io/ByteArrayOutputStream; */
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_3
(( java.io.ByteArrayOutputStream ) v5 ).write ( v0, v6, v2 ); // invoke-virtual {v5, v0, v6, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 202 */
(( java.io.InputStream ) v4 ).read ( v0 ); // invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_4 */
v2 = /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 212 */
} // .end local v0 # "buf":[B
} // .end local v2 # "i":I
} // .end local v4 # "in":Ljava/io/InputStream;
} // .end local v5 # "out":Ljava/io/ByteArrayOutputStream;
/* .restart local v3 # "in":Ljava/io/InputStream; */
/* :catch_0 */
/* move-exception v6 */
/* .line 215 */
} // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 216 */
try { // :try_start_4
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 218 */
/* :catch_1 */
/* move-exception v6 */
/* .line 213 */
/* :catchall_0 */
/* move-exception v6 */
/* .line 215 */
} // :goto_3
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 216 */
try { // :try_start_5
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_3 */
/* .line 220 */
} // :cond_2
} // :goto_4
/* throw v6 */
/* .line 218 */
} // .end local v3 # "in":Ljava/io/InputStream;
/* .restart local v0 # "buf":[B */
/* .restart local v2 # "i":I */
/* .restart local v4 # "in":Ljava/io/InputStream; */
/* .restart local v5 # "out":Ljava/io/ByteArrayOutputStream; */
/* :catch_2 */
/* move-exception v6 */
/* move-object v3, v4 */
} // .end local v4 # "in":Ljava/io/InputStream;
/* .restart local v3 # "in":Ljava/io/InputStream; */
} // .end local v0 # "buf":[B
} // .end local v2 # "i":I
} // .end local v5 # "out":Ljava/io/ByteArrayOutputStream;
/* :catch_3 */
/* move-exception v7 */
/* .line 213 */
} // .end local v3 # "in":Ljava/io/InputStream;
/* .restart local v4 # "in":Ljava/io/InputStream; */
/* :catchall_1 */
/* move-exception v6 */
/* move-object v3, v4 */
} // .end local v4 # "in":Ljava/io/InputStream;
/* .restart local v3 # "in":Ljava/io/InputStream; */
/* .line 212 */
} // .end local v3 # "in":Ljava/io/InputStream;
/* .restart local v4 # "in":Ljava/io/InputStream; */
/* :catch_4 */
/* move-exception v6 */
/* move-object v3, v4 */
} // .end local v4 # "in":Ljava/io/InputStream;
/* .restart local v3 # "in":Ljava/io/InputStream; */
} // .end local v3 # "in":Ljava/io/InputStream;
/* .restart local v0 # "buf":[B */
/* .restart local v2 # "i":I */
/* .restart local v4 # "in":Ljava/io/InputStream; */
/* .restart local v5 # "out":Ljava/io/ByteArrayOutputStream; */
} // :cond_3
/* move-object v3, v4 */
} // .end local v4 # "in":Ljava/io/InputStream;
/* .restart local v3 # "in":Ljava/io/InputStream; */
} // .end method
public static dataOfRawResource ( android.content.Context p0, Integer p1 ) {
/* .locals 9 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "id" # I */
/* .prologue */
/* .line 232 */
int v4 = 0; // const/4 v4, 0x0
/* .line 233 */
/* .local v4, "in":Ljava/io/InputStream; */
int v1 = 0; // const/4 v1, 0x0
/* check-cast v1, [B */
/* .line 236 */
/* .local v1, "bytes":[B */
try { // :try_start_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v6 ).openRawResource ( p1 ); // invoke-virtual {v6, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
/* .line 239 */
/* const/16 v6, 0x400 */
/* new-array v0, v6, [B */
/* .line 240 */
/* .local v0, "buf":[B */
/* new-instance v5, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 241 */
/* .local v5, "out":Ljava/io/ByteArrayOutputStream; */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
int v6 = -1; // const/4 v6, -0x1
/* if-ne v3, v6, :cond_1 */
/* .line 246 */
(( java.io.ByteArrayOutputStream ) v5 ).toByteArray ( ); // invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 249 */
(( java.io.ByteArrayOutputStream ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->flush()V
/* .line 250 */
(( java.io.ByteArrayOutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 255 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 256 */
try { // :try_start_1
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 261 */
} // .end local v0 # "buf":[B
} // .end local v3 # "i":I
} // .end local v5 # "out":Ljava/io/ByteArrayOutputStream;
} // :cond_0
} // :goto_1
/* .line 242 */
/* .restart local v0 # "buf":[B */
/* .restart local v3 # "i":I */
/* .restart local v5 # "out":Ljava/io/ByteArrayOutputStream; */
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_2
(( java.io.ByteArrayOutputStream ) v5 ).write ( v0, v6, v3 ); // invoke-virtual {v5, v0, v6, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 241 */
(( java.io.InputStream ) v4 ).read ( v0 ); // invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
v3 = /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 251 */
} // .end local v0 # "buf":[B
} // .end local v3 # "i":I
} // .end local v5 # "out":Ljava/io/ByteArrayOutputStream;
/* :catch_0 */
/* move-exception v2 */
/* .line 252 */
/* .local v2, "e":Ljava/lang/Throwable; */
try { // :try_start_3
final String v6 = "libwiengine"; // const-string v6, "libwiengine"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "Can\'t read the raw resource: "; // const-string v8, "Can\'t read the raw resource: "
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( p1 ); // invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 255 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 256 */
try { // :try_start_4
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 258 */
/* :catch_1 */
/* move-exception v6 */
/* .line 253 */
} // .end local v2 # "e":Ljava/lang/Throwable;
/* :catchall_0 */
/* move-exception v6 */
/* .line 255 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 256 */
try { // :try_start_5
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
/* .line 260 */
} // :cond_2
} // :goto_2
/* throw v6 */
/* .line 258 */
/* :catch_2 */
/* move-exception v7 */
/* .restart local v0 # "buf":[B */
/* .restart local v3 # "i":I */
/* .restart local v5 # "out":Ljava/io/ByteArrayOutputStream; */
/* :catch_3 */
/* move-exception v6 */
} // .end method
public static java.lang.String getFileNameWithoutExt ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 62 */
/* const/16 v1, 0x2e */
v0 = (( java.lang.String ) p0 ).lastIndexOf ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I
/* .line 63 */
/* .local v0, "index":I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 64 */
int v1 = 0; // const/4 v1, 0x0
(( java.lang.String ) p0 ).substring ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 66 */
} // .end local p0 # "filename":Ljava/lang/String;
} // :cond_0
} // .end method
public static Float getFloat ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 95 */
/* if-nez p0, :cond_0 */
/* .line 101 */
} // :goto_0
/* .line 99 */
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Float .parseFloat ( v2 );
/* :try_end_0 */
v1 = /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 100 */
/* :catch_0 */
/* move-exception v0 */
/* .line 101 */
/* .local v0, "e":Ljava/lang/NumberFormatException; */
} // .end method
public static Float getFloat ( java.lang.String p0, Float p1 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "fault" # F */
/* .prologue */
/* .line 106 */
/* if-nez p0, :cond_0 */
/* .line 112 */
} // .end local p1 # "fault":F
} // :goto_0
/* .line 110 */
/* .restart local p1 # "fault":F */
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Float .parseFloat ( v1 );
/* :try_end_0 */
p1 = /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 111 */
/* :catch_0 */
/* move-exception v0 */
/* .line 112 */
/* .local v0, "e":Ljava/lang/NumberFormatException; */
} // .end method
public static Integer getInt ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "radix" # I */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 87 */
int v0 = 0; // const/4 v0, 0x0
v0 = com.wiyun.engine.utils.Utilities .getInt ( p0,p1,v0 );
} // .end method
public static Integer getInt ( Integer p0, java.lang.String p1, Integer p2 ) {
/* .locals 3 */
/* .param p0, "radix" # I */
/* .param p1, "value" # Ljava/lang/String; */
/* .param p2, "faultValue" # I */
/* .prologue */
/* .line 71 */
/* if-nez p1, :cond_0 */
/* .line 82 */
} // .end local p2 # "faultValue":I
} // :goto_0
/* .line 80 */
/* .restart local p2 # "faultValue":I */
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Long .parseLong ( v1,p0 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v1 */
/* long-to-int p2, v1 */
/* .line 81 */
/* :catch_0 */
/* move-exception v0 */
/* .line 82 */
/* .local v0, "e":Ljava/lang/NumberFormatException; */
} // .end method
public static Integer getInt ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 123 */
/* const/16 v0, 0xa */
v0 = com.wiyun.engine.utils.Utilities .getInt ( v0,p0 );
} // .end method
public static Integer getInt ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "faultValue" # I */
/* .prologue */
/* .line 91 */
/* const/16 v0, 0xa */
v0 = com.wiyun.engine.utils.Utilities .getInt ( v0,p0,p1 );
} // .end method
public static Long getLong ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "value" # Ljava/lang/String; */
/* .prologue */
/* const-wide/16 v1, 0x0 */
/* .line 127 */
/* if-nez p0, :cond_0 */
/* .line 133 */
} // :goto_0
/* return-wide v1 */
/* .line 131 */
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Long .parseLong ( v3 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v1 */
/* .line 132 */
/* :catch_0 */
/* move-exception v0 */
/* .line 133 */
/* .local v0, "e":Ljava/lang/NumberFormatException; */
} // .end method
public static Integer getNextPOT ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "x" # I */
/* .prologue */
/* .line 169 */
/* add-int/lit8 p0, p0, -0x1 */
/* .line 170 */
/* shr-int/lit8 v0, p0, 0x1 */
/* or-int/2addr p0, v0 */
/* .line 171 */
/* shr-int/lit8 v0, p0, 0x2 */
/* or-int/2addr p0, v0 */
/* .line 172 */
/* shr-int/lit8 v0, p0, 0x4 */
/* or-int/2addr p0, v0 */
/* .line 173 */
/* shr-int/lit8 v0, p0, 0x8 */
/* or-int/2addr p0, v0 */
/* .line 174 */
/* shr-int/lit8 v0, p0, 0x10 */
/* or-int/2addr p0, v0 */
/* .line 175 */
/* add-int/lit8 v0, p0, 0x1 */
} // .end method
public static java.lang.String getUTF8String ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "b" # [B */
/* .prologue */
/* .line 145 */
/* if-nez p0, :cond_0 */
/* .line 146 */
final String v0 = ""; // const-string v0, ""
/* .line 147 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.wiyun.engine.utils.Utilities .getUTF8String ( p0,v0,v1 );
} // .end method
public static java.lang.String getUTF8String ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p0, "b" # [B */
/* .param p1, "start" # I */
/* .param p2, "length" # I */
/* .prologue */
/* .line 154 */
/* if-nez p0, :cond_0 */
/* .line 155 */
final String v1 = ""; // const-string v1, ""
/* .line 160 */
} // :goto_0
/* .line 158 */
} // :cond_0
try { // :try_start_0
/* new-instance v1, Ljava/lang/String; */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
/* invoke-direct {v1, p0, p1, p2, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 159 */
/* :catch_0 */
/* move-exception v0 */
/* .line 160 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
final String v1 = ""; // const-string v1, ""
} // .end method
public static com.wiyun.engine.utils.BitmapRawData loadJPG ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 300 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapRawData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapRawData;-><init>()V */
/* .line 301 */
/* .local v0, "data":Lcom/wiyun/engine/utils/BitmapRawData; */
com.wiyun.engine.utils.Utilities .nativeLoadJPG ( p0,v0 );
/* .line 302 */
} // .end method
public static com.wiyun.engine.utils.BitmapRawData loadJPG ( java.lang.String p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
/* .line 315 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapRawData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapRawData;-><init>()V */
/* .line 316 */
/* .local v0, "data":Lcom/wiyun/engine/utils/BitmapRawData; */
com.wiyun.engine.utils.Utilities .nativeLoadJPG ( p0,p1,v0 );
/* .line 317 */
} // .end method
public static com.wiyun.engine.utils.BitmapRawData loadPNG ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 271 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapRawData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapRawData;-><init>()V */
/* .line 272 */
/* .local v0, "data":Lcom/wiyun/engine/utils/BitmapRawData; */
com.wiyun.engine.utils.Utilities .nativeLoadPNG ( p0,v0 );
/* .line 273 */
} // .end method
public static com.wiyun.engine.utils.BitmapRawData loadPNG ( java.lang.String p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
/* .line 286 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapRawData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapRawData;-><init>()V */
/* .line 287 */
/* .local v0, "data":Lcom/wiyun/engine/utils/BitmapRawData; */
com.wiyun.engine.utils.Utilities .nativeLoadPNG ( p0,p1,v0 );
/* .line 288 */
} // .end method
private static native void nativeLoadJPG ( Integer p0, com.wiyun.engine.utils.BitmapRawData p1 ) {
} // .end method
private static native void nativeLoadJPG ( java.lang.String p0, Boolean p1, com.wiyun.engine.utils.BitmapRawData p2 ) {
} // .end method
private static native void nativeLoadPNG ( Integer p0, com.wiyun.engine.utils.BitmapRawData p1 ) {
} // .end method
private static native void nativeLoadPNG ( java.lang.String p0, Boolean p1, com.wiyun.engine.utils.BitmapRawData p2 ) {
} // .end method
public static Float r2d ( Float p0 ) {
/* .locals 2 */
/* .param p0, "angle" # F */
/* .prologue */
/* .line 58 */
/* const v0, 0x40490fdb # (float)Math.PI */
/* div-float v0, p0, v0 */
/* const/high16 v1, 0x43340000 # 180.0f */
/* mul-float/2addr v0, v1 */
} // .end method
public static Integer rand ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "max" # I */
/* .prologue */
/* .line 38 */
v0 = com.wiyun.engine.utils.Utilities.sRandom;
v0 = (( java.util.Random ) v0 ).nextInt ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I
} // .end method
public static Float randMinusOneToOne ( ) {
/* .locals 2 */
/* .prologue */
/* .line 27 */
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
/* .prologue */
/* .line 34 */
java.lang.Math .random ( );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static void swap ( Float[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p0, "v" # [F */
/* .param p1, "index1" # I */
/* .param p2, "index2" # I */
/* .prologue */
/* .line 186 */
/* aget v0, p0, p1 */
/* .line 187 */
/* .local v0, "tmp":F */
/* aget v1, p0, p2 */
/* aput v1, p0, p1 */
/* .line 188 */
/* aput v0, p0, p2 */
/* .line 189 */
return;
} // .end method
