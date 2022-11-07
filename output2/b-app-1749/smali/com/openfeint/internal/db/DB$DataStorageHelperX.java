public class com.openfeint.internal.db.DB$DataStorageHelperX extends com.openfeint.internal.db.SQLiteOpenHelperX {
	 /* .source "DB.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/db/DB; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "DataStorageHelperX" */
} // .end annotation
/* # direct methods */
 com.openfeint.internal.db.DB$DataStorageHelperX ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 126 */
/* new-instance v0, Lcom/openfeint/internal/db/DB$DataStorageHelper; */
/* invoke-direct {v0, p1}, Lcom/openfeint/internal/db/DB$DataStorageHelper;-><init>(Landroid/content/Context;)V */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V */
/* .line 127 */
return;
} // .end method
 com.openfeint.internal.db.DB$DataStorageHelperX ( ) {
/* .locals 1 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 129 */
int v0 = 3; // const/4 v0, 0x3
/* invoke-direct {p0, p1, v0}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;-><init>(Ljava/lang/String;I)V */
/* .line 130 */
return;
} // .end method
/* # virtual methods */
public void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 0 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
/* .line 134 */
com.openfeint.internal.db.DB .access$000 ( p1 );
/* .line 135 */
return;
} // .end method
public void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .param p2, "oldVersion" # I */
/* .param p3, "newVersion" # I */
/* .prologue */
/* .line 139 */
com.openfeint.internal.db.DB .access$100 ( p1,p2,p3 );
/* .line 140 */
return;
} // .end method
