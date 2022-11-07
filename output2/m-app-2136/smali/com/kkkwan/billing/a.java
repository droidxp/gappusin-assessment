public class com.kkkwan.billing.a {
	 /* # instance fields */
	 private com.kkkwan.billing.e.a.a a;
	 /* # direct methods */
	 public com.kkkwan.billing.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.kkkwan.billing.a ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 try { // :try_start_0
			 final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
			 final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u6784\u9020\u65b9\u6cd5"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u6784\u9020\u65b9\u6cd5"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* new-instance v0, Lcom/kkkwan/billing/e/a/a; */
			 /* invoke-direct {v0, p1}, Lcom/kkkwan/billing/e/a/a;-><init>(Landroid/content/Context;)V */
			 this.a = v0;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 private void c ( android.content.Context p0 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
			 final String v1 = "createDBOpenHelper"; // const-string v1, "createDBOpenHelper"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* new-instance v0, Lcom/kkkwan/billing/e/a/a; */
			 /* invoke-direct {v0, p1}, Lcom/kkkwan/billing/e/a/a;-><init>(Landroid/content/Context;)V */
			 this.a = v0;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 /* # virtual methods */
	 public com.kkkwan.billing.e.a.b a ( java.lang.String p0, android.content.Context p1 ) {
		 /* .locals 9 */
		 int v8 = 0; // const/4 v8, 0x0
		 try { // :try_start_0
			 final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
			 final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u67e5\u8be2"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u67e5\u8be2"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 v0 = this.a;
			 /* if-nez v0, :cond_0 */
			 /* invoke-direct {p0, p2}, Lcom/kkkwan/billing/a;->c(Landroid/content/Context;)V */
		 } // :cond_0
		 v0 = this.a;
		 (( com.kkkwan.billing.e.a.a ) v0 ).getReadableDatabase ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/e/a/a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 final String v1 = "used_pipe"; // const-string v1, "used_pipe"
		 int v2 = 2; // const/4 v2, 0x2
		 /* new-array v2, v2, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 final String v4 = "day_count"; // const-string v4, "day_count"
		 /* aput-object v4, v2, v3 */
		 int v3 = 1; // const/4 v3, 0x1
		 final String v4 = "month_count"; // const-string v4, "month_count"
		 /* aput-object v4, v2, v3 */
		 final String v3 = "pipe_id=?"; // const-string v3, "pipe_id=?"
		 int v4 = 1; // const/4 v4, 0x1
		 /* new-array v4, v4, [Ljava/lang/String; */
		 int v5 = 0; // const/4 v5, 0x0
		 /* aput-object p1, v4, v5 */
		 int v5 = 0; // const/4 v5, 0x0
		 int v6 = 0; // const/4 v6, 0x0
		 int v7 = 0; // const/4 v7, 0x0
		 v2 = 		 /* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 v0 = 			 final String v0 = "day_count"; // const-string v0, "day_count"
			 v0 = 			 final String v0 = "month_count"; // const-string v0, "month_count"
			 /* new-instance v0, Lcom/kkkwan/billing/e/a/b; */
			 /* invoke-direct {v0, p1, v2, v1}, Lcom/kkkwan/billing/e/a/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
		 } // :goto_0
	 } // :cond_1
	 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* move-object v0, v8 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void a ( ) {
/* .locals 2 */
try { // :try_start_0
	 final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
	 final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u5173\u95ed\u6570\u636e\u5e93"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u5173\u95ed\u6570\u636e\u5e93"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
		 (( com.kkkwan.billing.e.a.a ) v0 ).close ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/e/a/a;->close()V
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 5 */
try { // :try_start_0
	 final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
	 final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u91cd\u7f6e\u5f53\u5929\u6240\u6709\u901a\u9053\u6b21\u6570"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u91cd\u7f6e\u5f53\u5929\u6240\u6709\u901a\u9053\u6b21\u6570"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 v0 = this.a;
	 /* if-nez v0, :cond_0 */
	 /* invoke-direct {p0, p1}, Lcom/kkkwan/billing/a;->c(Landroid/content/Context;)V */
} // :cond_0
v0 = this.a;
(( com.kkkwan.billing.e.a.a ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/e/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* new-instance v1, Landroid/content/ContentValues; */
/* invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V */
final String v2 = "day_count"; // const-string v2, "day_count"
final String v3 = "0"; // const-string v3, "0"
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "used_pipe"; // const-string v2, "used_pipe"
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
(( android.database.sqlite.SQLiteDatabase ) v0 ).update ( v2, v1, v3, v4 ); // invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void a ( Object p0, android.content.Context p1 ) {
/* .locals 4 */
try { // :try_start_0
final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u63d2\u5165"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u63d2\u5165"
com.kkkwan.billing.h.f .a ( v0,v1 );
v0 = this.a;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, p2}, Lcom/kkkwan/billing/a;->c(Landroid/content/Context;)V */
} // :cond_0
v0 = this.a;
(( com.kkkwan.billing.e.a.a ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/e/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* new-instance v1, Landroid/content/ContentValues; */
/* invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V */
final String v2 = "pipe_id"; // const-string v2, "pipe_id"
(( com.kkkwan.billing.e.a.b ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->a()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "day_count"; // const-string v2, "day_count"
(( com.kkkwan.billing.e.a.b ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "month_count"; // const-string v2, "month_count"
(( com.kkkwan.billing.e.a.b ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "used_pipe"; // const-string v2, "used_pipe"
int v3 = 0; // const/4 v3, 0x0
(( android.database.sqlite.SQLiteDatabase ) v0 ).insert ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void b ( android.content.Context p0 ) {
/* .locals 5 */
try { // :try_start_0
final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u91cd\u7f6e\u5f53\u6708\u6240\u6709\u901a\u9053\u6b21\u6570"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u91cd\u7f6e\u5f53\u6708\u6240\u6709\u901a\u9053\u6b21\u6570"
com.kkkwan.billing.h.f .a ( v0,v1 );
v0 = this.a;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, p1}, Lcom/kkkwan/billing/a;->c(Landroid/content/Context;)V */
} // :cond_0
v0 = this.a;
(( com.kkkwan.billing.e.a.a ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/e/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* new-instance v1, Landroid/content/ContentValues; */
/* invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V */
final String v2 = "month_count"; // const-string v2, "month_count"
final String v3 = "0"; // const-string v3, "0"
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "used_pipe"; // const-string v2, "used_pipe"
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
(( android.database.sqlite.SQLiteDatabase ) v0 ).update ( v2, v1, v3, v4 ); // invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void b ( Object p0, android.content.Context p1 ) {
/* .locals 7 */
try { // :try_start_0
final String v0 = "OtherUsedPipeService"; // const-string v0, "OtherUsedPipeService"
final String v1 = "\u64cd\u4f5c\u6570\u636e\uff1a\u66f4\u65b0"; // const-string v1, "\u64cd\u4f5c\u6570\u636e\uff1a\u66f4\u65b0"
com.kkkwan.billing.h.f .a ( v0,v1 );
v0 = this.a;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, p2}, Lcom/kkkwan/billing/a;->c(Landroid/content/Context;)V */
} // :cond_0
v0 = this.a;
(( com.kkkwan.billing.e.a.a ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/e/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* new-instance v1, Landroid/content/ContentValues; */
/* invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V */
(( com.kkkwan.billing.e.a.b ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_2
(( com.kkkwan.billing.e.a.b ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_2
final String v2 = "day_count"; // const-string v2, "day_count"
(( com.kkkwan.billing.e.a.b ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "month_count"; // const-string v2, "month_count"
(( com.kkkwan.billing.e.a.b ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "used_pipe"; // const-string v2, "used_pipe"
final String v3 = "pipe_id=?"; // const-string v3, "pipe_id=?"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
(( com.kkkwan.billing.e.a.b ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->a()Ljava/lang/String;
/* aput-object v6, v4, v5 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).update ( v2, v1, v3, v4 ); // invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
} // :cond_1
} // :goto_0
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
} // :goto_1
return;
} // :cond_2
(( com.kkkwan.billing.e.a.b ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_3
final String v2 = "day_count"; // const-string v2, "day_count"
(( com.kkkwan.billing.e.a.b ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "used_pipe"; // const-string v2, "used_pipe"
final String v3 = "pipe_id=?"; // const-string v3, "pipe_id=?"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
(( com.kkkwan.billing.e.a.b ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->a()Ljava/lang/String;
/* aput-object v6, v4, v5 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).update ( v2, v1, v3, v4 ); // invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_3
try { // :try_start_1
(( com.kkkwan.billing.e.a.b ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_1
final String v2 = "month_count"; // const-string v2, "month_count"
(( com.kkkwan.billing.e.a.b ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "used_pipe"; // const-string v2, "used_pipe"
final String v3 = "pipe_id=?"; // const-string v3, "pipe_id=?"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
(( com.kkkwan.billing.e.a.b ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/kkkwan/billing/e/a/b;->a()Ljava/lang/String;
/* aput-object v6, v4, v5 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).update ( v2, v1, v3, v4 ); // invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public Boolean b ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "OtherUsedPipeService"; // const-string v1, "OtherUsedPipeService"
final String v2 = "\u64cd\u4f5c\u6570\u636e\uff1a\u662f\u5426\u5b58\u5728"; // const-string v2, "\u64cd\u4f5c\u6570\u636e\uff1a\u662f\u5426\u5b58\u5728"
com.kkkwan.billing.h.f .a ( v1,v2 );
(( com.kkkwan.billing.a ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/kkkwan/billing/a;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/kkkwan/billing/e/a/b;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // :goto_0
/* :catch_0 */
/* move-exception v1 */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
