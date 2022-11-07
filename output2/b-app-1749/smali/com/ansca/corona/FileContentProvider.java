public class com.ansca.corona.FileContentProvider extends android.content.ContentProvider {
	 /* .source "FileContentProvider.java" */
	 /* # direct methods */
	 public com.ansca.corona.FileContentProvider ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V */
		 return;
	 } // .end method
	 public static android.net.Uri getContentUriFromFilePath ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 6 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .param p1, "filePath" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 220 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 v4 = 				 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
				 /* if-gtz v4, :cond_1 */
				 /* .line 221 */
			 } // :cond_0
			 /* new-instance v4, Ljava/lang/IllegalArgumentException; */
			 /* invoke-direct {v4}, Ljava/lang/IllegalArgumentException;-><init>()V */
			 /* throw v4 */
			 /* .line 225 */
		 } // :cond_1
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 226 */
		 /* .local v2, "isAssetFile":Z */
		 /* move-object v3, p1 */
		 /* .line 227 */
		 /* .local v3, "localFilePath":Ljava/lang/String; */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v5 = "/data/data/"; // const-string v5, "/data/data/"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 228 */
		 /* .local v0, "absolutePathPrefix":Ljava/lang/String; */
		 v1 = 		 (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
		 /* .line 229 */
		 /* .local v1, "index":I */
		 /* if-ltz v1, :cond_5 */
		 v4 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* add-int/2addr v4, v1 */
		 v5 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-ge v4, v5, :cond_5 */
		 /* .line 230 */
		 v4 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* add-int/2addr v4, v1 */
		 (( java.lang.String ) p1 ).substring ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
		 /* .line 231 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 240 */
	 } // :cond_2
} // :goto_0
v4 = java.io.File.separator;
v4 = (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_3 */
/* .line 241 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
v5 = java.io.File.separator;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 243 */
} // :cond_3
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 244 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
v5 = java.io.File.separator;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "assets"; // const-string v5, "assets"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 248 */
} // :cond_4
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "content://"; // const-string v5, "content://"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = ".files"; // const-string v5, ".files"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v4 );
/* .line 234 */
} // :cond_5
final String v0 = "file:///android_asset"; // const-string v0, "file:///android_asset"
/* .line 235 */
v1 = (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 236 */
/* if-ltz v1, :cond_2 */
v4 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/2addr v4, v1 */
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ge v4, v5, :cond_2 */
/* .line 237 */
v4 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/2addr v4, v1 */
(( java.lang.String ) p1 ).substring ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // .end method
/* # virtual methods */
public Integer delete ( android.net.Uri p0, java.lang.String p1, java.lang.String[] p2 ) {
/* .locals 2 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .param p2, "selection" # Ljava/lang/String; */
/* .param p3, "selectionArgs" # [Ljava/lang/String; */
/* .prologue */
/* .line 150 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Not supported by this provider"; // const-string v1, "Not supported by this provider"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String getType ( android.net.Uri p0 ) {
/* .locals 2 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .prologue */
/* .line 162 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Not supported by this provider"; // const-string v1, "Not supported by this provider"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public android.net.Uri insert ( android.net.Uri p0, android.content.ContentValues p1 ) {
/* .locals 2 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .param p2, "values" # Landroid/content/ContentValues; */
/* .prologue */
/* .line 175 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Not supported by this provider"; // const-string v1, "Not supported by this provider"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Boolean onCreate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 137 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public android.content.res.AssetFileDescriptor openAssetFile ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 11 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .param p2, "mode" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 60 */
int v0 = 0; // const/4 v0, 0x0
/* .line 63 */
/* .local v0, "descriptor":Landroid/content/res/AssetFileDescriptor; */
/* if-nez p1, :cond_0 */
/* .line 65 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw v1 */
/* .line 72 */
} // :cond_0
int v10 = 1; // const/4 v10, 0x1
/* .line 73 */
/* .local v10, "isAssetFile":Z */
try { // :try_start_0
(( android.net.Uri ) p1 ).getPath ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
/* .line 74 */
/* .local v8, "filePath":Ljava/lang/String; */
final String v6 = "files/coronaResources/"; // const-string v6, "files/coronaResources/"
/* .line 75 */
/* .local v6, "assetsPath":Ljava/lang/String; */
v9 = (( java.lang.String ) v8 ).indexOf ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 76 */
/* .local v9, "index":I */
/* if-ltz v9, :cond_2 */
v1 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v9 */
v2 = (( java.lang.String ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/String;->length()I
/* if-ge v1, v2, :cond_2 */
/* .line 78 */
v1 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v9 */
(( java.lang.String ) v8 ).substring ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 104 */
} // :goto_0
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 108 */
v1 = java.io.File.separator;
v1 = (( java.lang.String ) v8 ).startsWith ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 110 */
int v1 = 1; // const/4 v1, 0x1
(( java.lang.String ) v8 ).substring ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 112 */
} // :cond_1
(( com.ansca.corona.FileContentProvider ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/ansca/corona/FileContentProvider;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v1 ).openFd ( v8 ); // invoke-virtual {v1, v8}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* .line 127 */
} // :goto_1
/* .line 82 */
} // :cond_2
final String v6 = "android_asset/"; // const-string v6, "android_asset/"
/* .line 83 */
v9 = (( java.lang.String ) v8 ).indexOf ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 84 */
/* if-ltz v9, :cond_3 */
v1 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v9 */
v2 = (( java.lang.String ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/String;->length()I
/* if-ge v1, v2, :cond_3 */
/* .line 86 */
v1 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v9 */
(( java.lang.String ) v8 ).substring ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 90 */
} // :cond_3
final String v6 = "/assets/"; // const-string v6, "/assets/"
/* .line 91 */
v1 = (( java.lang.String ) v8 ).startsWith ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 93 */
v1 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v9 */
(( java.lang.String ) v8 ).substring ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 97 */
} // :cond_4
int v10 = 0; // const/4 v10, 0x0
/* .line 117 */
} // :cond_5
/* new-instance v0, Landroid/content/res/AssetFileDescriptor; */
} // .end local v0 # "descriptor":Landroid/content/res/AssetFileDescriptor;
(( com.ansca.corona.FileContentProvider ) p0 ).openFile ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/ansca/corona/FileContentProvider;->openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
/* const-wide/16 v2, 0x0 */
/* const-wide/16 v4, -0x1 */
/* invoke-direct/range {v0 ..v5}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .restart local v0 # "descriptor":Landroid/content/res/AssetFileDescriptor; */
/* .line 120 */
} // .end local v0 # "descriptor":Landroid/content/res/AssetFileDescriptor;
} // .end local v6 # "assetsPath":Ljava/lang/String;
} // .end local v8 # "filePath":Ljava/lang/String;
} // .end local v9 # "index":I
/* :catch_0 */
/* move-exception v7 */
/* .line 125 */
/* .local v7, "ex":Ljava/lang/Exception; */
/* new-instance v1, Ljava/io/FileNotFoundException; */
/* invoke-direct {v1}, Ljava/io/FileNotFoundException;-><init>()V */
/* throw v1 */
} // .end method
public android.os.ParcelFileDescriptor openFile ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .param p2, "mode" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 33 */
/* if-nez p1, :cond_0 */
/* .line 35 */
/* new-instance v2, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw v2 */
/* .line 39 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "/data/data/"; // const-string v3, "/data/data/"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.ansca.corona.FileContentProvider ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/ansca/corona/FileContentProvider;->getContext()Landroid/content/Context;
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.net.Uri ) p1 ).getPath ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 40 */
/* .local v1, "filePath":Ljava/lang/String; */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 41 */
/* .local v0, "file":Ljava/io/File; */
/* if-nez v0, :cond_1 */
/* .line 43 */
/* new-instance v2, Ljava/io/FileNotFoundException; */
/* invoke-direct {v2}, Ljava/io/FileNotFoundException;-><init>()V */
/* throw v2 */
/* .line 45 */
} // :cond_1
/* const/high16 v2, 0x10000000 */
android.os.ParcelFileDescriptor .open ( v0,v2 );
} // .end method
public android.database.Cursor query ( android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4 ) {
/* .locals 1 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .param p2, "projection" # [Ljava/lang/String; */
/* .param p3, "selection" # Ljava/lang/String; */
/* .param p4, "selectionArgs" # [Ljava/lang/String; */
/* .param p5, "sortOrder" # Ljava/lang/String; */
/* .prologue */
/* .line 194 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer update ( android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3 ) {
/* .locals 2 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .param p2, "values" # Landroid/content/ContentValues; */
/* .param p3, "selection" # Ljava/lang/String; */
/* .param p4, "selectionArgs" # [Ljava/lang/String; */
/* .prologue */
/* .line 208 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Not supported by this provider"; // const-string v1, "Not supported by this provider"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
