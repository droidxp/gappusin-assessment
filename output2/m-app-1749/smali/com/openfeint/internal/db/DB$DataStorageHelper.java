public class com.openfeint.internal.db.DB$DataStorageHelper extends android.database.sqlite.SQLiteOpenHelper {
	 /* .source "DB.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/db/DB; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "DataStorageHelper" */
} // .end annotation
/* # direct methods */
 com.openfeint.internal.db.DB$DataStorageHelper ( ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 146 */
final String v0 = "manifest.db"; // const-string v0, "manifest.db"
int v1 = 0; // const/4 v1, 0x0
int v2 = 3; // const/4 v2, 0x3
/* invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V */
/* .line 147 */
return;
} // .end method
/* # virtual methods */
public void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 0 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .prologue */
/* .line 151 */
com.openfeint.internal.db.DB .access$000 ( p1 );
/* .line 152 */
return;
} // .end method
public void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "db" # Landroid/database/sqlite/SQLiteDatabase; */
/* .param p2, "oldVersion" # I */
/* .param p3, "newVersion" # I */
/* .prologue */
/* .line 156 */
com.openfeint.internal.db.DB .access$100 ( p1,p2,p3 );
/* .line 157 */
return;
} // .end method
