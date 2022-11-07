public class com.Ina.Notegre.SmipleNotePad extends android.app.ListActivity {
	 /* .source "SmipleNotePad.java" */
	 /* # static fields */
	 private static final Integer MENU_ABOUT;
	 private static final Integer MENU_ADD;
	 private static final Integer MENU_CLOSE;
	 private static final Integer MENU_FOLDER;
	 private static java.lang.String mContent;
	 private static Integer mId;
	 private static Integer mIndex;
	 private static java.lang.String mTime;
	 private static java.lang.String mTitle;
	 /* # instance fields */
	 private android.content.DialogInterface$OnClickListener FolderListener;
	 protected android.view.View$OnClickListener btnListener;
	 private android.widget.Button btnNewWrite;
	 private android.widget.EditText editRename;
	 protected android.widget.AdapterView$OnItemLongClickListener longClickListener;
	 private com.Ina.Notegre.TextAdapter mAdapter;
	 private android.database.Cursor mCurFolder;
	 private android.database.Cursor mCursor;
	 private java.util.List mIdList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private com.Ina.Notegre.SqlData mSqlAccess;
private android.widget.TextView mTextView;
private android.content.DialogInterface$OnClickListener reOnFolderListener;
private android.content.DialogInterface$OnClickListener reOnListener;
private android.view.View renameView;
/* # direct methods */
static com.Ina.Notegre.SmipleNotePad ( ) {
/* .locals 1 */
/* .prologue */
/* .line 55 */
int v0 = -1; // const/4 v0, -0x1
/* .line 31 */
return;
} // .end method
public com.Ina.Notegre.SmipleNotePad ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
/* invoke-direct {p0}, Landroid/app/ListActivity;-><init>()V */
/* .line 168 */
/* new-instance v0, Lcom/Ina/Notegre/SmipleNotePad$1; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SmipleNotePad$1;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
this.btnListener = v0;
/* .line 221 */
/* new-instance v0, Lcom/Ina/Notegre/SmipleNotePad$2; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SmipleNotePad$2;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
this.longClickListener = v0;
/* .line 444 */
/* new-instance v0, Lcom/Ina/Notegre/SmipleNotePad$3; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SmipleNotePad$3;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
this.reOnListener = v0;
/* .line 461 */
/* new-instance v0, Lcom/Ina/Notegre/SmipleNotePad$4; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SmipleNotePad$4;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
this.reOnFolderListener = v0;
/* .line 487 */
/* new-instance v0, Lcom/Ina/Notegre/SmipleNotePad$5; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SmipleNotePad$5;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
this.FolderListener = v0;
/* .line 31 */
return;
} // .end method
private void CreateFolder ( ) {
/* .locals 4 */
/* .prologue */
/* .line 515 */
android.view.LayoutInflater .from ( p0 );
/* .line 516 */
/* .local v0, "factory":Landroid/view/LayoutInflater; */
/* const v2, 0x7f030008 */
int v3 = 0; // const/4 v3, 0x0
(( android.view.LayoutInflater ) v0 ).inflate ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
this.renameView = v2;
/* .line 517 */
v2 = this.renameView;
/* const v3, 0x7f090014 */
(( android.view.View ) v2 ).findViewById ( v3 ); // invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
this.mTextView = v2;
/* .line 518 */
v2 = this.renameView;
/* const v3, 0x7f090018 */
(( android.view.View ) v2 ).findViewById ( v3 ); // invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/EditText; */
this.editRename = v2;
/* .line 520 */
v2 = this.mTextView;
/* const v3, 0x7f07000c */
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V
/* .line 521 */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v2 ).create ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 522 */
/* .local v1, "renameDlg":Landroid/app/AlertDialog; */
v2 = this.renameView;
(( android.app.AlertDialog ) v1 ).setView ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V
/* .line 523 */
/* const v2, 0x7f070011 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
v3 = this.FolderListener;
(( android.app.AlertDialog ) v1 ).setButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
/* .line 524 */
/* const v2, 0x7f070012 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* new-instance v3, Lcom/Ina/Notegre/SmipleNotePad$9; */
/* invoke-direct {v3, p0}, Lcom/Ina/Notegre/SmipleNotePad$9;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
(( android.app.AlertDialog ) v1 ).setButton2 ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog;->setButton2(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
/* .line 532 */
(( android.app.AlertDialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
/* .line 533 */
return;
} // .end method
private Boolean PopupEdit ( Integer p0, java.lang.String p1, java.lang.String p2, Integer p3, Boolean p4 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .param p2, "sTitle" # Ljava/lang/String; */
/* .param p3, "sContent" # Ljava/lang/String; */
/* .param p4, "index" # I */
/* .param p5, "bEdit" # Z */
/* .prologue */
/* .line 330 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 332 */
/* .local v1, "intent":Landroid/content/Intent; */
if ( p5 != null) { // if-eqz p5, :cond_0
	 /* .line 334 */
	 /* const-class v2, Lcom/Ina/Notegre/NoteText; */
	 (( android.content.Intent ) v1 ).setClass ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
	 /* .line 341 */
} // :goto_0
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 342 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v2 = "Title"; // const-string v2, "Title"
(( android.os.Bundle ) v0 ).putString ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 343 */
final String v2 = "Content"; // const-string v2, "Content"
(( android.os.Bundle ) v0 ).putString ( v2, p3 ); // invoke-virtual {v0, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 344 */
final String v2 = "_id"; // const-string v2, "_id"
(( android.os.Bundle ) v0 ).putInt ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 345 */
final String v2 = "Index"; // const-string v2, "Index"
(( android.os.Bundle ) v0 ).putInt ( v2, p4 ); // invoke-virtual {v0, v2, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 346 */
final String v2 = "Time"; // const-string v2, "Time"
v3 = com.Ina.Notegre.SmipleNotePad.mTime;
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 348 */
(( android.content.Intent ) v1 ).putExtras ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 350 */
int v2 = 0; // const/4 v2, 0x0
(( com.Ina.Notegre.SmipleNotePad ) p0 ).startActivityForResult ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/Ina/Notegre/SmipleNotePad;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 351 */
/* const v2, 0x7f040003 */
/* const v3, 0x7f040001 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).overridePendingTransition ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->overridePendingTransition(II)V
/* .line 353 */
int v2 = 1; // const/4 v2, 0x1
/* .line 338 */
} // .end local v0 # "bundle":Landroid/os/Bundle;
} // :cond_0
/* const-class v2, Lcom/Ina/Notegre/ReadText; */
(( android.content.Intent ) v1 ).setClass ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
} // .end method
private Boolean PopupText ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 314 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 315 */
/* .local v1, "textIntent":Landroid/content/Intent; */
/* const-class v2, Lcom/Ina/Notegre/NoteText; */
(( android.content.Intent ) v1 ).setClass ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 317 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 318 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v2 = "_id"; // const-string v2, "_id"
int v3 = -1; // const/4 v3, -0x1
(( android.os.Bundle ) v0 ).putInt ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 319 */
final String v2 = "index"; // const-string v2, "index"
(( android.os.Bundle ) v0 ).putInt ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 320 */
(( android.content.Intent ) v1 ).putExtras ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 322 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).startActivityForResult ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lcom/Ina/Notegre/SmipleNotePad;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 323 */
/* const v2, 0x7f040003 */
/* const v3, 0x7f040001 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).overridePendingTransition ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->overridePendingTransition(II)V
/* .line 324 */
} // .end method
static Boolean access$0 ( com.Ina.Notegre.SmipleNotePad p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 312 */
v0 = /* invoke-direct {p0}, Lcom/Ina/Notegre/SmipleNotePad;->PopupText()Z */
} // .end method
static com.Ina.Notegre.TextAdapter access$1 ( com.Ina.Notegre.SmipleNotePad p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 41 */
v0 = this.mAdapter;
} // .end method
static com.Ina.Notegre.SqlData access$10 ( com.Ina.Notegre.SmipleNotePad p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 38 */
v0 = this.mSqlAccess;
} // .end method
static Integer access$11 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 50 */
} // .end method
static void access$12 ( Integer p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 55 */
return;
} // .end method
static java.util.List access$13 ( com.Ina.Notegre.SmipleNotePad p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.mIdList;
} // .end method
static Integer access$2 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 55 */
} // .end method
static Boolean access$3 ( com.Ina.Notegre.SmipleNotePad p0, Integer p1, java.lang.String p2, java.lang.String p3, Integer p4, Boolean p5 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 328 */
v0 = /* invoke-direct/range {p0 ..p5}, Lcom/Ina/Notegre/SmipleNotePad;->PopupEdit(ILjava/lang/String;Ljava/lang/String;IZ)Z */
} // .end method
static Boolean access$4 ( com.Ina.Notegre.SmipleNotePad p0, Integer p1, java.lang.String p2, Integer p3 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 357 */
v0 = /* invoke-direct {p0, p1, p2, p3}, Lcom/Ina/Notegre/SmipleNotePad;->deleteText(ILjava/lang/String;I)Z */
} // .end method
static Boolean access$5 ( com.Ina.Notegre.SmipleNotePad p0, Integer p1, java.lang.String p2, Integer p3 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 420 */
v0 = /* invoke-direct {p0, p1, p2, p3}, Lcom/Ina/Notegre/SmipleNotePad;->rename(ILjava/lang/String;I)Z */
} // .end method
static void access$6 ( com.Ina.Notegre.SmipleNotePad p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 542 */
/* invoke-direct {p0, p1}, Lcom/Ina/Notegre/SmipleNotePad;->popupMove(I)V */
return;
} // .end method
static java.lang.String access$7 ( com.Ina.Notegre.SmipleNotePad p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 662 */
/* invoke-direct {p0, p1, p2}, Lcom/Ina/Notegre/SmipleNotePad;->exportToDisk(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; */
} // .end method
static android.widget.EditText access$8 ( com.Ina.Notegre.SmipleNotePad p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = this.editRename;
} // .end method
static void access$9 ( com.Ina.Notegre.SmipleNotePad p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 536 */
/* invoke-direct {p0, p1}, Lcom/Ina/Notegre/SmipleNotePad;->tips(Ljava/lang/String;)V */
return;
} // .end method
private Boolean deleteText ( Integer p0, java.lang.String p1, Integer p2 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .param p2, "sTitle" # Ljava/lang/String; */
/* .param p3, "nType" # I */
/* .prologue */
/* const v3, 0x7f07000d */
/* .line 360 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 361 */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v3 ); // invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 362 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* const v2, 0x7f07000e */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 363 */
/* new-instance v1, Lcom/Ina/Notegre/SmipleNotePad$6; */
/* invoke-direct {v1, p0, p3, p1}, Lcom/Ina/Notegre/SmipleNotePad$6;-><init>(Lcom/Ina/Notegre/SmipleNotePad;II)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 406 */
/* const v1, 0x7f070012 */
/* new-instance v2, Lcom/Ina/Notegre/SmipleNotePad$7; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/SmipleNotePad$7;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 414 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 416 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private java.lang.String exportToDisk ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 7 */
/* .param p1, "titleString" # Ljava/lang/String; */
/* .param p2, "conString" # Ljava/lang/String; */
/* .prologue */
/* .line 664 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/SmipleNotePad;->getSDPath()Ljava/lang/String; */
/* .line 665 */
/* .local v4, "sdPathString":Ljava/lang/String; */
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "/"; // const-string v6, "/"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ".txt"; // const-string v6, ".txt"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 669 */
/* .local v1, "fileString":Ljava/lang/String; */
try { // :try_start_0
/* new-instance v3, Ljava/io/FileOutputStream; */
int v5 = 1; // const/4 v5, 0x1
/* invoke-direct {v3, v1, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V */
/* .line 670 */
/* .local v3, "outputStream":Ljava/io/FileOutputStream; */
/* new-instance v2, Ljava/io/OutputStreamWriter; */
final String v5 = "gb2312"; // const-string v5, "gb2312"
/* invoke-direct {v2, v3, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
/* .line 671 */
/* .local v2, "osw":Ljava/io/OutputStreamWriter; */
(( java.io.OutputStreamWriter ) v2 ).write ( p2 ); // invoke-virtual {v2, p2}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
/* .line 672 */
(( java.io.OutputStreamWriter ) v2 ).flush ( ); // invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->flush()V
/* .line 673 */
(( java.io.OutputStreamWriter ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 680 */
} // .end local v2 # "osw":Ljava/io/OutputStreamWriter;
} // .end local v3 # "outputStream":Ljava/io/FileOutputStream;
} // :goto_0
/* .line 675 */
/* :catch_0 */
/* move-exception v0 */
/* .line 677 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = 0; // const/4 v1, 0x0
} // .end method
private java.lang.String getSDPath ( ) {
/* .locals 4 */
/* .prologue */
/* .line 685 */
final String v1 = ""; // const-string v1, ""
/* .line 686 */
/* .local v1, "pathString":Ljava/lang/String; */
android.os.Environment .getExternalStorageState ( );
/* .line 687 */
final String v3 = "mounted"; // const-string v3, "mounted"
/* .line 686 */
v0 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 689 */
/* .local v0, "bHave":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 691 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;
/* .line 694 */
} // :cond_0
} // .end method
private void popupMove ( Integer p0 ) {
/* .locals 10 */
/* .param p1, "nId" # I */
/* .prologue */
int v9 = -1; // const/4 v9, -0x1
/* .line 544 */
/* .line 545 */
/* new-instance v5, Ljava/util/ArrayList; */
/* invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V */
/* .line 546 */
/* .local v5, "sList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
/* new-instance v7, Ljava/util/ArrayList; */
/* invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V */
this.mIdList = v7;
/* .line 548 */
v7 = this.mSqlAccess;
(( com.Ina.Notegre.SqlData ) v7 ).getFolderList ( ); // invoke-virtual {v7}, Lcom/Ina/Notegre/SqlData;->getFolderList()Landroid/database/Cursor;
/* .line 550 */
/* .local v0, "cursor":Landroid/database/Cursor; */
v4 = final String v7 = "name"; // const-string v7, "name"
/* .line 551 */
/* .local v4, "nName":I */
v3 = final String v7 = "_id"; // const-string v7, "_id"
/* .line 552 */
v2 = /* .local v3, "nIndex":I */
/* .line 554 */
/* .local v2, "nCount":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v2, :cond_1 */
/* .line 561 */
/* if-eq v9, v7, :cond_0 */
/* .line 563 */
final String v7 = "sm"; // const-string v7, "sm"
/* .line 564 */
v7 = this.mIdList;
java.lang.Integer .valueOf ( v9 );
/* .line 567 */
} // :cond_0
/* new-array v7, v2, [Ljava/lang/String; */
/* check-cast v6, [Ljava/lang/String; */
/* .line 569 */
/* .local v6, "sTitle":[Ljava/lang/String; */
/* new-instance v7, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 570 */
/* const v8, 0x7f070015 */
(( android.app.AlertDialog$Builder ) v7 ).setTitle ( v8 ); // invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 571 */
/* new-instance v8, Lcom/Ina/Notegre/SmipleNotePad$10; */
/* invoke-direct {v8, p0}, Lcom/Ina/Notegre/SmipleNotePad$10;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
(( android.app.AlertDialog$Builder ) v7 ).setItems ( v6, v8 ); // invoke-virtual {v7, v6, v8}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 583 */
(( android.app.AlertDialog$Builder ) v7 ).show ( ); // invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 584 */
return;
/* .line 556 */
} // .end local v6 # "sTitle":[Ljava/lang/String;
} // :cond_1
/* .line 557 */
/* .line 558 */
v8 = v7 = this.mIdList;
java.lang.Integer .valueOf ( v8 );
/* .line 554 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
private Boolean rename ( Integer p0, java.lang.String p1, Integer p2 ) {
/* .locals 4 */
/* .param p1, "nId" # I */
/* .param p2, "sTitle" # Ljava/lang/String; */
/* .param p3, "nType" # I */
/* .prologue */
/* .line 422 */
android.view.LayoutInflater .from ( p0 );
/* .line 423 */
/* .local v0, "factory":Landroid/view/LayoutInflater; */
/* const v2, 0x7f030008 */
int v3 = 0; // const/4 v3, 0x0
(( android.view.LayoutInflater ) v0 ).inflate ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
this.renameView = v2;
/* .line 424 */
v2 = this.renameView;
/* const v3, 0x7f090018 */
(( android.view.View ) v2 ).findViewById ( v3 ); // invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/EditText; */
this.editRename = v2;
/* .line 425 */
v2 = this.editRename;
(( android.widget.EditText ) v2 ).setText ( p2 ); // invoke-virtual {v2, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
/* .line 427 */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v2 ).create ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 428 */
/* .local v1, "renameDlg":Landroid/app/AlertDialog; */
v2 = this.renameView;
(( android.app.AlertDialog ) v1 ).setView ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V
/* .line 429 */
/* const v2, 0x7f070011 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* if-ne p3, v2, :cond_0 */
v2 = this.reOnListener;
} // :goto_0
(( android.app.AlertDialog ) v1 ).setButton ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
/* .line 430 */
/* const v2, 0x7f070012 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* new-instance v3, Lcom/Ina/Notegre/SmipleNotePad$8; */
/* invoke-direct {v3, p0}, Lcom/Ina/Notegre/SmipleNotePad$8;-><init>(Lcom/Ina/Notegre/SmipleNotePad;)V */
(( android.app.AlertDialog ) v1 ).setButton2 ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog;->setButton2(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
/* .line 437 */
(( android.app.AlertDialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
/* .line 439 */
/* .line 441 */
int v2 = 1; // const/4 v2, 0x1
/* .line 429 */
} // :cond_0
v2 = this.reOnFolderListener;
} // .end method
private void tips ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "sContent" # Ljava/lang/String; */
/* .prologue */
/* .line 538 */
int v1 = 0; // const/4 v1, 0x0
android.widget.Toast .makeText ( p0,p1,v1 );
/* .line 539 */
/* .local v0, "toast":Landroid/widget/Toast; */
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 540 */
return;
} // .end method
/* # virtual methods */
public Integer GetTextList ( Integer p0, Boolean p1 ) {
/* .locals 13 */
/* .param p1, "index" # I */
/* .param p2, "bFolder" # Z */
/* .prologue */
/* .line 588 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 590 */
/* .local v2, "listMaps":Ljava/util/List;, "Ljava/util/List<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
v11 = this.mAdapter;
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 592 */
v11 = this.mAdapter;
(( com.Ina.Notegre.TextAdapter ) v11 ).clear ( ); // invoke-virtual {v11}, Lcom/Ina/Notegre/TextAdapter;->clear()V
/* .line 593 */
v11 = this.mAdapter;
(( com.Ina.Notegre.TextAdapter ) v11 ).notifyDataSetChanged ( ); // invoke-virtual {v11}, Lcom/Ina/Notegre/TextAdapter;->notifyDataSetChanged()V
/* .line 596 */
} // :cond_0
/* if-nez p2, :cond_1 */
/* .line 598 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 599 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v11 = "type"; // const-string v11, "type"
int v12 = 5; // const/4 v12, 0x5
java.lang.Integer .valueOf ( v12 );
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 600 */
/* .line 603 */
} // .end local v0 # "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 605 */
v11 = this.mSqlAccess;
(( com.Ina.Notegre.SqlData ) v11 ).getFolderList ( ); // invoke-virtual {v11}, Lcom/Ina/Notegre/SqlData;->getFolderList()Landroid/database/Cursor;
this.mCurFolder = v11;
/* .line 607 */
v6 = v11 = this.mCurFolder;
/* .line 608 */
/* .local v6, "nFolderCount":I */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 610 */
v11 = this.mCurFolder;
v5 = final String v12 = "name"; // const-string v12, "name"
/* .line 611 */
/* .local v5, "nFolder":I */
v11 = this.mCurFolder;
v8 = final String v12 = "_id"; // const-string v12, "_id"
/* .line 613 */
/* .local v8, "nIndex":I */
v11 = this.mCurFolder;
/* .line 614 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v6, :cond_5 */
/* .line 627 */
} // .end local v1 # "i":I
} // .end local v5 # "nFolder":I
} // .end local v6 # "nFolderCount":I
} // .end local v8 # "nIndex":I
} // :cond_2
v11 = this.mSqlAccess;
(( com.Ina.Notegre.SqlData ) v11 ).select ( p1 ); // invoke-virtual {v11, p1}, Lcom/Ina/Notegre/SqlData;->select(I)Landroid/database/Cursor;
this.mCursor = v11;
/* .line 628 */
v4 = v11 = this.mCursor;
/* .line 630 */
/* .local v4, "nCount":I */
/* if-lez v4, :cond_3 */
/* .line 632 */
v11 = this.mCursor;
v9 = final String v12 = "title"; // const-string v12, "title"
/* .line 633 */
/* .local v9, "nName":I */
v11 = this.mCursor;
v3 = final String v12 = "content"; // const-string v12, "content"
/* .line 634 */
/* .local v3, "nCon":I */
v11 = this.mCursor;
v10 = final String v12 = "time"; // const-string v12, "time"
/* .line 635 */
/* .local v10, "nTime":I */
v11 = this.mCursor;
v7 = final String v12 = "_id"; // const-string v12, "_id"
/* .line 638 */
/* .local v7, "nId":I */
int v1 = 0; // const/4 v1, 0x0
/* .restart local v1 # "i":I */
} // :goto_1
/* if-lt v1, v4, :cond_6 */
/* .line 653 */
} // .end local v1 # "i":I
} // .end local v3 # "nCon":I
} // .end local v7 # "nId":I
} // .end local v9 # "nName":I
} // .end local v10 # "nTime":I
v11 = } // :cond_3
/* if-lez v11, :cond_4 */
/* .line 655 */
/* new-instance v11, Lcom/Ina/Notegre/TextAdapter; */
/* invoke-direct {v11, p0, v2}, Lcom/Ina/Notegre/TextAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V */
this.mAdapter = v11;
/* .line 656 */
v11 = this.mAdapter;
(( com.Ina.Notegre.SmipleNotePad ) p0 ).setListAdapter ( v11 ); // invoke-virtual {p0, v11}, Lcom/Ina/Notegre/SmipleNotePad;->setListAdapter(Landroid/widget/ListAdapter;)V
/* .line 659 */
} // :cond_4
int v11 = 0; // const/4 v11, 0x0
/* .line 616 */
} // .end local v4 # "nCount":I
/* .restart local v1 # "i":I */
/* .restart local v5 # "nFolder":I */
/* .restart local v6 # "nFolderCount":I */
/* .restart local v8 # "nIndex":I */
} // :cond_5
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 617 */
/* .restart local v0 # "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v11 = "type"; // const-string v11, "type"
int v12 = 1; // const/4 v12, 0x1
java.lang.Integer .valueOf ( v12 );
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 618 */
final String v11 = "name"; // const-string v11, "name"
v12 = this.mCurFolder;
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 619 */
final String v11 = "_id"; // const-string v11, "_id"
v12 = v12 = this.mCurFolder;
java.lang.Integer .valueOf ( v12 );
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 621 */
/* .line 622 */
v11 = this.mCurFolder;
/* .line 614 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 640 */
} // .end local v0 # "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v5 # "nFolder":I
} // .end local v6 # "nFolderCount":I
} // .end local v8 # "nIndex":I
/* .restart local v3 # "nCon":I */
/* .restart local v4 # "nCount":I */
/* .restart local v7 # "nId":I */
/* .restart local v9 # "nName":I */
/* .restart local v10 # "nTime":I */
} // :cond_6
v11 = this.mCursor;
/* .line 641 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 642 */
/* .restart local v0 # "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v11 = "type"; // const-string v11, "type"
final String v12 = "-1"; // const-string v12, "-1"
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 643 */
final String v11 = "title"; // const-string v11, "title"
v12 = this.mCursor;
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 644 */
final String v11 = "content"; // const-string v11, "content"
v12 = this.mCursor;
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 645 */
final String v11 = "_id"; // const-string v11, "_id"
v12 = v12 = this.mCursor;
java.lang.Integer .valueOf ( v12 );
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 646 */
final String v11 = "time"; // const-string v11, "time"
v12 = this.mCursor;
(( java.util.HashMap ) v0 ).put ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 648 */
/* .line 638 */
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_1 */
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 8 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
int v7 = -1; // const/4 v7, -0x1
int v5 = 1; // const/4 v5, 0x1
/* .line 201 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/ListActivity;->onActivityResult(IILandroid/content/Intent;)V */
/* .line 203 */
/* if-ne v5, p2, :cond_1 */
/* .line 205 */
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 206 */
/* .local v6, "bundle":Landroid/os/Bundle; */
final String v0 = "_id"; // const-string v0, "_id"
v1 = (( android.os.Bundle ) v6 ).getInt ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 207 */
/* .local v1, "nId":I */
final String v0 = "Index"; // const-string v0, "Index"
v0 = (( android.os.Bundle ) v6 ).getInt ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 208 */
final String v0 = "Title"; // const-string v0, "Title"
(( android.os.Bundle ) v6 ).getString ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 209 */
/* .local v2, "sTitle":Ljava/lang/String; */
final String v0 = "Content"; // const-string v0, "Content"
(( android.os.Bundle ) v6 ).getString ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 210 */
/* .local v3, "sContent":Ljava/lang/String; */
/* if-lez v1, :cond_0 */
/* .line 212 */
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/Ina/Notegre/SmipleNotePad;->PopupEdit(ILjava/lang/String;Ljava/lang/String;IZ)Z */
/* .line 219 */
} // .end local v1 # "nId":I
} // .end local v2 # "sTitle":Ljava/lang/String;
} // .end local v3 # "sContent":Ljava/lang/String;
} // .end local v6 # "bundle":Landroid/os/Bundle;
} // :cond_0
} // :goto_0
return;
/* .line 215 */
} // :cond_1
/* if-ne v7, p2, :cond_0 */
/* .line 217 */
/* if-le v4, v7, :cond_2 */
int v5 = 0; // const/4 v5, 0x0
} // :cond_2
(( com.Ina.Notegre.SmipleNotePad ) p0 ).GetTextList ( v0, v5 ); // invoke-virtual {p0, v0, v5}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 62 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/SmipleNotePad;->requestWindowFeature(I)Z
/* .line 66 */
/* invoke-super {p0, p1}, Landroid/app/ListActivity;->onCreate(Landroid/os/Bundle;)V */
/* .line 67 */
/* const v0, 0x7f030003 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->setContentView(I)V
/* .line 69 */
/* const v0, 0x7f090002 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.btnNewWrite = v0;
/* .line 70 */
v0 = this.btnNewWrite;
/* const v2, 0x7f020019 */
(( android.widget.Button ) v0 ).setBackgroundResource ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
/* .line 71 */
v0 = this.btnNewWrite;
v2 = this.btnListener;
(( android.widget.Button ) v0 ).setOnClickListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 73 */
/* new-instance v0, Lcom/Ina/Notegre/SqlData; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/SqlData;-><init>(Landroid/content/Context;)V */
this.mSqlAccess = v0;
/* .line 75 */
int v3 = -1; // const/4 v3, -0x1
/* if-le v0, v3, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( com.Ina.Notegre.SmipleNotePad ) p0 ).GetTextList ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 77 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getListView ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SmipleNotePad;->getListView()Landroid/widget/ListView;
v1 = this.longClickListener;
(( android.widget.ListView ) v0 ).setOnItemLongClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
/* .line 79 */
return;
} // :cond_0
/* move v0, v1 */
/* .line 75 */
} // .end method
public Boolean onCreateOptionsMenu ( android.view.Menu p0 ) {
/* .locals 6 */
/* .param p1, "menu" # Landroid/view/Menu; */
/* .prologue */
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 84 */
/* invoke-super {p0, p1}, Landroid/app/ListActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z */
/* .line 86 */
/* const v0, 0x7f070003 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* const v1, 0x7f020007 */
/* .line 87 */
/* const v0, 0x7f070004 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* const v1, 0x7f02000e */
/* .line 88 */
int v0 = 4; // const/4 v0, 0x4
/* const v1, 0x7f070005 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* const/high16 v1, 0x7f020000 */
/* .line 89 */
/* const v0, 0x7f070006 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* const v1, 0x7f020008 */
/* .line 91 */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
int v2 = -1; // const/4 v2, -0x1
/* .line 181 */
int v1 = 4; // const/4 v1, 0x4
/* if-ne p1, v1, :cond_1 */
/* .line 183 */
/* if-eq v2, v1, :cond_0 */
/* .line 185 */
/* .line 186 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).GetTextList ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 195 */
} // :goto_0
/* .line 191 */
} // :cond_0
(( com.Ina.Notegre.SmipleNotePad ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SmipleNotePad;->finish()V
/* .line 195 */
} // :cond_1
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/ListActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onListItemClick ( android.widget.ListView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 7 */
/* .param p1, "l" # Landroid/widget/ListView; */
/* .param p2, "v" # Landroid/view/View; */
/* .param p3, "position" # I */
/* .param p4, "id" # J */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v5 = 0; // const/4 v5, 0x0
int v1 = -1; // const/4 v1, -0x1
/* .line 141 */
/* invoke-super/range {p0 ..p5}, Landroid/app/ListActivity;->onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V */
/* .line 143 */
v0 = this.mAdapter;
v6 = (( com.Ina.Notegre.TextAdapter ) v0 ).getType ( p3 ); // invoke-virtual {v0, p3}, Lcom/Ina/Notegre/TextAdapter;->getType(I)I
/* .line 145 */
/* .local v6, "nType":I */
int v0 = 5; // const/4 v0, 0x5
/* if-ne v0, v6, :cond_1 */
/* .line 147 */
/* .line 148 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).GetTextList ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 166 */
} // :cond_0
} // :goto_0
return;
/* .line 152 */
} // :cond_1
v0 = this.mAdapter;
v0 = (( com.Ina.Notegre.TextAdapter ) v0 ).getId ( p3 ); // invoke-virtual {v0, p3}, Lcom/Ina/Notegre/TextAdapter;->getId(I)I
/* .line 153 */
/* if-ne v1, v6, :cond_2 */
/* .line 155 */
v0 = this.mAdapter;
(( com.Ina.Notegre.TextAdapter ) v0 ).getTitle ( p3 ); // invoke-virtual {v0, p3}, Lcom/Ina/Notegre/TextAdapter;->getTitle(I)Ljava/lang/String;
/* .line 156 */
v0 = this.mAdapter;
(( com.Ina.Notegre.TextAdapter ) v0 ).getContent ( p3 ); // invoke-virtual {v0, p3}, Lcom/Ina/Notegre/TextAdapter;->getContent(I)Ljava/lang/String;
/* .line 157 */
v0 = this.mAdapter;
(( com.Ina.Notegre.TextAdapter ) v0 ).getTime ( p3 ); // invoke-virtual {v0, p3}, Lcom/Ina/Notegre/TextAdapter;->getTime(I)Ljava/lang/String;
/* .line 158 */
v2 = com.Ina.Notegre.SmipleNotePad.mTitle;
v3 = com.Ina.Notegre.SmipleNotePad.mContent;
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/Ina/Notegre/SmipleNotePad;->PopupEdit(ILjava/lang/String;Ljava/lang/String;IZ)Z */
/* .line 160 */
} // :cond_2
/* if-ne v2, v6, :cond_0 */
/* .line 162 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).GetTextList ( v0, v5 ); // invoke-virtual {p0, v0, v5}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 163 */
} // .end method
public Boolean onOptionsItemSelected ( android.view.MenuItem p0 ) {
/* .locals 2 */
/* .param p1, "item" # Landroid/view/MenuItem; */
/* .prologue */
/* .line 111 */
/* invoke-super {p0, p1}, Landroid/app/ListActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
v0 = /* .line 113 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 135 */
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* .line 116 */
/* :pswitch_0 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/SmipleNotePad;->PopupText()Z */
/* .line 119 */
/* :pswitch_1 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne v0, v1, :cond_0 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/SmipleNotePad;->CreateFolder()V */
/* .line 120 */
} // :cond_0
/* const v0, 0x7f070007 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->tips(Ljava/lang/String;)V */
/* .line 124 */
/* :pswitch_2 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/SmipleNotePad;->finish()V
/* .line 128 */
/* :pswitch_3 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/Ina/Notegre/MoreActivity; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/SmipleNotePad;->startActivity(Landroid/content/Intent;)V
/* .line 129 */
/* const v0, 0x7f040003 */
/* const v1, 0x7f040001 */
(( com.Ina.Notegre.SmipleNotePad ) p0 ).overridePendingTransition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/Ina/Notegre/SmipleNotePad;->overridePendingTransition(II)V
/* .line 113 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
protected void onResume ( ) {
/* .locals 4 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 99 */
/* sget-boolean v0, Lcom/Ina/Notegre/GlobalValues;->bUpdate:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 101 */
int v3 = -1; // const/4 v3, -0x1
/* if-le v0, v3, :cond_1 */
/* move v0, v1 */
} // :goto_0
(( com.Ina.Notegre.SmipleNotePad ) p0 ).GetTextList ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 102 */
com.Ina.Notegre.GlobalValues.bUpdate = (v1!= 0);
/* .line 105 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/ListActivity;->onResume()V */
/* .line 106 */
return;
/* .line 101 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
