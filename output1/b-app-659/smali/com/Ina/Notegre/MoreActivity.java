public class com.Ina.Notegre.MoreActivity extends android.app.Activity {
	 /* .source "MoreActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/Ina/Notegre/MoreActivity$VertionTask; */
	 /* } */
} // .end annotation
/* # instance fields */
private android.view.View mAboutView;
private android.widget.Button mBackButton;
private android.view.View mBackupView;
private android.widget.Button mBtnAdd;
private android.view.View mMoreAppView;
private android.view.View mRestoreView;
private com.Ina.Notegre.SqlData mSqlAccess;
private android.widget.TextView mTitleTextView;
private android.view.View mUpdateView;
private android.view.View$OnClickListener onClickListener;
/* # direct methods */
public com.Ina.Notegre.MoreActivity ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 39 */
	 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
	 /* .line 102 */
	 /* new-instance v0, Lcom/Ina/Notegre/MoreActivity$1; */
	 /* invoke-direct {v0, p0}, Lcom/Ina/Notegre/MoreActivity$1;-><init>(Lcom/Ina/Notegre/MoreActivity;)V */
	 this.onClickListener = v0;
	 /* .line 39 */
	 return;
} // .end method
static void access$0 ( com.Ina.Notegre.MoreActivity p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 96 */
	 /* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->quit()V */
	 return;
} // .end method
static Boolean access$1 ( com.Ina.Notegre.MoreActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 147 */
	 v0 = 	 /* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->startBackup()Z */
} // .end method
static Boolean access$2 ( com.Ina.Notegre.MoreActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 182 */
	 v0 = 	 /* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->reduction()Z */
} // .end method
static java.lang.String access$3 ( com.Ina.Notegre.MoreActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 260 */
	 /* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->getSDPath()Ljava/lang/String; */
} // .end method
static Boolean access$4 ( com.Ina.Notegre.MoreActivity p0, java.lang.String p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 274 */
	 v0 = 	 /* invoke-direct {p0, p1}, Lcom/Ina/Notegre/MoreActivity;->createFolder(Ljava/lang/String;)Z */
} // .end method
static java.lang.String access$5 ( com.Ina.Notegre.MoreActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 306 */
	 /* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->getXml()Ljava/lang/String; */
} // .end method
static Boolean access$6 ( com.Ina.Notegre.MoreActivity p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 286 */
	 v0 = 	 /* invoke-direct {p0, p1, p2}, Lcom/Ina/Notegre/MoreActivity;->writeToXml(Ljava/lang/String;Ljava/lang/String;)Z */
} // .end method
static com.Ina.Notegre.SqlData access$7 ( com.Ina.Notegre.MoreActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 51 */
	 v0 = this.mSqlAccess;
} // .end method
private Boolean createFolder ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .param p1, "pathString" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 276 */
	 /* new-instance v0, Ljava/io/File; */
	 /* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 /* .line 277 */
	 /* .local v0, "folderDir":Ljava/io/File; */
	 v1 = 	 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
	 /* if-nez v1, :cond_0 */
	 /* .line 279 */
	 (( java.io.File ) v0 ).mkdir ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdir()Z
	 /* .line 280 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 283 */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
