public class com.jumptap.adtag.db.DBManager {
	 /* .source "DBManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/db/DBManager$JtSQLiteOpenHelper; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String ADID_COLUMN;
private static final java.lang.String CREATE_PENDING_EVENTS_QUERY;
private static final java.lang.String CREATE_VIDEO_CACHE_QUERY;
private static final java.lang.String DATABASE_NAME;
private static final Integer DATABASE_VERSION;
private static final java.lang.String DATE_COLUMN;
private static final java.lang.String DROP_QUERY;
private static final java.lang.String EVENT_TYPE_COLUMN;
private static final java.lang.String ID_COLUMN;
private static final java.lang.String INSERT_EVENT_QUERY;
private static final java.lang.String INSERT_VIDEO_CACHE_QUERY;
private static final java.lang.String PENDING_EVENTS_TABLE_NAME;
private static final java.lang.String URL_COLUMN;
private static final java.lang.String VIDEO_CACHE_TABLE_NAME;
private static com.jumptap.adtag.db.DBManager dbManagerInstance;
/* # instance fields */
private android.content.Context context;
private android.database.sqlite.SQLiteDatabase db;
private android.database.sqlite.SQLiteStatement insertStmt;
/* # direct methods */
private com.jumptap.adtag.db.DBManager ( ) {
	 /* .locals 0 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 49 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 50 */
	 this.context = p1;
	 /* .line 51 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
	 /* .line 52 */
	 return;
} // .end method
public static com.jumptap.adtag.db.DBManager getInstance ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .param p0, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 60 */
	 v0 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
	 /* if-nez v0, :cond_0 */
	 /* .line 61 */
	 /* new-instance v0, Lcom/jumptap/adtag/db/DBManager; */
	 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/db/DBManager;-><init>(Landroid/content/Context;)V */
	 /* .line 63 */
} // :cond_0
v0 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
} // .end method
private void openDB ( ) {
/* .locals 2 */
/* .prologue */
/* .line 306 */
/* new-instance v0, Lcom/jumptap/adtag/db/DBManager$JtSQLiteOpenHelper; */
v1 = this.context;
/* invoke-direct {v0, v1}, Lcom/jumptap/adtag/db/DBManager$JtSQLiteOpenHelper;-><init>(Landroid/content/Context;)V */
/* .line 307 */
/* .local v0, "openHelper":Lcom/jumptap/adtag/db/DBManager$JtSQLiteOpenHelper; */
(( com.jumptap.adtag.db.DBManager$JtSQLiteOpenHelper ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/db/DBManager$JtSQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
this.db = v1;
/* .line 308 */
return;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
v0 = this.db;
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* .line 71 */
return;
} // .end method
public void deleteAllPendingEvents ( ) {
/* .locals 7 */
/* .prologue */
/* .line 102 */
v3 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v3 */
/* .line 104 */
try { // :try_start_0
	 v2 = this.db;
	 v1 = 	 (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
	 /* .line 105 */
	 /* .local v1, "isOpen":Z */
	 /* if-nez v1, :cond_0 */
	 /* .line 106 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
	 /* .line 108 */
} // :cond_0
v2 = this.db;
final String v4 = "pending_events"; // const-string v4, "pending_events"
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
(( android.database.sqlite.SQLiteDatabase ) v2 ).delete ( v4, v5, v6 ); // invoke-virtual {v2, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 113 */
} // .end local v1 # "isOpen":Z
} // :goto_0
try { // :try_start_1
/* monitor-exit v3 */
/* .line 114 */
return;
/* .line 109 */
/* :catch_0 */
/* move-exception v0 */
/* .line 110 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v4 = "Failed to delete all pending events table"; // const-string v4, "Failed to delete all pending events table"
android.util.Log .d ( v2,v4,v0 );
/* .line 113 */
} // .end local v0 # "e":Ljava/lang/IllegalStateException;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v2 */
} // .end method
public void deleteAllVideoCacheItems ( ) {
/* .locals 7 */
/* .prologue */
/* .line 248 */
v3 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v3 */
/* .line 250 */
try { // :try_start_0
v2 = this.db;
v1 = (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 251 */
/* .local v1, "isOpen":Z */
/* if-nez v1, :cond_0 */
/* .line 252 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 254 */
} // :cond_0
v2 = this.db;
final String v4 = "video_cache"; // const-string v4, "video_cache"
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
(( android.database.sqlite.SQLiteDatabase ) v2 ).delete ( v4, v5, v6 ); // invoke-virtual {v2, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 259 */
} // .end local v1 # "isOpen":Z
} // :goto_0
try { // :try_start_1
/* monitor-exit v3 */
/* .line 260 */
return;
/* .line 255 */
/* :catch_0 */
/* move-exception v0 */
/* .line 256 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v4 = "Failed to delete all video cache items table"; // const-string v4, "Failed to delete all video cache items table"
android.util.Log .d ( v2,v4,v0 );
/* .line 259 */
} // .end local v0 # "e":Ljava/lang/IllegalStateException;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v2 */
} // .end method
public void deleteEventById ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 122 */
v3 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v3 */
/* .line 124 */
try { // :try_start_0
v2 = this.db;
v1 = (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 125 */
/* .local v1, "isOpen":Z */
/* if-nez v1, :cond_0 */
/* .line 126 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 128 */
} // :cond_0
v2 = this.db;
final String v4 = "pending_events"; // const-string v4, "pending_events"
final String v5 = "id=?"; // const-string v5, "id=?"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v8, v6, v7 */
(( android.database.sqlite.SQLiteDatabase ) v2 ).delete ( v4, v5, v6 ); // invoke-virtual {v2, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 134 */
} // .end local v1 # "isOpen":Z
} // :goto_0
try { // :try_start_1
/* monitor-exit v3 */
/* .line 135 */
return;
/* .line 130 */
/* :catch_0 */
/* move-exception v0 */
/* .line 131 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Failed to delete event by id="; // const-string v5, "Failed to delete event by id="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v4,v0 );
/* .line 134 */
} // .end local v0 # "e":Ljava/lang/IllegalStateException;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v2 */
} // .end method
public void deleteVideoCacheItemByAdId ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "adid" # Ljava/lang/String; */
/* .prologue */
/* .line 268 */
v3 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v3 */
/* .line 270 */
try { // :try_start_0
v2 = this.db;
v1 = (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 271 */
/* .local v1, "isOpen":Z */
/* if-nez v1, :cond_0 */
/* .line 272 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 274 */
} // :cond_0
v2 = this.db;
final String v4 = "video_cache"; // const-string v4, "video_cache"
final String v5 = "adid=?"; // const-string v5, "adid=?"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
/* aput-object p1, v6, v7 */
(( android.database.sqlite.SQLiteDatabase ) v2 ).delete ( v4, v5, v6 ); // invoke-virtual {v2, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 282 */
} // .end local v1 # "isOpen":Z
} // :goto_0
try { // :try_start_1
/* monitor-exit v3 */
/* .line 283 */
return;
/* .line 276 */
/* :catch_0 */
/* move-exception v0 */
/* .line 277 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Failed to delete video chache item by adid="; // const-string v5, "Failed to delete video chache item by adid="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v4,v0 );
/* .line 282 */
} // .end local v0 # "e":Ljava/lang/IllegalStateException;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v2 */
} // .end method
public void deleteVideoCacheItemById ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 286 */
v3 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v3 */
/* .line 288 */
try { // :try_start_0
v2 = this.db;
v1 = (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 289 */
/* .local v1, "isOpen":Z */
/* if-nez v1, :cond_0 */
/* .line 290 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 292 */
} // :cond_0
v2 = this.db;
final String v4 = "video_cache"; // const-string v4, "video_cache"
final String v5 = "id=?"; // const-string v5, "id=?"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v8, v6, v7 */
(( android.database.sqlite.SQLiteDatabase ) v2 ).delete ( v4, v5, v6 ); // invoke-virtual {v2, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 299 */
} // .end local v1 # "isOpen":Z
} // :goto_0
try { // :try_start_1
/* monitor-exit v3 */
/* .line 300 */
return;
/* .line 294 */
/* :catch_0 */
/* move-exception v0 */
/* .line 295 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Failed to delete video chache item by id="; // const-string v5, "Failed to delete video chache item by id="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v4,v0 );
/* .line 299 */
} // .end local v0 # "e":Ljava/lang/IllegalStateException;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v2 */
} // .end method
public Long insertEvent ( com.jumptap.adtag.events.JtEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Lcom/jumptap/adtag/events/JtEvent; */
/* .prologue */
/* .line 82 */
v2 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v2 */
/* .line 83 */
try { // :try_start_0
v1 = this.db;
v0 = (( android.database.sqlite.SQLiteDatabase ) v1 ).isOpen ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 84 */
/* .local v0, "isOpen":Z */
/* if-nez v0, :cond_0 */
/* .line 85 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 87 */
} // :cond_0
v1 = this.db;
final String v3 = "insert into pending_events(eventType,date,url) values (?,?,?)"; // const-string v3, "insert into pending_events(eventType,date,url) values (?,?,?)"
(( android.database.sqlite.SQLiteDatabase ) v1 ).compileStatement ( v3 ); // invoke-virtual {v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
this.insertStmt = v1;
/* .line 88 */
v1 = this.insertStmt;
int v3 = 1; // const/4 v3, 0x1
(( com.jumptap.adtag.events.JtEvent ) p1 ).getEventType ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/JtEvent;->getEventType()Lcom/jumptap/adtag/events/EventType;
(( com.jumptap.adtag.events.EventType ) v4 ).name ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/events/EventType;->name()Ljava/lang/String;
(( android.database.sqlite.SQLiteStatement ) v1 ).bindString ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 91 */
v1 = this.insertStmt;
int v3 = 2; // const/4 v3, 0x2
(( com.jumptap.adtag.events.JtEvent ) p1 ).getDate ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/JtEvent;->getDate()Ljava/lang/String;
(( android.database.sqlite.SQLiteStatement ) v1 ).bindString ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 92 */
v1 = this.insertStmt;
int v3 = 3; // const/4 v3, 0x3
(( com.jumptap.adtag.events.JtEvent ) p1 ).getUrl ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/JtEvent;->getUrl()Ljava/lang/String;
(( android.database.sqlite.SQLiteStatement ) v1 ).bindString ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 93 */
v1 = this.insertStmt;
(( android.database.sqlite.SQLiteStatement ) v1 ).executeInsert ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
/* move-result-wide v3 */
/* monitor-exit v2 */
/* return-wide v3 */
/* .line 94 */
} // .end local v0 # "isOpen":Z
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public Long insertVideoCacheItem ( com.jumptap.adtag.media.VideoCacheItem p0 ) {
/* .locals 5 */
/* .param p1, "item" # Lcom/jumptap/adtag/media/VideoCacheItem; */
/* .prologue */
/* .line 200 */
v2 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v2 */
/* .line 201 */
try { // :try_start_0
v1 = this.db;
v0 = (( android.database.sqlite.SQLiteDatabase ) v1 ).isOpen ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 202 */
/* .local v0, "isOpen":Z */
/* if-nez v0, :cond_0 */
/* .line 203 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 206 */
} // :cond_0
v1 = this.db;
final String v3 = "insert into video_cache(adid,date) values (?,?)"; // const-string v3, "insert into video_cache(adid,date) values (?,?)"
(( android.database.sqlite.SQLiteDatabase ) v1 ).compileStatement ( v3 ); // invoke-virtual {v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
this.insertStmt = v1;
/* .line 208 */
v1 = this.insertStmt;
int v3 = 1; // const/4 v3, 0x1
(( com.jumptap.adtag.media.VideoCacheItem ) p1 ).getAdID ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/media/VideoCacheItem;->getAdID()Ljava/lang/String;
(( android.database.sqlite.SQLiteStatement ) v1 ).bindString ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 209 */
v1 = this.insertStmt;
int v3 = 2; // const/4 v3, 0x2
(( com.jumptap.adtag.media.VideoCacheItem ) p1 ).getDate ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/media/VideoCacheItem;->getDate()Ljava/lang/String;
(( android.database.sqlite.SQLiteStatement ) v1 ).bindString ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V
/* .line 210 */
v1 = this.insertStmt;
(( android.database.sqlite.SQLiteStatement ) v1 ).executeInsert ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
/* move-result-wide v3 */
/* monitor-exit v2 */
/* return-wide v3 */
/* .line 211 */
} // .end local v0 # "isOpen":Z
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public java.util.List selectAllEvents ( ) {
/* .locals 23 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/jumptap/adtag/events/JtEvent;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 144 */
v22 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v22 */
/* .line 145 */
int v12 = 0; // const/4 v12, 0x0
/* .line 146 */
/* .local v12, "cursor":Landroid/database/Cursor; */
int v10 = 0; // const/4 v10, 0x0
/* .line 148 */
/* .local v10, "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
try { // :try_start_0
/* new-instance v19, Ljava/util/ArrayList; */
/* invoke-direct/range {v19 ..v19}, Ljava/util/ArrayList;-><init>()V */
/* .line 149 */
/* .local v19, "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;" */
/* move-object/from16 v0, p0 */
v2 = this.db;
v18 = (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 150 */
/* .local v18, "isOpen":Z */
/* if-nez v18, :cond_0 */
/* .line 151 */
/* invoke-direct/range {p0 ..p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 153 */
} // :cond_0
/* move-object/from16 v0, p0 */
v2 = this.db;
final String v3 = "pending_events"; // const-string v3, "pending_events"
int v4 = 4; // const/4 v4, 0x4
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
final String v6 = "id"; // const-string v6, "id"
/* aput-object v6, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
final String v6 = "eventType"; // const-string v6, "eventType"
/* aput-object v6, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
final String v6 = "date"; // const-string v6, "date"
/* aput-object v6, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
final String v6 = "url"; // const-string v6, "url"
/* aput-object v6, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
final String v9 = "id asc"; // const-string v9, "id asc"
/* invoke-virtual/range {v2 ..v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 157 */
/* :try_end_0 */
v2 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_1
/* move-object v11, v10 */
/* .line 159 */
} // .end local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .local v11, "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
int v2 = 0; // const/4 v2, 0x0
v17 = try { // :try_start_1
/* .line 160 */
/* .local v17, "id":I */
int v2 = 1; // const/4 v2, 0x1
/* .line 161 */
/* .local v20, "s":Ljava/lang/String; */
if ( v20 != null) { // if-eqz v20, :cond_4
/* .line 162 */
int v2 = 1; // const/4 v2, 0x1
com.jumptap.adtag.events.EventType .valueOf ( v2 );
/* .line 164 */
/* .local v14, "eventType":Lcom/jumptap/adtag/events/EventType; */
int v2 = 2; // const/4 v2, 0x2
/* .line 165 */
/* .local v13, "date":Ljava/lang/String; */
int v2 = 3; // const/4 v2, 0x3
/* .line 166 */
/* .local v21, "url":Ljava/lang/String; */
/* new-instance v2, Lcom/jumptap/adtag/events/JtEvent; */
/* move/from16 v0, v17 */
/* move-object/from16 v1, v21 */
/* invoke-direct {v2, v0, v1, v14, v13}, Lcom/jumptap/adtag/events/JtEvent;-><init>(ILjava/lang/String;Lcom/jumptap/adtag/events/EventType;Ljava/lang/String;)V */
/* move-object/from16 v0, v19 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* move-object v10, v11 */
/* .line 173 */
} // .end local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
} // .end local v13 # "date":Ljava/lang/String;
} // .end local v14 # "eventType":Lcom/jumptap/adtag/events/EventType;
} // .end local v21 # "url":Ljava/lang/String;
/* .restart local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :goto_0
try { // :try_start_2
/* :try_end_2 */
v2 = /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* if-nez v2, :cond_1 */
/* .line 177 */
} // .end local v17 # "id":I
} // .end local v20 # "s":Ljava/lang/String;
} // :cond_2
if ( v12 != null) { // if-eqz v12, :cond_3
v2 = try { // :try_start_3
/* if-nez v2, :cond_3 */
/* .line 178 */
/* .line 181 */
} // :cond_3
v2 = if ( v10 != null) { // if-eqz v10, :cond_6
/* const/16 v3, 0xa */
/* if-le v2, v3, :cond_6 */
/* .line 184 */
/* .local v16, "i$":Ljava/util/Iterator; */
} // :goto_1
v2 = /* invoke-interface/range {v16 ..v16}, Ljava/util/Iterator;->hasNext()Z */
if ( v2 != null) { // if-eqz v2, :cond_6
/* invoke-interface/range {v16 ..v16}, Ljava/util/Iterator;->next()Ljava/lang/Object; */
/* check-cast v15, Ljava/lang/Integer; */
/* .line 185 */
/* .local v15, "i":Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v15 ).intValue ( ); // invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I
/* move-object/from16 v0, p0 */
(( com.jumptap.adtag.db.DBManager ) v0 ).deleteEventById ( v2 ); // invoke-virtual {v0, v2}, Lcom/jumptap/adtag/db/DBManager;->deleteEventById(I)V
/* .line 189 */
} // .end local v15 # "i":Ljava/lang/Integer;
} // .end local v16 # "i$":Ljava/util/Iterator;
} // .end local v18 # "isOpen":Z
} // .end local v19 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;"
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v22 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* throw v2 */
/* .line 168 */
} // .end local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .restart local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
/* .restart local v17 # "id":I */
/* .restart local v18 # "isOpen":Z */
/* .restart local v19 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;" */
/* .restart local v20 # "s":Ljava/lang/String; */
} // :cond_4
/* if-nez v11, :cond_8 */
/* .line 169 */
try { // :try_start_4
/* new-instance v10, Ljava/util/ArrayList; */
/* invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
/* .line 171 */
} // .end local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .restart local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :goto_2
try { // :try_start_5
/* new-instance v2, Ljava/lang/Integer; */
/* move/from16 v0, v17 */
/* invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 177 */
} // .end local v17 # "id":I
} // .end local v18 # "isOpen":Z
} // .end local v19 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;"
} // .end local v20 # "s":Ljava/lang/String;
/* :catchall_1 */
/* move-exception v2 */
} // :goto_3
if ( v12 != null) { // if-eqz v12, :cond_5
v3 = try { // :try_start_6
/* if-nez v3, :cond_5 */
/* .line 178 */
/* .line 181 */
} // :cond_5
v3 = if ( v10 != null) { // if-eqz v10, :cond_7
/* const/16 v4, 0xa */
/* if-le v3, v4, :cond_7 */
/* .line 184 */
/* .restart local v16 # "i$":Ljava/util/Iterator; */
} // :goto_4
v3 = /* invoke-interface/range {v16 ..v16}, Ljava/util/Iterator;->hasNext()Z */
if ( v3 != null) { // if-eqz v3, :cond_7
/* invoke-interface/range {v16 ..v16}, Ljava/util/Iterator;->next()Ljava/lang/Object; */
/* check-cast v15, Ljava/lang/Integer; */
/* .line 185 */
/* .restart local v15 # "i":Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v15 ).intValue ( ); // invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I
/* move-object/from16 v0, p0 */
(( com.jumptap.adtag.db.DBManager ) v0 ).deleteEventById ( v3 ); // invoke-virtual {v0, v3}, Lcom/jumptap/adtag/db/DBManager;->deleteEventById(I)V
} // .end local v15 # "i":Ljava/lang/Integer;
} // .end local v16 # "i$":Ljava/util/Iterator;
/* .restart local v18 # "isOpen":Z */
/* .restart local v19 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;" */
} // :cond_6
/* monitor-exit v22 */
} // .end local v18 # "isOpen":Z
} // .end local v19 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;"
} // :cond_7
/* throw v2 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* .line 177 */
} // .end local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .restart local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
/* .restart local v18 # "isOpen":Z */
/* .restart local v19 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;" */
/* :catchall_2 */
/* move-exception v2 */
/* move-object v10, v11 */
} // .end local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .restart local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // .end local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .restart local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
/* .restart local v17 # "id":I */
/* .restart local v20 # "s":Ljava/lang/String; */
} // :cond_8
/* move-object v10, v11 */
} // .end local v11 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* .restart local v10 # "bads":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // .end method
public java.util.List selectAllVideoCacheItems ( ) {
/* .locals 15 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/jumptap/adtag/media/VideoCacheItem;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 220 */
v14 = com.jumptap.adtag.db.DBManager.dbManagerInstance;
/* monitor-enter v14 */
/* .line 221 */
try { // :try_start_0
/* new-instance v13, Ljava/util/ArrayList; */
/* invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V */
/* .line 222 */
/* .local v13, "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/media/VideoCacheItem;>;" */
v0 = this.db;
v12 = (( android.database.sqlite.SQLiteDatabase ) v0 ).isOpen ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
/* .line 223 */
/* .local v12, "isOpen":Z */
/* if-nez v12, :cond_0 */
/* .line 224 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/db/DBManager;->openDB()V */
/* .line 226 */
} // :cond_0
v0 = this.db;
final String v1 = "video_cache"; // const-string v1, "video_cache"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "id"; // const-string v4, "id"
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
final String v4 = "adid"; // const-string v4, "adid"
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
final String v4 = "date"; // const-string v4, "date"
/* aput-object v4, v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
final String v7 = "id desc"; // const-string v7, "id desc"
/* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 229 */
v0 = /* .local v9, "cursor":Landroid/database/Cursor; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 231 */
} // :cond_1
v11 = int v0 = 0; // const/4 v0, 0x0
/* .line 232 */
/* .local v11, "id":I */
int v0 = 1; // const/4 v0, 0x1
/* .line 233 */
/* .local v8, "adid":Ljava/lang/String; */
int v0 = 2; // const/4 v0, 0x2
/* .line 234 */
/* .local v10, "date":Ljava/lang/String; */
/* new-instance v0, Lcom/jumptap/adtag/media/VideoCacheItem; */
/* invoke-direct {v0, v11, v8, v10}, Lcom/jumptap/adtag/media/VideoCacheItem;-><init>(ILjava/lang/String;Ljava/lang/String;)V */
v0 = /* .line 235 */
/* if-nez v0, :cond_1 */
/* .line 237 */
} // .end local v8 # "adid":Ljava/lang/String;
} // .end local v10 # "date":Ljava/lang/String;
} // .end local v11 # "id":I
} // :cond_2
v0 = if ( v9 != null) { // if-eqz v9, :cond_3
/* if-nez v0, :cond_3 */
/* .line 238 */
/* .line 240 */
} // :cond_3
/* monitor-exit v14 */
/* .line 241 */
} // .end local v9 # "cursor":Landroid/database/Cursor;
} // .end local v12 # "isOpen":Z
} // .end local v13 # "list":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/media/VideoCacheItem;>;"
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v14 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
