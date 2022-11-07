class com.umeng.common.net.c$a extends android.database.sqlite.SQLiteOpenHelper {
	 /* .source "DownloadTaskList.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/c; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "a" */
} // .end annotation
/* # static fields */
private static final Integer b;
private static final java.lang.String c;
/* # instance fields */
final com.umeng.common.net.c a; //synthetic
/* # direct methods */
 com.umeng.common.net.c$a ( ) {
/* .locals 3 */
/* .prologue */
/* .line 267 */
this.a = p1;
/* .line 268 */
final String v0 = "UMENG_DATA"; // const-string v0, "UMENG_DATA"
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* invoke-direct {p0, p2, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V */
/* .line 269 */
return;
} // .end method
/* # virtual methods */
public void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 273 */
com.umeng.common.net.c .a ( );
final String v1 = "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);"; // const-string v1, "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);"
com.umeng.common.Log .c ( v0,v1 );
/* .line 274 */
final String v0 = "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);"; // const-string v0, "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);"
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 275 */
return;
} // .end method
public void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .prologue */
/* .line 279 */
return;
} // .end method
