public class de.nurogames.android.ticb.base.PurchaseDatabase {
	 /* .source "PurchaseDatabase.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/PurchaseDatabase$DatabaseHelper; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String DATABASE_NAME;
private static final Integer DATABASE_VERSION;
private static final java.lang.String HISTORY_COLUMNS;
static final java.lang.String HISTORY_DEVELOPER_PAYLOAD_COL;
static final java.lang.String HISTORY_ORDER_ID_COL;
static final java.lang.String HISTORY_PRODUCT_ID_COL;
static final java.lang.String HISTORY_PURCHASE_TIME_COL;
static final java.lang.String HISTORY_STATE_COL;
private static final java.lang.String PURCHASED_COLUMNS;
private static final java.lang.String PURCHASED_ITEMS_TABLE_NAME;
static final java.lang.String PURCHASED_PRODUCT_ID_COL;
static final java.lang.String PURCHASED_QUANTITY_COL;
private static final java.lang.String PURCHASE_HISTORY_TABLE_NAME;
private static final java.lang.String TAG;
/* # instance fields */
private de.nurogames.android.ticb.base.PurchaseDatabase$DatabaseHelper mDatabaseHelper;
private android.database.sqlite.SQLiteDatabase mDb;
/* # direct methods */
static de.nurogames.android.ticb.base.PurchaseDatabase ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 int v5 = 2; // const/4 v5, 0x2
	 int v4 = 1; // const/4 v4, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 52 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* new-array v0, v0, [Ljava/lang/String; */
	 /* .line 53 */
	 final String v1 = "_id"; // const-string v1, "_id"
	 /* aput-object v1, v0, v3 */
	 final String v1 = "productId"; // const-string v1, "productId"
	 /* aput-object v1, v0, v4 */
	 final String v1 = "state"; // const-string v1, "state"
	 /* aput-object v1, v0, v5 */
	 int v1 = 3; // const/4 v1, 0x3
	 /* .line 54 */
	 final String v2 = "purchaseTime"; // const-string v2, "purchaseTime"
	 /* aput-object v2, v0, v1 */
	 int v1 = 4; // const/4 v1, 0x4
	 final String v2 = "developerPayload"; // const-string v2, "developerPayload"
	 /* aput-object v2, v0, v1 */
	 /* .line 52 */
	 /* .line 61 */
	 /* new-array v0, v5, [Ljava/lang/String; */
	 /* .line 62 */
	 final String v1 = "_id"; // const-string v1, "_id"
	 /* aput-object v1, v0, v3 */
	 final String v1 = "quantity"; // const-string v1, "quantity"
	 /* aput-object v1, v0, v4 */
	 /* .line 61 */
	 /* .line 63 */
	 return;
} // .end method
public de.nurogames.android.ticb.base.PurchaseDatabase ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 68 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 69 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/PurchaseDatabase$DatabaseHelper; */
	 /* invoke-direct {v0, p0, p1}, Lde/nurogames/android/ticb/base/PurchaseDatabase$DatabaseHelper;-><init>(Lde/nurogames/android/ticb/base/PurchaseDatabase;Landroid/content/Context;)V */
	 this.mDatabaseHelper = v0;
	 /* .line 70 */
	 v0 = this.mDatabaseHelper;
	 (( de.nurogames.android.ticb.base.PurchaseDatabase$DatabaseHelper ) v0 ).getWritableDatabase ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/PurchaseDatabase$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
	 this.mDb = v0;
	 /* .line 71 */
	 return;
} // .end method
private void insertOrder ( java.lang.String p0, java.lang.String p1, de.nurogames.android.ticb.base.Consts$PurchaseState p2, Long p3, java.lang.String p4 ) {
	 /* .locals 4 */
	 /* .param p1, "orderId" # Ljava/lang/String; */
	 /* .param p2, "productId" # Ljava/lang/String; */
	 /* .param p3, "state" # Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
	 /* .param p4, "purchaseTime" # J */
	 /* .param p6, "developerPayload" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 90 */
	 /* new-instance v0, Landroid/content/ContentValues; */
	 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
	 /* .line 91 */
	 /* .local v0, "values":Landroid/content/ContentValues; */
	 final String v1 = "_id"; // const-string v1, "_id"
	 (( android.content.ContentValues ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 92 */
	 final String v1 = "productId"; // const-string v1, "productId"
	 (( android.content.ContentValues ) v0 ).put ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 93 */
	 final String v1 = "state"; // const-string v1, "state"
	 v2 = 	 (( de.nurogames.android.ticb.base.Consts$PurchaseState ) p3 ).ordinal ( ); // invoke-virtual {p3}, Lde/nurogames/android/ticb/base/Consts$PurchaseState;->ordinal()I
	 java.lang.Integer .valueOf ( v2 );
	 (( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
	 /* .line 94 */
	 final String v1 = "purchaseTime"; // const-string v1, "purchaseTime"
	 java.lang.Long .valueOf ( p4,p5 );
	 (( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
	 /* .line 95 */
	 final String v1 = "developerPayload"; // const-string v1, "developerPayload"
	 (( android.content.ContentValues ) v0 ).put ( v1, p6 ); // invoke-virtual {v0, v1, p6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 96 */
	 v1 = this.mDb;
	 final String v2 = "history"; // const-string v2, "history"
	 int v3 = 0; // const/4 v3, 0x0
	 (( android.database.sqlite.SQLiteDatabase ) v1 ).replace ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
	 /* .line 97 */
	 return;
} // .end method
private void updatePurchasedItem ( java.lang.String p0, Integer p1 ) {
	 /* .locals 6 */
	 /* .param p1, "productId" # Ljava/lang/String; */
	 /* .param p2, "quantity" # I */
	 /* .prologue */
	 /* .line 106 */
	 /* if-nez p2, :cond_0 */
	 /* .line 107 */
	 v1 = this.mDb;
	 final String v2 = "purchased"; // const-string v2, "purchased"
	 final String v3 = "_id=?"; // const-string v3, "_id=?"
	 /* .line 108 */
	 int v4 = 1; // const/4 v4, 0x1
	 /* new-array v4, v4, [Ljava/lang/String; */
	 int v5 = 0; // const/4 v5, 0x0
	 /* aput-object p1, v4, v5 */
	 /* .line 107 */
	 (( android.database.sqlite.SQLiteDatabase ) v1 ).delete ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
	 /* .line 115 */
} // :goto_0
return;
/* .line 111 */
} // :cond_0
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 112 */
/* .local v0, "values":Landroid/content/ContentValues; */
final String v1 = "_id"; // const-string v1, "_id"
(( android.content.ContentValues ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 113 */
final String v1 = "quantity"; // const-string v1, "quantity"
java.lang.Integer .valueOf ( p2 );
(( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 114 */
v1 = this.mDb;
final String v2 = "purchased"; // const-string v2, "purchased"
int v3 = 0; // const/4 v3, 0x0
(( android.database.sqlite.SQLiteDatabase ) v1 ).replace ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 1 */
/* .prologue */
/* .line 74 */
v0 = this.mDatabaseHelper;
(( de.nurogames.android.ticb.base.PurchaseDatabase$DatabaseHelper ) v0 ).close ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/PurchaseDatabase$DatabaseHelper;->close()V
/* .line 75 */
return;
} // .end method
public android.database.Cursor queryAllPurchasedItems ( ) {
/* .locals 8 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 165 */
v0 = this.mDb;
final String v1 = "purchased"; // const-string v1, "purchased"
v2 = de.nurogames.android.ticb.base.PurchaseDatabase.PURCHASED_COLUMNS;
/* move-object v4, v3 */
/* move-object v5, v3 */
/* move-object v6, v3 */
/* move-object v7, v3 */
/* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
} // .end method
public synchronized Integer updatePurchase ( java.lang.String p0, java.lang.String p1, de.nurogames.android.ticb.base.Consts$PurchaseState p2, Long p3, java.lang.String p4 ) {
/* .locals 13 */
/* .param p1, "orderId" # Ljava/lang/String; */
/* .param p2, "productId" # Ljava/lang/String; */
/* .param p3, "purchaseState" # Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
/* .param p4, "purchaseTime" # J */
/* .param p6, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 131 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct/range {p0 ..p6}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->insertOrder(Ljava/lang/String;Ljava/lang/String;Lde/nurogames/android/ticb/base/Consts$PurchaseState;JLjava/lang/String;)V */
/* .line 132 */
v0 = this.mDb;
final String v1 = "history"; // const-string v1, "history"
v2 = de.nurogames.android.ticb.base.PurchaseDatabase.HISTORY_COLUMNS;
/* .line 133 */
final String v3 = "productId=?"; // const-string v3, "productId=?"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object p2, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* .line 132 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 134 */
/* .local v9, "cursor":Landroid/database/Cursor; */
/* if-nez v9, :cond_1 */
/* .line 135 */
int v10 = 0; // const/4 v10, 0x0
/* .line 157 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
/* .line 137 */
} // :cond_1
int v10 = 0; // const/4 v10, 0x0
/* .line 140 */
/* .local v10, "quantity":I */
} // :cond_2
} // :goto_1
v0 = try { // :try_start_1
/* if-nez v0, :cond_3 */
/* .line 151 */
/* invoke-direct {p0, p2, v10}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->updatePurchasedItem(Ljava/lang/String;I)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 153 */
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 154 */
try { // :try_start_2
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 131 */
} // .end local v9 # "cursor":Landroid/database/Cursor;
} // .end local v10 # "quantity":I
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 141 */
/* .restart local v9 # "cursor":Landroid/database/Cursor; */
/* .restart local v10 # "quantity":I */
} // :cond_3
int v0 = 2; // const/4 v0, 0x2
v12 = try { // :try_start_3
/* .line 142 */
/* .local v12, "stateIndex":I */
de.nurogames.android.ticb.base.Consts$PurchaseState .valueOf ( v12 );
/* .line 145 */
/* .local v11, "state":Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
v0 = de.nurogames.android.ticb.base.Consts$PurchaseState.PURCHASED;
/* if-eq v11, v0, :cond_4 */
v0 = de.nurogames.android.ticb.base.Consts$PurchaseState.REFUNDED;
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* if-ne v11, v0, :cond_2 */
/* .line 146 */
} // :cond_4
/* add-int/lit8 v10, v10, 0x1 */
/* .line 152 */
} // .end local v11 # "state":Lde/nurogames/android/ticb/base/Consts$PurchaseState;
} // .end local v12 # "stateIndex":I
/* :catchall_1 */
/* move-exception v0 */
/* .line 153 */
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 154 */
try { // :try_start_4
/* .line 156 */
} // :cond_5
/* throw v0 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // .end method