private java.util.List getConList ( ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 376 */
v10 = this.mSqlAccess;
(( com.Ina.Notegre.SqlData ) v10 ).getList ( ); // invoke-virtual {v10}, Lcom/Ina/Notegre/SqlData;->getList()Landroid/database/Cursor;
/* .line 377 */
/* .local v0, "cursor":Landroid/database/Cursor; */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 380 */
/* .local v2, "list":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
try { // :try_start_0
v8 = final String v10 = "title"; // const-string v10, "title"
/* .line 381 */
/* .local v8, "nName":I */
v4 = final String v10 = "content"; // const-string v10, "content"
/* .line 382 */
/* .local v4, "nCon":I */
v9 = final String v10 = "time"; // const-string v10, "time"
/* .line 383 */
/* .local v9, "nTime":I */
v7 = final String v10 = "_id"; // const-string v10, "_id"
/* .line 384 */
/* .local v7, "nId":I */
v6 = final String v10 = "folder_index"; // const-string v10, "folder_index"
/* .line 386 */
v5 = /* .local v6, "nFolder":I */
/* .line 387 */
/* .local v5, "nCount":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v5, :cond_0 */
/* .line 401 */
/* .line 406 */
} // .end local v1 # "i":I
} // .end local v4 # "nCon":I
} // .end local v5 # "nCount":I
} // .end local v6 # "nFolder":I
} // .end local v7 # "nId":I
} // .end local v8 # "nName":I
} // .end local v9 # "nTime":I
} // :goto_1
/* .line 389 */
/* .restart local v1 # "i":I */
/* .restart local v4 # "nCon":I */
/* .restart local v5 # "nCount":I */
/* .restart local v6 # "nFolder":I */
/* .restart local v7 # "nId":I */
/* .restart local v8 # "nName":I */
/* .restart local v9 # "nTime":I */
} // :cond_0
/* .line 390 */
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
/* .line 392 */
/* .local v3, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v10 = "title"; // const-string v10, "title"
/* .line 393 */
final String v10 = "content"; // const-string v10, "content"
/* .line 394 */
final String v10 = "time"; // const-string v10, "time"
/* .line 395 */
final String v10 = "_id"; // const-string v10, "_id"
/* .line 396 */
final String v10 = "folder_index"; // const-string v10, "folder_index"
/* .line 398 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 387 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 402 */
} // .end local v1 # "i":I
} // .end local v3 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v4 # "nCon":I
} // .end local v5 # "nCount":I
} // .end local v6 # "nFolder":I
} // .end local v7 # "nId":I
} // .end local v8 # "nName":I
} // .end local v9 # "nTime":I
/* :catch_0 */
/* move-exception v10 */
} // .end method
private java.util.List getFolderList ( ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 411 */
v7 = this.mSqlAccess;
(( com.Ina.Notegre.SqlData ) v7 ).getFolderList ( ); // invoke-virtual {v7}, Lcom/Ina/Notegre/SqlData;->getFolderList()Landroid/database/Cursor;
/* .line 413 */
/* .local v0, "cursor":Landroid/database/Cursor; */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 416 */
/* .local v2, "list":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
try { // :try_start_0
v5 = final String v7 = "_id"; // const-string v7, "_id"
/* .line 417 */
/* .local v5, "nId":I */
v6 = final String v7 = "name"; // const-string v7, "name"
/* .line 419 */
v4 = /* .local v6, "nName":I */
/* .line 420 */
/* .local v4, "nCount":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v4, :cond_0 */
/* .line 434 */
} // .end local v1 # "i":I
} // .end local v4 # "nCount":I
} // .end local v5 # "nId":I
} // .end local v6 # "nName":I
} // :goto_1
/* .line 422 */
/* .restart local v1 # "i":I */
/* .restart local v4 # "nCount":I */
/* .restart local v5 # "nId":I */
/* .restart local v6 # "nName":I */
} // :cond_0
/* .line 423 */
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
/* .line 424 */
/* .local v3, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v7 = "id"; // const-string v7, "id"
/* .line 425 */
final String v7 = "name"; // const-string v7, "name"
/* .line 427 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 420 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 429 */
} // .end local v1 # "i":I
} // .end local v3 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v4 # "nCount":I
} // .end local v5 # "nId":I
} // .end local v6 # "nName":I
/* :catch_0 */
/* move-exception v7 */
} // .end method
private java.lang.String getSDPath ( ) {
/* .locals 4 */
/* .prologue */
/* .line 262 */
final String v1 = ""; // const-string v1, ""
/* .line 263 */
/* .local v1, "pathString":Ljava/lang/String; */
android.os.Environment .getExternalStorageState ( );
/* .line 264 */
final String v3 = "mounted"; // const-string v3, "mounted"
/* .line 263 */
v0 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 266 */
/* .local v0, "bHave":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 268 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;
/* .line 271 */
} // :cond_0
} // .end method
private java.lang.String getXml ( ) {
/* .locals 9 */
/* .prologue */
/* .line 308 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->getConList()Ljava/util/List; */
/* .line 309 */
/* .local v0, "conList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->getFolderList()Ljava/util/List; */
/* .line 311 */
/* .local v2, "folList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* new-instance v5, Ljava/io/StringWriter; */
/* invoke-direct {v5}, Ljava/io/StringWriter;-><init>()V */
/* .line 315 */
/* .local v5, "stringWriter":Ljava/io/StringWriter; */
try { // :try_start_0
org.xmlpull.v1.XmlPullParserFactory .newInstance ( );
/* .line 316 */
/* .local v1, "factory":Lorg/xmlpull/v1/XmlPullParserFactory; */
(( org.xmlpull.v1.XmlPullParserFactory ) v1 ).newSerializer ( ); // invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;
/* .line 317 */
/* .local v4, "serializer":Lorg/xmlpull/v1/XmlSerializer; */
/* .line 319 */
final String v6 = "utf-8"; // const-string v6, "utf-8"
int v7 = 1; // const/4 v7, 0x1
java.lang.Boolean .valueOf ( v7 );
/* .line 320 */
int v6 = 0; // const/4 v6, 0x0
final String v7 = "data"; // const-string v7, "data"
/* .line 322 */
v7 = } // :goto_0
/* if-nez v7, :cond_0 */
/* .line 349 */
v7 = } // :goto_1
/* if-nez v7, :cond_1 */
/* .line 364 */
int v6 = 0; // const/4 v6, 0x0
final String v7 = "data"; // const-string v7, "data"
/* .line 366 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 371 */
} // .end local v1 # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
} // .end local v4 # "serializer":Lorg/xmlpull/v1/XmlSerializer;
} // :goto_2
(( java.io.StringWriter ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
/* .line 322 */
/* .restart local v1 # "factory":Lorg/xmlpull/v1/XmlPullParserFactory; */
/* .restart local v4 # "serializer":Lorg/xmlpull/v1/XmlSerializer; */
} // :cond_0
try { // :try_start_1
/* check-cast v3, Ljava/util/Map; */
/* .line 324 */
/* .local v3, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "item"; // const-string v8, "item"
/* .line 326 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "id"; // const-string v8, "id"
/* .line 327 */
final String v7 = "_id"; // const-string v7, "_id"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 328 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "id"; // const-string v8, "id"
/* .line 330 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "title"; // const-string v8, "title"
/* .line 331 */
final String v7 = "title"; // const-string v7, "title"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 332 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "title"; // const-string v8, "title"
/* .line 334 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "time"; // const-string v8, "time"
/* .line 335 */
final String v7 = "time"; // const-string v7, "time"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 336 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "time"; // const-string v8, "time"
/* .line 338 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "folder_index"; // const-string v8, "folder_index"
/* .line 339 */
final String v7 = "folder_index"; // const-string v7, "folder_index"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 340 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "folder_index"; // const-string v8, "folder_index"
/* .line 342 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "content"; // const-string v8, "content"
/* .line 343 */
final String v7 = "content"; // const-string v7, "content"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 344 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "content"; // const-string v8, "content"
/* .line 346 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "item"; // const-string v8, "item"
/* goto/16 :goto_0 */
/* .line 367 */
} // .end local v1 # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
} // .end local v3 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v4 # "serializer":Lorg/xmlpull/v1/XmlSerializer;
/* :catch_0 */
/* move-exception v6 */
/* goto/16 :goto_2 */
/* .line 349 */
/* .restart local v1 # "factory":Lorg/xmlpull/v1/XmlPullParserFactory; */
/* .restart local v4 # "serializer":Lorg/xmlpull/v1/XmlSerializer; */
} // :cond_1
/* check-cast v3, Ljava/util/Map; */
/* .line 351 */
/* .restart local v3 # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "folder"; // const-string v8, "folder"
/* .line 353 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "id"; // const-string v8, "id"
/* .line 354 */
final String v7 = "id"; // const-string v7, "id"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 355 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "id"; // const-string v8, "id"
/* .line 357 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "name"; // const-string v8, "name"
/* .line 358 */
final String v7 = "name"; // const-string v7, "name"
(( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 359 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "name"; // const-string v8, "name"
/* .line 361 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "folder"; // const-string v8, "folder"
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_1 */
} // .end method
private void quit ( ) {
/* .locals 2 */
/* .prologue */
/* .line 98 */
(( com.Ina.Notegre.MoreActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/MoreActivity;->finish()V
/* .line 99 */
/* const/high16 v0, 0x7f040000 */
/* const v1, 0x7f040004 */
(( com.Ina.Notegre.MoreActivity ) p0 ).overridePendingTransition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/Ina/Notegre/MoreActivity;->overridePendingTransition(II)V
/* .line 100 */
return;
} // .end method
private Boolean reduction ( ) {
/* .locals 3 */
/* .prologue */
/* .line 184 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 185 */
/* const v1, 0x7f07001f */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 186 */
/* const v1, 0x7f070023 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
/* .line 187 */
/* const v1, 0x7f070011 */
/* new-instance v2, Lcom/Ina/Notegre/MoreActivity$4; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/MoreActivity$4;-><init>(Lcom/Ina/Notegre/MoreActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 245 */
/* const v1, 0x7f070012 */
/* new-instance v2, Lcom/Ina/Notegre/MoreActivity$5; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/MoreActivity$5;-><init>(Lcom/Ina/Notegre/MoreActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 255 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 257 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private Boolean startBackup ( ) {
/* .locals 3 */
/* .prologue */
/* .line 149 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 150 */
/* const v1, 0x7f07001f */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 151 */
/* const v1, 0x7f070020 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
/* .line 152 */
/* const v1, 0x7f070011 */
/* new-instance v2, Lcom/Ina/Notegre/MoreActivity$2; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/MoreActivity$2;-><init>(Lcom/Ina/Notegre/MoreActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 166 */
/* const v1, 0x7f070012 */
/* new-instance v2, Lcom/Ina/Notegre/MoreActivity$3; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/MoreActivity$3;-><init>(Lcom/Ina/Notegre/MoreActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 176 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 178 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private Boolean writeToXml ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p1, "pathString" # Ljava/lang/String; */
/* .param p2, "xmlString" # Ljava/lang/String; */
/* .prologue */
/* .line 290 */
try { // :try_start_0
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 291 */
/* .local v1, "file":Ljava/io/File; */
/* new-instance v2, Ljava/io/FileOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 292 */
/* .local v2, "os":Ljava/io/OutputStream; */
/* new-instance v3, Ljava/io/OutputStreamWriter; */
/* invoke-direct {v3, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V */
/* .line 294 */
/* .local v3, "osw":Ljava/io/OutputStreamWriter; */
(( java.io.OutputStreamWriter ) v3 ).write ( p2 ); // invoke-virtual {v3, p2}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
/* .line 295 */
(( java.io.OutputStreamWriter ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
/* .line 296 */
(( java.io.OutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 303 */
int v4 = 1; // const/4 v4, 0x1
} // .end local v1 # "file":Ljava/io/File;
} // .end local v2 # "os":Ljava/io/OutputStream;
} // .end local v3 # "osw":Ljava/io/OutputStreamWriter;
} // :goto_0
/* .line 298 */
/* :catch_0 */
/* move-exception v0 */
/* .line 300 */
/* .local v0, "e":Ljava/lang/Exception; */
int v4 = 0; // const/4 v4, 0x0
} // .end method
/* # virtual methods */
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 56 */
int v0 = 1; // const/4 v0, 0x1
(( com.Ina.Notegre.MoreActivity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->requestWindowFeature(I)Z
/* .line 57 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.games.a .a ( p0 );
/* .line 58 */
/* const v0, 0x7f030009 */
(( com.Ina.Notegre.MoreActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->setContentView(I)V
/* .line 60 */
/* const v0, 0x7f090002 */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.mBtnAdd = v0;
/* .line 61 */
/* const/high16 v0, 0x7f090000 */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.mBackButton = v0;
/* .line 62 */
/* const v0, 0x7f090001 */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.mTitleTextView = v0;
/* .line 63 */
/* const v0, 0x7f090019 */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
this.mBackupView = v0;
/* .line 64 */
/* const v0, 0x7f09001a */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
this.mRestoreView = v0;
/* .line 65 */
/* const v0, 0x7f09001c */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
this.mAboutView = v0;
/* .line 66 */
/* const v0, 0x7f09001d */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
this.mMoreAppView = v0;
/* .line 67 */
/* const v0, 0x7f09001b */
(( com.Ina.Notegre.MoreActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/MoreActivity;->findViewById(I)Landroid/view/View;
this.mUpdateView = v0;
/* .line 69 */
v0 = this.mTitleTextView;
/* const v1, 0x7f070005 */
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
/* .line 70 */
v0 = this.mBtnAdd;
/* const/16 v1, 0x8 */
(( android.widget.Button ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
/* .line 71 */
v0 = this.mBackButton;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.Button ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
/* .line 72 */
v0 = this.mBackButton;
v1 = this.onClickListener;
(( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 73 */
v0 = this.mBackupView;
v1 = this.onClickListener;
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 74 */
v0 = this.mRestoreView;
v1 = this.onClickListener;
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 75 */
v0 = this.mAboutView;
v1 = this.onClickListener;
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 76 */
v0 = this.mMoreAppView;
v1 = this.onClickListener;
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 77 */
v0 = this.mUpdateView;
v1 = this.onClickListener;
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 79 */
/* new-instance v0, Lcom/Ina/Notegre/SqlData; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SqlData;-><init>(Landroid/content/Context;)V */
this.mSqlAccess = v0;
/* .line 80 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 85 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 87 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/MoreActivity;->quit()V */
/* .line 88 */
int v0 = 1; // const/4 v0, 0x1
/* .line 91 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
