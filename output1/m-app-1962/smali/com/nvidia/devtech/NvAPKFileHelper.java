public class com.nvidia.devtech.NvAPKFileHelper {
	 /* .source "NvAPKFileHelper.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile; */
	 /* } */
} // .end annotation
/* # static fields */
private static com.nvidia.devtech.NvAPKFileHelper instance;
/* # instance fields */
private android.content.Context context;
/* # direct methods */
static com.nvidia.devtech.NvAPKFileHelper ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 39 */
	 /* new-instance v0, Lcom/nvidia/devtech/NvAPKFileHelper; */
	 /* invoke-direct {v0}, Lcom/nvidia/devtech/NvAPKFileHelper;-><init>()V */
	 /* .line 36 */
	 return;
} // .end method
public com.nvidia.devtech.NvAPKFileHelper ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 36 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 38 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.context = v0;
	 /* .line 36 */
	 return;
} // .end method
public static com.nvidia.devtech.NvAPKFileHelper getInstance ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 48 */
	 v0 = com.nvidia.devtech.NvAPKFileHelper.instance;
} // .end method
/* # virtual methods */
public void closeFileAndroid ( com.nvidia.devtech.NvAPKFileHelper$NvAPKFile p0 ) {
	 /* .locals 1 */
	 /* .param p1, "strm" # Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile; */
	 /* .prologue */
	 /* .line 149 */
	 try { // :try_start_0
		 v0 = this.is;
		 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 154 */
	 } // :goto_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [B */
	 this.data = v0;
	 /* .line 155 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.is = v0;
	 /* .line 156 */
	 return;
	 /* .line 151 */
	 /* :catch_0 */
	 /* move-exception v0 */
} // .end method
public com.nvidia.devtech.NvAPKFileHelper$NvAPKFile openFileAndroid ( java.lang.String p0 ) {
	 /* .locals 6 */
	 /* .param p1, "filename" # Ljava/lang/String; */
	 /* .prologue */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 66 */
	 /* new-instance v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile; */
	 /* invoke-direct {v1, p0}, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;-><init>(Lcom/nvidia/devtech/NvAPKFileHelper;)V */
	 /* .line 67 */
	 /* .local v1, "ret":Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile; */
	 int v3 = 0; // const/4 v3, 0x0
	 this.is = v3;
	 /* .line 68 */
	 /* iput v4, v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->length:I */
	 /* .line 69 */
	 /* iput v4, v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->position:I */
	 /* .line 70 */
	 /* iput v4, v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
	 /* .line 74 */
	 try { // :try_start_0
		 v3 = this.context;
		 (( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 (( android.content.res.AssetManager ) v3 ).open ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
		 this.is = v3;
		 /* .line 75 */
		 v3 = this.is;
		 v2 = 		 (( java.io.InputStream ) v3 ).available ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->available()I
		 /* .line 76 */
		 /* .local v2, "size":I */
		 /* iput v2, v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->length:I */
		 /* .line 77 */
		 v3 = this.is;
		 /* const/high16 v4, 0x10000000 */
		 (( java.io.InputStream ) v3 ).mark ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/InputStream;->mark(I)V
		 /* .line 78 */
		 /* const/16 v3, 0x400 */
		 /* iput v3, v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
		 /* .line 79 */
		 /* iget v3, v1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
		 /* new-array v3, v3, [B */
		 this.data = v3;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 87 */
	 } // .end local v2 # "size":I
} // :goto_0
/* .line 81 */
/* :catch_0 */
/* move-exception v0 */
/* .line 83 */
/* .local v0, "e2":Ljava/lang/Exception; */
v3 = java.lang.System.out;
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "openFileAndroid \""; // const-string v5, "openFileAndroid \""
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 84 */
final String v5 = "\" not found in assets"; // const-string v5, "\" not found in assets"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 83 */
(( java.io.PrintStream ) v3 ).println ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 85 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public void readFileAndroid ( com.nvidia.devtech.NvAPKFileHelper$NvAPKFile p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "strm" # Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile; */
/* .param p2, "size" # I */
/* .prologue */
/* .line 92 */
/* iget v0, p1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* if-le p2, v0, :cond_0 */
/* .line 94 */
/* new-array v0, p2, [B */
this.data = v0;
/* .line 95 */
/* iput p2, p1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* .line 99 */
} // :cond_0
try { // :try_start_0
v0 = this.is;
v1 = this.data;
int v2 = 0; // const/4 v2, 0x0
(( java.io.InputStream ) v0 ).read ( v1, v2, p2 ); // invoke-virtual {v0, v1, v2, p2}, Ljava/io/InputStream;->read([BII)I
/* .line 100 */
/* iget v0, p1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->position:I */
/* add-int/2addr v0, p2 */
/* iput v0, p1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->position:I */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 105 */
} // :goto_0
return;
/* .line 102 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public Long seekFileAndroid ( com.nvidia.devtech.NvAPKFileHelper$NvAPKFile p0, Integer p1 ) {
/* .locals 10 */
/* .param p1, "strm" # Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile; */
/* .param p2, "offset" # I */
/* .prologue */
/* .line 112 */
/* const/16 v0, 0x80 */
/* .line 113 */
/* .local v0, "MAX_ITERATION":I */
/* const-wide/16 v5, 0x0 */
/* .line 114 */
/* .local v5, "totalSkip":J */
/* const/16 v1, 0x80 */
/* .line 116 */
/* .local v1, "count":I */
/* const-wide/16 v3, 0x0 */
/* .line 120 */
/* .local v3, "skippedBytes":J */
try { // :try_start_0
v7 = this.is;
(( java.io.InputStream ) v7 ).reset ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->reset()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 121 */
} // :goto_0
/* if-lez p2, :cond_0 */
/* if-gtz v1, :cond_1 */
/* .line 141 */
} // :cond_0
} // :goto_1
/* long-to-int v7, v5 */
/* iput v7, p1, Lcom/nvidia/devtech/NvAPKFileHelper$NvAPKFile;->position:I */
/* .line 142 */
/* return-wide v5 */
/* .line 125 */
} // :cond_1
try { // :try_start_1
v7 = this.is;
/* int-to-long v8, p2 */
(( java.io.InputStream ) v7 ).skip ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/io/InputStream;->skip(J)J
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* move-result-wide v3 */
/* .line 132 */
} // :goto_2
/* add-long/2addr v5, v3 */
/* .line 133 */
/* int-to-long v7, p2 */
/* sub-long/2addr v7, v3 */
/* long-to-int p2, v7 */
/* .line 134 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 127 */
/* :catch_0 */
/* move-exception v2 */
/* .line 129 */
/* .local v2, "e":Ljava/io/IOException; */
try { // :try_start_2
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 137 */
} // .end local v2 # "e":Ljava/io/IOException;
/* :catch_1 */
/* move-exception v7 */
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 43 */
this.context = p1;
/* .line 44 */
return;
} // .end method
