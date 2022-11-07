public class com.cont.tools.Tools {
	 /* .source "Tools.java" */
	 /* # direct methods */
	 public com.cont.tools.Tools ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean createDir ( java.io.File p0 ) {
		 /* .locals 1 */
		 /* .param p0, "dir" # Ljava/io/File; */
		 /* .prologue */
		 /* .line 89 */
		 /* if-nez p0, :cond_0 */
		 /* .line 90 */
		 /* new-instance v0, Ljava/lang/NullPointerException; */
		 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
		 /* throw v0 */
		 /* .line 93 */
	 } // :cond_0
	 v0 = 	 (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
	 /* if-nez v0, :cond_1 */
	 /* .line 94 */
	 v0 = 	 (( java.io.File ) p0 ).mkdirs ( ); // invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
	 /* .line 97 */
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean createFile ( java.io.File p0 ) {
/* .locals 2 */
/* .param p0, "dir" # Ljava/io/File; */
/* .prologue */
/* .line 16 */
/* if-nez p0, :cond_0 */
/* .line 17 */
/* new-instance v1, Ljava/lang/NullPointerException; */
/* invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v1 */
/* .line 20 */
} // :cond_0
v1 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_1 */
/* .line 23 */
try { // :try_start_0
(( java.io.File ) p0 ).createNewFile ( ); // invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
/* :try_end_0 */
v1 = /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 30 */
} // :goto_0
/* .line 24 */
/* :catch_0 */
/* move-exception v0 */
/* .line 26 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 30 */
} // .end local v0 # "e":Ljava/io/IOException;
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // .end method
public static void deleleAllFileAndNullDir ( java.io.File p0 ) {
/* .locals 0 */
/* .param p0, "dir" # Ljava/io/File; */
/* .prologue */
/* .line 73 */
com.cont.tools.Tools .deleteAllFile ( p0 );
/* .line 75 */
com.cont.tools.Tools .createDir ( p0 );
/* .line 76 */
com.cont.tools.Tools .deleteNullDir ( p0 );
/* .line 77 */
return;
} // .end method
public static Boolean deleteAllFile ( java.io.File p0 ) {
/* .locals 3 */
/* .param p0, "dir" # Ljava/io/File; */
/* .prologue */
/* .line 35 */
/* if-nez p0, :cond_0 */
/* .line 36 */
/* new-instance v2, Ljava/lang/NullPointerException; */
/* invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v2 */
/* .line 39 */
} // :cond_0
v2 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 41 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .line 42 */
/* .local v0, "files":[Ljava/io/File; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 43 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_2 */
/* .line 49 */
} // .end local v0 # "files":[Ljava/io/File;
} // .end local v1 # "i":I
} // :cond_1
v2 = (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* .line 44 */
/* .restart local v0 # "files":[Ljava/io/File; */
/* .restart local v1 # "i":I */
} // :cond_2
/* aget-object v2, v0, v1 */
com.cont.tools.Tools .deleteAllFile ( v2 );
/* .line 43 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void deleteNullDir ( java.io.File p0 ) {
/* .locals 3 */
/* .param p0, "dir" # Ljava/io/File; */
/* .prologue */
/* .line 54 */
/* if-nez p0, :cond_0 */
/* .line 55 */
/* new-instance v2, Ljava/lang/NullPointerException; */
/* invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v2 */
/* .line 58 */
} // :cond_0
v2 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 60 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .line 61 */
/* .local v0, "files":[Ljava/io/File; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v2, v0 */
/* if-gtz v2, :cond_2 */
/* .line 62 */
} // :cond_1
(( java.io.File ) p0 ).getParentFile ( ); // invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;
/* .line 63 */
/* .local v1, "parent":Ljava/io/File; */
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* .line 64 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 65 */
com.cont.tools.Tools .deleteNullDir ( v1 );
/* .line 69 */
} // .end local v0 # "files":[Ljava/io/File;
} // .end local v1 # "parent":Ljava/io/File;
} // :cond_2
return;
} // .end method
public static Boolean fileExists ( java.io.File p0 ) {
/* .locals 1 */
/* .param p0, "file" # Ljava/io/File; */
/* .prologue */
/* .line 81 */
/* if-nez p0, :cond_0 */
/* .line 82 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 85 */
} // :cond_0
v0 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
} // .end method
public static readFile ( java.io.File p0 ) {
/* .locals 9 */
/* .param p0, "file" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 136 */
if ( p0 != null) { // if-eqz p0, :cond_0
v8 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v8 != null) { // if-eqz v8, :cond_0
v8 = (( java.io.File ) p0 ).isFile ( ); // invoke-virtual {p0}, Ljava/io/File;->isFile()Z
/* if-nez v8, :cond_2 */
/* .line 137 */
} // :cond_0
int v8 = 0; // const/4 v8, 0x0
/* .line 157 */
} // :cond_1
} // :goto_0
/* .line 140 */
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 141 */
/* .local v5, "fis":Ljava/io/FileInputStream; */
int v2 = 0; // const/4 v2, 0x0
/* .line 142 */
/* .local v2, "bis":Ljava/io/BufferedInputStream; */
int v0 = 0; // const/4 v0, 0x0
/* .line 145 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
try { // :try_start_0
/* new-instance v6, Ljava/io/FileInputStream; */
/* invoke-direct {v6, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 146 */
} // .end local v5 # "fis":Ljava/io/FileInputStream;
/* .local v6, "fis":Ljava/io/FileInputStream; */
try { // :try_start_1
/* new-instance v3, Ljava/io/BufferedInputStream; */
/* invoke-direct {v3, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 147 */
} // .end local v2 # "bis":Ljava/io/BufferedInputStream;
/* .local v3, "bis":Ljava/io/BufferedInputStream; */
try { // :try_start_2
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* const v8, 0x32000 */
/* invoke-direct {v1, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
/* .line 149 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
/* .local v1, "baos":Ljava/io/ByteArrayOutputStream; */
int v7 = 0; // const/4 v7, 0x0
/* .line 150 */
/* .local v7, "len":I */
/* const v8, 0x32000 */
try { // :try_start_3
/* new-array v4, v8, [B */
/* .line 152 */
/* .local v4, "buffer":[B */
} // :goto_1
v7 = (( java.io.BufferedInputStream ) v3 ).read ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/BufferedInputStream;->read([B)I
int v8 = -1; // const/4 v8, -0x1
/* if-ne v7, v8, :cond_5 */
/* .line 155 */
(( java.io.ByteArrayOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
/* .line 157 */
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 159 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 160 */
(( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 161 */
} // :cond_3
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 162 */
(( java.io.BufferedInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
/* .line 163 */
} // :cond_4
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 164 */
(( java.io.FileInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
/* .line 153 */
} // :cond_5
int v8 = 0; // const/4 v8, 0x0
try { // :try_start_4
(( java.io.ByteArrayOutputStream ) v1 ).write ( v4, v8, v7 ); // invoke-virtual {v1, v4, v8, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 158 */
} // .end local v4 # "buffer":[B
/* :catchall_0 */
/* move-exception v8 */
/* move-object v0, v1 */
} // .end local v1 # "baos":Ljava/io/ByteArrayOutputStream;
/* .restart local v0 # "baos":Ljava/io/ByteArrayOutputStream; */
/* move-object v2, v3 */
} // .end local v3 # "bis":Ljava/io/BufferedInputStream;
/* .restart local v2 # "bis":Ljava/io/BufferedInputStream; */
/* move-object v5, v6 */
/* .line 159 */
} // .end local v6 # "fis":Ljava/io/FileInputStream;
} // .end local v7 # "len":I
/* .restart local v5 # "fis":Ljava/io/FileInputStream; */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 160 */
(( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 161 */
} // :cond_6
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 162 */
(( java.io.BufferedInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
/* .line 163 */
} // :cond_7
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 164 */
(( java.io.FileInputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
/* .line 165 */
} // :cond_8
/* throw v8 */
/* .line 158 */
/* :catchall_1 */
/* move-exception v8 */
} // .end local v5 # "fis":Ljava/io/FileInputStream;
/* .restart local v6 # "fis":Ljava/io/FileInputStream; */
/* :catchall_2 */
/* move-exception v8 */
/* move-object v5, v6 */
} // .end local v6 # "fis":Ljava/io/FileInputStream;
/* .restart local v5 # "fis":Ljava/io/FileInputStream; */
} // .end local v2 # "bis":Ljava/io/BufferedInputStream;
} // .end local v5 # "fis":Ljava/io/FileInputStream;
/* .restart local v3 # "bis":Ljava/io/BufferedInputStream; */
/* .restart local v6 # "fis":Ljava/io/FileInputStream; */
/* :catchall_3 */
/* move-exception v8 */
/* move-object v2, v3 */
} // .end local v3 # "bis":Ljava/io/BufferedInputStream;
/* .restart local v2 # "bis":Ljava/io/BufferedInputStream; */
/* move-object v5, v6 */
} // .end local v6 # "fis":Ljava/io/FileInputStream;
/* .restart local v5 # "fis":Ljava/io/FileInputStream; */
} // .end method
public static java.lang.String readFileContent ( java.io.File p0, java.lang.String p1 ) {
/* .locals 10 */
/* .param p0, "file" # Ljava/io/File; */
/* .param p1, "encoding" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 102 */
if ( p0 != null) { // if-eqz p0, :cond_0
v8 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v8 != null) { // if-eqz v8, :cond_0
v8 = (( java.io.File ) p0 ).isFile ( ); // invoke-virtual {p0}, Ljava/io/File;->isFile()Z
/* if-nez v8, :cond_2 */
/* .line 103 */
} // :cond_0
int v8 = 0; // const/4 v8, 0x0
/* .line 123 */
} // :cond_1
} // :goto_0
/* .line 106 */
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 107 */
/* .local v5, "fis":Ljava/io/FileInputStream; */
int v2 = 0; // const/4 v2, 0x0
/* .line 108 */
/* .local v2, "bis":Ljava/io/BufferedInputStream; */
int v0 = 0; // const/4 v0, 0x0
/* .line 111 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
try { // :try_start_0
/* new-instance v6, Ljava/io/FileInputStream; */
/* invoke-direct {v6, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 112 */
} // .end local v5 # "fis":Ljava/io/FileInputStream;
/* .local v6, "fis":Ljava/io/FileInputStream; */
try { // :try_start_1
/* new-instance v3, Ljava/io/BufferedInputStream; */
/* invoke-direct {v3, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 113 */
} // .end local v2 # "bis":Ljava/io/BufferedInputStream;
/* .local v3, "bis":Ljava/io/BufferedInputStream; */
try { // :try_start_2
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* const/16 v8, 0x2800 */
/* invoke-direct {v1, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
/* .line 115 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
/* .local v1, "baos":Ljava/io/ByteArrayOutputStream; */
int v7 = 0; // const/4 v7, 0x0
/* .line 116 */
/* .local v7, "len":I */
/* const/16 v8, 0x2800 */
try { // :try_start_3
/* new-array v4, v8, [B */
/* .line 118 */
/* .local v4, "buffer":[B */
} // :goto_1
v7 = (( java.io.BufferedInputStream ) v3 ).read ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/BufferedInputStream;->read([B)I
int v8 = -1; // const/4 v8, -0x1
/* if-ne v7, v8, :cond_5 */
/* .line 121 */
(( java.io.ByteArrayOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
/* .line 123 */
/* new-instance v8, Ljava/lang/String; */
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {v8, v9, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 125 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 126 */
(( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 127 */
} // :cond_3
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 128 */
(( java.io.BufferedInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
/* .line 129 */
} // :cond_4
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 130 */
(( java.io.FileInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
/* .line 119 */
} // :cond_5
int v8 = 0; // const/4 v8, 0x0
try { // :try_start_4
(( java.io.ByteArrayOutputStream ) v1 ).write ( v4, v8, v7 ); // invoke-virtual {v1, v4, v8, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 124 */
} // .end local v4 # "buffer":[B
/* :catchall_0 */
/* move-exception v8 */
/* move-object v0, v1 */
} // .end local v1 # "baos":Ljava/io/ByteArrayOutputStream;
/* .restart local v0 # "baos":Ljava/io/ByteArrayOutputStream; */
/* move-object v2, v3 */
} // .end local v3 # "bis":Ljava/io/BufferedInputStream;
/* .restart local v2 # "bis":Ljava/io/BufferedInputStream; */
/* move-object v5, v6 */
/* .line 125 */
} // .end local v6 # "fis":Ljava/io/FileInputStream;
} // .end local v7 # "len":I
/* .restart local v5 # "fis":Ljava/io/FileInputStream; */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 126 */
(( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 127 */
} // :cond_6
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 128 */
(( java.io.BufferedInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
/* .line 129 */
} // :cond_7
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 130 */
(( java.io.FileInputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
/* .line 131 */
} // :cond_8
/* throw v8 */
/* .line 124 */
/* :catchall_1 */
/* move-exception v8 */
} // .end local v5 # "fis":Ljava/io/FileInputStream;
/* .restart local v6 # "fis":Ljava/io/FileInputStream; */
/* :catchall_2 */
/* move-exception v8 */
/* move-object v5, v6 */
} // .end local v6 # "fis":Ljava/io/FileInputStream;
/* .restart local v5 # "fis":Ljava/io/FileInputStream; */
} // .end local v2 # "bis":Ljava/io/BufferedInputStream;
} // .end local v5 # "fis":Ljava/io/FileInputStream;
/* .restart local v3 # "bis":Ljava/io/BufferedInputStream; */
/* .restart local v6 # "fis":Ljava/io/FileInputStream; */
/* :catchall_3 */
/* move-exception v8 */
/* move-object v2, v3 */
} // .end local v3 # "bis":Ljava/io/BufferedInputStream;
/* .restart local v2 # "bis":Ljava/io/BufferedInputStream; */
/* move-object v5, v6 */
} // .end local v6 # "fis":Ljava/io/FileInputStream;
/* .restart local v5 # "fis":Ljava/io/FileInputStream; */
} // .end method
public static Boolean saveFile ( java.io.File p0, Object[] p1 ) {
/* .locals 5 */
/* .param p0, "file" # Ljava/io/File; */
/* .param p1, "content" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 171 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* if-nez p1, :cond_1 */
/* .line 185 */
} // :cond_0
} // :goto_0
/* .line 175 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 176 */
/* .local v2, "fos":Ljava/io/FileOutputStream; */
int v0 = 0; // const/4 v0, 0x0
/* .line 179 */
/* .local v0, "bos":Ljava/io/BufferedOutputStream; */
try { // :try_start_0
/* new-instance v3, Ljava/io/FileOutputStream; */
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v3, p0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 180 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .local v3, "fos":Ljava/io/FileOutputStream; */
try { // :try_start_1
/* new-instance v1, Ljava/io/BufferedOutputStream; */
/* invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 182 */
} // .end local v0 # "bos":Ljava/io/BufferedOutputStream;
/* .local v1, "bos":Ljava/io/BufferedOutputStream; */
try { // :try_start_2
(( java.io.BufferedOutputStream ) v1 ).write ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/BufferedOutputStream;->write([B)V
/* .line 183 */
(( java.io.BufferedOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->flush()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
/* .line 187 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 188 */
(( java.io.BufferedOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
/* .line 189 */
} // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 190 */
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* .line 185 */
} // :cond_3
int v4 = 1; // const/4 v4, 0x1
/* .line 186 */
} // .end local v1 # "bos":Ljava/io/BufferedOutputStream;
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v0 # "bos":Ljava/io/BufferedOutputStream; */
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_0 */
/* move-exception v4 */
/* .line 187 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 188 */
(( java.io.BufferedOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V
/* .line 189 */
} // :cond_4
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 190 */
(( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
/* .line 191 */
} // :cond_5
/* throw v4 */
/* .line 186 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_1 */
/* move-exception v4 */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
} // .end local v0 # "bos":Ljava/io/BufferedOutputStream;
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v1 # "bos":Ljava/io/BufferedOutputStream; */
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_2 */
/* move-exception v4 */
/* move-object v0, v1 */
} // .end local v1 # "bos":Ljava/io/BufferedOutputStream;
/* .restart local v0 # "bos":Ljava/io/BufferedOutputStream; */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
} // .end method
public static Boolean saveFileContent ( java.io.File p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 5 */
/* .param p0, "file" # Ljava/io/File; */
/* .param p1, "content" # Ljava/lang/String; */
/* .param p2, "encoding" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 197 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* if-nez p1, :cond_1 */
/* .line 211 */
} // :cond_0
} // :goto_0
/* .line 201 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 202 */
/* .local v2, "fos":Ljava/io/FileOutputStream; */
int v0 = 0; // const/4 v0, 0x0
/* .line 205 */
/* .local v0, "bos":Ljava/io/BufferedOutputStream; */
try { // :try_start_0
/* new-instance v3, Ljava/io/FileOutputStream; */
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v3, p0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 206 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .local v3, "fos":Ljava/io/FileOutputStream; */
try { // :try_start_1
/* new-instance v1, Ljava/io/BufferedOutputStream; */
/* invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 208 */
} // .end local v0 # "bos":Ljava/io/BufferedOutputStream;
/* .local v1, "bos":Ljava/io/BufferedOutputStream; */
try { // :try_start_2
(( java.lang.String ) p1 ).getBytes ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
(( java.io.BufferedOutputStream ) v1 ).write ( v4 ); // invoke-virtual {v1, v4}, Ljava/io/BufferedOutputStream;->write([B)V
/* .line 209 */
(( java.io.BufferedOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->flush()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
/* .line 213 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 214 */
(( java.io.BufferedOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
/* .line 215 */
} // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 216 */
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* .line 211 */
} // :cond_3
int v4 = 1; // const/4 v4, 0x1
/* .line 212 */
} // .end local v1 # "bos":Ljava/io/BufferedOutputStream;
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v0 # "bos":Ljava/io/BufferedOutputStream; */
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_0 */
/* move-exception v4 */
/* .line 213 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 214 */
(( java.io.BufferedOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V
/* .line 215 */
} // :cond_4
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 216 */
(( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
/* .line 217 */
} // :cond_5
/* throw v4 */
/* .line 212 */
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_1 */
/* move-exception v4 */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
} // .end local v0 # "bos":Ljava/io/BufferedOutputStream;
} // .end local v2 # "fos":Ljava/io/FileOutputStream;
/* .restart local v1 # "bos":Ljava/io/BufferedOutputStream; */
/* .restart local v3 # "fos":Ljava/io/FileOutputStream; */
/* :catchall_2 */
/* move-exception v4 */
/* move-object v0, v1 */
} // .end local v1 # "bos":Ljava/io/BufferedOutputStream;
/* .restart local v0 # "bos":Ljava/io/BufferedOutputStream; */
/* move-object v2, v3 */
} // .end local v3 # "fos":Ljava/io/FileOutputStream;
/* .restart local v2 # "fos":Ljava/io/FileOutputStream; */
} // .end method
