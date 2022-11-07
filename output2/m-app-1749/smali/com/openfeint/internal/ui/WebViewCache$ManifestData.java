class com.openfeint.internal.ui.WebViewCache$ManifestData {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "ManifestData" */
} // .end annotation
/* # instance fields */
java.util.Set globals;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Map objects;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$ManifestData ( ) {
/* .locals 12 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
int v9 = 0; // const/4 v9, 0x0
/* .line 223 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 221 */
/* new-instance v10, Ljava/util/HashSet; */
/* invoke-direct {v10}, Ljava/util/HashSet;-><init>()V */
this.globals = v10;
/* .line 222 */
/* new-instance v10, Ljava/util/HashMap; */
/* invoke-direct {v10}, Ljava/util/HashMap;-><init>()V */
this.objects = v10;
/* .line 224 */
int v7 = 0; // const/4 v7, 0x0
/* .line 226 */
/* .local v7, "result":Landroid/database/Cursor; */
try { // :try_start_0
final String v10 = "SELECT path, hash, is_global FROM server_manifest"; // const-string v10, "SELECT path, hash, is_global FROM server_manifest"
int v11 = 0; // const/4 v11, 0x0
(( android.database.sqlite.SQLiteDatabase ) p1 ).rawQuery ( v10, v11 ); // invoke-virtual {p1, v10, v11}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
v10 = /* .line 227 */
/* if-lez v10, :cond_2 */
/* .line 228 */
/* .line 230 */
} // :cond_0
int v10 = 0; // const/4 v10, 0x0
/* .line 231 */
/* .local v6, "path":Ljava/lang/String; */
int v10 = 1; // const/4 v10, 0x1
/* .line 232 */
/* .local v2, "hash":Ljava/lang/String; */
v10 = int v10 = 2; // const/4 v10, 0x2
if ( v10 != null) { // if-eqz v10, :cond_5
/* move v4, v8 */
/* .line 234 */
/* .local v4, "isGlobal":Z */
} // :goto_0
v10 = this.objects;
/* new-instance v11, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* invoke-direct {v11, v6, v2}, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 235 */
if ( v4 != null) { // if-eqz v4, :cond_1
v10 = this.globals;
/* .line 236 */
v10 = } // :cond_1
/* if-nez v10, :cond_0 */
/* .line 238 */
} // .end local v2 # "hash":Ljava/lang/String;
} // .end local v4 # "isGlobal":Z
} // .end local v6 # "path":Ljava/lang/String;
} // :cond_2
/* .line 240 */
v8 = this.objects;
/* .local v3, "i$":Ljava/util/Iterator; */
v8 = } // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_6
/* check-cast v6, Ljava/lang/String; */
/* .line 242 */
/* .restart local v6 # "path":Ljava/lang/String; */
final String v8 = "SELECT has_dependency FROM dependencies WHERE path = ?"; // const-string v8, "SELECT has_dependency FROM dependencies WHERE path = ?"
int v9 = 1; // const/4 v9, 0x1
/* new-array v9, v9, [Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
/* aput-object v6, v9, v10 */
(( android.database.sqlite.SQLiteDatabase ) p1 ).rawQuery ( v8, v9 ); // invoke-virtual {p1, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
v8 = /* .line 243 */
/* if-lez v8, :cond_4 */
/* .line 244 */
v8 = this.objects;
/* check-cast v5, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 245 */
/* .local v5, "manifestItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 246 */
v0 = this.dependentObjects;
/* .line 247 */
/* .local v0, "deps":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .line 249 */
} // :cond_3
int v8 = 0; // const/4 v8, 0x0
v8 = /* .line 250 */
/* if-nez v8, :cond_3 */
/* .line 253 */
} // .end local v0 # "deps":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
} // .end local v5 # "manifestItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // :cond_4
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 255 */
} // .end local v3 # "i$":Ljava/util/Iterator;
} // .end local v6 # "path":Ljava/lang/String;
/* :catch_0 */
/* move-exception v1 */
/* .line 256 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
try { // :try_start_1
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 260 */
try { // :try_start_2
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 262 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
} // :goto_2
return;
/* .restart local v2 # "hash":Ljava/lang/String; */
/* .restart local v6 # "path":Ljava/lang/String; */
} // :cond_5
/* move v4, v9 */
/* .line 232 */
/* .line 260 */
} // .end local v2 # "hash":Ljava/lang/String;
} // .end local v6 # "path":Ljava/lang/String;
/* .restart local v3 # "i$":Ljava/util/Iterator; */
} // :cond_6
try { // :try_start_3
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* :catch_1 */
/* move-exception v8 */
/* .line 257 */
} // .end local v3 # "i$":Ljava/util/Iterator;
/* :catch_2 */
/* move-exception v1 */
/* .line 258 */
/* .local v1, "e":Ljava/lang/Exception; */
try { // :try_start_4
final String v8 = "WebViewCache"; // const-string v8, "WebViewCache"
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "SQLite exception."; // const-string v10, "SQLite exception."
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v8,v9 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 260 */
try { // :try_start_5
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_3 */
/* :catch_3 */
/* move-exception v8 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v8 */
try { // :try_start_6
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_5 */
} // :goto_3
/* throw v8 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
/* :catch_4 */
/* move-exception v8 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_5 */
/* move-exception v9 */
} // .end method
 com.openfeint.internal.ui.WebViewCache$ManifestData ( ) {
/* .locals 10 */
/* .param p1, "stm" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 295 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 221 */
/* new-instance v8, Ljava/util/HashSet; */
/* invoke-direct {v8}, Ljava/util/HashSet;-><init>()V */
this.globals = v8;
/* .line 222 */
/* new-instance v8, Ljava/util/HashMap; */
/* invoke-direct {v8}, Ljava/util/HashMap;-><init>()V */
this.objects = v8;
/* .line 297 */
int v2 = 0; // const/4 v2, 0x0
/* .line 299 */
/* .local v2, "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
try { // :try_start_0
/* new-instance v7, Ljava/io/InputStreamReader; */
/* new-instance v8, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v8, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* invoke-direct {v7, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* .line 300 */
/* .local v7, "reader":Ljava/io/InputStreamReader; */
/* new-instance v0, Ljava/io/BufferedReader; */
/* const/16 v8, 0x2000 */
/* invoke-direct {v0, v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .local v0, "buffered":Ljava/io/BufferedReader; */
/* move-object v3, v2 */
/* .line 301 */
} // .end local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .local v3, "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
} // :cond_0
} // :goto_0
try { // :try_start_1
(( java.io.BufferedReader ) v0 ).readLine ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* .local v4, "line":Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 302 */
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 303 */
v8 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 304 */
int v8 = 0; // const/4 v8, 0x0
v8 = (( java.lang.String ) v4 ).charAt ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C
/* sparse-switch v8, :sswitch_data_0 */
/* .line 316 */
final String v8 = " "; // const-string v8, " "
(( java.lang.String ) v4 ).split ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 318 */
/* .local v6, "pieces":[Ljava/lang/String; */
/* array-length v8, v6 */
int v9 = 2; // const/4 v9, 0x2
/* if-lt v8, v9, :cond_3 */
/* .line 319 */
int v8 = 0; // const/4 v8, 0x0
/* aget-object v8, v6, v8 */
int v9 = 0; // const/4 v9, 0x0
v8 = (( java.lang.String ) v8 ).charAt ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C
/* const/16 v9, 0x40 */
/* if-ne v8, v9, :cond_2 */
/* .line 320 */
int v8 = 0; // const/4 v8, 0x0
/* aget-object v8, v6, v8 */
int v9 = 1; // const/4 v9, 0x1
(( java.lang.String ) v8 ).substring ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 321 */
/* .local v5, "path":Ljava/lang/String; */
v8 = this.globals;
/* .line 326 */
} // :goto_1
/* new-instance v2, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
int v8 = 1; // const/4 v8, 0x1
/* aget-object v8, v6, v8 */
/* invoke-direct {v2, v5, v8}, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 327 */
} // .end local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
try { // :try_start_2
v8 = this.objects;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
} // .end local v5 # "path":Ljava/lang/String;
} // .end local v6 # "pieces":[Ljava/lang/String;
} // :goto_2
/* move-object v3, v2 */
/* .line 332 */
} // .end local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* :sswitch_0 */
/* move-object v2, v3 */
/* .line 307 */
} // .end local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 309 */
} // .end local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* :sswitch_1 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 310 */
try { // :try_start_3
v8 = this.dependentObjects;
int v9 = 1; // const/4 v9, 0x1
(( java.lang.String ) v4 ).substring ( v9 ); // invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.String ) v9 ).trim ( ); // invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v2, v3 */
} // .end local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 312 */
} // .end local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
} // :cond_1
/* new-instance v8, Ljava/lang/Exception; */
final String v9 = "Manifest Syntax Error: Dependency without an item"; // const-string v9, "Manifest Syntax Error: Dependency without an item"
/* invoke-direct {v8, v9}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v8 */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .line 335 */
} // .end local v4 # "line":Ljava/lang/String;
/* :catch_0 */
/* move-exception v1 */
/* move-object v2, v3 */
/* .line 336 */
} // .end local v0 # "buffered":Ljava/io/BufferedReader;
} // .end local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v7 # "reader":Ljava/io/InputStreamReader;
/* .local v1, "e":Ljava/lang/Exception; */
/* .restart local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
} // :goto_3
/* new-instance v8, Ljava/lang/Exception; */
/* invoke-direct {v8, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V */
/* throw v8 */
/* .line 324 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // .end local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
/* .restart local v0 # "buffered":Ljava/io/BufferedReader; */
/* .restart local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .restart local v4 # "line":Ljava/lang/String; */
/* .restart local v6 # "pieces":[Ljava/lang/String; */
/* .restart local v7 # "reader":Ljava/io/InputStreamReader; */
} // :cond_2
int v8 = 0; // const/4 v8, 0x0
try { // :try_start_4
/* aget-object v5, v6, v8 */
/* .restart local v5 # "path":Ljava/lang/String; */
/* .line 329 */
} // .end local v5 # "path":Ljava/lang/String;
} // :cond_3
/* new-instance v8, Ljava/lang/Exception; */
final String v9 = "Manifest Syntax Error: Extra items in line"; // const-string v9, "Manifest Syntax Error: Extra items in line"
/* invoke-direct {v8, v9}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v8 */
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .line 338 */
} // .end local v6 # "pieces":[Ljava/lang/String;
} // :cond_4
return;
/* .line 335 */
} // .end local v0 # "buffered":Ljava/io/BufferedReader;
} // .end local v3 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v4 # "line":Ljava/lang/String;
} // .end local v7 # "reader":Ljava/io/InputStreamReader;
/* .restart local v2 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* :catch_1 */
/* move-exception v1 */
/* .line 304 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x23 -> :sswitch_0 */
/* 0x2d -> :sswitch_1 */
} // .end sparse-switch
} // .end method
/* # virtual methods */
void saveTo ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 11 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
/* .line 266 */
try { // :try_start_0
(( android.database.sqlite.SQLiteDatabase ) p1 ).beginTransaction ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
/* .line 267 */
final String v8 = "DELETE FROM server_manifest;"; // const-string v8, "DELETE FROM server_manifest;"
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v8 ); // invoke-virtual {p1, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 268 */
final String v8 = "DELETE FROM dependencies;"; // const-string v8, "DELETE FROM dependencies;"
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v8 ); // invoke-virtual {p1, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 269 */
final String v8 = "INSERT INTO server_manifest(path, hash, is_global) VALUES(?, ?, ?)"; // const-string v8, "INSERT INTO server_manifest(path, hash, is_global) VALUES(?, ?, ?)"
(( android.database.sqlite.SQLiteDatabase ) p1 ).compileStatement ( v8 ); // invoke-virtual {p1, v8}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
/* .line 270 */
/* .local v5, "insertIntoManifest":Landroid/database/sqlite/SQLiteStatement; */
final String v8 = "INSERT INTO dependencies(path, has_dependency) VALUES(?, ?)"; // const-string v8, "INSERT INTO dependencies(path, has_dependency) VALUES(?, ?)"
(( android.database.sqlite.SQLiteDatabase ) p1 ).compileStatement ( v8 ); // invoke-virtual {p1, v8}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
/* .line 271 */
/* .local v4, "insertIntoDependencies":Landroid/database/sqlite/SQLiteStatement; */
v8 = this.objects;
v8 = } // :cond_0
if ( v8 != null) { // if-eqz v8, :cond_2
/* check-cast v7, Ljava/lang/String; */
/* .line 272 */
/* .local v7, "path":Ljava/lang/String; */
v8 = this.objects;
/* check-cast v6, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 274 */
/* .local v6, "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
int v8 = 1; // const/4 v8, 0x1
(( android.database.sqlite.SQLiteStatement ) v5 ).bindString ( v8, v7 ); // invoke-virtual {v5, v8, v7}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 275 */
int v8 = 2; // const/4 v8, 0x2
v9 = this.hash;
(( android.database.sqlite.SQLiteStatement ) v5 ).bindString ( v8, v9 ); // invoke-virtual {v5, v8, v9}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 276 */
int v10 = 3; // const/4 v10, 0x3
v8 = v8 = this.globals;
if ( v8 != null) { // if-eqz v8, :cond_1
/* const-wide/16 v8, 0x1 */
} // :goto_0
(( android.database.sqlite.SQLiteStatement ) v5 ).bindLong ( v10, v8, v9 ); // invoke-virtual {v5, v10, v8, v9}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V
/* .line 277 */
(( android.database.sqlite.SQLiteStatement ) v5 ).execute ( ); // invoke-virtual {v5}, Landroid/database/sqlite/SQLiteStatement;->execute()V
/* .line 279 */
int v8 = 1; // const/4 v8, 0x1
(( android.database.sqlite.SQLiteStatement ) v4 ).bindString ( v8, v7 ); // invoke-virtual {v4, v8, v7}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 280 */
v8 = this.dependentObjects;
/* .local v3, "i$":Ljava/util/Iterator; */
v8 = } // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_0
/* check-cast v0, Ljava/lang/String; */
/* .line 281 */
/* .local v0, "dep":Ljava/lang/String; */
int v8 = 2; // const/4 v8, 0x2
(( android.database.sqlite.SQLiteStatement ) v4 ).bindString ( v8, v0 ); // invoke-virtual {v4, v8, v0}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 282 */
(( android.database.sqlite.SQLiteStatement ) v4 ).execute ( ); // invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->execute()V
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 286 */
} // .end local v0 # "dep":Ljava/lang/String;
} // .end local v3 # "i$":Ljava/util/Iterator;
} // .end local v4 # "insertIntoDependencies":Landroid/database/sqlite/SQLiteStatement;
} // .end local v5 # "insertIntoManifest":Landroid/database/sqlite/SQLiteStatement;
} // .end local v6 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v7 # "path":Ljava/lang/String;
/* :catch_0 */
/* move-exception v1 */
/* .line 287 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
try { // :try_start_1
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 291 */
try { // :try_start_2
(( android.database.sqlite.SQLiteDatabase ) p1 ).endTransaction ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 293 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
} // :goto_2
return;
/* .line 276 */
/* .restart local v4 # "insertIntoDependencies":Landroid/database/sqlite/SQLiteStatement; */
/* .restart local v5 # "insertIntoManifest":Landroid/database/sqlite/SQLiteStatement; */
/* .restart local v6 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .restart local v7 # "path":Ljava/lang/String; */
} // :cond_1
/* const-wide/16 v8, 0x0 */
/* .line 285 */
} // .end local v6 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v7 # "path":Ljava/lang/String;
} // :cond_2
try { // :try_start_3
(( android.database.sqlite.SQLiteDatabase ) p1 ).setTransactionSuccessful ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
/* :try_end_3 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 291 */
try { // :try_start_4
(( android.database.sqlite.SQLiteDatabase ) p1 ).endTransaction ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* :catch_1 */
/* move-exception v8 */
/* .line 288 */
} // .end local v4 # "insertIntoDependencies":Landroid/database/sqlite/SQLiteStatement;
} // .end local v5 # "insertIntoManifest":Landroid/database/sqlite/SQLiteStatement;
/* :catch_2 */
/* move-exception v1 */
/* .line 289 */
/* .local v1, "e":Ljava/lang/Exception; */
try { // :try_start_5
final String v8 = "WebViewCache"; // const-string v8, "WebViewCache"
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "SQLite exception."; // const-string v10, "SQLite exception."
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v8,v9 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 291 */
try { // :try_start_6
(( android.database.sqlite.SQLiteDatabase ) p1 ).endTransaction ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_3 */
/* :catch_3 */
/* move-exception v8 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v8 */
try { // :try_start_7
(( android.database.sqlite.SQLiteDatabase ) p1 ).endTransaction ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_5 */
} // :goto_3
/* throw v8 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
/* :catch_4 */
/* move-exception v8 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_5 */
/* move-exception v9 */
} // .end method
