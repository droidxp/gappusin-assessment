public class inal extends android.database.sqlite.SQLiteOpenHelper {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 3 */
		 final String v0 = "kkkwan.db"; // const-string v0, "kkkwan.db"
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 final String v0 = "CREATE TABLE used_pipe (personid integer primary key autoincrement, pipe_id varchar(20), day_count varchar(20), month_count varchar(20))"; // const-string v0, "CREATE TABLE used_pipe (personid integer primary key autoincrement, pipe_id varchar(20), day_count varchar(20), month_count varchar(20))"
			 (( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 public final void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 final String v0 = "DROP TABLE IF EXISTS used_pipe"; // const-string v0, "DROP TABLE IF EXISTS used_pipe"
			 (( android.database.sqlite.SQLiteDatabase ) p1 ).execSQL ( v0 ); // invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
			 (( com.kkkwan.billing.e.a.a ) p0 ).onCreate ( p1 ); // invoke-virtual {p0, p1}, Lcom/kkkwan/billing/e/a/a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
