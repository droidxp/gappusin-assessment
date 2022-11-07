public class com.openfeint.internal.Util {
	 /* .source "Util.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 public static final Integer VERSION;
	 /* # direct methods */
	 static com.openfeint.internal.Util ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 v0 = android.os.Build$VERSION.SDK;
		 java.lang.Integer .valueOf ( v0 );
		 v0 = 		 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
		 return;
	 } // .end method
	 public com.openfeint.internal.Util ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void copyDirectory ( java.io.File p0, java.io.File p1 ) {
		 /* .locals 5 */
		 /* .param p0, "srcDir" # Ljava/io/File; */
		 /* .param p1, "dstDir" # Ljava/io/File; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 69 */
	 v2 = 	 (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 70 */
		 v2 = 		 (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
		 /* if-nez v2, :cond_0 */
		 /* .line 71 */
		 (( java.io.File ) p1 ).mkdir ( ); // invoke-virtual {p1}, Ljava/io/File;->mkdir()Z
		 /* .line 74 */
	 } // :cond_0
	 (( java.io.File ) p0 ).list ( ); // invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;
	 /* .line 75 */
	 /* .local v0, "children":[Ljava/lang/String; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .local v1, "i":I */
} // :goto_0
/* array-length v2, v0 */
/* if-ge v1, v2, :cond_2 */
/* .line 76 */
/* new-instance v2, Ljava/io/File; */
/* aget-object v3, v0, v1 */
/* invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* new-instance v3, Ljava/io/File; */
/* aget-object v4, v0, v1 */
/* invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
com.openfeint.internal.Util .copyDirectory ( v2,v3 );
/* .line 75 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 81 */
} // .end local v0 # "children":[Ljava/lang/String;
} // .end local v1 # "i":I
} // :cond_1
com.openfeint.internal.Util .copyFile ( p0,p1 );
/* .line 83 */
} // :cond_2
return;
} // .end method
public static void copyFile ( java.io.File p0, java.io.File p1 ) {
/* .locals 2 */
/* .param p0, "src" # Ljava/io/File; */
/* .param p1, "dst" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 86 */
/* new-instance v0, Ljava/io/FileInputStream; */
/* invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 87 */
/* .local v0, "in":Ljava/io/InputStream; */
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 88 */
/* .local v1, "out":Ljava/io/OutputStream; */
com.openfeint.internal.Util .copyStream ( v0,v1 );
/* .line 89 */
return;
} // .end method
public static void copyStream ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 0 */
/* .param p0, "in" # Ljava/io/InputStream; */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 102 */
com.openfeint.internal.Util .copyStreamAndLeaveInputOpen ( p0,p1 );
/* .line 103 */
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 104 */
return;
} // .end method
public static void copyStreamAndLeaveInputOpen ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 3 */
/* .param p0, "in" # Ljava/io/InputStream; */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 94 */
/* const/16 v2, 0x4000 */
/* new-array v0, v2, [B */
/* .line 95 */
/* .local v0, "copyBuffer":[B */
} // :goto_0
v1 = (( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
/* .local v1, "len":I */
/* if-lez v1, :cond_0 */
/* .line 96 */
int v2 = 0; // const/4 v2, 0x0
(( java.io.OutputStream ) p1 ).write ( v0, v2, v1 ); // invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V
/* .line 98 */
} // :cond_0
(( java.io.OutputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
/* .line 99 */
return;
} // .end method
public static void createSymbolic ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p0, "dst" # Ljava/lang/String; */
/* .param p1, "src" # Ljava/lang/String; */
/* .prologue */
/* .line 144 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "ln -s "; // const-string v1, "ln -s "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.Util .run ( v0 );
/* .line 145 */
return;
} // .end method
public static void deleteFiles ( java.io.File p0 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/io/File; */
/* .prologue */
/* .line 56 */
v6 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 57 */
(( java.io.File ) p0 ).list ( ); // invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;
/* .line 58 */
/* .local v2, "files":[Ljava/lang/String; */
/* move-object v0, v2 */
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v4, v0 */
/* .local v4, "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i$":I */
} // :goto_0
/* if-ge v3, v4, :cond_0 */
/* aget-object v5, v0, v3 */
/* .line 59 */
/* .local v5, "name":Ljava/lang/String; */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 60 */
/* .local v1, "child":Ljava/io/File; */
com.openfeint.internal.Util .deleteFiles ( v1 );
/* .line 58 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 63 */
} // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v1 # "child":Ljava/io/File;
} // .end local v2 # "files":[Ljava/lang/String;
} // .end local v3 # "i$":I
} // .end local v4 # "len$":I
} // .end local v5 # "name":Ljava/lang/String;
} // :cond_0
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* .line 64 */
return;
} // .end method
public static android.util.DisplayMetrics getDisplayMetrics ( ) {
/* .locals 4 */
/* .prologue */
/* .line 127 */
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 128 */
/* .local v0, "metrics":Landroid/util/DisplayMetrics; */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
final String v3 = "window"; // const-string v3, "window"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
/* .line 129 */
/* .local v1, "wm":Landroid/view/WindowManager; */
(( android.view.Display ) v2 ).getMetrics ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 130 */
} // .end method
public static java.lang.String getDpiName ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 249 */
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 250 */
/* .local v0, "metrics":Landroid/util/DisplayMetrics; */
final String v2 = "window"; // const-string v2, "window"
(( android.content.Context ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
/* .line 251 */
/* .local v1, "winMan":Landroid/view/WindowManager; */
(( android.view.Display ) v2 ).getMetrics ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 252 */
/* iget v2, v0, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 v3, 0x40000000 # 2.0f */
/* cmpl-float v2, v2, v3 */
/* if-ltz v2, :cond_0 */
/* .line 253 */
final String v2 = "udpi"; // const-string v2, "udpi"
/* .line 257 */
} // :goto_0
/* .line 254 */
} // :cond_0
/* iget v2, v0, Landroid/util/DisplayMetrics;->density:F */
/* float-to-double v2, v2 */
/* const-wide/high16 v4, 0x3ff8000000000000L # 1.5 */
/* cmpl-double v2, v2, v4 */
/* if-ltz v2, :cond_1 */
/* .line 255 */
final String v2 = "hdpi"; // const-string v2, "hdpi"
/* .line 257 */
} // :cond_1
final String v2 = "mdpi"; // const-string v2, "mdpi"
} // .end method
public static java.lang.Object getObjFromJson ( Object[] p0 ) {
/* .locals 6 */
/* .param p0, "json" # [B */
/* .prologue */
/* .line 224 */
/* new-instance v3, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v3}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 226 */
/* .local v3, "jsonFactory":Lorg/codehaus/jackson/JsonFactory; */
try { // :try_start_0
(( org.codehaus.jackson.JsonFactory ) v3 ).createJsonParser ( p0 ); // invoke-virtual {v3, p0}, Lorg/codehaus/jackson/JsonFactory;->createJsonParser([B)Lorg/codehaus/jackson/JsonParser;
/* .line 227 */
/* .local v1, "jp":Lorg/codehaus/jackson/JsonParser; */
/* new-instance v2, Lcom/openfeint/internal/JsonResourceParser; */
/* invoke-direct {v2, v1}, Lcom/openfeint/internal/JsonResourceParser;-><init>(Lorg/codehaus/jackson/JsonParser;)V */
/* .line 228 */
/* .local v2, "jrp":Lcom/openfeint/internal/JsonResourceParser; */
(( com.openfeint.internal.JsonResourceParser ) v2 ).parse ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/JsonResourceParser;->parse()Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 232 */
} // .end local v1 # "jp":Lorg/codehaus/jackson/JsonParser;
} // .end local v2 # "jrp":Lcom/openfeint/internal/JsonResourceParser;
} // :goto_0
/* .line 229 */
/* :catch_0 */
/* move-exception v0 */
/* .line 230 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v4 = "Util"; // const-string v4, "Util"
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 232 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public static java.lang.Object getObjFromJson ( Object[] p0, com.openfeint.internal.resource.ResourceClass p1 ) {
/* .locals 7 */
/* .param p0, "json" # [B */
/* .param p1, "resourceClass" # Lcom/openfeint/internal/resource/ResourceClass; */
/* .prologue */
/* .line 236 */
/* new-instance v3, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v3}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 237 */
/* .local v3, "jsonFactory":Lorg/codehaus/jackson/JsonFactory; */
final String v4 = "Util"; // const-string v4, "Util"
/* new-instance v5, Ljava/lang/String; */
/* invoke-direct {v5, p0}, Ljava/lang/String;-><init>([B)V */
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 239 */
try { // :try_start_0
(( org.codehaus.jackson.JsonFactory ) v3 ).createJsonParser ( p0 ); // invoke-virtual {v3, p0}, Lorg/codehaus/jackson/JsonFactory;->createJsonParser([B)Lorg/codehaus/jackson/JsonParser;
/* .line 240 */
/* .local v1, "jp":Lorg/codehaus/jackson/JsonParser; */
/* new-instance v2, Lcom/openfeint/internal/JsonResourceParser; */
/* invoke-direct {v2, v1}, Lcom/openfeint/internal/JsonResourceParser;-><init>(Lorg/codehaus/jackson/JsonParser;)V */
/* .line 241 */
/* .local v2, "jrp":Lcom/openfeint/internal/JsonResourceParser; */
(( com.openfeint.internal.JsonResourceParser ) v2 ).parse ( p1 ); // invoke-virtual {v2, p1}, Lcom/openfeint/internal/JsonResourceParser;->parse(Lcom/openfeint/internal/resource/ResourceClass;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 245 */
} // .end local v1 # "jp":Lorg/codehaus/jackson/JsonParser;
} // .end local v2 # "jrp":Lcom/openfeint/internal/JsonResourceParser;
} // :goto_0
/* .line 242 */
/* :catch_0 */
/* move-exception v0 */
/* .line 243 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v4 = "Util"; // const-string v4, "Util"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "json error"; // const-string v6, "json error"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 245 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public static java.lang.Object getObjFromJsonFile ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 207 */
try { // :try_start_0
/* new-instance v0, Ljava/io/FileInputStream; */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 208 */
/* .local v0, "in":Ljava/io/InputStream; */
com.openfeint.internal.Util .getObjFromJsonStream ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 211 */
} // .end local v0 # "in":Ljava/io/InputStream;
} // :goto_0
/* .line 209 */
/* :catch_0 */
/* move-exception v1 */
/* .line 211 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public static java.lang.Object getObjFromJsonStream ( java.io.InputStream p0 ) {
/* .locals 4 */
/* .param p0, "in" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 215 */
/* new-instance v2, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v2}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 216 */
/* .local v2, "jsonFactory":Lorg/codehaus/jackson/JsonFactory; */
(( org.codehaus.jackson.JsonFactory ) v2 ).createJsonParser ( p0 ); // invoke-virtual {v2, p0}, Lorg/codehaus/jackson/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lorg/codehaus/jackson/JsonParser;
/* .line 217 */
/* .local v0, "jp":Lorg/codehaus/jackson/JsonParser; */
/* new-instance v1, Lcom/openfeint/internal/JsonResourceParser; */
/* invoke-direct {v1, v0}, Lcom/openfeint/internal/JsonResourceParser;-><init>(Lorg/codehaus/jackson/JsonParser;)V */
/* .line 218 */
/* .local v1, "jrp":Lcom/openfeint/internal/JsonResourceParser; */
(( com.openfeint.internal.JsonResourceParser ) v1 ).parse ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/JsonResourceParser;->parse()Ljava/lang/Object;
/* .line 219 */
/* .local v3, "obj":Ljava/lang/Object; */
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 220 */
} // .end method
public static Boolean isPadVersion ( ) {
/* .locals 2 */
/* .prologue */
/* .line 32 */
/* const/16 v1, 0xb */
/* if-lt v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean isSymblic ( java.io.File p0 ) {
/* .locals 3 */
/* .param p0, "f" # Ljava/io/File; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 149 */
try { // :try_start_0
(( java.io.File ) p0 ).getCanonicalPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
(( java.io.File ) p0 ).getAbsolutePath ( ); // invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
v1 = /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 152 */
} // :cond_0
} // :goto_0
/* .line 150 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public static void moveWebCache ( android.content.Context p0 ) {
/* .locals 5 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 165 */
v3 = com.openfeint.internal.Util .noSdcardPermission ( p0 );
/* if-nez v3, :cond_1 */
/* .line 181 */
} // :cond_0
} // :goto_0
return;
/* .line 166 */
} // :cond_1
/* new-instance v0, Ljava/io/File; */
(( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
final String v4 = "webviewCache"; // const-string v4, "webviewCache"
/* invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 168 */
/* .local v0, "cache":Ljava/io/File; */
v3 = com.openfeint.internal.Util .isSymblic ( v0 );
/* if-nez v3, :cond_0 */
/* .line 171 */
android.os.Environment .getExternalStorageState ( );
/* .line 172 */
/* .local v2, "state":Ljava/lang/String; */
final String v3 = "mounted"; // const-string v3, "mounted"
v3 = (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 175 */
/* new-instance v1, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
final String v4 = "openfeint/cache"; // const-string v4, "openfeint/cache"
/* invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 176 */
/* .local v1, "sdcard":Ljava/io/File; */
v3 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v3, :cond_2 */
/* .line 177 */
(( java.io.File ) v1 ).mkdirs ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
/* .line 179 */
} // :cond_2
com.openfeint.internal.Util .deleteFiles ( v0 );
/* .line 180 */
(( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
com.openfeint.internal.Util .createSymbolic ( v3,v4 );
} // .end method
public static Boolean noPermission ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 3 */
/* .param p0, "permission" # Ljava/lang/String; */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 184 */
int v0 = -1; // const/4 v0, -0x1
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v1 = (( android.content.pm.PackageManager ) v1 ).checkPermission ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean noSdcardPermission ( ) {
/* .locals 1 */
/* .prologue */
/* .line 189 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
v0 = com.openfeint.internal.Util .noSdcardPermission ( v0 );
} // .end method
public static Boolean noSdcardPermission ( android.content.Context p0 ) {
/* .locals 1 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 193 */
final String v0 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"
v0 = com.openfeint.internal.Util .noPermission ( v0,p0 );
} // .end method
public static readWholeFile ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 197 */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 198 */
/* .local v1, "f":Ljava/io/File; */
(( java.io.File ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/io/File;->length()J
/* move-result-wide v4 */
/* long-to-int v3, v4 */
/* .line 199 */
/* .local v3, "len":I */
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 200 */
/* .local v2, "in":Ljava/io/InputStream; */
/* new-array v0, v3, [B */
/* .line 201 */
/* .local v0, "b":[B */
(( java.io.InputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
/* .line 202 */
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* .line 203 */
} // .end method
public static void run ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "cmd" # Ljava/lang/String; */
/* .prologue */
/* .line 135 */
try { // :try_start_0
java.lang.Runtime .getRuntime ( );
(( java.lang.Runtime ) v1 ).exec ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
/* .line 136 */
final String v1 = "Util"; // const-string v1, "Util"
com.openfeint.internal.OpenFeintInternal .log ( v1,p0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 141 */
} // :goto_0
return;
/* .line 138 */
/* :catch_0 */
/* move-exception v0 */
/* .line 139 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "Util"; // const-string v1, "Util"
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
} // .end method
public static void saveFile ( Object[] p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "in" # [B */
/* .param p1, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 107 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 108 */
/* .local v0, "file":Ljava/io/File; */
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
(( java.io.File ) v2 ).mkdirs ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
/* .line 109 */
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 110 */
/* .local v1, "out":Ljava/io/FileOutputStream; */
(( java.io.FileOutputStream ) v1 ).write ( p0 ); // invoke-virtual {v1, p0}, Ljava/io/FileOutputStream;->write([B)V
/* .line 111 */
(( java.io.FileOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
/* .line 112 */
return;
} // .end method
public static void saveStream ( java.io.InputStream p0, java.lang.String p1 ) {
/* .locals 0 */
/* .param p0, "in" # Ljava/io/InputStream; */
/* .param p1, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 122 */
com.openfeint.internal.Util .saveStreamAndLeaveInputOpen ( p0,p1 );
/* .line 123 */
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 124 */
return;
} // .end method
public static void saveStreamAndLeaveInputOpen ( java.io.InputStream p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "in" # Ljava/io/InputStream; */
/* .param p1, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 115 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 116 */
/* .local v0, "file":Ljava/io/File; */
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
(( java.io.File ) v2 ).mkdirs ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
/* .line 117 */
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 118 */
/* .local v1, "out":Ljava/io/FileOutputStream; */
com.openfeint.internal.Util .copyStreamAndLeaveInputOpen ( p0,v1 );
/* .line 119 */
return;
} // .end method
public static Boolean sdcardReady ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 156 */
v2 = com.openfeint.internal.Util .noSdcardPermission ( p0 );
/* if-nez v2, :cond_1 */
/* .line 161 */
} // :cond_0
} // :goto_0
/* .line 157 */
} // :cond_1
android.os.Environment .getExternalStorageState ( );
/* .line 158 */
/* .local v0, "state":Ljava/lang/String; */
final String v2 = "mounted"; // const-string v2, "mounted"
v2 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 161 */
int v1 = 1; // const/4 v1, 0x1
} // .end method
public static void setOrientation ( android.app.Activity p0 ) {
/* .locals 3 */
/* .param p0, "act" # Landroid/app/Activity; */
/* .prologue */
/* .line 36 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getSettings ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getSettings()Ljava/util/Map;
final String v2 = "RequestedOrientation"; // const-string v2, "RequestedOrientation"
/* check-cast v0, Ljava/lang/Integer; */
/* .line 38 */
/* .local v0, "orientation":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 39 */
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.app.Activity ) p0 ).setRequestedOrientation ( v1 ); // invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V
/* .line 41 */
} // :cond_0
return;
} // .end method
public static final toByteArray ( java.io.InputStream p0 ) {
/* .locals 5 */
/* .param p0, "is" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 44 */
/* const/16 v0, 0x1000 */
/* .line 45 */
/* .local v0, "CHUNK_SIZE":I */
/* const/16 v4, 0x1000 */
/* new-array v3, v4, [B */
/* .line 46 */
/* .local v3, "readBuffer":[B */
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 48 */
/* .local v1, "accumulator":Ljava/io/ByteArrayOutputStream; */
} // :goto_0
v2 = (( java.io.InputStream ) p0 ).read ( v3 ); // invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I
/* .local v2, "count":I */
/* if-lez v2, :cond_0 */
/* .line 49 */
int v4 = 0; // const/4 v4, 0x0
(( java.io.ByteArrayOutputStream ) v1 ).write ( v3, v4, v2 ); // invoke-virtual {v1, v3, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 51 */
} // :cond_0
(( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 52 */
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // .end method
