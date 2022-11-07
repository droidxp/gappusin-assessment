public class com.Ina.Notegre.ReadText extends android.app.Activity {
	 /* .source "ReadText.java" */
	 /* # static fields */
	 private static final Integer MENU_CLOSE;
	 private static final Integer MENU_EDIT;
	 private static java.lang.String mContent;
	 private static Integer mId;
	 private static Integer mIndex;
	 private static java.lang.String mTitle;
	 /* # instance fields */
	 private android.view.animation.Animation$AnimationListener animaEnd;
	 private android.widget.TextView contentTextView;
	 private com.Ina.Control.AnimaAccess mAnimaAccess;
	 private android.widget.Button mBackButton;
	 private android.widget.TextView mHeadTextView;
	 private android.view.View mMenuBgView;
	 private android.widget.Button mMenuButton;
	 private android.view.View mOnMenu_1;
	 private android.view.View mOnMenu_2;
	 private android.view.View mOnMenu_3;
	 private android.widget.LinearLayout mPopupMenuLayout;
	 private Integer mTextSize;
	 private Boolean mbPopup;
	 private android.view.View$OnClickListener onClickListener;
	 private android.widget.TextView timeTextView;
	 private android.widget.TextView titleTextView;
	 /* # direct methods */
	 public com.Ina.Notegre.ReadText ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 45 */
		 /* const/16 v0, 0x10 */
		 /* iput v0, p0, Lcom/Ina/Notegre/ReadText;->mTextSize:I */
		 /* .line 176 */
		 /* new-instance v0, Lcom/Ina/Notegre/ReadText$1; */
		 /* invoke-direct {v0, p0}, Lcom/Ina/Notegre/ReadText$1;-><init>(Lcom/Ina/Notegre/ReadText;)V */
		 this.onClickListener = v0;
		 /* .line 264 */
		 /* new-instance v0, Lcom/Ina/Notegre/ReadText$2; */
		 /* invoke-direct {v0, p0}, Lcom/Ina/Notegre/ReadText$2;-><init>(Lcom/Ina/Notegre/ReadText;)V */
		 this.animaEnd = v0;
		 /* .line 24 */
		 return;
	 } // .end method
	 static void access$0 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 242 */
		 /* invoke-direct {p0}, Lcom/Ina/Notegre/ReadText;->popupMenu()V */
		 return;
	 } // .end method
	 static Boolean access$1 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 38 */
		 /* iget-boolean v0, p0, Lcom/Ina/Notegre/ReadText;->mbPopup:Z */
	 } // .end method
	 static android.widget.TextView access$10 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 v0 = this.contentTextView;
	 } // .end method
	 static android.widget.LinearLayout access$11 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 34 */
		 v0 = this.mPopupMenuLayout;
	 } // .end method
	 static android.view.View access$12 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 35 */
		 v0 = this.mMenuBgView;
	 } // .end method
	 static void access$2 ( com.Ina.Notegre.ReadText p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 38 */
		 /* iput-boolean p1, p0, Lcom/Ina/Notegre/ReadText;->mbPopup:Z */
		 return;
	 } // .end method
	 static void access$3 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 112 */
		 /* invoke-direct {p0}, Lcom/Ina/Notegre/ReadText;->quit()V */
		 return;
	 } // .end method
	 static Integer access$4 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
	 } // .end method
	 static Integer access$5 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
	 } // .end method
	 static java.lang.String access$6 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 49 */
		 v0 = com.Ina.Notegre.ReadText.mTitle;
	 } // .end method
	 static java.lang.String access$7 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 50 */
		 v0 = com.Ina.Notegre.ReadText.mContent;
	 } // .end method
	 static Integer access$8 ( com.Ina.Notegre.ReadText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 45 */
		 /* iget v0, p0, Lcom/Ina/Notegre/ReadText;->mTextSize:I */
	 } // .end method
	 static void access$9 ( com.Ina.Notegre.ReadText p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 45 */
		 /* iput p1, p0, Lcom/Ina/Notegre/ReadText;->mTextSize:I */
		 return;
	 } // .end method
	 private void popupMenu ( ) {
		 /* .locals 10 */
		 /* .prologue */
		 /* .line 244 */
		 v0 = this.mMenuBgView;
		 v0 = 		 (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
		 /* if-nez v0, :cond_0 */
		 /* .line 246 */
		 v0 = this.mPopupMenuLayout;
		 final String v1 = "1"; // const-string v1, "1"
		 (( android.widget.LinearLayout ) v0 ).setTag ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V
		 /* .line 248 */
		 v0 = this.mAnimaAccess;
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v6, -0x40800000 # -1.0f */
		 /* const/16 v7, 0x64 */
		 int v8 = 0; // const/4 v8, 0x0
		 /* invoke-virtual/range {v0 ..v8}, Lcom/Ina/Control/AnimaAccess;->alphaAnimation(FFFFFFIZ)Landroid/view/animation/AnimationSet; */
		 /* .line 249 */
		 /* .local v9, "anim":Landroid/view/animation/Animation; */
		 v0 = this.animaEnd;
		 (( android.view.animation.Animation ) v9 ).setAnimationListener ( v0 ); // invoke-virtual {v9, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
		 /* .line 250 */
		 v0 = this.mPopupMenuLayout;
		 (( android.widget.LinearLayout ) v0 ).startAnimation ( v9 ); // invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V
		 /* .line 261 */
	 } // :goto_0
	 return;
	 /* .line 254 */
} // .end local v9 # "anim":Landroid/view/animation/Animation;
} // :cond_0
v0 = this.mPopupMenuLayout;
final String v1 = "0"; // const-string v1, "0"
(( android.widget.LinearLayout ) v0 ).setTag ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V
/* .line 255 */
v0 = this.mMenuBgView;
int v1 = 0; // const/4 v1, 0x0
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
/* .line 257 */
v0 = this.mAnimaAccess;
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, 0x3f800000 # 1.0f */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, -0x40800000 # -1.0f */
int v6 = 0; // const/4 v6, 0x0
/* const/16 v7, 0x64 */
int v8 = 0; // const/4 v8, 0x0
/* invoke-virtual/range {v0 ..v8}, Lcom/Ina/Control/AnimaAccess;->alphaAnimation(FFFFFFIZ)Landroid/view/animation/AnimationSet; */
/* .line 258 */
/* .restart local v9 # "anim":Landroid/view/animation/Animation; */
v0 = this.animaEnd;
(( android.view.animation.Animation ) v9 ).setAnimationListener ( v0 ); // invoke-virtual {v9, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 259 */
v0 = this.mPopupMenuLayout;
(( android.widget.LinearLayout ) v0 ).startAnimation ( v9 ); // invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V
} // .end method
private void quit ( ) {
/* .locals 2 */
/* .prologue */
/* .line 114 */
(( com.Ina.Notegre.ReadText ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/ReadText;->finish()V
/* .line 115 */
/* const/high16 v0, 0x7f040000 */
/* const v1, 0x7f040004 */
(( com.Ina.Notegre.ReadText ) p0 ).overridePendingTransition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/Ina/Notegre/ReadText;->overridePendingTransition(II)V
/* .line 116 */
return;
} // .end method
private void setTextSize ( ) {
/* .locals 3 */
/* .prologue */
/* .line 237 */
android.preference.PreferenceManager .getDefaultSharedPreferences ( p0 );
/* .line 238 */
/* .local v0, "spf":Landroid/content/SharedPreferences; */
final String v1 = "TextSize"; // const-string v1, "TextSize"
v1 = /* const/16 v2, 0x10 */
/* iput v1, p0, Lcom/Ina/Notegre/ReadText;->mTextSize:I */
/* .line 239 */
v1 = this.contentTextView;
/* iget v2, p0, Lcom/Ina/Notegre/ReadText;->mTextSize:I */
/* int-to-float v2, v2 */
(( android.widget.TextView ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V
/* .line 240 */
return;
} // .end method
/* # virtual methods */
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 55 */
int v1 = 1; // const/4 v1, 0x1
(( com.Ina.Notegre.ReadText ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->requestWindowFeature(I)Z
/* .line 57 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 58 */
/* const v1, 0x7f030007 */
(( com.Ina.Notegre.ReadText ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->setContentView(I)V
/* .line 60 */
/* const v1, 0x7f090014 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.titleTextView = v1;
/* .line 61 */
/* const v1, 0x7f090016 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.contentTextView = v1;
/* .line 62 */
/* const v1, 0x7f090015 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.timeTextView = v1;
/* .line 63 */
/* const v1, 0x7f090002 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
this.mMenuButton = v1;
/* .line 64 */
/* const/high16 v1, 0x7f090000 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
this.mBackButton = v1;
/* .line 65 */
/* const v1, 0x7f09000f */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/LinearLayout; */
this.mPopupMenuLayout = v1;
/* .line 66 */
/* const v1, 0x7f09000e */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
this.mMenuBgView = v1;
/* .line 67 */
/* const v1, 0x7f090010 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
this.mOnMenu_1 = v1;
/* .line 68 */
/* const v1, 0x7f090011 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
this.mOnMenu_2 = v1;
/* .line 69 */
/* const v1, 0x7f090012 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
this.mOnMenu_3 = v1;
/* .line 70 */
/* const v1, 0x7f090001 */
(( com.Ina.Notegre.ReadText ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/ReadText;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.mHeadTextView = v1;
/* .line 72 */
v1 = this.mHeadTextView;
/* const v2, 0x7f070026 */
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V
/* .line 73 */
v1 = this.mBackButton;
int v2 = 0; // const/4 v2, 0x0
(( android.widget.Button ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 74 */
v1 = this.mMenuButton;
/* const v2, 0x7f070016 */
(( android.widget.Button ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V
/* .line 75 */
v1 = this.mBackButton;
v2 = this.onClickListener;
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 76 */
v1 = this.mMenuButton;
v2 = this.onClickListener;
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 77 */
v1 = this.mMenuBgView;
v2 = this.onClickListener;
(( android.view.View ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 78 */
v1 = this.mOnMenu_1;
v2 = this.onClickListener;
(( android.view.View ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 79 */
v1 = this.mOnMenu_2;
v2 = this.onClickListener;
(( android.view.View ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 80 */
v1 = this.mOnMenu_3;
v2 = this.onClickListener;
(( android.view.View ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 82 */
(( com.Ina.Notegre.ReadText ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/ReadText;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v1 ).getExtras ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 84 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v1 = "_id"; // const-string v1, "_id"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 85 */
final String v1 = "Index"; // const-string v1, "Index"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 86 */
final String v1 = "Title"; // const-string v1, "Title"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 87 */
final String v1 = "Content"; // const-string v1, "Content"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 89 */
v1 = this.timeTextView;
final String v2 = "Time"; // const-string v2, "Time"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 90 */
v1 = this.titleTextView;
final String v2 = "Title"; // const-string v2, "Title"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 91 */
v1 = this.contentTextView;
final String v2 = "Content"; // const-string v2, "Content"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 93 */
/* new-instance v1, Lcom/Ina/Control/AnimaAccess; */
/* invoke-direct {v1, p0}, Lcom/Ina/Control/AnimaAccess;-><init>(Landroid/content/Context;)V */
this.mAnimaAccess = v1;
/* .line 95 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/ReadText;->setTextSize()V */
/* .line 96 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 101 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 103 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/ReadText;->quit()V */
/* .line 104 */
int v0 = 1; // const/4 v0, 0x1
/* .line 107 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onOptionsItemSelected ( android.view.MenuItem p0 ) {
/* .locals 5 */
/* .param p1, "item" # Landroid/view/MenuItem; */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
/* .line 144 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
v2 = /* .line 146 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 173 */
} // :goto_0
/* .line 151 */
/* :pswitch_0 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 152 */
/* .local v1, "intent":Landroid/content/Intent; */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 153 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v2 = "_id"; // const-string v2, "_id"
(( android.os.Bundle ) v0 ).putInt ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 154 */
final String v2 = "Index"; // const-string v2, "Index"
(( android.os.Bundle ) v0 ).putInt ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 155 */
final String v2 = "Title"; // const-string v2, "Title"
v3 = com.Ina.Notegre.ReadText.mTitle;
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 156 */
final String v2 = "Content"; // const-string v2, "Content"
v3 = com.Ina.Notegre.ReadText.mContent;
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 157 */
(( android.content.Intent ) v1 ).putExtras ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 159 */
(( com.Ina.Notegre.ReadText ) p0 ).setResult ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Lcom/Ina/Notegre/ReadText;->setResult(ILandroid/content/Intent;)V
/* .line 161 */
(( com.Ina.Notegre.ReadText ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/ReadText;->finish()V
/* .line 166 */
} // .end local v0 # "bundle":Landroid/os/Bundle;
} // .end local v1 # "intent":Landroid/content/Intent;
/* :pswitch_1 */
int v2 = -1; // const/4 v2, -0x1
(( com.Ina.Notegre.ReadText ) p0 ).setResult ( v2 ); // invoke-virtual {p0, v2}, Lcom/Ina/Notegre/ReadText;->setResult(I)V
/* .line 167 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/ReadText;->quit()V */
/* .line 146 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onPause ( ) {
/* .locals 4 */
/* .prologue */
/* .line 131 */
android.preference.PreferenceManager .getDefaultSharedPreferences ( p0 );
/* .line 132 */
/* .local v1, "spf":Landroid/content/SharedPreferences; */
/* .line 133 */
/* .local v0, "edit":Landroid/content/SharedPreferences$Editor; */
final String v2 = "TextSize"; // const-string v2, "TextSize"
/* iget v3, p0, Lcom/Ina/Notegre/ReadText;->mTextSize:I */
/* .line 134 */
/* .line 136 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 137 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 0 */
/* .prologue */
/* .line 122 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/ReadText;->setTextSize()V */
/* .line 123 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 124 */
return;
} // .end method
