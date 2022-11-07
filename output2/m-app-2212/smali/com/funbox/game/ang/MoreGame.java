class com.funbox.game.ang.MoreGame {
	 /* .source "MoreGame.java" */
	 /* # instance fields */
	 private android.app.AlertDialog mDlg;
	 private android.app.Activity mParent;
	 /* # direct methods */
	 public com.funbox.game.ang.MoreGame ( ) {
		 /* .locals 0 */
		 /* .param p1, "parent" # Landroid/app/Activity; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 23 */
		 /* if-nez p1, :cond_0 */
		 /* .line 27 */
	 } // :goto_0
	 return;
	 /* .line 26 */
} // :cond_0
this.mParent = p1;
} // .end method
static android.app.AlertDialog access$0 ( com.funbox.game.ang.MoreGame p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 19 */
v0 = this.mDlg;
} // .end method
/* # virtual methods */
public void goApp ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "adId" # I */
/* .prologue */
/* .line 105 */
/* new-instance v2, Ljava/lang/String; */
/* invoke-direct {v2}, Ljava/lang/String;-><init>()V */
/* .line 106 */
/* .local v2, "url":Ljava/lang/String; */
/* if-nez p1, :cond_0 */
/* .line 107 */
final String v2 = "market://details?id=com.monkeytouch.game.Penguin"; // const-string v2, "market://details?id=com.monkeytouch.game.Penguin"
/* .line 115 */
} // :goto_0
android.net.Uri .parse ( v2 );
/* .line 116 */
/* .local v1, "uri":Landroid/net/Uri; */
/* new-instance v0, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
/* invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 117 */
/* .local v0, "intent":Landroid/content/Intent; */
v3 = this.mParent;
(( android.app.Activity ) v3 ).startActivity ( v0 ); // invoke-virtual {v3, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 118 */
return;
/* .line 108 */
} // .end local v0 # "intent":Landroid/content/Intent;
} // .end local v1 # "uri":Landroid/net/Uri;
} // :cond_0
int v3 = 1; // const/4 v3, 0x1
/* if-ne v3, p1, :cond_1 */
/* .line 109 */
final String v2 = "market://details?id=com.funbox.game.superdash"; // const-string v2, "market://details?id=com.funbox.game.superdash"
/* .line 110 */
} // :cond_1
int v3 = 2; // const/4 v3, 0x2
/* if-ne v3, p1, :cond_2 */
/* .line 111 */
final String v2 = "market://details?id=com.funbox.game.alphaZoo"; // const-string v2, "market://details?id=com.funbox.game.alphaZoo"
/* .line 113 */
} // :cond_2
final String v2 = "market://search?q=pub:%22FunBox%22"; // const-string v2, "market://search?q=pub:%22FunBox%22"
} // .end method
public void show ( ) {
/* .locals 14 */
/* .prologue */
/* .line 31 */
v1 = this.mParent;
android.view.LayoutInflater .from ( v1 );
/* .line 32 */
/* .local v7, "factory":Landroid/view/LayoutInflater; */
/* const v1, 0x7f030006 */
int v2 = 0; // const/4 v2, 0x0
(( android.view.LayoutInflater ) v7 ).inflate ( v1, v2 ); // invoke-virtual {v7, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 34 */
/* .local v6, "entryDlg":Landroid/view/View; */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
v2 = this.mParent;
/* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v1 ).setView ( v6 ); // invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
/* .line 35 */
(( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 33 */
this.mDlg = v1;
/* .line 37 */
/* const v1, 0x7f060019 */
(( android.view.View ) v6 ).findViewById ( v1 ); // invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v8, Landroid/widget/ListView; */
/* .line 40 */
/* .local v8, "lv":Landroid/widget/ListView; */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 41 */
/* .local v2, "users":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* new-instance v9, Ljava/util/HashMap; */
/* invoke-direct {v9}, Ljava/util/HashMap;-><init>()V */
/* .line 42 */
/* .local v9, "rec1":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v10, Ljava/util/HashMap; */
/* invoke-direct {v10}, Ljava/util/HashMap;-><init>()V */
/* .line 43 */
/* .local v10, "rec2":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v11, Ljava/util/HashMap; */
/* invoke-direct {v11}, Ljava/util/HashMap;-><init>()V */
/* .line 44 */
/* .local v11, "rec3":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v12, Ljava/util/HashMap; */
/* invoke-direct {v12}, Ljava/util/HashMap;-><init>()V */
/* .line 45 */
/* .local v12, "rec4":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v13, Ljava/util/HashMap; */
/* invoke-direct {v13}, Ljava/util/HashMap;-><init>()V */
/* .line 48 */
/* .local v13, "rec5":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "img"; // const-string v1, "img"
/* const/high16 v3, 0x7f020000 */
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v9 ).put ( v1, v3 ); // invoke-virtual {v9, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 49 */
final String v1 = "name"; // const-string v1, "name"
final String v3 = "Yeah, Penguin Jump!"; // const-string v3, "Yeah, Penguin Jump!"
(( java.util.HashMap ) v9 ).put ( v1, v3 ); // invoke-virtual {v9, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 50 */
(( java.util.ArrayList ) v2 ).add ( v9 ); // invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 52 */
final String v1 = "img"; // const-string v1, "img"
/* const v3, 0x7f020001 */
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v10 ).put ( v1, v3 ); // invoke-virtual {v10, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 53 */
final String v1 = "name"; // const-string v1, "name"
final String v3 = "Cool, Super Dash!"; // const-string v3, "Cool, Super Dash!"
(( java.util.HashMap ) v10 ).put ( v1, v3 ); // invoke-virtual {v10, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 54 */
(( java.util.ArrayList ) v2 ).add ( v10 ); // invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 56 */
final String v1 = "img"; // const-string v1, "img"
/* const v3, 0x7f020003 */
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v11 ).put ( v1, v3 ); // invoke-virtual {v11, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 57 */
final String v1 = "name"; // const-string v1, "name"
final String v3 = "Wow, Alpha Zoo!"; // const-string v3, "Wow, Alpha Zoo!"
(( java.util.HashMap ) v11 ).put ( v1, v3 ); // invoke-virtual {v11, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 58 */
(( java.util.ArrayList ) v2 ).add ( v11 ); // invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 60 */
final String v1 = "img"; // const-string v1, "img"
/* const v3, 0x7f020004 */
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v12 ).put ( v1, v3 ); // invoke-virtual {v12, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 61 */
final String v1 = "name"; // const-string v1, "name"
final String v3 = "More Games"; // const-string v3, "More Games"
(( java.util.HashMap ) v12 ).put ( v1, v3 ); // invoke-virtual {v12, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 62 */
(( java.util.ArrayList ) v2 ).add ( v12 ); // invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 68 */
final String v1 = "img"; // const-string v1, "img"
/* const v3, 0x7f02000a */
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v13 ).put ( v1, v3 ); // invoke-virtual {v13, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 69 */
final String v1 = "name"; // const-string v1, "name"
final String v3 = "Back"; // const-string v3, "Back"
(( java.util.HashMap ) v13 ).put ( v1, v3 ); // invoke-virtual {v13, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 70 */
(( java.util.ArrayList ) v2 ).add ( v13 ); // invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 72 */
/* new-instance v0, Landroid/widget/SimpleAdapter; */
v1 = this.mParent;
/* .line 73 */
/* const v3, 0x7f030007 */
/* .line 74 */
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
final String v6 = "img"; // const-string v6, "img"
} // .end local v6 # "entryDlg":Landroid/view/View;
/* aput-object v6, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
final String v6 = "name"; // const-string v6, "name"
/* aput-object v6, v4, v5 */
/* .line 76 */
int v5 = 2; // const/4 v5, 0x2
/* new-array v5, v5, [I */
/* fill-array-data v5, :array_0 */
/* .line 72 */
/* invoke-direct/range {v0 ..v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V */
/* .line 78 */
/* .local v0, "saImageItems":Landroid/widget/SimpleAdapter; */
(( android.widget.ListView ) v8 ).setAdapter ( v0 ); // invoke-virtual {v8, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 79 */
/* const/high16 v1, -0x1000000 */
(( android.widget.ListView ) v8 ).setBackgroundColor ( v1 ); // invoke-virtual {v8, v1}, Landroid/widget/ListView;->setBackgroundColor(I)V
/* .line 80 */
int v1 = 1; // const/4 v1, 0x1
(( android.widget.ListView ) v8 ).setItemsCanFocus ( v1 ); // invoke-virtual {v8, v1}, Landroid/widget/ListView;->setItemsCanFocus(Z)V
/* .line 83 */
/* new-instance v1, Lcom/funbox/game/ang/MoreGame$1; */
/* invoke-direct {v1, p0}, Lcom/funbox/game/ang/MoreGame$1;-><init>(Lcom/funbox/game/ang/MoreGame;)V */
(( android.widget.ListView ) v8 ).setOnItemClickListener ( v1 ); // invoke-virtual {v8, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 101 */
v1 = this.mDlg;
(( android.app.AlertDialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
/* .line 102 */
return;
/* .line 76 */
/* :array_0 */
/* .array-data 4 */
/* 0x7f06001a */
/* 0x7f06001b */
} // .end array-data
} // .end method
