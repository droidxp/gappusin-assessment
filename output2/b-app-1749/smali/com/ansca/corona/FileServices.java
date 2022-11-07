public class com.ansca.corona.FileServices {
	 /* .source "FileServices.java" */
	 /* # direct methods */
	 private com.ansca.corona.FileServices ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 public static Boolean copyFile ( java.io.File p0, java.io.File p1 ) {
		 /* .locals 12 */
		 /* .param p0, "sourceFile" # Ljava/io/File; */
		 /* .param p1, "destinationFile" # Ljava/io/File; */
		 /* .prologue */
		 int v10 = 0; // const/4 v10, 0x0
		 /* .line 50 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* .line 51 */
		 /* .local v6, "inputStream":Ljava/io/FileInputStream; */
		 int v8 = 0; // const/4 v8, 0x0
		 /* .line 52 */
		 /* .local v8, "outputStream":Ljava/io/FileOutputStream; */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 55 */
		 /* .local v5, "hasSucceeded":Z */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* if-nez p1, :cond_1 */
			 /* .line 98 */
		 } // :cond_0
	 } // :goto_0
	 /* .line 60 */
} // :cond_1
v11 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v11 != null) { // if-eqz v11, :cond_0
	 /* .line 66 */
	 try { // :try_start_0
		 /* new-instance v7, Ljava/io/FileInputStream; */
		 /* invoke-direct {v7, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 67 */
	 } // .end local v6 # "inputStream":Ljava/io/FileInputStream;
	 /* .local v7, "inputStream":Ljava/io/FileInputStream; */
	 try { // :try_start_1
		 /* new-instance v9, Ljava/io/FileOutputStream; */
		 /* invoke-direct {v9, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_7 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
		 /* .line 68 */
	 } // .end local v8 # "outputStream":Ljava/io/FileOutputStream;
	 /* .local v9, "outputStream":Ljava/io/FileOutputStream; */
	 try { // :try_start_2
		 v2 = 		 (( java.io.FileInputStream ) v7 ).available ( ); // invoke-virtual {v7}, Ljava/io/FileInputStream;->available()I
		 /* .line 69 */
		 /* .local v2, "byteCount":I */
		 /* if-lez v2, :cond_3 */
		 /* .line 70 */
		 /* const/16 v0, 0x400 */
		 /* .line 71 */
		 /* .local v0, "BUFFER_SIZE":I */
		 /* const/16 v10, 0x400 */
		 /* new-array v1, v10, [B */
		 /* .line 72 */
		 /* .local v1, "byteBuffer":[B */
	 } // :goto_1
	 /* if-lez v2, :cond_3 */
	 /* .line 73 */
	 /* const/16 v3, 0x400 */
	 /* .line 74 */
	 /* .local v3, "bytesToCopy":I */
	 /* if-le v3, v2, :cond_2 */
	 /* .line 75 */
	 /* move v3, v2 */
	 /* .line 77 */
} // :cond_2
int v10 = 0; // const/4 v10, 0x0
v3 = (( java.io.FileInputStream ) v7 ).read ( v1, v10, v3 ); // invoke-virtual {v7, v1, v10, v3}, Ljava/io/FileInputStream;->read([BII)I
/* .line 78 */
int v10 = 0; // const/4 v10, 0x0
(( java.io.FileOutputStream ) v9 ).write ( v1, v10, v3 ); // invoke-virtual {v9, v1, v10, v3}, Ljava/io/FileOutputStream;->write([BII)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_8 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
/* .line 79 */
/* sub-int/2addr v2, v3 */
/* .line 80 */
/* .line 82 */
} // .end local v0 # "BUFFER_SIZE":I
} // .end local v1 # "byteBuffer":[B
} // .end local v3 # "bytesToCopy":I
} // :cond_3
int v5 = 1; // const/4 v5, 0x1
/* .line 89 */
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 90 */
try { // :try_start_3
(( java.io.FileInputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
/* .line 93 */
} // :cond_4
} // :goto_2
if ( v9 != null) { // if-eqz v9, :cond_9
/* .line 94 */
try { // :try_start_4
(( java.io.FileOutputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* move-object v8, v9 */
} // .end local v9 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v8 # "outputStream":Ljava/io/FileOutputStream; */
/* move-object v6, v7 */
} // .end local v2 # "byteCount":I
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
} // :cond_5
} // :goto_3
/* move v10, v5 */
/* .line 98 */
/* .line 95 */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
} // .end local v8 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v2 # "byteCount":I */
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* .restart local v9 # "outputStream":Ljava/io/FileOutputStream; */
/* :catch_0 */
/* move-exception v10 */
/* move-object v8, v9 */
} // .end local v9 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v8 # "outputStream":Ljava/io/FileOutputStream; */
/* move-object v6, v7 */
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
/* .line 84 */
} // .end local v2 # "byteCount":I
/* :catch_1 */
/* move-exception v4 */
/* .line 85 */
/* .local v4, "ex":Ljava/lang/Exception; */
} // :goto_4
try { // :try_start_5
(( java.lang.Exception ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 89 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 90 */
try { // :try_start_6
(( java.io.FileInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_4 */
/* .line 93 */
} // :cond_6
} // :goto_5
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 94 */
try { // :try_start_7
(( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_2 */
/* .line 95 */
/* :catch_2 */
/* move-exception v10 */
/* .line 89 */
} // .end local v4 # "ex":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v10 */
} // :goto_6
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 90 */
try { // :try_start_8
(( java.io.FileInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_5 */
/* .line 93 */
} // :cond_7
} // :goto_7
if ( v8 != null) { // if-eqz v8, :cond_8
/* .line 94 */
try { // :try_start_9
(( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/lang/Exception; {:try_start_9 ..:try_end_9} :catch_6 */
/* .line 95 */
} // :cond_8
} // :goto_8
/* throw v10 */
/* .line 91 */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
} // .end local v8 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v2 # "byteCount":I */
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* .restart local v9 # "outputStream":Ljava/io/FileOutputStream; */
/* :catch_3 */
/* move-exception v10 */
} // .end local v2 # "byteCount":I
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
} // .end local v9 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v4 # "ex":Ljava/lang/Exception; */
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
/* .restart local v8 # "outputStream":Ljava/io/FileOutputStream; */
/* :catch_4 */
/* move-exception v10 */
} // .end local v4 # "ex":Ljava/lang/Exception;
/* :catch_5 */
/* move-exception v11 */
/* .line 95 */
/* :catch_6 */
/* move-exception v11 */
/* .line 89 */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* :catchall_1 */
/* move-exception v10 */
/* move-object v6, v7 */
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
} // .end local v8 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* .restart local v9 # "outputStream":Ljava/io/FileOutputStream; */
/* :catchall_2 */
/* move-exception v10 */
/* move-object v8, v9 */
} // .end local v9 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v8 # "outputStream":Ljava/io/FileOutputStream; */
/* move-object v6, v7 */
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
/* .line 84 */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* :catch_7 */
/* move-exception v4 */
/* move-object v6, v7 */
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
} // .end local v8 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* .restart local v9 # "outputStream":Ljava/io/FileOutputStream; */
/* :catch_8 */
/* move-exception v4 */
/* move-object v8, v9 */
} // .end local v9 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v8 # "outputStream":Ljava/io/FileOutputStream; */
/* move-object v6, v7 */
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
} // .end local v6 # "inputStream":Ljava/io/FileInputStream;
} // .end local v8 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v2 # "byteCount":I */
/* .restart local v7 # "inputStream":Ljava/io/FileInputStream; */
/* .restart local v9 # "outputStream":Ljava/io/FileOutputStream; */
} // :cond_9
/* move-object v8, v9 */
} // .end local v9 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v8 # "outputStream":Ljava/io/FileOutputStream; */
/* move-object v6, v7 */
} // .end local v7 # "inputStream":Ljava/io/FileInputStream;
/* .restart local v6 # "inputStream":Ljava/io/FileInputStream; */
} // .end method
public static Boolean copyFile ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p0, "sourceFilePath" # Ljava/lang/String; */
/* .param p1, "destinationFilePath" # Ljava/lang/String; */
/* .prologue */
/* .line 24 */
int v1 = 0; // const/4 v1, 0x0
/* .line 27 */
/* .local v1, "hasSucceeded":Z */
if ( p0 != null) { // if-eqz p0, :cond_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v2, :cond_1 */
/* .line 29 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 39 */
} // :goto_0
/* .line 34 */
} // :cond_1
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
/* invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* new-instance v3, Ljava/io/File; */
/* invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
com.ansca.corona.FileServices .copyFile ( v2,v3 );
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* move v2, v1 */
/* .line 39 */
/* .line 36 */
/* :catch_0 */
/* move-exception v0 */
/* .line 37 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static Boolean moveFile ( java.io.File p0, java.io.File p1 ) {
/* .locals 4 */
/* .param p0, "sourceFile" # Ljava/io/File; */
/* .param p1, "destinationFile" # Ljava/io/File; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 110 */
int v1 = 0; // const/4 v1, 0x0
/* .line 113 */
/* .local v1, "hasSucceeded":Z */
if ( p0 != null) { // if-eqz p0, :cond_0
/* if-nez p1, :cond_1 */
/* .line 137 */
} // :cond_0
} // :goto_0
/* .line 118 */
} // :cond_1
v3 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 126 */
try { // :try_start_0
v1 = (( java.io.File ) p0 ).renameTo ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
/* .line 129 */
/* if-nez v1, :cond_2 */
/* .line 130 */
v1 = com.ansca.corona.FileServices .copyFile ( p0,p1 );
/* .line 131 */
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_2
} // :goto_1
/* move v2, v1 */
/* .line 137 */
/* .line 134 */
/* :catch_0 */
/* move-exception v0 */
/* .line 135 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
