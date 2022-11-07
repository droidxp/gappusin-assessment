class com.jumptap.adtag.db.DBManager$JtSQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
	 /* .source "DBManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/db/DBManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "JtSQLiteOpenHelper" */
} // .end annotation
/* # direct methods */
 com.jumptap.adtag.db.DBManager$JtSQLiteOpenHelper ( ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 314 */
final String v0 = "jt_ad_view.db"; // const-string v0, "jt_ad_view.db"
int v1 = 0; // const/4 v1, 0x0
int v2 = 5; // const/4 v2, 0x5
/* invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V */
/* .line 315 */
return;
} // .end method
/* # virtual methods */
public void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 2 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
/* .line 319 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Creating database."; // const-string v1, "Creating database."
android.util.Log .w ( v0,v1 );
/* .line 321 */
final String v0 = "CREATE TABLE IF NOT EXISTS pending_events(id INTEGER PRIMARY KEY, eventType TEXT, date TEXT, url TEXT);"; // const-string v0, "CREATE TABLE IF NOT EXISTS pending_events(id INTEGER PRIMARY KEY, eventType TEXT, date TEXT, url TEXT);"
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 322 */
final String v0 = "CREATE TABLE IF NOT EXISTS video_cache(id INTEGER PRIMARY KEY, adid INTEGER,date TEXT);"; // const-string v0, "CREATE TABLE IF NOT EXISTS video_cache(id INTEGER PRIMARY KEY, adid INTEGER,date TEXT);"
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 323 */
return;
} // .end method
public void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .param p2, "oldVersion" # I */
/* .param p3, "newVersion" # I */
/* .prologue */
/* .line 327 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Upgrading database, this will drop tables and recreate."; // const-string v1, "Upgrading database, this will drop tables and recreate."
android.util.Log .w ( v0,v1 );
/* .line 328 */
final String v0 = "DROP TABLE IF EXISTS pending_events; DROP TABLE IF EXISTS video_cache;"; // const-string v0, "DROP TABLE IF EXISTS pending_events; DROP TABLE IF EXISTS video_cache;"
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 329 */
(( com.jumptap.adtag.db.DBManager$JtSQLiteOpenHelper ) p0 ).onCreate ( p1 ); // invoke-virtual {p0, p1}, Lcom/jumptap/adtag/db/DBManager$JtSQLiteOpenHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
/* .line 330 */
return;
} // .end method
