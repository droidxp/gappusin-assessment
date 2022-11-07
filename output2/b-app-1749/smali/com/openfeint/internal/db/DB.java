public class com.openfeint.internal.db.DB {
	 /* .source "DB.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/db/DB$DataStorageHelper;, */
	 /* Lcom/openfeint/internal/db/DB$DataStorageHelperX; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String DBNAME;
private static final java.lang.String DBPATH;
private static final java.lang.String TAG;
private static final Integer VERSION;
public static com.openfeint.internal.db.DB$DataStorageHelperX storeHelper;
/* # direct methods */
public com.openfeint.internal.db.DB ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 16 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 143 */
	 return;
} // .end method
static void access$000 ( android.database.sqlite.SQLiteDatabase p0 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Landroid/database/sqlite/SQLiteDatabase; */
	 /* .prologue */
	 /* .line 16 */
	 com.openfeint.internal.db.DB .onCreate ( p0 );
	 return;
} // .end method
static void access$100 ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Landroid/database/sqlite/SQLiteDatabase; */
	 /* .param p1, "x1" # I */
	 /* .param p2, "x2" # I */
	 /* .prologue */
	 /* .line 16 */
	 com.openfeint.internal.db.DB .onUpgrade ( p0,p1,p2 );
	 return;
} // .end method
public static void createDB ( android.content.Context p0 ) {
	 /* .locals 5 */
	 /* .param p0, "ctx" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 36 */
	 v2 = 	 com.openfeint.internal.Util .noSdcardPermission ( );
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 37 */
		 /* new-instance v2, Lcom/openfeint/internal/db/DB$DataStorageHelperX; */
		 /* invoke-direct {v2, p0}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;-><init>(Landroid/content/Context;)V */
		 /* .line 47 */
	 } // :goto_0
	 return;
	 /* .line 40 */
} // :cond_0
android.os.Environment .getExternalStorageState ( );
/* .line 41 */
/* .local v1, "state":Ljava/lang/String; */
final String v2 = "mounted"; // const-string v2, "mounted"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 42 */
	 android.os.Environment .getExternalStorageDirectory ( );
	 /* .line 43 */
	 /* .local v0, "sdcard":Ljava/io/File; */
	 /* new-instance v2, Lcom/openfeint/internal/db/DB$DataStorageHelperX; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v4 = "/openfeint/webui/manifest.db"; // const-string v4, "/openfeint/webui/manifest.db"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v2, v3}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;-><init>(Ljava/lang/String;)V */
	 /* .line 45 */
} // .end local v0 # "sdcard":Ljava/io/File;
} // :cond_1
/* new-instance v2, Lcom/openfeint/internal/db/DB$DataStorageHelperX; */
/* invoke-direct {v2, p0}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;-><init>(Landroid/content/Context;)V */
} // .end method
private static void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 2 */
/* .param p0, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
/* .line 101 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 3; // const/4 v1, 0x3
com.openfeint.internal.db.DB .onUpgrade ( p0,v0,v1 );
/* .line 102 */
return;
} // .end method
private static void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p0, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .param p1, "oldVersion" # I */
/* .param p2, "newVersion" # I */
/* .prologue */
int v2 = 2; // const/4 v2, 0x2
int v5 = 1; // const/4 v5, 0x1
/* .line 108 */
/* if-nez p1, :cond_0 */
/* .line 109 */
final String v0 = "CREATE TABLE IF NOT EXISTS manifest (path TEXT PRIMARY KEY, hash TEXT);"; // const-string v0, "CREATE TABLE IF NOT EXISTS manifest (path TEXT PRIMARY KEY, hash TEXT);"
(( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 110 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 112 */
} // :cond_0
/* if-ne p1, v5, :cond_1 */
/* .line 113 */
final String v0 = "CREATE TABLE IF NOT EXISTS store (ID TEXT PRIMARY KEY, VALUE TEXT);"; // const-string v0, "CREATE TABLE IF NOT EXISTS store (ID TEXT PRIMARY KEY, VALUE TEXT);"
(( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 114 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 116 */
} // :cond_1
/* if-ne p1, v2, :cond_2 */
/* .line 117 */
final String v0 = "CREATE TABLE IF NOT EXISTS server_manifest (path TEXT PRIMARY KEY NOT NULL, hash TEXT DEFAULT NULL, is_global INTEGER DEFAULT 0);"; // const-string v0, "CREATE TABLE IF NOT EXISTS server_manifest (path TEXT PRIMARY KEY NOT NULL, hash TEXT DEFAULT NULL, is_global INTEGER DEFAULT 0);"
(( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 118 */
final String v0 = "CREATE TABLE IF NOT EXISTS dependencies (path TEXT NOT NULL, has_dependency TEXT NOT NULL);"; // const-string v0, "CREATE TABLE IF NOT EXISTS dependencies (path TEXT NOT NULL, has_dependency TEXT NOT NULL);"
(( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 119 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 121 */
} // :cond_2
/* if-eq p1, p2, :cond_3 */
final String v0 = "SQL"; // const-string v0, "SQL"
final String v1 = "Unable to upgrade DB from %d to %d."; // const-string v1, "Unable to upgrade DB from %d to %d."
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Integer .valueOf ( p1 );
/* aput-object v4, v2, v3 */
java.lang.Integer .valueOf ( p2 );
/* aput-object v3, v2, v5 */
java.lang.String .format ( v1,v2 );
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 122 */
} // :cond_3
return;
} // .end method
public static Boolean recover ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 50 */
v1 = com.openfeint.internal.db.DB.storeHelper;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 51 */
v1 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v1 ).close ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->close()V
/* .line 53 */
} // :cond_0
v0 = com.openfeint.internal.db.DB .removeDB ( p0 );
/* .line 54 */
/* .local v0, "success":Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 55 */
com.openfeint.internal.db.DB .createDB ( p0 );
/* .line 56 */
v1 = com.openfeint.internal.db.DB.storeHelper;
if ( v1 != null) { // if-eqz v1, :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 58 */
} // :cond_1
} // :goto_0
/* .line 56 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static Boolean removeDB ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 21 */
v3 = com.openfeint.internal.Util .noSdcardPermission ( );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 22 */
final String v3 = "manifest.db"; // const-string v3, "manifest.db"
(( android.content.Context ) p0 ).getDatabasePath ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
v3 = (( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* .line 30 */
} // :goto_0
/* .line 24 */
} // :cond_0
android.os.Environment .getExternalStorageState ( );
/* .line 25 */
/* .local v2, "state":Ljava/lang/String; */
final String v3 = "mounted"; // const-string v3, "mounted"
v3 = (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 26 */
android.os.Environment .getExternalStorageDirectory ( );
/* .line 27 */
/* .local v1, "sdcard":Ljava/io/File; */
/* new-instance v0, Ljava/io/File; */
final String v3 = "/openfeint/webui/manifest.db"; // const-string v3, "/openfeint/webui/manifest.db"
/* invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 28 */
/* .local v0, "db":Ljava/io/File; */
v3 = (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* .line 30 */
} // .end local v0 # "db":Ljava/io/File;
} // .end local v1 # "sdcard":Ljava/io/File;
} // :cond_1
final String v3 = "manifest.db"; // const-string v3, "manifest.db"
(( android.content.Context ) p0 ).getDatabasePath ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
v3 = (( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
} // .end method
public static void setClientManifest ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "clientHash" # Ljava/lang/String; */
/* .prologue */
/* .line 86 */
try { // :try_start_0
v2 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v2 ).getWritableDatabase ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 87 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v2 = "INSERT OR REPLACE INTO manifest(path, hash) VALUES(?,?)"; // const-string v2, "INSERT OR REPLACE INTO manifest(path, hash) VALUES(?,?)"
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object p0, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* aput-object p1, v3, v4 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).execSQL ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 94 */
} // .end local v0 # "db":Landroid/database/sqlite/SQLiteDatabase;
} // :goto_0
return;
/* .line 89 */
/* :catch_0 */
/* move-exception v1 */
/* .line 90 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* .line 91 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_1 */
/* move-exception v1 */
/* .line 92 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v2 = "SQL"; // const-string v2, "SQL"
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
} // .end method
public static void setClientManifestBatch ( java.lang.String[] p0, java.lang.String[] p1 ) {
/* .locals 6 */
/* .param p0, "paths" # [Ljava/lang/String; */
/* .param p1, "clientHashes" # [Ljava/lang/String; */
/* .prologue */
/* .line 62 */
int v0 = 0; // const/4 v0, 0x0
/* .line 63 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* array-length v4, p0 */
/* array-length v5, p1 */
/* if-ne v4, v5, :cond_1 */
/* .line 64 */
try { // :try_start_0
v4 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v4 ).getWritableDatabase ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 65 */
final String v4 = "INSERT OR REPLACE INTO manifest(path, hash) VALUES(?,?)"; // const-string v4, "INSERT OR REPLACE INTO manifest(path, hash) VALUES(?,?)"
(( android.database.sqlite.SQLiteDatabase ) v0 ).compileStatement ( v4 ); // invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
/* .line 66 */
/* .local v3, "statement":Landroid/database/sqlite/SQLiteStatement; */
(( android.database.sqlite.SQLiteDatabase ) v0 ).beginTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
/* .line 67 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
/* array-length v4, p0 */
/* if-ge v2, v4, :cond_0 */
/* .line 68 */
int v4 = 1; // const/4 v4, 0x1
/* aget-object v5, p0, v2 */
(( android.database.sqlite.SQLiteStatement ) v3 ).bindString ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 69 */
int v4 = 2; // const/4 v4, 0x2
/* aget-object v5, p1, v2 */
(( android.database.sqlite.SQLiteStatement ) v3 ).bindString ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 70 */
(( android.database.sqlite.SQLiteStatement ) v3 ).execute ( ); // invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->execute()V
/* .line 67 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 72 */
} // :cond_0
(( android.database.sqlite.SQLiteStatement ) v3 ).close ( ); // invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->close()V
/* .line 73 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).setTransactionSuccessful ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 80 */
try { // :try_start_1
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_4 */
/* .line 82 */
} // .end local v2 # "i":I
} // .end local v3 # "statement":Landroid/database/sqlite/SQLiteStatement;
} // :cond_1
} // :goto_1
return;
/* .line 75 */
/* :catch_0 */
/* move-exception v1 */
/* .line 76 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
try { // :try_start_2
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 80 */
try { // :try_start_3
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* :catch_1 */
/* move-exception v4 */
/* .line 77 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_2 */
/* move-exception v1 */
/* .line 78 */
/* .local v1, "e":Ljava/lang/Exception; */
try { // :try_start_4
final String v4 = "SQL"; // const-string v4, "SQL"
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 80 */
try { // :try_start_5
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_3 */
/* :catch_3 */
/* move-exception v4 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v4 */
try { // :try_start_6
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_5 */
} // :goto_2
/* throw v4 */
/* .restart local v2 # "i":I */
/* .restart local v3 # "statement":Landroid/database/sqlite/SQLiteStatement; */
/* :catch_4 */
/* move-exception v4 */
} // .end local v2 # "i":I
} // .end local v3 # "statement":Landroid/database/sqlite/SQLiteStatement;
/* :catch_5 */
/* move-exception v5 */
} // .end method
