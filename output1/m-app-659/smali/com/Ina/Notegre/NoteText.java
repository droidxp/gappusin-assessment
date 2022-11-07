public class com.Ina.Notegre.NoteText extends android.app.Activity {
	 /* .source "NoteText.java" */
	 /* # static fields */
	 private static Integer mId;
	 private static Integer mIndex;
	 /* # instance fields */
	 private android.view.View$OnClickListener btnListener;
	 private android.widget.Button mBackButton;
	 private android.widget.Button mBtnAdd;
	 private android.widget.EditText mEditContent;
	 private android.widget.EditText mEditTitle;
	 private com.Ina.Notegre.SqlData mSqlAccess;
	 private android.widget.TextView mTitleTextView;
	 /* # direct methods */
	 static com.Ina.Notegre.NoteText ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 19 */
		 /* .line 20 */
		 /* .line 16 */
		 return;
	 } // .end method
	 public com.Ina.Notegre.NoteText ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 104 */
		 /* new-instance v0, Lcom/Ina/Notegre/NoteText$1; */
		 /* invoke-direct {v0, p0}, Lcom/Ina/Notegre/NoteText$1;-><init>(Lcom/Ina/Notegre/NoteText;)V */
		 this.btnListener = v0;
		 /* .line 16 */
		 return;
	 } // .end method
	 private Boolean BackIndex ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 148 */
		 int v0 = -1; // const/4 v0, -0x1
		 (( com.Ina.Notegre.NoteText ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/NoteText;->setResult(I)V
		 /* .line 150 */
		 /* invoke-direct {p0}, Lcom/Ina/Notegre/NoteText;->quit()V */
		 /* .line 152 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 private Boolean CheckData ( ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* .line 85 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 87 */
		 /* .local v0, "bRet":Z */
		 v4 = this.mEditTitle;
		 (( android.widget.EditText ) v4 ).getText ( ); // invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
		 /* .line 88 */
		 /* .local v2, "sTitle":Ljava/lang/String; */
		 v4 = this.mEditContent;
		 (( android.widget.EditText ) v4 ).getText ( ); // invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
		 /* .line 90 */
		 /* .local v1, "sContent":Ljava/lang/String; */
		 final String v4 = ""; // const-string v4, ""
		 v4 = 		 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 91 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 92 */
		 } // :cond_0
		 final String v4 = ""; // const-string v4, ""
		 v4 = 		 (( java.lang.String ) v1 ).equals ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v4 != null) { // if-eqz v4, :cond_1
			 /* .line 93 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 95 */
		 } // :cond_1
		 /* if-nez v0, :cond_2 */
		 /* .line 97 */
		 /* const v4, 0x7f07000f */
		 (( com.Ina.Notegre.NoteText ) p0 ).getString ( v4 ); // invoke-virtual {p0, v4}, Lcom/Ina/Notegre/NoteText;->getString(I)Ljava/lang/String;
		 int v5 = 0; // const/4 v5, 0x0
		 android.widget.Toast .makeText ( p0,v4,v5 );
		 /* .line 98 */
		 /* .local v3, "tError":Landroid/widget/Toast; */
		 (( android.widget.Toast ) v3 ).show ( ); // invoke-virtual {v3}, Landroid/widget/Toast;->show()V
		 /* .line 101 */
	 } // .end local v3 # "tError":Landroid/widget/Toast;
} // :cond_2
} // .end method
private Boolean SaveData ( ) {
/* .locals 7 */
/* .prologue */
int v1 = -1; // const/4 v1, -0x1
/* .line 129 */
v0 = this.mEditTitle;
(( android.widget.EditText ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
/* .line 130 */
/* .local v2, "sTitle":Ljava/lang/String; */
v0 = this.mEditContent;
(( android.widget.EditText ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
/* .line 132 */
/* .local v3, "sContent":Ljava/lang/String; */
/* new-instance v6, Landroid/text/format/Time; */
final String v0 = "china"; // const-string v0, "china"
/* invoke-direct {v6, v0}, Landroid/text/format/Time;-><init>(Ljava/lang/String;)V */
/* .line 133 */
/* .local v6, "t":Landroid/text/format/Time; */
(( android.text.format.Time ) v6 ).setToNow ( ); // invoke-virtual {v6}, Landroid/text/format/Time;->setToNow()V
/* .line 135 */
final String v4 = ""; // const-string v4, ""
/* .line 136 */
/* .local v4, "sTime":Ljava/lang/String; */
final String v0 = "%Y-%m-%d"; // const-string v0, "%Y-%m-%d"
(( android.text.format.Time ) v6 ).format ( v0 ); // invoke-virtual {v6, v0}, Landroid/text/format/Time;->format(Ljava/lang/String;)Ljava/lang/String;
/* .line 138 */
/* if-ne v1, v0, :cond_0 */
/* .line 139 */
v0 = this.mSqlAccess;
/* invoke-virtual/range {v0 ..v5}, Lcom/Ina/Notegre/SqlData;->insert(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)J */
/* .line 143 */
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* .line 141 */
} // :cond_0
v0 = this.mSqlAccess;
(( com.Ina.Notegre.SqlData ) v0 ).update ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/Ina/Notegre/SqlData;->update(ILjava/lang/String;Ljava/lang/String;)V
} // .end method
static Boolean access$0 ( com.Ina.Notegre.NoteText p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 83 */
v0 = /* invoke-direct {p0}, Lcom/Ina/Notegre/NoteText;->CheckData()Z */
} // .end method
static Boolean access$1 ( com.Ina.Notegre.NoteText p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 127 */
v0 = /* invoke-direct {p0}, Lcom/Ina/Notegre/NoteText;->SaveData()Z */
} // .end method
static Boolean access$2 ( com.Ina.Notegre.NoteText p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 146 */
v0 = /* invoke-direct {p0}, Lcom/Ina/Notegre/NoteText;->BackIndex()Z */
} // .end method
static void access$3 ( com.Ina.Notegre.NoteText p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 77 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/NoteText;->quit()V */
return;
} // .end method
private void quit ( ) {
/* .locals 2 */
/* .prologue */
/* .line 79 */
(( com.Ina.Notegre.NoteText ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/NoteText;->finish()V
/* .line 80 */
/* const/high16 v0, 0x7f040000 */
/* const v1, 0x7f040004 */
(( com.Ina.Notegre.NoteText ) p0 ).overridePendingTransition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/Ina/Notegre/NoteText;->overridePendingTransition(II)V
/* .line 81 */
return;
} // .end method
/* # virtual methods */
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 33 */
int v1 = 1; // const/4 v1, 0x1
(( com.Ina.Notegre.NoteText ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->requestWindowFeature(I)Z
/* .line 35 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 36 */
/* const v1, 0x7f03000a */
(( com.Ina.Notegre.NoteText ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->setContentView(I)V
/* .line 38 */
/* const v1, 0x7f09001e */
(( com.Ina.Notegre.NoteText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/EditText; */
this.mEditTitle = v1;
/* .line 39 */
/* const v1, 0x7f09001f */
(( com.Ina.Notegre.NoteText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/EditText; */
this.mEditContent = v1;
/* .line 40 */
/* const v1, 0x7f090002 */
(( com.Ina.Notegre.NoteText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
this.mBtnAdd = v1;
/* .line 41 */
/* const/high16 v1, 0x7f090000 */
(( com.Ina.Notegre.NoteText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
this.mBackButton = v1;
/* .line 42 */
/* const v1, 0x7f090001 */
(( com.Ina.Notegre.NoteText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/NoteText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.mTitleTextView = v1;
/* .line 44 */
v1 = this.mTitleTextView;
/* const v2, 0x7f070027 */
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V
/* .line 45 */
v1 = this.mBackButton;
int v2 = 0; // const/4 v2, 0x0
(( android.widget.Button ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 46 */
v1 = this.mBtnAdd;
/* const v2, 0x7f07001a */
(( android.widget.Button ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V
/* .line 47 */
v1 = this.mBtnAdd;
v2 = this.btnListener;
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 48 */
v1 = this.mBackButton;
v2 = this.btnListener;
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 50 */
/* new-instance v1, Lcom/Ina/Notegre/SqlData; */
/* invoke-direct {v1, p0}, Lcom/Ina/Notegre/SqlData;-><init>(Landroid/content/Context;)V */
this.mSqlAccess = v1;
/* .line 52 */
(( com.Ina.Notegre.NoteText ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/NoteText;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v1 ).getExtras ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 53 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v1 = "_id"; // const-string v1, "_id"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 54 */
final String v1 = "index"; // const-string v1, "index"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 56 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 58 */
v1 = this.mEditTitle;
final String v2 = "Title"; // const-string v2, "Title"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( android.widget.EditText ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
/* .line 59 */
v1 = this.mEditContent;
final String v2 = "Content"; // const-string v2, "Content"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( android.widget.EditText ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
/* .line 61 */
} // :cond_0
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 66 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 68 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/NoteText;->quit()V */
/* .line 69 */
int v0 = 1; // const/4 v0, 0x1
/* .line 72 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
