public class com.Ina.Notegre.SqlData extends android.database.sqlite.SQLiteOpenHelper {
	 /* .source "SqlData.java" */
	 /* # static fields */
	 private static final java.lang.String DATABASE_NAME;
	 private static final Integer DATABASE_VERSION;
	 private static final java.lang.String FIELD_FOLDER;
	 private static final java.lang.String FIELD_TEXT;
	 private static final java.lang.String FIELD_TIME;
	 private static final java.lang.String FIELD_TITLE;
	 private static final java.lang.String FIELD_id;
	 private static final java.lang.String FOLDER_ID;
	 private static final java.lang.String FOLDER_NAME;
	 private static final java.lang.String FOLDER_TABLE;
	 private static final java.lang.String TABLE_NAME;
	 /* # direct methods */
	 public com.Ina.Notegre.SqlData ( ) {
		 /* .locals 3 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 30 */
		 final String v0 = "SmipleNotePad"; // const-string v0, "SmipleNotePad"
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V */
		 /* .line 31 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long CreateaFolder ( java.lang.String p0 ) {
		 /* .locals 6 */
		 /* .param p1, "sName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 216 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 217 */
		 /* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 218 */
		 /* .local v0, "cv":Landroid/content/ContentValues; */
		 final String v4 = "name"; // const-string v4, "name"
		 (( android.content.ContentValues ) v0 ).put ( v4, p1 ); // invoke-virtual {v0, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 220 */
		 final String v4 = "folder"; // const-string v4, "folder"
		 int v5 = 0; // const/4 v5, 0x0
		 (( android.database.sqlite.SQLiteDatabase ) v1 ).insert ( v4, v5, v0 ); // invoke-virtual {v1, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
		 /* move-result-wide v2 */
		 /* .line 222 */
		 /* .local v2, "row":J */
		 /* return-wide v2 */
	 } // .end method
	 public void UpdateFolder ( Integer p0, java.lang.String p1 ) {
		 /* .locals 6 */
		 /* .param p1, "index" # I */
		 /* .param p2, "sName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 251 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 253 */
		 /* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v2 = "_id = ?"; // const-string v2, "_id = ?"
		 /* .line 255 */
		 /* .local v2, "where":Ljava/lang/String; */
		 int v4 = 1; // const/4 v4, 0x1
		 /* new-array v3, v4, [Ljava/lang/String; */
		 int v4 = 0; // const/4 v4, 0x0
		 java.lang.Integer .toString ( p1 );
		 /* aput-object v5, v3, v4 */
		 /* .line 257 */
		 /* .local v3, "whereStrings":[Ljava/lang/String; */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 258 */
		 /* .local v0, "cv":Landroid/content/ContentValues; */
		 final String v4 = "name"; // const-string v4, "name"
		 (( android.content.ContentValues ) v0 ).put ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 260 */
		 final String v4 = "folder"; // const-string v4, "folder"
		 (( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v4, v0, v2, v3 ); // invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
		 /* .line 261 */
		 return;
	 } // .end method
	 public void delete ( Integer p0 ) {
		 /* .locals 5 */
		 /* .param p1, "id" # I */
		 /* .prologue */
		 /* .line 100 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 101 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v1 = "_id = ?"; // const-string v1, "_id = ?"
		 /* .line 103 */
		 /* .local v1, "where":Ljava/lang/String; */
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v2, v3, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 java.lang.Integer .toString ( p1 );
		 /* aput-object v4, v2, v3 */
		 /* .line 104 */
		 /* .local v2, "whereStrings":[Ljava/lang/String; */
		 final String v3 = "content"; // const-string v3, "content"
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).delete ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
		 /* .line 105 */
		 return;
	 } // .end method
	 public void deleteByFolder ( Integer p0 ) {
		 /* .locals 5 */
		 /* .param p1, "nIndex" # I */
		 /* .prologue */
		 /* .line 110 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 111 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v1 = "folder_index = ?"; // const-string v1, "folder_index = ?"
		 /* .line 113 */
		 /* .local v1, "where":Ljava/lang/String; */
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v2, v3, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 java.lang.Integer .toString ( p1 );
		 /* aput-object v4, v2, v3 */
		 /* .line 114 */
		 /* .local v2, "whereStrings":[Ljava/lang/String; */
		 final String v3 = "content"; // const-string v3, "content"
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).delete ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
		 /* .line 115 */
		 return;
	 } // .end method
	 public void deleteFolder ( Integer p0 ) {
		 /* .locals 5 */
		 /* .param p1, "index" # I */
		 /* .prologue */
		 /* .line 240 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 241 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v1 = "_id = ?"; // const-string v1, "_id = ?"
		 /* .line 243 */
		 /* .local v1, "where":Ljava/lang/String; */
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v2, v3, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 java.lang.Integer .toString ( p1 );
		 /* aput-object v4, v2, v3 */
		 /* .line 245 */
		 /* .local v2, "whereStrings":[Ljava/lang/String; */
		 final String v3 = "folder"; // const-string v3, "folder"
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).delete ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
		 /* .line 246 */
		 return;
	 } // .end method
	 public android.database.Cursor getFolderList ( ) {
		 /* .locals 9 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 206 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getReadableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 208 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v1 = "folder"; // const-string v1, "folder"
		 /* move-object v3, v2 */
		 /* move-object v4, v2 */
		 /* move-object v5, v2 */
		 /* move-object v6, v2 */
		 /* move-object v7, v2 */
		 /* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
		 /* .line 210 */
		 /* .local v8, "cursor":Landroid/database/Cursor; */
	 } // .end method
	 public android.database.Cursor getList ( ) {
		 /* .locals 9 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 74 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getReadableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 76 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v1 = "content"; // const-string v1, "content"
		 /* move-object v3, v2 */
		 /* move-object v4, v2 */
		 /* move-object v5, v2 */
		 /* move-object v6, v2 */
		 /* move-object v7, v2 */
		 /* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
		 /* .line 78 */
		 /* .local v8, "cursor":Landroid/database/Cursor; */
	 } // .end method
	 public Boolean haveFolder ( java.lang.String p0 ) {
		 /* .locals 11 */
		 /* .param p1, "sTitle" # Ljava/lang/String; */
		 /* .prologue */
		 int v10 = 1; // const/4 v10, 0x1
		 int v9 = 0; // const/4 v9, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 179 */
		 (( com.Ina.Notegre.SqlData ) p0 ).getReadableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
		 /* .line 180 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 final String v3 = "name = ?"; // const-string v3, "name = ?"
		 /* .line 182 */
		 /* .local v3, "where":Ljava/lang/String; */
		 /* new-array v4, v10, [Ljava/lang/String; */
		 /* aput-object p1, v4, v9 */
		 /* .line 184 */
		 /* .local v4, "whereStrings":[Ljava/lang/String; */
		 final String v1 = "folder"; // const-string v1, "folder"
		 /* move-object v5, v2 */
		 /* move-object v6, v2 */
		 /* move-object v7, v2 */
		 /* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
		 /* .line 186 */
		 v1 = 		 /* .local v8, "cursor":Landroid/database/Cursor; */
		 /* if-gtz v1, :cond_0 */
		 /* move v1, v9 */
	 } // :goto_0
} // :cond_0
/* move v1, v10 */
} // .end method
public Long insert ( Integer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, Integer p4 ) {
/* .locals 6 */
/* .param p1, "idx" # I */
/* .param p2, "title" # Ljava/lang/String; */
/* .param p3, "text" # Ljava/lang/String; */
/* .param p4, "time" # Ljava/lang/String; */
/* .param p5, "index" # I */
/* .prologue */
/* .line 84 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 85 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 86 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = "title"; // const-string v4, "title"
(( android.content.ContentValues ) v0 ).put ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 87 */
final String v4 = "content"; // const-string v4, "content"
(( android.content.ContentValues ) v0 ).put ( v4, p3 ); // invoke-virtual {v0, v4, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 88 */
final String v4 = "time"; // const-string v4, "time"
(( android.content.ContentValues ) v0 ).put ( v4, p4 ); // invoke-virtual {v0, v4, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 89 */
final String v4 = "folder_index"; // const-string v4, "folder_index"
java.lang.Integer .valueOf ( p5 );
(( android.content.ContentValues ) v0 ).put ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 90 */
int v4 = -1; // const/4 v4, -0x1
/* if-eq p1, v4, :cond_0 */
/* .line 91 */
final String v4 = "_id"; // const-string v4, "_id"
java.lang.Integer .valueOf ( p1 );
(( android.content.ContentValues ) v0 ).put ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 92 */
} // :cond_0
final String v4 = "content"; // const-string v4, "content"
int v5 = 0; // const/4 v5, 0x0
(( android.database.sqlite.SQLiteDatabase ) v1 ).insert ( v4, v5, v0 ); // invoke-virtual {v1, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* move-result-wide v2 */
/* .line 94 */
/* .local v2, "row":J */
/* return-wide v2 */
} // .end method
public Long insertFolder ( Integer p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p1, "index" # I */
/* .param p2, "sName" # Ljava/lang/String; */
/* .prologue */
/* .line 228 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 229 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 230 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = "name"; // const-string v4, "name"
(( android.content.ContentValues ) v0 ).put ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 231 */
final String v4 = "_id"; // const-string v4, "_id"
java.lang.Integer .valueOf ( p1 );
(( android.content.ContentValues ) v0 ).put ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 232 */
final String v4 = "folder"; // const-string v4, "folder"
int v5 = 0; // const/4 v5, 0x0
(( android.database.sqlite.SQLiteDatabase ) v1 ).insert ( v4, v5, v0 ); // invoke-virtual {v1, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* move-result-wide v2 */
/* .line 234 */
/* .local v2, "row":J */
/* return-wide v2 */
} // .end method
public void moveIndex ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "nIndex" # I */
/* .prologue */
/* .line 120 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 122 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v2 = "folder_index = ?"; // const-string v2, "folder_index = ?"
/* .line 124 */
/* .local v2, "where":Ljava/lang/String; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v3, v4, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v5, v3, v4 */
/* .line 126 */
/* .local v3, "whereStrings":[Ljava/lang/String; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 127 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = "folder_index"; // const-string v4, "folder_index"
int v5 = -1; // const/4 v5, -0x1
java.lang.Integer .valueOf ( v5 );
(( android.content.ContentValues ) v0 ).put ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 129 */
final String v4 = "content"; // const-string v4, "content"
(( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v4, v0, v2, v3 ); // invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 130 */
return;
} // .end method
public void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 1 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
/* .line 36 */
final String v0 = "CREATE TABLE content(_id INTEGER primary key autoincrement, title text, content text, time text, folder_index INTEGER)"; // const-string v0, "CREATE TABLE content(_id INTEGER primary key autoincrement, title text, content text, time text, folder_index INTEGER)"
/* .line 40 */
/* .local v0, "sqlString":Ljava/lang/String; */
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 42 */
final String v0 = "CREATE TABLE folder(_id INTEGER primary key autoincrement, name text)"; // const-string v0, "CREATE TABLE folder(_id INTEGER primary key autoincrement, name text)"
/* .line 45 */
(( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
/* .line 46 */
return;
} // .end method
public void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .param p2, "oldVersion" # I */
/* .param p3, "newVersion" # I */
/* .prologue */
/* .line 58 */
return;
} // .end method
public void reFolderName ( Integer p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p1, "nId" # I */
/* .param p2, "sTitle" # Ljava/lang/String; */
/* .prologue */
/* .line 192 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 193 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v2 = "_id = ?"; // const-string v2, "_id = ?"
/* .line 195 */
/* .local v2, "where":Ljava/lang/String; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v3, v4, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v5, v3, v4 */
/* .line 197 */
/* .local v3, "whereStrings":[Ljava/lang/String; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 198 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = "name"; // const-string v4, "name"
(( android.content.ContentValues ) v0 ).put ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 200 */
final String v4 = "folder"; // const-string v4, "folder"
(( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v4, v0, v2, v3 ); // invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 201 */
return;
} // .end method
public void rename ( Integer p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p1, "nId" # I */
/* .param p2, "sTitle" # Ljava/lang/String; */
/* .prologue */
/* .line 165 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 166 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v2 = "_id = ?"; // const-string v2, "_id = ?"
/* .line 168 */
/* .local v2, "where":Ljava/lang/String; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v3, v4, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v5, v3, v4 */
/* .line 170 */
/* .local v3, "whereStrings":[Ljava/lang/String; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 171 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = "title"; // const-string v4, "title"
(( android.content.ContentValues ) v0 ).put ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 173 */
final String v4 = "content"; // const-string v4, "content"
(( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v4, v0, v2, v3 ); // invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 174 */
return;
} // .end method
public android.database.Cursor select ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "index" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 62 */
(( com.Ina.Notegre.SqlData ) p0 ).getReadableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 63 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v3 = "folder_index = ?"; // const-string v3, "folder_index = ?"
/* .line 65 */
/* .local v3, "selection":Ljava/lang/String; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v4, v1, [Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v5, v4, v1 */
/* .line 67 */
/* .local v4, "selectsStrings":[Ljava/lang/String; */
final String v1 = "content"; // const-string v1, "content"
/* move-object v5, v2 */
/* move-object v6, v2 */
/* move-object v7, v2 */
/* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 69 */
/* .local v8, "cursor":Landroid/database/Cursor; */
} // .end method
public void update ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 6 */
/* .param p1, "id" # I */
/* .param p2, "title" # Ljava/lang/String; */
/* .param p3, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 150 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 152 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v2 = "_id = ?"; // const-string v2, "_id = ?"
/* .line 154 */
/* .local v2, "where":Ljava/lang/String; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v3, v4, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v5, v3, v4 */
/* .line 156 */
/* .local v3, "whereStrings":[Ljava/lang/String; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 157 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = ""; // const-string v4, ""
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_0 */
final String v4 = "title"; // const-string v4, "title"
(( android.content.ContentValues ) v0 ).put ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 158 */
} // :cond_0
final String v4 = ""; // const-string v4, ""
v4 = (( java.lang.String ) p3 ).equals ( v4 ); // invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_1 */
final String v4 = "content"; // const-string v4, "content"
(( android.content.ContentValues ) v0 ).put ( v4, p3 ); // invoke-virtual {v0, v4, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 159 */
} // :cond_1
final String v4 = "content"; // const-string v4, "content"
(( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v4, v0, v2, v3 ); // invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 160 */
return;
} // .end method
public void updateIndex ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* .param p1, "id" # I */
/* .param p2, "index" # I */
/* .prologue */
/* .line 135 */
(( com.Ina.Notegre.SqlData ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SqlData;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 137 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v2 = "_id = ?"; // const-string v2, "_id = ?"
/* .line 139 */
/* .local v2, "where":Ljava/lang/String; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v3, v4, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .toString ( p1 );
/* aput-object v5, v3, v4 */
/* .line 141 */
/* .local v3, "whereStrings":[Ljava/lang/String; */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 142 */
/* .local v0, "cv":Landroid/content/ContentValues; */
final String v4 = "folder_index"; // const-string v4, "folder_index"
java.lang.Integer .valueOf ( p2 );
(( android.content.ContentValues ) v0 ).put ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 144 */
final String v4 = "content"; // const-string v4, "content"
(( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v4, v0, v2, v3 ); // invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* .line 145 */
return;
} // .end method
