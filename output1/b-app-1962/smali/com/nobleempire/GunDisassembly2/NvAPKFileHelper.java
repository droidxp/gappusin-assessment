public class com.nobleempire.GunDisassembly2.NvAPKFileHelper {
	 /* .source "NvAPKFileHelper.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String TAG;
private static com.nobleempire.GunDisassembly2.NvAPKFileHelper instance;
/* # instance fields */
private android.content.Context context;
/* # direct methods */
static com.nobleempire.GunDisassembly2.NvAPKFileHelper ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 18 */
	 /* new-instance v0, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper; */
	 /* invoke-direct {v0}, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper;-><init>()V */
	 /* .line 15 */
	 return;
} // .end method
public com.nobleempire.GunDisassembly2.NvAPKFileHelper ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 15 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 17 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.context = v0;
	 /* .line 15 */
	 return;
} // .end method
public static com.nobleempire.GunDisassembly2.NvAPKFileHelper getInstance ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 27 */
	 v0 = com.nobleempire.GunDisassembly2.NvAPKFileHelper.instance;
} // .end method
/* # virtual methods */
public Integer checkFileInAssets ( java.lang.String p0 ) {
	 /* .locals 8 */
	 /* .param p1, "path" # Ljava/lang/String; */
	 /* .prologue */
	 int v4 = 1; // const/4 v4, 0x1
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 152 */
	 try { // :try_start_0
		 final String v6 = "/"; // const-string v6, "/"
		 (( java.lang.String ) p1 ).split ( v6 ); // invoke-virtual {p1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 /* .line 154 */
		 /* .local v3, "spl":[Ljava/lang/String; */
		 v6 = this.context;
		 (( android.content.Context ) v6 ).getAssets ( ); // invoke-virtual {v6}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 int v7 = 0; // const/4 v7, 0x0
		 /* aget-object v7, v3, v7 */
		 (( android.content.res.AssetManager ) v6 ).list ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;
		 /* .line 156 */
		 /* .local v2, "list":[Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .local v1, "i":I */
	 } // :goto_0
	 /* array-length v6, v2 */
	 /* if-lt v1, v6, :cond_1 */
	 /* move v4, v5 */
	 /* .line 167 */
} // .end local v1 # "i":I
} // .end local v2 # "list":[Ljava/lang/String;
} // .end local v3 # "spl":[Ljava/lang/String;
} // :cond_0
} // :goto_1
/* .line 158 */
/* .restart local v1 # "i":I */
/* .restart local v2 # "list":[Ljava/lang/String; */
/* .restart local v3 # "spl":[Ljava/lang/String; */
} // :cond_1
/* aget-object v6, v2, v1 */
int v7 = 1; // const/4 v7, 0x1
/* aget-object v7, v3, v7 */
(( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
v6 = /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v6, :cond_0 */
/* .line 156 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 164 */
} // .end local v1 # "i":I
} // .end local v2 # "list":[Ljava/lang/String;
} // .end local v3 # "spl":[Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 165 */
/* .local v0, "e":Ljava/io/IOException; */
final String v4 = "==>NvAPKFileHelper.java"; // const-string v4, "==>NvAPKFileHelper.java"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "~~List error: can\'t list"; // const-string v7, "~~List error: can\'t list"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( p1 ); // invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v6 );
/* move v4, v5 */
/* .line 167 */
} // .end method
public void closeFileAndroid ( com.nobleempire.GunDisassembly2.NvAPKFileHelper$NvAPKFile p0 ) {
/* .locals 3 */
/* .param p1, "strm" # Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile; */
/* .prologue */
/* .line 103 */
try { // :try_start_0
v1 = this.is;
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 107 */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [B */
this.data = v1;
/* .line 108 */
int v1 = 0; // const/4 v1, 0x0
this.is = v1;
/* .line 109 */
return;
/* .line 104 */
/* :catch_0 */
/* move-exception v0 */
/* .line 105 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "==>NvAPKFileHelper.java"; // const-string v1, "==>NvAPKFileHelper.java"
final String v2 = "~~*** closeFileAndroid "; // const-string v2, "~~*** closeFileAndroid "
android.util.Log .e ( v1,v2 );
} // .end method
public void displayFiles ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 112 */
try { // :try_start_0
v4 = this.context;
(( android.content.Context ) v4 ).getAssets ( ); // invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v4 ).list ( p1 ); // invoke-virtual {v4, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;
/* .line 113 */
/* .local v3, "list":[Ljava/lang/String; */
/* if-nez v3, :cond_1 */
/* .line 131 */
} // .end local v3 # "list":[Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 114 */
/* .restart local v3 # "list":[Ljava/lang/String; */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_1
/* array-length v4, v3 */
/* if-ge v2, v4, :cond_0 */
/* .line 115 */
final String v4 = ""; // const-string v4, ""
/* if-eq p1, v4, :cond_3 */
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "/"; // const-string v5, "/"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v5, v3, v2 */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 117 */
/* .local v1, "full_name":Ljava/lang/String; */
} // :goto_2
/* aget-object v4, v3, v2 */
final String v5 = "audio"; // const-string v5, "audio"
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 114 */
} // :cond_2
} // :goto_3
/* add-int/lit8 v2, v2, 0x1 */
/* .line 115 */
} // .end local v1 # "full_name":Ljava/lang/String;
} // :cond_3
/* aget-object v1, v3, v2 */
/* .line 120 */
/* .restart local v1 # "full_name":Ljava/lang/String; */
} // :cond_4
/* aget-object v4, v3, v2 */
final String v5 = ".ivy"; // const-string v5, ".ivy"
v4 = (( java.lang.String ) v4 ).contains ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 121 */
(( com.nobleempire.GunDisassembly2.NvAPKFileHelper ) p0 ).ivy_enum_files_callback ( v1 ); // invoke-virtual {p0, v1}, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper;->ivy_enum_files_callback(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 128 */
} // .end local v1 # "full_name":Ljava/lang/String;
} // .end local v2 # "i":I
} // .end local v3 # "list":[Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 129 */
/* .local v0, "e":Ljava/io/IOException; */
final String v4 = "==>NvAPKFileHelper.java"; // const-string v4, "==>NvAPKFileHelper.java"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "~~List error: can\'t list"; // const-string v6, "~~List error: can\'t list"
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v5 );
/* .line 124 */
} // .end local v0 # "e":Ljava/io/IOException;
/* .restart local v1 # "full_name":Ljava/lang/String; */
/* .restart local v2 # "i":I */
/* .restart local v3 # "list":[Ljava/lang/String; */
} // :cond_5
try { // :try_start_1
/* aget-object v4, v3, v2 */
final String v5 = "."; // const-string v5, "."
v4 = (( java.lang.String ) v4 ).contains ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v4, :cond_2 */
/* aget-object v4, v3, v2 */
final String v5 = "audio"; // const-string v5, "audio"
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v4, :cond_2 */
/* .line 125 */
(( com.nobleempire.GunDisassembly2.NvAPKFileHelper ) p0 ).displayFiles ( v1 ); // invoke-virtual {p0, v1}, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper;->displayFiles(Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public void enumerateFiles ( ) {
/* .locals 8 */
/* .prologue */
/* .line 133 */
v5 = this.context;
/* if-nez v5, :cond_1 */
/* .line 134 */
final String v5 = "==>NvAPKFileHelper.java"; // const-string v5, "==>NvAPKFileHelper.java"
final String v6 = "~~enumerateFiles zero context"; // const-string v6, "~~enumerateFiles zero context"
android.util.Log .v ( v5,v6 );
/* .line 149 */
} // :cond_0
} // :goto_0
return;
/* .line 138 */
} // :cond_1
final String v4 = "data"; // const-string v4, "data"
/* .line 140 */
/* .local v4, "path":Ljava/lang/String; */
try { // :try_start_0
v5 = this.context;
(( android.content.Context ) v5 ).getAssets ( ); // invoke-virtual {v5}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v5 ).list ( v4 ); // invoke-virtual {v5, v4}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;
/* .line 141 */
/* .local v3, "list":[Ljava/lang/String; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 142 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_1
/* array-length v5, v3 */
/* if-ge v2, v5, :cond_0 */
/* .line 143 */
final String v5 = ""; // const-string v5, ""
/* if-eq v4, v5, :cond_2 */
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "/"; // const-string v6, "/"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v6, v3, v2 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 144 */
/* .local v1, "full_name":Ljava/lang/String; */
} // :goto_2
(( com.nobleempire.GunDisassembly2.NvAPKFileHelper ) p0 ).ivy_enum_files_callback ( v1 ); // invoke-virtual {p0, v1}, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper;->ivy_enum_files_callback(Ljava/lang/String;)V
/* .line 142 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 143 */
} // .end local v1 # "full_name":Ljava/lang/String;
} // :cond_2
/* aget-object v1, v3, v2 */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 146 */
} // .end local v2 # "i":I
} // .end local v3 # "list":[Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 147 */
/* .local v0, "e":Ljava/io/IOException; */
final String v5 = "==>NvAPKFileHelper.java"; // const-string v5, "==>NvAPKFileHelper.java"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "~~List error: can\'t list"; // const-string v7, "~~List error: can\'t list"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v5,v6 );
} // .end method
public native void ivy_enum_files_callback ( java.lang.String p0 ) {
} // .end method
public com.nobleempire.GunDisassembly2.NvAPKFileHelper$NvAPKFile openFileAndroid ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 37 */
/* new-instance v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile; */
/* invoke-direct {v1, p0}, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;-><init>(Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper;)V */
/* .line 38 */
/* .local v1, "ret":Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile; */
int v3 = 0; // const/4 v3, 0x0
this.is = v3;
/* .line 39 */
/* iput v4, v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->length:I */
/* .line 40 */
/* iput v4, v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
/* .line 41 */
/* iput v4, v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* .line 43 */
try { // :try_start_0
v3 = this.context;
(( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v3 ).open ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
this.is = v3;
/* .line 44 */
v3 = this.is;
v2 = (( java.io.InputStream ) v3 ).available ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->available()I
/* .line 45 */
/* .local v2, "size":I */
/* iput v2, v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->length:I */
/* .line 46 */
v3 = this.is;
/* const/high16 v4, 0x10000000 */
(( java.io.InputStream ) v3 ).mark ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/InputStream;->mark(I)V
/* .line 47 */
/* const/16 v3, 0x400 */
/* iput v3, v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* .line 48 */
/* iget v3, v1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* new-array v3, v3, [B */
this.data = v3;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 53 */
} // .end local v2 # "size":I
} // :goto_0
/* .line 49 */
/* :catch_0 */
/* move-exception v0 */
/* .line 50 */
/* .local v0, "e2":Ljava/lang/Exception; */
final String v3 = "==>NvAPKFileHelper.java"; // const-string v3, "==>NvAPKFileHelper.java"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "~~openFileAndroid \""; // const-string v5, "~~openFileAndroid \""
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\" not found in assets"; // const-string v5, "\" not found in assets"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 51 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public void readFileAndroid ( com.nobleempire.GunDisassembly2.NvAPKFileHelper$NvAPKFile p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "strm" # Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile; */
/* .param p2, "size" # I */
/* .prologue */
/* .line 56 */
/* iget v1, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
/* add-int/2addr v1, p2 */
/* iget v2, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->length:I */
/* if-le v1, v2, :cond_0 */
/* .line 57 */
final String v1 = "==>NvAPKFileHelper.java"; // const-string v1, "==>NvAPKFileHelper.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~*** readFileAndroid: trying to read outside file.position = "; // const-string v3, "~~*** readFileAndroid: trying to read outside file.position = "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v3, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " lenght = "; // const-string v3, " lenght = "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v3, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->length:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " size = "; // const-string v3, " size = "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 58 */
/* iget v1, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->length:I */
/* iget v2, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
/* sub-int p2, v1, v2 */
/* .line 61 */
} // :cond_0
/* iget v1, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* if-le p2, v1, :cond_1 */
/* .line 62 */
final String v1 = "==>NvAPKFileHelper.java"; // const-string v1, "==>NvAPKFileHelper.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~ expanding buffer "; // const-string v3, "~~ expanding buffer "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v3, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " => "; // const-string v3, " => "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 63 */
/* new-array v1, p2, [B */
this.data = v1;
/* .line 64 */
/* iput p2, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->bufferSize:I */
/* .line 67 */
} // :cond_1
try { // :try_start_0
v1 = this.is;
v2 = this.data;
int v3 = 0; // const/4 v3, 0x0
(( java.io.InputStream ) v1 ).read ( v2, v3, p2 ); // invoke-virtual {v1, v2, v3, p2}, Ljava/io/InputStream;->read([BII)I
/* .line 69 */
/* iget v1, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
/* add-int/2addr v1, p2 */
/* iput v1, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 73 */
} // :goto_0
return;
/* .line 70 */
/* :catch_0 */
/* move-exception v0 */
/* .line 71 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "==>NvAPKFileHelper.java"; // const-string v1, "==>NvAPKFileHelper.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~*** readFileAndroid "; // const-string v3, "~~*** readFileAndroid "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
} // .end method
public Long seekFileAndroid ( com.nobleempire.GunDisassembly2.NvAPKFileHelper$NvAPKFile p0, Integer p1 ) {
/* .locals 10 */
/* .param p1, "strm" # Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile; */
/* .param p2, "offset" # I */
/* .prologue */
/* .line 78 */
/* const/16 v0, 0x80 */
/* .line 79 */
/* .local v0, "MAX_ITERATION":I */
/* const-wide/16 v5, 0x0 */
/* .line 80 */
/* .local v5, "totalSkip":J */
/* const/16 v1, 0x80 */
/* .line 81 */
/* .local v1, "count":I */
/* const-wide/16 v3, 0x0 */
/* .line 83 */
/* .local v3, "skippedBytes":J */
try { // :try_start_0
v7 = this.is;
(( java.io.InputStream ) v7 ).reset ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->reset()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 84 */
} // :goto_0
/* if-lez p2, :cond_0 */
/* if-gtz v1, :cond_1 */
/* .line 98 */
} // :cond_0
} // :goto_1
/* long-to-int v7, v5 */
/* iput v7, p1, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper$NvAPKFile;->position:I */
/* .line 99 */
/* return-wide v5 */
/* .line 86 */
} // :cond_1
try { // :try_start_1
v7 = this.is;
/* int-to-long v8, p2 */
(( java.io.InputStream ) v7 ).skip ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/io/InputStream;->skip(J)J
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* move-result-wide v3 */
/* .line 90 */
} // :goto_2
/* add-long/2addr v5, v3 */
/* .line 91 */
/* int-to-long v7, p2 */
/* sub-long/2addr v7, v3 */
/* long-to-int p2, v7 */
/* .line 92 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 87 */
/* :catch_0 */
/* move-exception v2 */
/* .line 88 */
/* .local v2, "e":Ljava/io/IOException; */
try { // :try_start_2
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 95 */
} // .end local v2 # "e":Ljava/io/IOException;
/* :catch_1 */
/* move-exception v2 */
/* .line 96 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v7 = "==>NvAPKFileHelper.java"; // const-string v7, "==>NvAPKFileHelper.java"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "~~*** seekFileAndroid "; // const-string v9, "~~*** seekFileAndroid "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( p2 ); // invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v8 );
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 24 */
this.context = p1;
/* .line 25 */
return;
} // .end method
