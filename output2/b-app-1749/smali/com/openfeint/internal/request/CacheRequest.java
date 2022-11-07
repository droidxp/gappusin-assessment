public abstract class com.openfeint.internal.request.CacheRequest extends com.openfeint.internal.request.BaseRequest {
	 /* .source "CacheRequest.java" */
	 /* # static fields */
	 private static final java.lang.String IF_MODIFIED_SINCE;
	 private static final java.lang.String LastModified;
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private java.lang.String key_;
	 /* # direct methods */
	 public com.openfeint.internal.request.CacheRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "key" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/BaseRequest;-><init>()V */
		 /* .line 21 */
		 this.key_ = p1;
		 /* .line 22 */
		 return;
	 } // .end method
	 private java.lang.String getLastModified ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* .line 35 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 36 */
		 /* .local v3, "result":Landroid/database/Cursor; */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 38 */
		 /* .local v4, "value":Ljava/lang/String; */
		 try { // :try_start_0
			 v5 = com.openfeint.internal.db.DB.storeHelper;
			 (( com.openfeint.internal.db.DB$DataStorageHelperX ) v5 ).getReadableDatabase ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
			 /* .line 39 */
			 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
			 int v5 = 1; // const/4 v5, 0x1
			 /* new-array v2, v5, [Ljava/lang/String; */
			 int v5 = 0; // const/4 v5, 0x0
			 v6 = this.key_;
			 /* aput-object v6, v2, v5 */
			 /* .line 40 */
			 /* .local v2, "key":[Ljava/lang/String; */
			 final String v5 = "SELECT VALUE FROM store where id=?"; // const-string v5, "SELECT VALUE FROM store where id=?"
			 (( android.database.sqlite.SQLiteDatabase ) v0 ).rawQuery ( v5, v2 ); // invoke-virtual {v0, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
			 v5 = 			 /* .line 41 */
			 /* if-lez v5, :cond_0 */
			 /* .line 42 */
			 /* .line 43 */
			 int v5 = 0; // const/4 v5, 0x0
			 /* .line 45 */
		 } // :cond_0
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
		 /* :try_end_0 */
		 /* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .line 51 */
	 } // .end local v0 # "db":Landroid/database/sqlite/SQLiteDatabase;
} // .end local v2 # "key":[Ljava/lang/String;
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 53 */
} // :cond_1
/* .line 46 */
/* :catch_0 */
/* move-exception v1 */
/* .line 47 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* .line 48 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_1 */
/* move-exception v1 */
/* .line 49 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v5 = "CacheRequest"; // const-string v5, "CacheRequest"
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
} // .end method
private void storeLastModified ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 57 */
/* if-nez p1, :cond_0 */
/* .line 68 */
} // :goto_0
return;
/* .line 58 */
} // :cond_0
int v3 = 2; // const/4 v3, 0x2
/* new-array v2, v3, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.key_;
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p1, v2, v3 */
/* .line 60 */
/* .local v2, "values":[Ljava/lang/String; */
try { // :try_start_0
v3 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v3 ).getWritableDatabase ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 61 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
final String v3 = "INSERT OR REPLACE INTO store VALUES(?, ?)"; // const-string v3, "INSERT OR REPLACE INTO store VALUES(?, ?)"
(( android.database.sqlite.SQLiteDatabase ) v0 ).execSQL ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
/* .line 62 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 63 */
} // .end local v0 # "db":Landroid/database/sqlite/SQLiteDatabase;
/* :catch_0 */
/* move-exception v1 */
/* .line 64 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* .line 65 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_1 */
/* move-exception v1 */
/* .line 66 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v3 = "CacheRequest"; // const-string v3, "CacheRequest"
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v3,v4 );
} // .end method
/* # virtual methods */
protected org.apache.http.client.methods.HttpUriRequest generateRequest ( ) {
/* .locals 3 */
/* .prologue */
/* .line 26 */
/* invoke-super {p0}, Lcom/openfeint/internal/request/BaseRequest;->generateRequest()Lorg/apache/http/client/methods/HttpUriRequest; */
/* .line 27 */
/* .local v1, "req":Lorg/apache/http/client/methods/HttpUriRequest; */
/* invoke-direct {p0}, Lcom/openfeint/internal/request/CacheRequest;->getLastModified()Ljava/lang/String; */
/* .line 28 */
/* .local v0, "date":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 29 */
final String v2 = "If-Modified-Since"; // const-string v2, "If-Modified-Since"
/* .line 31 */
} // :cond_0
} // .end method
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void on200Response ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
(( com.openfeint.internal.request.CacheRequest ) p0 ).getResponse ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/CacheRequest;->getResponse()Lorg/apache/http/HttpResponse;
(( com.openfeint.internal.request.CacheRequest ) p0 ).updateLastModifiedFromResponse ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/CacheRequest;->updateLastModifiedFromResponse(Lorg/apache/http/HttpResponse;)V
/* .line 80 */
return;
} // .end method
protected void updateLastModifiedFromResponse ( org.apache.http.HttpResponse p0 ) {
/* .locals 2 */
/* .param p1, "response" # Lorg/apache/http/HttpResponse; */
/* .prologue */
/* .line 72 */
if ( p1 != null) { // if-eqz p1, :cond_1
final String v1 = "Last-Modified"; // const-string v1, "Last-Modified"
/* .line 73 */
/* .local v0, "h":Lorg/apache/http/Header; */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 74 */
/* invoke-direct {p0, v1}, Lcom/openfeint/internal/request/CacheRequest;->storeLastModified(Ljava/lang/String;)V */
/* .line 76 */
} // :cond_0
return;
/* .line 72 */
} // .end local v0 # "h":Lorg/apache/http/Header;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
