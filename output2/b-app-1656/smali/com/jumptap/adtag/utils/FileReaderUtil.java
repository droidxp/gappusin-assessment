public class com.jumptap.adtag.utils.FileReaderUtil {
	 /* .source "FileReaderUtil.java" */
	 /* # static fields */
	 private static final Integer BUFFER_SIZE;
	 /* # direct methods */
	 public com.jumptap.adtag.utils.FileReaderUtil ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.StringBuilder getFileContent ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 9 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .param p1, "fileName" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/jumptap/adtag/utils/JtException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 19 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 21 */
	 /* .local v3, "in":Ljava/io/InputStream; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 22 */
	 /* .local v2, "fileContentString":Ljava/lang/StringBuilder; */
	 /* if-nez v2, :cond_1 */
	 /* .line 23 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
} // .end local v2 # "fileContentString":Ljava/lang/StringBuilder;
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 24 */
/* .restart local v2 # "fileContentString":Ljava/lang/StringBuilder; */
/* const/16 v6, 0x400 */
/* new-array v0, v6, [B */
/* .line 25 */
/* .local v0, "buffer":[B */
int v4 = 0; // const/4 v4, 0x0
/* .line 28 */
/* .local v4, "len":I */
try { // :try_start_0
	 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v6 ).getAssets ( ); // invoke-virtual {v6}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
	 (( android.content.res.AssetManager ) v6 ).open ( p1 ); // invoke-virtual {v6, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
	 /* .line 30 */
} // :goto_0
v4 = (( java.io.InputStream ) v3 ).read ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I
/* if-lez v4, :cond_0 */
/* .line 32 */
/* new-instance v5, Ljava/lang/StringBuffer; */
/* new-instance v6, Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
/* invoke-direct {v6, v0, v7, v4}, Ljava/lang/String;-><init>([BII)V */
/* invoke-direct {v5, v6}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 33 */
/* .local v5, "tmpBuf":Ljava/lang/StringBuffer; */
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 38 */
} // .end local v5 # "tmpBuf":Ljava/lang/StringBuffer;
/* :catch_0 */
/* move-exception v1 */
/* .line 40 */
/* .local v1, "e":Ljava/io/IOException; */
/* new-instance v6, Lcom/jumptap/adtag/utils/JtException; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Cannot load "; // const-string v8, "Cannot load "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p1 ); // invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = " from asset folder"; // const-string v8, " from asset folder"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v6, v7}, Lcom/jumptap/adtag/utils/JtException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 35 */
} // .end local v1 # "e":Ljava/io/IOException;
} // :cond_0
try { // :try_start_1
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 43 */
} // .end local v0 # "buffer":[B
} // .end local v4 # "len":I
} // :cond_1
} // .end method
