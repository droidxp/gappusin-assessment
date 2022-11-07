public class com.umeng.common.net.c {
	 /* .source "DownloadTaskList.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/common/net/c$a;, */
	 /* Lcom/umeng/common/net/c$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String a;
private static final java.lang.String b;
private static final java.lang.String c;
private static final java.lang.String d;
private static final java.lang.String e;
private static final java.lang.String f;
private static final java.lang.String g;
private static final java.lang.String h;
private static android.content.Context i;
private static final java.lang.String j;
/* # instance fields */
private com.umeng.common.net.c$a k;
/* # direct methods */
static com.umeng.common.net.c ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 50 */
	 /* const-class v0, Lcom/umeng/common/net/c; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 /* .line 59 */
	 return;
} // .end method
private com.umeng.common.net.c ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 63 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 64 */
	 /* new-instance v0, Lcom/umeng/common/net/c$a; */
	 v1 = com.umeng.common.net.c.i;
	 /* invoke-direct {v0, p0, v1}, Lcom/umeng/common/net/c$a;-><init>(Lcom/umeng/common/net/c;Landroid/content/Context;)V */
	 this.k = v0;
	 /* .line 65 */
	 return;
} // .end method
 com.umeng.common.net.c ( ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 63 */
	 /* invoke-direct {p0}, Lcom/umeng/common/net/c;-><init>()V */
	 return;
} // .end method
public static com.umeng.common.net.c a ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 72 */
	 v0 = com.umeng.common.net.c.i;
	 /* if-nez v0, :cond_0 */
	 /* if-nez p0, :cond_0 */
	 /* .line 73 */
	 /* new-instance v0, Ljava/lang/NullPointerException; */
	 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
	 /* throw v0 */
	 /* .line 74 */
} // :cond_0
v0 = com.umeng.common.net.c.i;
/* if-nez v0, :cond_1 */
/* .line 75 */
/* .line 76 */
} // :cond_1
v0 = com.umeng.common.net.c$b.a;
} // .end method
static java.lang.String a ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 50 */
v0 = com.umeng.common.net.c.a;
} // .end method
/* # virtual methods */
public java.util.List a ( java.lang.String p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v5 = 0; // const/4 v5, 0x0
int v9 = 0; // const/4 v9, 0x0
/* .line 199 */
final String v3 = "cp=?"; // const-string v3, "cp=?"
/* .line 200 */
/* new-array v4, v2, [Ljava/lang/String; */
/* aput-object p1, v4, v9 */
/* .line 201 */
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).getReadableDatabase ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "umeng_download_task_list"; // const-string v1, "umeng_download_task_list"
/* .line 202 */
/* new-array v2, v2, [Ljava/lang/String; */
final String v6 = "url"; // const-string v6, "url"
/* aput-object v6, v2, v9 */
/* .line 203 */
final String v8 = "1"; // const-string v8, "1"
/* move-object v6, v5 */
/* move-object v7, v5 */
/* .line 201 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 204 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 205 */
/* .line 206 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 211 */
/* .line 212 */
/* .line 207 */
} // :cond_0
/* .line 208 */
} // .end method
public void a ( Integer p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 228 */
try { // :try_start_0
/* new-instance v0, Ljava/util/Date; */
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
/* mul-int/lit16 v3, p1, 0x3e8 */
/* int-to-long v3, v3 */
/* sub-long/2addr v1, v3 */
/* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
/* .line 229 */
/* new-instance v1, Ljava/text/SimpleDateFormat; */
final String v2 = "yyyy-MM-dd HH:mm:ss"; // const-string v2, "yyyy-MM-dd HH:mm:ss"
/* invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
/* .line 230 */
(( java.text.SimpleDateFormat ) v1 ).format ( v0 ); // invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
/* .line 231 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = " DELETE FROM umeng_download_task_list WHERE strftime(\'yyyy-MM-dd HH:mm:ss\', last_modified)<=strftime(\'yyyy-MM-dd HH:mm:ss\', \'"; // const-string v3, " DELETE FROM umeng_download_task_list WHERE strftime(\'yyyy-MM-dd HH:mm:ss\', last_modified)<=strftime(\'yyyy-MM-dd HH:mm:ss\', \'"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 233 */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\')"; // const-string v2, "\')"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 231 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 235 */
v2 = this.k;
(( com.umeng.common.net.c$a ) v2 ).getWritableDatabase ( ); // invoke-virtual {v2}, Lcom/umeng/common/net/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
(( android.database.sqlite.SQLiteDatabase ) v2 ).execSQL ( v1 ); // invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 237 */
v1 = com.umeng.common.net.c.a;
/* .line 238 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "clearOverdueTasks("; // const-string v3, "clearOverdueTasks("
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 239 */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 240 */
final String v3 = ")"; // const-string v3, ")"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 241 */
final String v3 = " remove all tasks before "; // const-string v3, " remove all tasks before "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 242 */
/* new-instance v3, Ljava/text/SimpleDateFormat; */
final String v4 = "yyyy-MM-dd HH:mm:ss"; // const-string v4, "yyyy-MM-dd HH:mm:ss"
/* invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
/* .line 243 */
(( java.text.SimpleDateFormat ) v3 ).format ( v0 ); // invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
/* .line 242 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 238 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 237 */
com.umeng.common.Log .c ( v1,v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 248 */
} // :goto_0
return;
/* .line 245 */
/* :catch_0 */
/* move-exception v0 */
/* .line 246 */
v1 = com.umeng.common.net.c.a;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.umeng.common.Log .b ( v1,v0 );
} // .end method
public void a ( java.lang.String p0, java.lang.String p1, Integer p2 ) {
/* .locals 5 */
/* .prologue */
/* .line 113 */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 114 */
final String v1 = "progress"; // const-string v1, "progress"
java.lang.Integer .valueOf ( p3 );
(( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 115 */
final String v1 = "last_modified"; // const-string v1, "last_modified"
com.umeng.common.util.h .a ( );
(( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 116 */
final String v1 = "cp=? and url=?"; // const-string v1, "cp=? and url=?"
/* .line 117 */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p2, v2, v3 */
/* .line 118 */
v3 = this.k;
(( com.umeng.common.net.c$a ) v3 ).getWritableDatabase ( ); // invoke-virtual {v3}, Lcom/umeng/common/net/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v4 = "umeng_download_task_list"; // const-string v4, "umeng_download_task_list"
(( android.database.sqlite.SQLiteDatabase ) v3 ).update ( v4, v0, v1, v2 ); // invoke-virtual {v3, v4, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 121 */
v0 = com.umeng.common.net.c.a;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "updateProgress("; // const-string v2, "updateProgress("
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 122 */
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 121 */
com.umeng.common.Log .c ( v0,v1 );
/* .line 123 */
return;
} // .end method
public void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 5 */
/* .prologue */
/* .line 126 */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 127 */
final String v1 = "extra"; // const-string v1, "extra"
(( android.content.ContentValues ) v0 ).put ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 128 */
final String v1 = "last_modified"; // const-string v1, "last_modified"
com.umeng.common.util.h .a ( );
(( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 129 */
final String v1 = "cp=? and url=?"; // const-string v1, "cp=? and url=?"
/* .line 130 */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p2, v2, v3 */
/* .line 131 */
v3 = this.k;
(( com.umeng.common.net.c$a ) v3 ).getWritableDatabase ( ); // invoke-virtual {v3}, Lcom/umeng/common/net/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v4 = "umeng_download_task_list"; // const-string v4, "umeng_download_task_list"
(( android.database.sqlite.SQLiteDatabase ) v3 ).update ( v4, v0, v1, v2 ); // invoke-virtual {v3, v4, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 133 */
v0 = com.umeng.common.net.c.a;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "updateExtra("; // const-string v2, "updateExtra("
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 134 */
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 133 */
com.umeng.common.Log .c ( v0,v1 );
/* .line 135 */
return;
} // .end method
public Boolean a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 13 */
/* .prologue */
int v10 = 1; // const/4 v10, 0x1
int v9 = 0; // const/4 v9, 0x0
/* .line 80 */
/* new-instance v11, Landroid/content/ContentValues; */
/* invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V */
/* .line 81 */
final String v0 = "cp"; // const-string v0, "cp"
(( android.content.ContentValues ) v11 ).put ( v0, p1 ); // invoke-virtual {v11, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 82 */
final String v0 = "url"; // const-string v0, "url"
(( android.content.ContentValues ) v11 ).put ( v0, p2 ); // invoke-virtual {v11, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 83 */
final String v0 = "progress"; // const-string v0, "progress"
java.lang.Integer .valueOf ( v9 );
(( android.content.ContentValues ) v11 ).put ( v0, v1 ); // invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 84 */
final String v0 = "last_modified"; // const-string v0, "last_modified"
com.umeng.common.util.h .a ( );
(( android.content.ContentValues ) v11 ).put ( v0, v1 ); // invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 87 */
try { // :try_start_0
final String v3 = "cp=? and url=?"; // const-string v3, "cp=? and url=?"
/* .line 88 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v4, v0, [Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
/* aput-object p1, v4, v0 */
int v0 = 1; // const/4 v0, 0x1
/* aput-object p2, v4, v0 */
/* .line 89 */
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).getReadableDatabase ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "umeng_download_task_list"; // const-string v1, "umeng_download_task_list"
/* .line 90 */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
final String v6 = "progress"; // const-string v6, "progress"
/* aput-object v6, v2, v5 */
int v5 = 0; // const/4 v5, 0x0
/* .line 91 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
final String v8 = "1"; // const-string v8, "1"
/* .line 89 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
v0 = /* .line 92 */
/* if-lez v0, :cond_0 */
/* .line 93 */
v0 = com.umeng.common.net.c.a;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "insert("; // const-string v3, "insert("
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "): "; // const-string v3, "): "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 94 */
final String v3 = " already exists in the db.Insert is cancelled."; // const-string v3, " already exists in the db.Insert is cancelled."
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 93 */
com.umeng.common.Log .c ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move v0, v9 */
/* .line 103 */
} // :goto_0
try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 109 */
} // :goto_1
/* .line 97 */
} // :cond_0
try { // :try_start_2
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "umeng_download_task_list"; // const-string v1, "umeng_download_task_list"
/* .line 98 */
int v3 = 0; // const/4 v3, 0x0
/* .line 97 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).insert ( v1, v3, v11 ); // invoke-virtual {v0, v1, v3, v11}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* move-result-wide v3 */
/* .line 99 */
/* const-wide/16 v0, -0x1 */
/* cmp-long v0, v3, v0 */
/* if-nez v0, :cond_1 */
/* move v1, v9 */
/* .line 100 */
} // :goto_2
try { // :try_start_3
v0 = com.umeng.common.net.c.a;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "insert("; // const-string v6, "insert("
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ", "; // const-string v6, ", "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "): "; // const-string v6, "): "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 101 */
final String v6 = "rowid="; // const-string v6, "rowid="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3, v4 ); // invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 100 */
com.umeng.common.Log .c ( v0,v3 );
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* move v0, v1 */
} // :cond_1
/* move v1, v10 */
/* .line 99 */
/* .line 104 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v0 */
/* move v0, v9 */
/* .line 105 */
} // :goto_3
v2 = com.umeng.common.net.c.a;
/* .line 106 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "insert("; // const-string v4, "insert("
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ", "; // const-string v4, ", "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "): "; // const-string v4, "): "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 105 */
com.umeng.common.Log .c ( v2,v3,v1 );
/* .line 104 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v12, v0 */
/* move v0, v1 */
/* move-object v1, v12 */
/* :catch_2 */
/* move-exception v1 */
} // .end method
public Integer b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 11 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v5 = 0; // const/4 v5, 0x0
int v10 = 0; // const/4 v10, 0x0
/* .line 138 */
int v9 = -1; // const/4 v9, -0x1
/* .line 139 */
final String v3 = "cp=? and url=?"; // const-string v3, "cp=? and url=?"
/* .line 140 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v4, v0, [Ljava/lang/String; */
/* aput-object p1, v4, v10 */
/* aput-object p2, v4, v2 */
/* .line 141 */
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).getReadableDatabase ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "umeng_download_task_list"; // const-string v1, "umeng_download_task_list"
/* .line 142 */
/* new-array v2, v2, [Ljava/lang/String; */
final String v6 = "progress"; // const-string v6, "progress"
/* aput-object v6, v2, v10 */
/* .line 143 */
final String v8 = "1"; // const-string v8, "1"
/* move-object v6, v5 */
/* move-object v7, v5 */
/* .line 141 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
v0 = /* .line 144 */
/* if-lez v0, :cond_0 */
/* .line 145 */
v0 = /* .line 146 */
/* .line 148 */
} // :goto_0
/* .line 149 */
} // :cond_0
/* move v0, v9 */
} // .end method
public java.lang.String c ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 10 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v9 = 0; // const/4 v9, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 153 */
/* .line 154 */
final String v3 = "cp=? and url=?"; // const-string v3, "cp=? and url=?"
/* .line 155 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v4, v0, [Ljava/lang/String; */
/* aput-object p1, v4, v9 */
/* aput-object p2, v4, v2 */
/* .line 156 */
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).getReadableDatabase ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "umeng_download_task_list"; // const-string v1, "umeng_download_task_list"
/* .line 157 */
/* new-array v2, v2, [Ljava/lang/String; */
final String v6 = "extra"; // const-string v6, "extra"
/* aput-object v6, v2, v9 */
/* .line 158 */
final String v8 = "1"; // const-string v8, "1"
/* move-object v6, v5 */
/* move-object v7, v5 */
/* .line 156 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
v1 = /* .line 159 */
/* if-lez v1, :cond_0 */
/* .line 160 */
/* .line 161 */
/* .line 163 */
} // :cond_0
/* .line 164 */
} // .end method
public java.util.Date d ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 10 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v9 = 0; // const/4 v9, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 168 */
/* .line 169 */
final String v3 = "cp=? and url=?"; // const-string v3, "cp=? and url=?"
/* .line 170 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v4, v0, [Ljava/lang/String; */
/* aput-object p1, v4, v9 */
/* aput-object p2, v4, v2 */
/* .line 171 */
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).getReadableDatabase ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "umeng_download_task_list"; // const-string v1, "umeng_download_task_list"
/* .line 172 */
/* new-array v2, v2, [Ljava/lang/String; */
final String v6 = "last_modified"; // const-string v6, "last_modified"
/* aput-object v6, v2, v9 */
/* move-object v6, v5 */
/* move-object v7, v5 */
/* move-object v8, v5 */
/* .line 171 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
v0 = /* .line 174 */
/* if-lez v0, :cond_0 */
/* .line 175 */
/* .line 176 */
/* .line 177 */
v2 = com.umeng.common.net.c.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "getLastModified("; // const-string v4, "getLastModified("
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ", "; // const-string v4, ", "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "): "; // const-string v4, "): "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 178 */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 177 */
com.umeng.common.Log .c ( v2,v3 );
/* .line 181 */
try { // :try_start_0
/* new-instance v2, Ljava/text/SimpleDateFormat; */
final String v3 = "yyyy-MM-dd HH:mm:ss"; // const-string v3, "yyyy-MM-dd HH:mm:ss"
/* invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
(( java.text.SimpleDateFormat ) v2 ).parse ( v0 ); // invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 186 */
} // :cond_0
} // :goto_0
/* .line 187 */
/* .line 182 */
/* :catch_0 */
/* move-exception v0 */
/* .line 183 */
v2 = com.umeng.common.net.c.a;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.umeng.common.Log .c ( v2,v0 );
} // .end method
public void e ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 4 */
/* .prologue */
/* .line 191 */
final String v0 = "cp=? and url=?"; // const-string v0, "cp=? and url=?"
/* .line 192 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* aput-object p2, v1, v2 */
/* .line 193 */
v2 = this.k;
(( com.umeng.common.net.c$a ) v2 ).getWritableDatabase ( ); // invoke-virtual {v2}, Lcom/umeng/common/net/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
final String v3 = "umeng_download_task_list"; // const-string v3, "umeng_download_task_list"
(( android.database.sqlite.SQLiteDatabase ) v2 ).delete ( v3, v0, v1 ); // invoke-virtual {v2, v3, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 194 */
v0 = com.umeng.common.net.c.a;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "delete("; // const-string v2, "delete("
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v0,v1 );
/* .line 196 */
return;
} // .end method
public void finalize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 254 */
v0 = this.k;
(( com.umeng.common.net.c$a ) v0 ).close ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c$a;->close()V
/* .line 255 */
return;
} // .end method
