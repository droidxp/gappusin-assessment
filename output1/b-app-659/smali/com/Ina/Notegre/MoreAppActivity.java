public class com.Ina.Notegre.MoreAppActivity extends android.app.Activity {
	 /* .source "MoreAppActivity.java" */
	 /* # instance fields */
	 private android.os.Handler handler;
	 private java.util.ArrayList mArrayList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
private android.widget.Button mBackButton;
private android.widget.ListView mListView;
private android.widget.Button mRigButton;
private android.widget.TextView mTitleTextView;
private java.util.ArrayList mTmpList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private android.view.View$OnClickListener onClickListener;
java.lang.Runnable runnable;
/* # direct methods */
public com.Ina.Notegre.MoreAppActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 21 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* .line 53 */
/* new-instance v0, Lcom/Ina/Notegre/MoreAppActivity$1; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/MoreAppActivity$1;-><init>(Lcom/Ina/Notegre/MoreAppActivity;)V */
this.onClickListener = v0;
/* .line 85 */
/* new-instance v0, Lcom/Ina/Notegre/MoreAppActivity$2; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/MoreAppActivity$2;-><init>(Lcom/Ina/Notegre/MoreAppActivity;)V */
this.runnable = v0;
/* .line 105 */
/* new-instance v0, Lcom/Ina/Notegre/MoreAppActivity$3; */
/* invoke-direct {v0, p0}, Lcom/Ina/Notegre/MoreAppActivity$3;-><init>(Lcom/Ina/Notegre/MoreAppActivity;)V */
this.handler = v0;
/* .line 21 */
return;
} // .end method
static void access$0 ( com.Ina.Notegre.MoreAppActivity p0, java.util.ArrayList p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 24 */
this.mTmpList = p1;
return;
} // .end method
static java.util.ArrayList access$1 ( com.Ina.Notegre.MoreAppActivity p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 24 */
v0 = this.mTmpList;
} // .end method
static android.os.Handler access$2 ( com.Ina.Notegre.MoreAppActivity p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 105 */
v0 = this.handler;
} // .end method
static void access$3 ( com.Ina.Notegre.MoreAppActivity p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 129 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/MoreAppActivity;->updateArrayList()V */
return;
} // .end method
static void access$4 ( com.Ina.Notegre.MoreAppActivity p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 71 */
/* invoke-direct {p0}, Lcom/Ina/Notegre/MoreAppActivity;->initList()V */
return;
} // .end method
private void initList ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 2; // const/4 v6, 0x2
/* .line 73 */
/* new-instance v0, Lcom/Ina/adapter/MoreAppAdapter; */
v2 = this.mArrayList;
/* const v3, 0x7f030005 */
/* .line 74 */
int v1 = 4; // const/4 v1, 0x4
/* new-array v4, v1, [Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .line 75 */
final String v5 = "title"; // const-string v5, "title"
/* aput-object v5, v4, v1 */
int v1 = 1; // const/4 v1, 0x1
/* .line 76 */
final String v5 = "content"; // const-string v5, "content"
/* aput-object v5, v4, v1 */
/* .line 77 */
final String v1 = "address"; // const-string v1, "address"
/* aput-object v1, v4, v6 */
int v1 = 3; // const/4 v1, 0x3
/* .line 78 */
final String v5 = "package"; // const-string v5, "package"
/* aput-object v5, v4, v1 */
/* .line 79 */
/* new-array v5, v6, [I */
/* fill-array-data v5, :array_0 */
/* move-object v1, p0 */
/* .line 73 */
/* invoke-direct/range {v0 ..v5}, Lcom/Ina/adapter/MoreAppAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I[Ljava/lang/String;[I)V */
/* .line 82 */
/* .local v0, "moreAppAdapter":Lcom/Ina/adapter/MoreAppAdapter; */
v1 = this.mListView;
(( android.widget.ListView ) v1 ).setAdapter ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 83 */
return;
/* .line 79 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x7f09000c */
/* 0x7f09000d */
} // .end array-data
} // .end method
private void updateArrayList ( ) {
/* .locals 4 */
/* .prologue */
/* .line 131 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
this.mArrayList = v2;
/* .line 133 */
v2 = this.mTmpList;
v0 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* .line 134 */
/* .local v0, "count":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v0, :cond_0 */
/* .line 138 */
v2 = this.mTmpList;
(( java.util.ArrayList ) v2 ).clear ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
/* .line 139 */
int v2 = 0; // const/4 v2, 0x0
this.mTmpList = v2;
/* .line 140 */
return;
/* .line 135 */
} // :cond_0
v3 = this.mArrayList;
v2 = this.mTmpList;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/util/HashMap; */
(( java.util.ArrayList ) v3 ).add ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 134 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
/* # virtual methods */
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 34 */
int v1 = 1; // const/4 v1, 0x1
(( com.Ina.Notegre.MoreAppActivity ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/MoreAppActivity;->requestWindowFeature(I)Z
/* .line 35 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.games.a .a ( p0 );
/* .line 36 */
/* const v1, 0x7f030004 */
(( com.Ina.Notegre.MoreAppActivity ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/MoreAppActivity;->setContentView(I)V
/* .line 38 */
/* const v1, 0x7f090007 */
(( com.Ina.Notegre.MoreAppActivity ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/MoreAppActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/ListView; */
this.mListView = v1;
/* .line 39 */
/* const v1, 0x7f090001 */
(( com.Ina.Notegre.MoreAppActivity ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/MoreAppActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.mTitleTextView = v1;
/* .line 40 */
/* const/high16 v1, 0x7f090000 */
(( com.Ina.Notegre.MoreAppActivity ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/MoreAppActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
this.mBackButton = v1;
/* .line 41 */
/* const v1, 0x7f090002 */
(( com.Ina.Notegre.MoreAppActivity ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/Ina/Notegre/MoreAppActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
this.mRigButton = v1;
/* .line 43 */
v1 = this.mRigButton;
/* const/16 v2, 0x8 */
(( android.widget.Button ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 44 */
v1 = this.mBackButton;
int v2 = 0; // const/4 v2, 0x0
(( android.widget.Button ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 45 */
v1 = this.mTitleTextView;
/* const v2, 0x7f070029 */
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V
/* .line 47 */
v1 = this.mBackButton;
v2 = this.onClickListener;
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 49 */
/* new-instance v0, Ljava/lang/Thread; */
v1 = this.runnable;
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 50 */
/* .local v0, "thread":Ljava/lang/Thread; */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 51 */
return;
} // .end method
